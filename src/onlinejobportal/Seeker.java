package onlinejobportal;

import com.fxexperience.javafx.animation.FadeInUpTransition;
import com.fxexperience.javafx.animation.FadeOutUpTransition;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Transition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.util.Duration;

public class Seeker {
    
    private Label d1, d2, d3, d4, d5, d6, d7, d8;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    private ImageView bg1, bg2, bg3, bg4, bg5, bg6, bg7, bg8;
    private PasswordField p1, p2, p3;
    private Label x1, x2, x3, x4, x5, x6, x7, x8;
    private Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
    private TextField t1, t2, t3, t4, t5, t6, t7, t8;
    private String fname, lname, pnum, email, street, city, state, zipcode, pass1, pass2, pass3, typeo, location, typej;
    private Transition f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23;
    private Transition f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36, f37, f38, f39, f40, f41, f42;
    private Transition f43, f44, f45, f46, f47, f48, f49;
    private ComboBox cb1, cb2, cb3;
    private int ind1, i1;
    private Integer j1[] = new Integer[20];
    private Label tit[] = new Label[20];
    private Button but[] = new Button[20];
    private VBox vt, vo;
    private ScrollPane scr, scr2;
    
    ObservableList<String> options = FXCollections.observableArrayList(
        "Type of Organistion",
        "Advertising",
        "Automotive",
        "Banking",
        "Bio Technology",
        "Chemicals",
        "Construction",
        "Courier",
        "Education",
        "E-Learning",
        "Food and Package Food",
        "Hospital/Health Care",
        "Hotels/Restaurents",
        "Insurance",
        "IT/Computer - Hardware",
        "IT/Computer - Software",
        "Machinery",
        "Oil/Gas/Petroleum",
        "Pharmaceuticals",
        "Real Estate",
        "Retailing",
        "Shipping",
        "Telecom",
        "Travel/Tourism"
    );
    
    ObservableList<String> options2 = FXCollections.observableArrayList(
            "Type of Job",
            "Advertising",
            "Banking",
            "Business Development",
            "Construction",
            "Customer Service",
            "Call Center",
            "Communication",
            "Education/ Teaching",
            "Export Import",
            "Finance and Accounts",
            "Hotels",
            "Human Resource",
            "IT",
            "Legal",
            "Marketing",
            "Real Estate",
            "Sales",
            "Secretarial",
            "Travels"
    );
    
    ObservableList<String> options3;
    
