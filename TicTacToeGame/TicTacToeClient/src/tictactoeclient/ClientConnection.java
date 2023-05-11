/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.StreamCorruptedException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 *
 * @author dell
 */
public class ClientConnection {

    private static ClientConnection instance;
    InputStream inputstream;
    OutputStream outpuststream;
    ObjectInputStream objectinputstream;
    ObjectOutputStream objectoutputstream;
    Socket socket;

    public static StringProperty flag = new SimpleStringProperty("");

    public static ClientConnection getInstance() {
        if (instance == null) {
            instance = new ClientConnection();
        }
        return instance;
    }

    public boolean initConnection(String ip) {
        try {
            if (socket == null || !socket.isConnected() || socket.isClosed()) {
                socket = new Socket(ip, 5005);
                outpuststream = socket.getOutputStream();
                inputstream = socket.getInputStream();
                objectoutputstream = new ObjectOutputStream(outpuststream);
                objectinputstream = new ObjectInputStream(inputstream);
                readMessage();
                return true;
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }

    public void readMessage() {

        new Thread() {

            @Override
            public void run() {
                try {
                    while (socket.isConnected() && !socket.isClosed()) {

                        System.out.println("now reciving >>>");
                        String msg = (String) objectinputstream.readObject();
                        Object obj = objectinputstream.readObject();

                        if (msg.equals(Messages.loginResponse)) {
                            checkLogin((Boolean) obj);
                        } else if (msg.equals(Messages.registrationResponse)) {
                            checkRegister((Boolean) obj);
                        }

                        System.out.println("msg is : " + msg);
                        System.out.println("boolean is : " + obj.toString());
                        
                        
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("THERE IS AN ERROR");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }

        }.start();
    }
    
    public void writeMessage(String msg, Object object) {
        new Thread() {
            @Override
            public void run() {
                try {
                    objectoutputstream.writeObject(msg);
                    objectoutputstream.writeObject(object);
                } catch (IOException ex) {
                    Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.start();
    }

    private void checkLogin(Boolean loginCheck) {

        if (loginCheck) {

            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                      flag.set("loginTrue");
                }
            });

        } else {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    flag.set("loginFalse");
                }
            });
        }

    }
    
    private void checkRegister(Boolean registerCheck) {

        if (registerCheck) {

            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                      flag.set("registerTrue");
                }
            });

        } else {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    flag.set("registerFalse");
                }
            });
        }

    }

    private void checkRegistration(Boolean registrationCheck) {

        new Thread() {

            @Override
            public void run() {
                try {

                    System.out.println("now reciving from Registration  >>>");
                    Boolean loginCheck = (Boolean) objectinputstream.readObject();
                    if (loginCheck) {

                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                OnlineUsersPage root = new OnlineUsersPage();
                                Scene scene = new Scene(root);
                                TicTacToeClient.stage.setScene(scene);
                            }
                        });

                    } else {
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setContentText("Error! while trying to Register!");
                                ButtonType okButton = new ButtonType("OK");
                                alert.getButtonTypes().setAll(okButton);
                                alert.showAndWait();
                            }
                        });
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }.start();

    }

    

}
