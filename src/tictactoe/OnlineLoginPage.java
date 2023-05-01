package tictactoe;

import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class OnlineLoginPage extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Glow glow;
    protected final Button loginBtn;
    protected final DropShadow dropShadow;
    protected final Button backBtn;
    protected final DropShadow dropShadow0;
    protected final Button homeBtn;
    protected final DropShadow dropShadow1;
    protected final TextField usernameTxtField;
    protected final TextField passwordTxtField;
    protected final Text passwordTxt;
    protected final InnerShadow innerShadow;
    protected final Text usernameTxt;
    protected final Text noAccountTxt;
    protected final InnerShadow innerShadow0;
    protected final Hyperlink signupTxt;
    protected final AnchorPane anchorPane0;
    protected final Glow glow0;
    protected final Text xTxt;
    protected final Text oTxt;
    protected final Text toeTxt;
    protected final Text aTxt;
    protected final Text ticTxt;
    protected final ImageView image;
    protected final ToggleButton soundBtn;
    protected final DropShadow dropShadow2;
    protected final Text soundTxt;

    public OnlineLoginPage() {

        anchorPane = new AnchorPane();
        glow = new Glow();
        loginBtn = new Button();
        dropShadow = new DropShadow();
        backBtn = new Button();
        dropShadow0 = new DropShadow();
        homeBtn = new Button();
        dropShadow1 = new DropShadow();
        usernameTxtField = new TextField();
        passwordTxtField = new TextField();
        passwordTxt = new Text();
        innerShadow = new InnerShadow();
        usernameTxt = new Text();
        noAccountTxt = new Text();
        innerShadow0 = new InnerShadow();
        signupTxt = new Hyperlink();
        anchorPane0 = new AnchorPane();
        glow0 = new Glow();
        xTxt = new Text();
        oTxt = new Text();
        toeTxt = new Text();
        aTxt = new Text();
        ticTxt = new Text();
        image = new ImageView();
        soundBtn = new ToggleButton();
        dropShadow2 = new DropShadow();
        soundTxt = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(1024.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(720.0);
        anchorPane.setPrefWidth(350.0);
        anchorPane.setStyle("-fx-background-color: #F27B7A;");

        anchorPane.setEffect(glow);

        loginBtn.setLayoutX(108.0);
        loginBtn.setLayoutY(278.0);
        loginBtn.setMnemonicParsing(false);
        loginBtn.setPrefHeight(37.0);
        loginBtn.setPrefWidth(126.0);
        loginBtn.setStyle("-fx-background-color: #ffffff;");
        loginBtn.setText("Login");
        loginBtn.setFont(new Font("Bauhaus 93", 19.0));

        loginBtn.setEffect(dropShadow);

        backBtn.setLayoutX(33.0);
        backBtn.setLayoutY(638.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(38.0);
        backBtn.setPrefWidth(93.0);
        backBtn.setStyle("-fx-background-color: #ffffff;");
        backBtn.setText("Back");
        backBtn.setFont(new Font("Bauhaus 93", 19.0));

        backBtn.setEffect(dropShadow0);

        homeBtn.setLayoutX(218.0);
        homeBtn.setLayoutY(637.0);
        homeBtn.setMnemonicParsing(false);
        homeBtn.setPrefHeight(38.0);
        homeBtn.setPrefWidth(93.0);
        homeBtn.setStyle("-fx-background-color: #ffffff;");
        homeBtn.setText("Home");
        homeBtn.setFont(new Font("Bauhaus 93", 19.0));

        homeBtn.setEffect(dropShadow1);

        usernameTxtField.setLayoutX(171.0);
        usernameTxtField.setLayoutY(83.0);
        usernameTxtField.setFont(new Font("Bauhaus 93", 14.0));

        passwordTxtField.setLayoutX(171.0);
        passwordTxtField.setLayoutY(181.0);
        passwordTxtField.setFont(new Font("Bauhaus 93", 14.0));

        passwordTxt.setLayoutX(33.0);
        passwordTxt.setLayoutY(200.0);
        passwordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        passwordTxt.setStrokeWidth(0.0);
        passwordTxt.setText("Password");
        passwordTxt.setFont(new Font("Bauhaus 93", 22.0));

        passwordTxt.setEffect(innerShadow);

        usernameTxt.setLayoutX(31.0);
        usernameTxt.setLayoutY(104.0);
        usernameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        usernameTxt.setStrokeWidth(0.0);
        usernameTxt.setText("Username");
        usernameTxt.setFont(new Font("Bauhaus 93", 22.0));

        noAccountTxt.setLayoutX(32.0);
        noAccountTxt.setLayoutY(403.0);
        noAccountTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        noAccountTxt.setStrokeWidth(0.0);
        noAccountTxt.setText("Don't have an account ?");
        noAccountTxt.setFont(new Font("Bauhaus 93", 18.0));

        noAccountTxt.setEffect(innerShadow0);

        signupTxt.setLayoutX(240.0);
        signupTxt.setLayoutY(383.0);
        signupTxt.setText("Sign up");
        signupTxt.setFont(new Font("Bauhaus 93", 18.0));
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        anchorPane0.setEffect(glow0);

        xTxt.setLayoutX(223.0);
        xTxt.setLayoutY(138.0);
        xTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        xTxt.setStrokeWidth(0.0);
        xTxt.setText("X");
        xTxt.setFont(new Font("Bauhaus 93", 90.0));

        oTxt.setLayoutX(381.0);
        oTxt.setLayoutY(230.0);
        oTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        oTxt.setStrokeWidth(0.0);
        oTxt.setText("O");
        oTxt.setFont(new Font("Bauhaus 93", 90.0));

        toeTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        toeTxt.setLayoutX(314.0);
        toeTxt.setLayoutY(107.0);
        toeTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeTxt.setStrokeWidth(0.0);
        toeTxt.setText("T   O   E");
        toeTxt.setFont(new Font("Bauhaus 93", 50.0));

        aTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        aTxt.setLayoutX(311.0);
        aTxt.setLayoutY(163.0);
        aTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aTxt.setStrokeWidth(0.0);
        aTxt.setText("A");
        aTxt.setFont(new Font("Bauhaus 93", 50.0));

        ticTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        ticTxt.setLayoutX(188.0);
        ticTxt.setLayoutY(224.0);
        ticTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticTxt.setStrokeWidth(0.0);
        ticTxt.setText("T   I   C");
        ticTxt.setFont(new Font("Bauhaus 93", 50.0));

        image.setFitHeight(350.0);
        image.setFitWidth(350.0);
        image.setLayoutX(163.0);
        image.setLayoutY(277.0);
        image.setPickOnBounds(true);
        image.setPreserveRatio(true);
        image.setImage(new Image(getClass().getResource("images/game.png").toExternalForm()));

        soundBtn.setLayoutX(519.0);
        soundBtn.setLayoutY(656.0);
        soundBtn.setMnemonicParsing(false);
        soundBtn.setPrefHeight(42.0);
        soundBtn.setPrefWidth(130.0);
        soundBtn.setText("On / Off");

        soundBtn.setEffect(dropShadow2);
        soundBtn.setFont(new Font("Bauhaus 93", 19.0));

        soundTxt.setLayoutX(410.0);
        soundTxt.setLayoutY(692.0);
        soundTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        soundTxt.setStrokeWidth(0.0);
        soundTxt.setText("Sound");
        soundTxt.setFont(new Font("Bauhaus 93", 30.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(loginBtn);
        anchorPane.getChildren().add(backBtn);
        anchorPane.getChildren().add(homeBtn);
        anchorPane.getChildren().add(usernameTxtField);
        anchorPane.getChildren().add(passwordTxtField);
        anchorPane.getChildren().add(passwordTxt);
        anchorPane.getChildren().add(usernameTxt);
        anchorPane.getChildren().add(noAccountTxt);
        anchorPane.getChildren().add(signupTxt);
        anchorPane0.getChildren().add(xTxt);
        anchorPane0.getChildren().add(oTxt);
        anchorPane0.getChildren().add(toeTxt);
        anchorPane0.getChildren().add(aTxt);
        anchorPane0.getChildren().add(ticTxt);
        anchorPane0.getChildren().add(image);
        anchorPane0.getChildren().add(soundBtn);
        anchorPane0.getChildren().add(soundTxt);

    }
}