    public void layout() {
        
        cb1 = new ComboBox(options);
        cb1.setLayoutX(400);
        cb1.setLayoutY(250);
        cb1.setPrefSize(200, 35);
        cb1.getStyleClass().add("combobox");
        cb1.getSelectionModel().selectFirst();
        
        cb2 = new ComboBox(options2);
        cb2.setLayoutX(630);
        cb2.setLayoutY(250);
        cb2.setPrefSize(200, 35);
        cb2.getStyleClass().add("combobox");
        cb2.getSelectionModel().selectFirst();
        
        
        b1 = new Button();
        b1.setPrefSize(200, 600);
        b1.setStyle("-fx-background-color: #373836;");
        
        bg1 = new ImageView(new Image(Admin.class.getResourceAsStream("files/img.jpg")));
        bg1.setX(200);
        bg1.setY(0);
        bg1.setFitWidth(1000);
        bg1.setFitHeight(600);
        
        bg2 = new ImageView(new Image(Admin.class.getResourceAsStream("files/0.png")));
        bg3 = new ImageView(new Image(Admin.class.getResourceAsStream("files/1.png")));
        bg4 = new ImageView(new Image(Admin.class.getResourceAsStream("files/2.png")));
        bg5 = new ImageView(new Image(Admin.class.getResourceAsStream("files/5.png")));
        bg6 = new ImageView(new Image(Admin.class.getResourceAsStream("files/46.png")));
        bg7 = new ImageView(new Image(Admin.class.getResourceAsStream("files/45.png")));
        
        bg3.setFitHeight(30);
        bg3.setFitWidth(30);

        bg4.setFitHeight(30);
        bg4.setFitWidth(30);

        bg5.setFitHeight(30);
        bg5.setFitWidth(30);

        bg6.setFitHeight(30);
        bg6.setFitWidth(40);

        bg7.setFitHeight(30);
        bg7.setFitWidth(30);

        
        b2 = new Button("   Home", bg2);
        b2.setPrefSize(200, 60);
        b2.getStyleClass().addAll("button12");

        b3 = new Button("   View Profile", bg3);
        b3.setPrefSize(200, 60);
        b3.getStyleClass().addAll("button12");
        b3.setLayoutY(60);
        
        b4 = new Button("   Change Password", bg4);
        b4.setPrefSize(200, 60);
        b4.getStyleClass().addAll("button12");
        b4.setLayoutY(120);
        
        b5 = new Button("   Search Job", bg5);
        b5.setPrefSize(200, 60);
        b5.getStyleClass().addAll("button12");
        b5.setLayoutY(180);
        
        b6 = new Button("   View Status", bg6);
        b6.setPrefSize(200, 60);
        b6.getStyleClass().addAll("button12");
        b6.setLayoutY(240);
        
        b7 = new Button("   Sign Out", bg7);
        b7.setPrefSize(200, 60);
        b7.getStyleClass().addAll("button12");
        b7.setLayoutY(300);
        
        b2.setAlignment(Pos.BASELINE_LEFT);
        b3.setAlignment(Pos.BASELINE_LEFT);
        b4.setAlignment(Pos.BASELINE_LEFT);
        b5.setAlignment(Pos.BASELINE_LEFT);
        b6.setAlignment(Pos.BASELINE_LEFT);
        b7.setAlignment(Pos.BASELINE_LEFT);
        
        x1 = new Label("First Name");
        x1.setLayoutX(350);
        x1.setLayoutY(200);
        x1.getStyleClass().add("label3");
        
        t1 = new TextField();
        t1.setLayoutX(500);
        t1.setLayoutY(205);
        t1.setPrefWidth(200);
        t1.setPrefHeight(30);
        
        x2 = new Label("Last Name");
        x2.setLayoutX(720);
        x2.setLayoutY(200);
        x2.getStyleClass().add("label3");
        
        t2 = new TextField();
        t2.setLayoutX(850);
        t2.setLayoutY(205);
        t2.setPrefWidth(200);
        t2.setPrefHeight(30);
        
        x3 = new Label("Email Id");
        x3.setLayoutX(350);
        x3.setLayoutY(280);
        x3.getStyleClass().add("label3");
        
        t3 = new TextField();
        t3.setLayoutX(500);
        t3.setLayoutY(285);
        t3.setPrefWidth(200);
        t3.setPrefHeight(30);
        
        x4 = new Label("Phone No");
        x4.setLayoutX(720);
        x4.setLayoutY(280);
        x4.getStyleClass().add("label3");
        
        t4 = new TextField();
        t4.setLayoutX(850);
        t4.setLayoutY(285);
        t4.setPrefWidth(200);
        t4.setPrefHeight(30);
        
        
        x5 = new Label("Street No");
        x5.setLayoutX(350);
        x5.setLayoutY(360);
        x5.getStyleClass().add("label3");
        
        t5 = new TextField();
        t5.setLayoutX(500);
        t5.setLayoutY(365);
        t5.setPrefWidth(200);
        t5.setPrefHeight(30);
        
        x6 = new Label("City");
        x6.setLayoutX(720);
        x6.setLayoutY(360);
        x6.getStyleClass().add("label3");
        
        t6 = new TextField();
        t6.setLayoutX(850);
        t6.setLayoutY(365);
        t6.setPrefWidth(200);
        t6.setPrefHeight(30);
        
        x7 = new Label("State");
        x7.setLayoutX(350);
        x7.setLayoutY(440);
        x7.getStyleClass().add("label3");
        
        t7 = new TextField();
        t7.setLayoutX(500);
        t7.setLayoutY(445);
        t7.setPrefWidth(200);
        t7.setPrefHeight(30);
        
        x8 = new Label("Zip Code");
        x8.setLayoutX(720);
        x8.setLayoutY(440);
        x8.getStyleClass().add("label3");
        
        t8 = new TextField();
        t8.setLayoutX(850);
        t8.setLayoutY(445);
        t8.setPrefWidth(200);
        t8.setPrefHeight(30);
        
        l1 = new Label("Your Profile");
        l1.setLayoutX(610);
        l1.setLayoutY(115);
        l1.getStyleClass().add("label4");
        
        l2 = new Label("Your Profile has been Updated Successfully");
        l2.setLayoutX(560);
        l2.setLayoutY(160);
        l2.getStyleClass().add("label12");
        
        l3 = new Label("Your Resume has been Uploaded Successfully");
        l3.setLayoutX(560);
        l3.setLayoutY(160);
        l3.getStyleClass().add("label12");
        
        l4 = new Label("Change Password");
        l4.setLayoutX(610);
        l4.setLayoutY(160);
        l4.getStyleClass().add("label4");
        
        l5 = new Label("Current Password");
        l5.setLayoutX(440);
        l5.setLayoutY(235);
        l5.getStyleClass().add("label3");
        
        l6 = new Label("New Password");
        l6.setLayoutX(440);
        l6.setLayoutY(295);
        l6.getStyleClass().add("label3");
        
        l7 = new Label("Verify New Password");
        l7.setLayoutX(440);
        l7.setLayoutY(350);
        l7.getStyleClass().add("label3");
        
        l8 = new Label("Enter Correct Details");
        l8.setLayoutX(660);
        l8.setLayoutY(200);
        l8.getStyleClass().add("label12");
        
        l9 = new Label("Password has been Updated");
        l9.setLayoutX(640);
        l9.setLayoutY(200);
        l9.getStyleClass().add("label12");
        
        l10 = new Label("Search Job");
        l10.setLayoutX(630);
        l10.setLayoutY(160);
        l10.getStyleClass().add("label4");
        
        l11 = new Label("No Job found");
        l11.setLayoutX(280);
        l11.setLayoutY(250);
        l11.getStyleClass().add("label4");
        
        l12 = new Label("Choose Better");
        l12.setLayoutX(720);
        l12.setLayoutY(100);
        l12.getStyleClass().add("label2");
        
        b8 = new Button();
        b8.setPrefSize(785, 450);
        b8.setLayoutX(320);
        b8.setLayoutY(100);
        b8.setOpacity(0.4);
        b8.setStyle("-fx-background-color: #373836;");
        
        b9 = new Button("Update");
        b9.setPrefSize(120, 20);
        b9.setLayoutX(930);
        b9.setLayoutY(500);
        b9.getStyleClass().addAll("button13");
        
        b10 = new Button("Upload Resume");
        b10.setPrefSize(150, 20);
        b10.setLayoutX(750);
        b10.setLayoutY(500);
        b10.getStyleClass().addAll("button13");
        
        b11 = new Button();
        b11.setPrefSize(700, 300);
        b11.setLayoutX(380);
        b11.setLayoutY(150);
        b11.setOpacity(0.4);
        b11.setStyle("-fx-background-color: #373836;");
        
        b12 = new Button("Submit");
        b12.setPrefSize(120, 20);
        b12.setLayoutX(880);
        b12.setLayoutY(400);
        b12.getStyleClass().addAll("button13");
        
        b13 = new Button();
        b13.setPrefSize(700, 250);
        b13.setLayoutX(380);
        b13.setLayoutY(150);
        b13.setOpacity(0.4);
        b13.setStyle("-fx-background-color: #373836;");
        
        b14 = new Button("Search");
        b14.setPrefSize(120, 30);
        b14.setLayoutX(650);
        b14.setLayoutY(330);
        b14.getStyleClass().addAll("button13");
        
        b15 = new Button();
        b15.setPrefSize(300, 300);
        b15.setLayoutX(230);
        b15.setLayoutY(150);
        b15.setOpacity(0.4);
        b15.setStyle("-fx-background-color: #373836;");
        
        b16 = new Button();
        b16.setPrefSize(500, 400);
        b16.setLayoutX(580);
        b16.setLayoutY(150);
        b16.setOpacity(0.6);
        b16.setStyle("-fx-background-color: #373836;");
        
        b17 = new Button();
        b17.setPrefSize(350, 300);
        b17.setLayoutX(530);
        b17.setLayoutY(130);
        b17.setOpacity(0.6);
        b17.setStyle("-fx-background-color: #373836;");
        
        b18 = new Button();
        b18.setPrefSize(300, 100);
        b18.setLayoutX(700);
        b18.setLayoutY(80);
        b18.setOpacity(0.4);
        b18.setStyle("-fx-background-color: #373836;");
        
        p1 = new PasswordField();
        p1.setLayoutX(680);
        p1.setLayoutY(235);
        p1.setPromptText("Current Password");
        p1.setPrefWidth(320);
        p1.setPrefHeight(35);
        
        p2 = new PasswordField();
        p2.setLayoutX(680);
        p2.setLayoutY(295);
        p2.setPromptText("New Password");
        p2.setPrefWidth(320);
        p2.setPrefHeight(35);
        
        p3 = new PasswordField();
        p3.setLayoutX(680);
        p3.setLayoutY(350);
        p3.setPromptText("Verify new Password");
        p3.setPrefWidth(320);
        p3.setPrefHeight(35);
        
        f1 = new FadeOutUpTransition(l2);
        f1.setDelay(Duration.millis(2000));
        f1.setRate(1.2);
        
        f2 = new FadeInUpTransition(l2);
        f2.setDelay(Duration.ZERO);
        f2.setRate(1.2);
        
        f3 = new FadeInUpTransition(x1);
        f3.setDelay(Duration.ZERO);
        f3.setRate(1.2);
        
        f4 = new FadeInUpTransition(x2);
        f4.setDelay(Duration.ZERO);
        f4.setRate(1.2);
        
        f5 = new FadeInUpTransition(x3);
        f5.setDelay(Duration.ZERO);
        f5.setRate(1.2);
        
        f6 = new FadeInUpTransition(x4);
        f6.setDelay(Duration.ZERO);
        f6.setRate(1.2);
        
        f7 = new FadeInUpTransition(x5);
        f7.setDelay(Duration.ZERO);
        f7.setRate(1.2);
        
        f8 = new FadeInUpTransition(x6);
        f8.setDelay(Duration.ZERO);
        f8.setRate(1.2);
        
        f9 = new FadeInUpTransition(x7);
        f9.setDelay(Duration.ZERO);
        f9.setRate(1.2);
        
        f10 = new FadeInUpTransition(x8);
        f10.setDelay(Duration.ZERO);
        f10.setRate(1.2);
        
        f11 = new FadeInUpTransition(l1);
        f11.setDelay(Duration.ZERO);
        f11.setRate(1.2);
        
        f12 = new FadeInUpTransition(t1);
        f12.setDelay(Duration.ZERO);
        f12.setRate(1.2);
        
        f13 = new FadeInUpTransition(t2);
        f13.setDelay(Duration.ZERO);
        f13.setRate(1.2);
        
        f14 = new FadeInUpTransition(t3);
        f14.setDelay(Duration.ZERO);
        f14.setRate(1.2);
        
        f15 = new FadeInUpTransition(t4);
        f15.setDelay(Duration.ZERO);
        f15.setRate(1.2);
        
        f16 = new FadeInUpTransition(t5);
        f16.setDelay(Duration.ZERO);
        f16.setRate(1.2);
        
        f17 = new FadeInUpTransition(t6);
        f17.setDelay(Duration.ZERO);
        f17.setRate(1.2);
        
        f18 = new FadeInUpTransition(t7);
        f18.setDelay(Duration.ZERO);
        f18.setRate(1.2);
        
        f19 = new FadeInUpTransition(t8);
        f19.setDelay(Duration.ZERO);
        f19.setRate(1.2);
        
        f20 = new FadeInUpTransition(b9);
        f20.setDelay(Duration.ZERO);
        f20.setRate(1.2);
        
        f21 = new FadeInUpTransition(b10);
        f21.setDelay(Duration.ZERO);
        f21.setRate(1.2);
        
        f22 = new FadeOutUpTransition(l3);
        f22.setDelay(Duration.millis(2000));
        f22.setRate(1.2);
        
        f23 = new FadeInUpTransition(l3);
        f23.setDelay(Duration.ZERO);
        f23.setRate(1.2);
        
        f24 = new FadeInUpTransition(p1);
        f24.setDelay(Duration.ZERO);
        f24.setRate(1.2);
        
        f25 = new FadeInUpTransition(p2);
        f25.setDelay(Duration.ZERO);
        f25.setRate(1.2);
        
        f26 = new FadeInUpTransition(p3);
        f26.setDelay(Duration.ZERO);
        f26.setRate(1.2);
        
        f27 = new FadeInUpTransition(l4);
        f27.setDelay(Duration.ZERO);
        f27.setRate(1.2);
        
        f28 = new FadeInUpTransition(l5);
        f28.setDelay(Duration.ZERO);
        f28.setRate(1.2);
        
        f29 = new FadeInUpTransition(l6);
        f29.setDelay(Duration.ZERO);
        f29.setRate(1.2);
        
        f30 = new FadeInUpTransition(l7);
        f30.setDelay(Duration.ZERO);
        f30.setRate(1.2);
        
        f31 = new FadeInUpTransition(b12);
        f31.setDelay(Duration.ZERO);
        f31.setRate(1.2);
        
        f32 = new FadeOutUpTransition(l9);
        f32.setDelay(Duration.millis(2000));
        f32.setRate(1.2);
        
        f33 = new FadeInUpTransition(l9);
        f33.setDelay(Duration.ZERO);
        f33.setRate(1.2);
        
        f34 = new FadeInUpTransition(l8);
        f34.setDelay(Duration.ZERO);
        f34.setRate(1.2);
        
        f35 = new FadeInUpTransition(cb1);
        f35.setDelay(Duration.ZERO);
        f35.setRate(1.2);
        
        f36 = new FadeInUpTransition(cb2);
        f36.setDelay(Duration.ZERO);
        f36.setRate(1.2);
        
        
        
        f38 = new FadeInUpTransition(b14);
        f38.setDelay(Duration.ZERO);
        f38.setRate(1.2);
        
        f39 = new FadeInUpTransition(l10);
        f39.setDelay(Duration.ZERO);
        f39.setRate(1.2);
        
        f40 = new FadeInUpTransition(l11);
        f40.setDelay(Duration.ZERO);
        f40.setRate(1.2);
        
        f43 = new FadeInUpTransition(b2);
        f43.setDelay(Duration.ZERO);
        f43.setRate(1.2);
        
        f44 = new FadeInUpTransition(b3);
        f44.setDelay(Duration.ZERO);
        f44.setRate(1.2);
        
        f45 = new FadeInUpTransition(b4);
        f45.setDelay(Duration.ZERO);
        f45.setRate(1.2);
        
        f46 = new FadeInUpTransition(b5);
        f46.setDelay(Duration.ZERO);
        f46.setRate(1.2);
        
        f47 = new FadeInUpTransition(b6);
        f47.setDelay(Duration.ZERO);
        f47.setRate(1.2);
        
        f48 = new FadeInUpTransition(b7);
        f48.setDelay(Duration.ZERO);
        f48.setRate(1.2);
        
        f49 = new FadeInUpTransition(l12);
        f49.setDelay(Duration.ZERO);
        f49.setRate(1.2);
        
        
    }
    
    public void main(Pane root, Login login, Admin admin, Seeker seeker, Provider provider, String user) {
        
        MySqlCommands command = new MySqlCommands();
        
        b2.setOpacity(0);
        b3.setOpacity(0);
        b4.setOpacity(0);
        b5.setOpacity(0);
        b6.setOpacity(0);
        b7.setOpacity(0);
        l12.setOpacity(0);
        
        root.getChildren().addAll(b1, bg1, b2, b3, b4, b5, b6, b7, b18, l12);
        
        f43.play();
        f44.play();
        f45.play();
        f46.play();
        f47.play();
        f48.play();
        f49.play();
        
        b2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                l12.setOpacity(0);

                root.getChildren().addAll(b1, bg1, b2, b3, b4, b5, b6, b7, b18, l12);

                f49.play();
            }
        });
        
        b7.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                login.main(root, login, admin, seeker, provider);
            }
        });
        
        b3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(b1, bg1, b2, b3, b4, b5, b6, b7);
                try {
                    getValues(user);
                } catch (Exception ex) {
                    Logger.getLogger(Seeker.class.getName()).log(Level.SEVERE, null, ex);
                }
                l1.setOpacity(0);
                x1.setOpacity(0);
                x2.setOpacity(0);
                x3.setOpacity(0);
                x4.setOpacity(0);
                x5.setOpacity(0);
                x6.setOpacity(0);
                x7.setOpacity(0);
                x8.setOpacity(0);
                t1.setOpacity(0);
                t2.setOpacity(0);
                t3.setOpacity(0);
                t4.setOpacity(0);
                t5.setOpacity(0);
                t6.setOpacity(0);
                t7.setOpacity(0);
                t8.setOpacity(0);
                b9.setOpacity(0);
                b10.setOpacity(0);
                root.getChildren().addAll(b8, l1, x1, x2, x3, x4, x5, x6, x7, x8, t1, t2, t3, t4, t5, t6, t7, t8, b9, b10);
                f3.play();
                f4.play();
                f5.play();
                f6.play();
                f7.play();
                f8.play();
                f9.play();
                f10.play();
                f11.play();
                f12.play();
                f13.play();
                f14.play();
                f15.play();
                f16.play();
                f17.play();
                f18.play();
                f19.play();
                f20.play();
                f21.play();
                
            }
        });
        
        b9.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                l2.setOpacity(0);
                root.getChildren().clear();
                root.getChildren().addAll(b1, bg1, b2, b3, b4, b5, b6, b7);
                root.getChildren().addAll(b8, l1, x1, x2, x3, x4, x5, x6, x7, x8, t1, t2, t3, t4, t5, t6, t7, t8, b9, b10, l2);
                fname = t1.getText();
                lname = t2.getText();
                email = t3.getText();
                pnum = t4.getText();
                street = t5.getText();
                city = t6.getText();
                state = t7.getText();
                zipcode = t8.getText();
                f2.play();
                f1.play();
                try {
                    command.updatePerson(user, fname, lname, email, pnum, street, city, state, zipcode);
                } catch (Exception ex) {
                    Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b10.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                FileChooser jfile = new FileChooser();
                FileChooser.ExtensionFilter extFilterPDF = new FileChooser.ExtensionFilter("PDF files (*.pdf)", "*.pdf");
                jfile.getExtensionFilters().addAll(extFilterPDF);
                
                File file = jfile.showOpenDialog(null);
                System.out.println(file.length());
                l3.setOpacity(0);
                root.getChildren().addAll(l3);
                f23.play();
                f22.play();
                
                try {
                    command.updateResume(user, file);
                } catch (Exception ex) {
                    Logger.getLogger(Seeker.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(b1, bg1, b2, b3, b4, b5, b6, b7);
                p1.setOpacity(0);
                p2.setOpacity(0);
                p3.setOpacity(0);
                l4.setOpacity(0);
                l5.setOpacity(0);
                l6.setOpacity(0);
                l7.setOpacity(0);
                b12.setOpacity(0);
                p1.clear();
                p2.clear();
                p3.clear();
                root.getChildren().addAll(b11, p1, p2, p3, l4, l5, l6, l7, b12);
                f24.play();
                f25.play();
                f26.play();
                f27.play();
                f28.play();
                f29.play();
                f30.play();
                f31.play();
            }
        });
        
        b12.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                pass1 = p1.getText();
                pass2 = p2.getText();
                pass3 = p3.getText();
                root.getChildren().clear();
                root.getChildren().addAll(b1, bg1, b2, b3, b4, b5, b6, b7);
                root.getChildren().addAll(b11, p1, p2, p3, l4, l5, l6, l7, b12);
                try {
                    if (pass2.equals(pass3) && command.oldPass(user, pass1) == true) {
                        command.updateNewPass(user, pass2);
                        l9.setOpacity(0);
                        root.getChildren().addAll(l9);
                        f33.play();
                        f32.play();
                        p1.clear();
                        p2.clear();
                        p3.clear();
                    }
                    else {
                        l8.setOpacity(0);
                        root.getChildren().addAll(l8);
                        f34.play();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                l10.setOpacity(0);
                cb1.setOpacity(0);
                cb2.setOpacity(0);
                
                b14.setOpacity(0);
                root.getChildren().clear();
                root.getChildren().addAll(b1, bg1, b2, b3, b4, b5, b6, b7);
                root.getChildren().addAll(b13, l10);
                try {
                    options3 = command.getLocation();
                } catch (Exception ex) {
                    Logger.getLogger(Seeker.class.getName()).log(Level.SEVERE, null, ex);
                }
                cb1.getSelectionModel().selectFirst();
                cb2.getSelectionModel().selectFirst();
                cb3 = new ComboBox(options3);
                cb3.setLayoutX(860);
                cb3.setLayoutY(250);
                cb3.setPrefSize(200, 35);
                cb3.getStyleClass().add("combobox");
                cb3.getSelectionModel().selectFirst();
                cb3.setOpacity(0);
                
                f37 = new FadeInUpTransition(cb3);
                f37.setDelay(Duration.ZERO);
                f37.setRate(1.2);
                
                root.getChildren().addAll(cb1, cb2, cb3, b14);
                
                f35.play();
                f36.play();
                f37.play();
                f38.play();
                f39.play();
            }
        });
        
        b14.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(b1, bg1, b2, b3, b4, b5, b6, b7);
                location = cb3.getValue().toString();
                typeo = cb1.getValue().toString();
                typej = cb2.getValue().toString();
                ind1 = 0;
                try {
                    getJobes();
                } catch (Exception ex) {
                    Logger.getLogger(Seeker.class.getName()).log(Level.SEVERE, null, ex);
                }
                root.getChildren().addAll(b15);
                if (ind1 == 0) {
                    l11.setOpacity(0);
                    root.getChildren().addAll(l11);
                    f40.play();
                }
                else {
                    vt = new VBox();
                    vt.setLayoutX(280);
                    vt.setLayoutY(200);
                    scr = new ScrollPane();
                    scr.setLayoutX(230);
                    scr.setLayoutY(150);
                    scr.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                    scr.setPrefSize(300, 300);
                    scr.setContent(vt);
                    f41 = new FadeInUpTransition(vt);
                    f41.setDelay(Duration.ZERO);
                    f41.setRate(1.2);
                    root.getChildren().addAll(scr);
                    try {
                        getAllJobs(root);
                        for (i1 = 0; i1 < ind1; i1++) {
                            but[i1].setOnAction(new EventHandler<ActionEvent>() {
                                int as = i1;
                                @Override
                                public void handle(ActionEvent e1) {
                                    try {
                                        function(root, as, command, user);
                                    } catch (Exception ex) {
                                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            });
                        }
                        
                    } catch (Exception ex) {
                        Logger.getLogger(Seeker.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        });
        
        b6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(b1, bg1, b2, b3, b4, b5, b6, b7);
                root.getChildren().addAll(b17);
                vo = new VBox();
                vo.setLayoutX(550);
                vo.setLayoutY(130);
                scr2 = new ScrollPane();
                scr2.setLayoutX(570);
                scr2.setLayoutY(130);
                scr2.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scr2.setPrefSize(320, 300);
                scr2.setContent(vo);
                f42 = new FadeInUpTransition(vo);
                f42.setDelay(Duration.ZERO);
                f42.setRate(1.2);
                try {
                    getStatus(user);
                } catch (Exception ex) {
                    Logger.getLogger(Seeker.class.getName()).log(Level.SEVERE, null, ex);
                }
                vo.setOpacity(0);
                root.getChildren().add(scr2);
                f42.play();
            }
        });
    }
    
    public void getStatus(String user) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from applied");
        boolean check = false;
        int id = 1;
        while (rs.next()) {
            if (rs.getString("userid").equals(user)) {
                check = true;
                Statement st1 = connect.createStatement();
                ResultSet rs1 = st1.executeQuery("select * from job");
                while (rs1.next()) {
                    if (rs1.getInt("jobid") == rs.getInt("jobid"))
                        break;
                }
                d1 = new Label("Job " + id);
                d1.getStyleClass().add("label3");
                d2 = new Label(rs1.getString("jobtitle"));
                d2.getStyleClass().add("label3");
                d3 = new Label(rs1.getString("cname"));
                d3.getStyleClass().add("label3");
                if (rs.getString("status").equals("waiting")) {
                    d4 = new Label("Status : Waiting");
                    d4.getStyleClass().add("label7");
                }
                else if (rs.getString("status").equals("rejected")) {
                    d4 = new Label("Status : Rejected");
                    d4.getStyleClass().add("label5");
                }
                else {
                    d4 = new Label("Status : Shortlisted");
                    d4.getStyleClass().add("label6");
                }
                id++;
                vo.getChildren().addAll(d1, new Label(), d2, new Label(), d3, new Label(), d4, new Label(), new Label(), new Label());
            }
        }
        
        if (check == false) {
            d1 = new Label("Not Applied Yet");
            d1.getStyleClass().add("label3");
            vo.getChildren().addAll(d1);
        }
    }
    
    public void getValues(String user) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from person");
        while (rs.next()) {
            if (rs.getString("userid").equals(user)) {
                t1.setText(rs.getString("fname"));
                t2.setText(rs.getString("lname"));
                t3.setText(rs.getString("emailid"));
                t4.setText(rs.getString("phone"));
                t5.setText(rs.getString("street"));
                t8.setText(Integer.toString(rs.getInt("zipcode")));
                break;
            }
        }
        ResultSet rs1 = st.executeQuery("select * from zip");
        while (rs1.next()) {
            if (rs1.getInt("zipcode") == Integer.parseInt(t8.getText())) {
                t6.setText(rs1.getString("city"));
                t7.setText(rs1.getString("state"));
                break;
            }
        }
    }
    
    public void getJobes() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from job");
        while (rs.next()) {
            
            if (rs.getString("approved").equals("no"))
                continue;
            
            if (location.equals("Select Location") && typeo.equals("Type of Organistion") && typej.equals("Type of Job")) {
                j1[ind1++] = rs.getInt("jobid");
            }
            
            else if (location.equals("Select Location") && typeo.equals("Type of Organistion")) {
                if (rs.getString("type").equals(typej))
                    j1[ind1++] = rs.getInt("jobid");
            }
            
            else if (location.equals("Select Location") && typej.equals("Type of Job")) {
                Statement st1 = connect.createStatement();
                ResultSet rs1 = st1.executeQuery("select * from company");
                
                boolean check = false;
                
                while (rs1.next()) {
                    if (rs1.getString("cname").equals(rs.getString("cname"))) {
                        check = true;
                        break;
                    }
                }
                if (check == true && rs1.getString("type").equals(typeo))
                    j1[ind1++] = rs.getInt("jobid");
            }
            
            else if (typeo.equals("Type of Organistion") && typej.equals("Type of Job")) {
                Statement st1 = connect.createStatement();
                ResultSet rs1 = st1.executeQuery("select * from company");
                
                boolean check = false;
                while (rs1.next()) {
                    if (rs1.getString("cname").equals(rs.getString("cname"))) { check = true;
                        break;
                    }
                }
                if (check == true && rs1.getString("location").equals(location))
                    j1[ind1++] = rs.getInt("jobid");
            }
            
            else if (location.equals("Select Location")) {
                Statement st1 = connect.createStatement();
                ResultSet rs1 = st1.executeQuery("select * from company");
                boolean check = false;
                while (rs1.next()) {
                    if (rs1.getString("cname").equals(rs.getString("cname"))) { check = true;
                        break;
                    }
                }
                if (check == true && rs1.getString("type").equals(typeo)&& rs.getString("type").equals(typej))
                    j1[ind1++] = rs.getInt("jobid");
            }
            
            else if (typeo.equals("Type of Organistion")) {
                Statement st1 = connect.createStatement();
                boolean check = false;
                ResultSet rs1 = st1.executeQuery("select * from company");
                while (rs1.next()) {
                    if (rs1.getString("cname").equals(rs.getString("cname")))
                        break;
                }
                if (rs1.getString("location").equals(location)&& rs.getString("type").equals(typej)) { check = true;
                    j1[ind1++] = rs.getInt("jobid");
                }
            }
            
            else if (typej.equals("Type of Job")) {
                Statement st1 = connect.createStatement();
                ResultSet rs1 = st1.executeQuery("select * from company");
                boolean check = false;
                while (rs1.next()) {
                    if (rs1.getString("cname").equals(rs.getString("cname"))) { check = true;
                        break;
                    }
                }
                if (check == true && rs1.getString("location").equals(location)&& rs1.getString("type").equals(typeo))
                    j1[ind1++] = rs.getInt("jobid");
            }
            
            else {
                Statement st1 = connect.createStatement();
                ResultSet rs1 = st1.executeQuery("select * from company");
                boolean check = false;
//                System.out.println(rs.getString("cname"));
                while (rs1.next()) {
                    if (rs1.getString("cname").equals(rs.getString("cname"))) {
                        check = true;
                        break;
                    }
                }
                if (check == true && rs1.getString("location").equals(location)&& rs1.getString("type").equals(typeo) && rs.getString("type").equals(typej))
                    j1[ind1++] = rs.getInt("jobid");
            }
        }
        System.out.println(ind1);
    }    
    
    public void getAllJobs(Pane root) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Label tmp = new Label("Jobs");
        tmp.getStyleClass().add("label11");
        vt.getChildren().addAll(tmp, new Label(), new Label());
        for (int i = 0; i < ind1; i++) {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("select * from job");
            while (rs.next()) {
                if (rs.getInt("jobid") == j1[i])
                    break;
            }
            but[i] = new Button("View Job");
            but[i].getStyleClass().add("button13");
            tit[i] = new Label(rs.getString("jobtitle"));
            tit[i].getStyleClass().add("label9");
            vt.getChildren().addAll(tit[i], but[i], new Label(), new Label());
        }
    }
    
    public void function (Pane root, int i2, MySqlCommands command, String user) throws Exception {
        root.getChildren().clear();
        root.getChildren().addAll(b1, bg1, b2, b3, b4, b5, b6, b7);
        root.getChildren().addAll(b15);
        root.getChildren().addAll(scr, b16);
        VBox vtmp = new VBox();
        vtmp.setOpacity(0);
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from job");
        Statement st1 = connect.createStatement();
        ResultSet rs1 = st1.executeQuery("select * from company");
        while (rs.next()) {
            if (rs.getInt("jobid") == j1[i2])
                break;
        }
        while (rs1.next()) {
            if (rs1.getString("cname").equals(rs.getString("cname")))
                break;
        }
        d1 = new Label("Title :                  " + rs.getString("jobtitle"));
        d1.getStyleClass().add("label9");
        d2 = new Label("Job Type :           " + rs.getString("type"));
        d2.getStyleClass().add("label9");
        d3 = new Label("Organisation :     " + rs.getString("cname"));
        d3.getStyleClass().add("label9");
        d4 = new Label("Description :       " + rs.getString("description"));
        d4.getStyleClass().add("label9");
        d5 = new Label("Location :           " + rs1.getString("location"));
        d5.getStyleClass().add("label9");
        d6 = new Label("Deadline :           " + rs.getString("deadline"));
        d6.getStyleClass().add("label9");
        vtmp.getChildren().addAll(d1, new Label(), d2, new Label(), d3,new Label(), d4, new Label(), d5, new Label(), d6);
        Button r1 = new Button("Apply");
        Label ty = new Label("You have successfuly applied");
        ty.getStyleClass().add("label12");
        Transition uy = new FadeInUpTransition(ty);
        uy.setDelay(Duration.ZERO);
        uy.setRate(1.2);
        Transition uy1 = new FadeOutUpTransition(ty);
        uy1.setDelay(Duration.millis(2000));
        uy1.setRate(1.2);
        r1.getStyleClass().add("button13");
        r1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e1) {
                   PreparedStatement ps;
                try {
                    ps = connect.prepareStatement("insert into applied set userid = ?, jobid = ?, status = ?");
                    ps.setString(1, user);
                    ps.setInt(2, j1[i2]);
                    ps.setString(3, "waiting");
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(Seeker.class.getName()).log(Level.SEVERE, null, ex);
                }
                ty.setOpacity(0);
                vtmp.getChildren().clear();
                vtmp.getChildren().addAll(d1, new Label(), d2, new Label(), d3,new Label(), d4, new Label(), d5, new Label(), d6);
                vtmp.getChildren().addAll(new Label(), r1);
                vtmp.getChildren().add(ty);
                uy.play();
                uy1.play();
            }
        });
        vtmp.getChildren().addAll(new Label(), r1);
        vtmp.setOpacity(0);
        Transition tx = new FadeInUpTransition(vtmp);
        tx.setDelay(Duration.ZERO);
        tx.setRate(1.2);
        vtmp.setLayoutX(600);
        vtmp.setLayoutY(180);
        root.getChildren().addAll(vtmp);
        tx.play();
    }
}
