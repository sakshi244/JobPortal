package onlinejobportal;

import com.fxexperience.javafx.animation.FadeInUpTransition;
import com.fxexperience.javafx.animation.FadeOutDownTransition;
import com.fxexperience.javafx.animation.FadeOutUpTransition;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Transition;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import javax.swing.event.ChangeListener;

public class Provider {
    
    private ScrollPane scr;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
    private ImageView bg1, bg2, bg3, bg4, bg5, bg6, bg7, bg8, bg9;
    private Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
    private Label l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25;
    private Transition ff, ff1, ff2, ff3, ff4, ff5, ff6, ff7, ff8, ff9, ff10, ff11, ff12, ff13, ff14, ff15, ff16, ff17, ff18, ff19;
    private Transition f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35;
    private Transition f36, f37, f38, f39, f40, f41, f42, f43, f44, f45, f46, f47, f48, f49, f50, f51, f52, f53;
    private Transition f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18;
    private TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15;
    private PasswordField p1, p2, p3;
    private String companyname, type, details, location, pass1, pass2, pass3;
    private String fname, lname, email, pnum, street, city, state, zipcode, title, cname, date, desc;
    private ComboBox cb, cb2, cb3;
    private Label x1, x2, x3, x4, x5, x6, x7, x8;
    private VBox v1;
    private VBox v[] = new VBox[10];
    private String tit[] = new String[10];
    private String company[] = new String[10];
    private String jobtype[] = new String[10];
    private String loc[] = new String[10];
    private String description[] = new String[10];
    private String app[] = new String[10];
    private Label jnum[] = new Label[10];
    private Label titl[] = new Label[10];
    private Label companyl[] = new Label[10];
    private Label jobtypel[] = new Label[10];
    private Label locl[] = new Label[10];
    private Label descriptionl[] = new Label[10];
    private Label appl[] = new Label[10];
    private Button but[] = new Button[20];
    private ScrollBar s1;
    
    ObservableList<String> options = FXCollections.observableArrayList(
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
    
    ObservableList<String> companyName;
    private int jb;
    
    
    public void layout() throws Exception {
        
        s1 = new ScrollBar();
        s1.setMin(0);
        s1.setOrientation(Orientation.VERTICAL);
        s1.setPrefHeight(600);
        s1.setLayoutX(900);
        s1.setLayoutY(0);
        
        
        v1 = new VBox();
        v1.setLayoutX(470);
        v1.setLayoutY(100);
        v1.setPrefSize(500, 200);
        v1.getChildren().add(s1);
        
        
        b1 = new Button();
        b1.setPrefSize(200, 600);
        b1.setStyle("-fx-background-color: #373836;");
        
        x1 = new Label("First Name");
        x1.setLayoutX(350);
        x1.setLayoutY(200);
        x1.getStyleClass().add("label3");
        
        t4 = new TextField();
        t4.setLayoutX(500);
        t4.setLayoutY(205);
        t4.setPrefWidth(200);
        t4.setPrefHeight(30);
        
        x2 = new Label("Last Name");
        x2.setLayoutX(720);
        x2.setLayoutY(200);
        x2.getStyleClass().add("label3");
        
        t8 = new TextField();
        t8.setLayoutX(850);
        t8.setLayoutY(205);
        t8.setPrefWidth(200);
        t8.setPrefHeight(30);
        
        x3 = new Label("Email Id");
        x3.setLayoutX(350);
        x3.setLayoutY(280);
        x3.getStyleClass().add("label3");
        
        t5 = new TextField();
        t5.setLayoutX(500);
        t5.setLayoutY(285);
        t5.setPrefWidth(200);
        t5.setPrefHeight(30);
        
        x4 = new Label("Phone No");
        x4.setLayoutX(720);
        x4.setLayoutY(280);
        x4.getStyleClass().add("label3");
        
        t9 = new TextField();
        t9.setLayoutX(850);
        t9.setLayoutY(285);
        t9.setPrefWidth(200);
        t9.setPrefHeight(30);
        
        
        x5 = new Label("Street No");
        x5.setLayoutX(350);
        x5.setLayoutY(360);
        x5.getStyleClass().add("label3");
        
        t6 = new TextField();
        t6.setLayoutX(500);
        t6.setLayoutY(365);
        t6.setPrefWidth(200);
        t6.setPrefHeight(30);
        
        x6 = new Label("City");
        x6.setLayoutX(720);
        x6.setLayoutY(360);
        x6.getStyleClass().add("label3");
        
        t10 = new TextField();
        t10.setLayoutX(850);
        t10.setLayoutY(365);
        t10.setPrefWidth(200);
        t10.setPrefHeight(30);
        
        t12 = new TextField();
        t12.setLayoutX(710);
        t12.setLayoutY(155);
        t12.setPromptText("Job Title");
        t12.setPrefWidth(310);
        t12.setPrefHeight(30);
        
        
        t14 = new TextField();
        t14.setLayoutX(710);
        t14.setLayoutY(305);
        t14.setPromptText("Application Deadline (dd/mm/yyyy)");
        t14.setPrefWidth(310);
        t14.setPrefHeight(30);
        
        t15 = new TextField();
        t15.setLayoutX(710);
        t15.setLayoutY(355);
        t15.setPromptText("Description (who can apply, salary provided, etc)");
        t15.setAlignment(Pos.TOP_LEFT);
        t15.setPrefWidth(310);
        t15.setPrefHeight(150);
        
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
        
        t11 = new TextField();
        t11.setLayoutX(850);
        t11.setLayoutY(445);
        t11.setPrefWidth(200);
        t11.setPrefHeight(30);
        
        b14 = new Button();
        b14.setPrefSize(785, 450);
        b14.setLayoutX(320);
        b14.setLayoutY(100);
        b14.setOpacity(0.4);
        b14.setStyle("-fx-background-color: #373836;");
        
        cb = new ComboBox(options);
        cb.setLayoutX(650);
        cb.setLayoutY(250);
        cb.setPromptText("Type of Organistaion");
        cb.setPrefSize(320, 35);
        cb.getStyleClass().add("combobox");
        
        cb3 = new ComboBox(options2);
        cb3.getSelectionModel().selectFirst();
        cb3.setLayoutX(710);
        cb3.setLayoutY(255);
        cb3.setPrefSize(310, 30);
        cb3.getStyleClass().add("combobox");
        
        l6 = new Label("Organisation Details");
        l6.setLayoutX(610);
        l6.setLayoutY(130);
        l6.getStyleClass().add("label4");
        
        l17 = new Label("Job Details");
        l17.setLayoutX(655);
        l17.setLayoutY(80);
        l17.getStyleClass().add("label4");
        
        l18 = new Label("Job Title");
        l18.setLayoutX(450);
        l18.setLayoutY(150);
        l18.getStyleClass().add("label3");
        
        l19 = new Label("Company Name");
        l19.setLayoutX(450);
        l19.setLayoutY(200);
        l19.getStyleClass().add("label3");
        
        l25 = new Label("No Job is Added by You");
        l25.setLayoutX(500);
        l25.setLayoutY(190);
        l25.getStyleClass().add("label3");
        
        b19 = new Button();
        b19.setPrefSize(400, 50);
        b19.setLayoutX(450);
        b19.setLayoutY(180);
        b19.setOpacity(0.4);
        b19.setStyle("-fx-background-color: #373836;");
        
        l20 = new Label("Job Type");
        l20.setLayoutX(450);
        l20.setLayoutY(250);
        l20.getStyleClass().add("label3");
        
        l21 = new Label("Application Deadline");
        l21.setLayoutX(450);
        l21.setLayoutY(300);
        l21.getStyleClass().add("label3");
        
        l22 = new Label("Job Description");
        l22.setLayoutX(450);
        l22.setLayoutY(350);
        l22.getStyleClass().add("label3");
        
        l15 = new Label("Your Profile");
        l15.setLayoutX(610);
        l15.setLayoutY(115);
        l15.getStyleClass().add("label4");
        
        l16 = new Label("Your Profile has been Updated Successfully");
        l16.setLayoutX(560);
        l16.setLayoutY(160);
        l16.getStyleClass().add("label1");
        
        l23 = new Label("Enter All Details");
        l23.setLayoutX(670);
        l23.setLayoutY(120);
        l23.getStyleClass().add("label1");
        
        l24 = new Label("Your Details have been sent for admin approval");
        l24.setLayoutX(590);
        l24.setLayoutY(120);
        l24.getStyleClass().add("label1");
        
        l9 = new Label("Change Password");
        l9.setLayoutX(610);
        l9.setLayoutY(160);
        l9.getStyleClass().add("label4");
        
        l7 = new Label("Enter Valid Details");
        l7.setLayoutX(650);
        l7.setLayoutY(175);
        l7.getStyleClass().add("label1");
        
        l8 = new Label("Your Details have been sent for admin approval");
        l8.setLayoutX(590);
        l8.setLayoutY(175);
        l8.getStyleClass().add("label1");
        
        l13 = new Label("Enter Correct Details");
        l13.setLayoutX(660);
        l13.setLayoutY(200);
        l13.getStyleClass().add("label1");
        
        l14 = new Label("Your Password has been changed");
        l14.setLayoutX(625);
        l14.setLayoutY(200);
        l14.getStyleClass().add("label1");
        
        l2 = new Label("Name");
        l2.setLayoutX(500);
        l2.setLayoutY(200);
        l2.getStyleClass().add("label3");
        
        l10 = new Label("Current Password");
        l10.setLayoutX(440);
        l10.setLayoutY(235);
        l10.getStyleClass().add("label3");
        
        t1 = new TextField();
        t1.setLayoutX(650);
        t1.setLayoutY(200);
        t1.setPromptText("Organistaion Name");
        t1.setPrefWidth(320);
        t1.setPrefHeight(35);
        
        p1 = new PasswordField();
        p1.setLayoutX(680);
        p1.setLayoutY(235);
        p1.setPromptText("Current Password");
        p1.setPrefWidth(320);
        p1.setPrefHeight(35);
        
        l3 = new Label("Type");
        l3.setLayoutX(500);
        l3.setLayoutY(250);
        l3.getStyleClass().add("label3");
        
        l4 = new Label("Location");
        l4.setLayoutX(500);
        l4.setLayoutY(300);
        l4.getStyleClass().add("label3");
        
        t2 = new TextField();
        t2.setLayoutX(650);
        t2.setLayoutY(305);
        t2.setPromptText("Organistaion Location");
        t2.setPrefWidth(320);
        t2.setPrefHeight(35);
        
        p2 = new PasswordField();
        p2.setLayoutX(680);
        p2.setLayoutY(295);
        p2.setPromptText("New Password");
        p2.setPrefWidth(320);
        p2.setPrefHeight(35);
        
        l11 = new Label("New Password");
        l11.setLayoutX(440);
        l11.setLayoutY(295);
        l11.getStyleClass().add("label3");
        
        l5 = new Label("Details");
        l5.setLayoutX(500);
        l5.setLayoutY(350);
        l5.getStyleClass().add("label3");
        
        t3 = new TextField();
        t3.setLayoutX(650);
        t3.setLayoutY(360);
        t3.setPromptText("Details (Company Description, Contact Number, etc)");
        t3.setAlignment(Pos.TOP_LEFT);
        t3.setPrefWidth(320);
        t3.setPrefHeight(150);
        
        p3 = new PasswordField();
        p3.setLayoutX(680);
        p3.setLayoutY(350);
        p3.setPromptText("Verify new Password");
        p3.setPrefWidth(320);
        p3.setPrefHeight(35);
        
        l12 = new Label("Verify New Password");
        l12.setLayoutX(440);
        l12.setLayoutY(350);
        l12.getStyleClass().add("label3");
        
        
        b9 = new Button();
        b9.setPrefSize(785, 80);
        b9.setLayoutX(320);
        b9.setLayoutY(135);
        b9.setOpacity(0.4);
        b9.setStyle("-fx-background-color: #373836;");
        
        b10 = new Button();
        b10.setPrefSize(700, 450);
        b10.setLayoutX(380);
        b10.setLayoutY(120);
        b10.setOpacity(0.4);
        b10.setStyle("-fx-background-color: #373836;");
        
        b16 = new Button();
        b16.setPrefSize(700, 500);
        b16.setLayoutX(380);
        b16.setLayoutY(70);
        b16.setOpacity(0.4);
        b16.setStyle("-fx-background-color: #373836;");
        
        b18 = new Button();
        b18.setPrefSize(450, 350);
        b18.setLayoutX(250);
        b18.setLayoutY(150);
        b18.setOpacity(0.4);
        b18.setStyle("-fx-background-color: #373836;");
        
        b12 = new Button();
        b12.setPrefSize(700, 300);
        b12.setLayoutX(380);
        b12.setLayoutY(150);
        b12.setOpacity(0.4);
        b12.setStyle("-fx-background-color: #373836;");
        
        b11 = new Button("Submit");
        b11.setPrefSize(120, 20);
        b11.setLayoutX(850);
        b11.setLayoutY(520);
        b11.getStyleClass().addAll("button5");
        
        b15 = new Button("Update");
        b15.setPrefSize(120, 20);
        b15.setLayoutX(930);
        b15.setLayoutY(500);
        b15.getStyleClass().addAll("button5");
        
        b17 = new Button("Submit");
        b17.setPrefSize(120, 20);
        b17.setLayoutX(900);
        b17.setLayoutY(520);
        b17.getStyleClass().addAll("button5");
        
        b13 = new Button("Submit");
        b13.setPrefSize(120, 20);
        b13.setLayoutX(880);
        b13.setLayoutY(400);
        b13.getStyleClass().addAll("button5");
        
        bg2 = new ImageView(new Image(Admin.class.getResourceAsStream("files/0.png")));
        bg3 = new ImageView(new Image(Admin.class.getResourceAsStream("files/1.png")));
        bg4 = new ImageView(new Image(Admin.class.getResourceAsStream("files/2.png")));
        bg5 = new ImageView(new Image(Admin.class.getResourceAsStream("files/3.png")));
        bg6 = new ImageView(new Image(Admin.class.getResourceAsStream("files/4.png")));
        bg7 = new ImageView(new Image(Admin.class.getResourceAsStream("files/5.png")));
        bg8 = new ImageView(new Image(Admin.class.getResourceAsStream("files/45.png")));
        
        bg9 = new ImageView(new Image(Admin.class.getResourceAsStream("files/img.jpg")));
        bg9.setX(200);
        bg9.setY(0);
        bg9.setFitWidth(1000);
        bg9.setFitHeight(600);
        bg9.setOpacity(0.7);
        
        bg3.setFitHeight(30);
        bg3.setFitWidth(30);
        
        bg4.setFitHeight(28);
        bg4.setFitWidth(28);
        
        bg5.setFitHeight(25);
        bg5.setFitWidth(25);
        
        
        bg6.setFitHeight(30);
        bg6.setFitWidth(30);
        
        bg7.setFitHeight(30);
        bg7.setFitWidth(30);
        
        bg8.setFitHeight(30);
        bg8.setFitWidth(30);
        
        
        b2 = new Button("   Home", bg2);
        b2.setPrefSize(200, 60);
        b2.getStyleClass().addAll("button4");
        
        b3 = new Button("   Edit Profile", bg3);
        b3.setPrefSize(200, 60);
        b3.getStyleClass().addAll("button4");
        b3.setLayoutY(60);
        
        b4 = new Button("   Change Password", bg4);
        b4.setPrefSize(200, 60);
        b4.setLayoutY(120);
        b4.getStyleClass().addAll("button4");
        
        b5 = new Button("    Add Organisation", bg5);
        b5.setPrefSize(200, 60);
        b5.setLayoutY(180);
        b5.getStyleClass().addAll("button4");
        
        b6 = new Button("   Add Job", bg6);
        b6.setPrefSize(200, 60);
        b6.setLayoutY(240);
        b6.getStyleClass().addAll("button4");
        
        b7 = new Button("   View Added Jobs", bg7);
        b7.setPrefSize(200, 60);
        b7.setLayoutY(300);
        b7.getStyleClass().addAll("button4");
        
        b8 = new Button("   Sign Out", bg8);
        b8.setPrefSize(200, 60);
        b8.getStyleClass().addAll("button4");
        b8.setLayoutY(360);
        
        b2.setAlignment(Pos.BASELINE_LEFT);
        b3.setAlignment(Pos.BASELINE_LEFT);
        b4.setAlignment(Pos.BASELINE_LEFT);
        b5.setAlignment(Pos.BASELINE_LEFT);
        b6.setAlignment(Pos.BASELINE_LEFT);
        b7.setAlignment(Pos.BASELINE_LEFT);
        b8.setAlignment(Pos.BASELINE_LEFT);
        
        bg1 = new ImageView(new Image(Admin.class.getResourceAsStream("files/bg1.png")));
        bg1.setX(0);
        bg1.setY(0);
        bg1.setFitWidth(1200);
        bg1.setFitHeight(600);
        
        bg2 = new ImageView(new Image(Admin.class.getResourceAsStream("files/home_pr.png")));
        bg2.setX(550);
        bg2.setY(230);
        
        l1 = new Label("Provide Better So They Can Choose Better");
        l1.setLayoutX(350);
        l1.setLayoutY(150);
        l1.getStyleClass().add("label2");
        
        f1 = new FadeInUpTransition(x1);
        f1.setDelay(Duration.ZERO);
        f1.setRate(1.2);
        
        f2 = new FadeInUpTransition(x2);
        f2.setDelay(Duration.ZERO);
        f2.setRate(1.2);
        
        f3 = new FadeInUpTransition(x3);
        f3.setDelay(Duration.ZERO);
        f3.setRate(1.2);
        
        f4 = new FadeInUpTransition(x4);
        f4.setDelay(Duration.ZERO);
        f4.setRate(1.2);
        
        f5 = new FadeInUpTransition(x5);
        f5.setDelay(Duration.ZERO);
        f5.setRate(1.2);
        
        f6 = new FadeInUpTransition(x6);
        f6.setDelay(Duration.ZERO);
        f6.setRate(1.2);
        
        f7 = new FadeInUpTransition(x7);
        f7.setDelay(Duration.ZERO);
        f7.setRate(1.2);
        
        f8 = new FadeInUpTransition(x8);
        f8.setDelay(Duration.ZERO);
        f8.setRate(1.2);
        
        f9 = new FadeInUpTransition(t4);
        f9.setDelay(Duration.ZERO);
        f9.setRate(1.2);
        
        f10 = new FadeInUpTransition(t5);
        f10.setDelay(Duration.ZERO);
        f10.setRate(1.2);
        
        f11 = new FadeInUpTransition(t6);
        f11.setDelay(Duration.ZERO);
        f11.setRate(1.2);
        
        f12 = new FadeInUpTransition(t7);
        f12.setDelay(Duration.ZERO);
        f12.setRate(1.2);
        
        f13 = new FadeInUpTransition(t8);
        f13.setDelay(Duration.ZERO);
        f13.setRate(1.2);
        
        f14 = new FadeInUpTransition(t9);
        f14.setDelay(Duration.ZERO);
        f14.setRate(1.2);
        
        f15 = new FadeInUpTransition(t10);
        f15.setDelay(Duration.ZERO);
        f15.setRate(1.2);
        
        f16 = new FadeInUpTransition(t11);
        f16.setDelay(Duration.ZERO);
        f16.setRate(1.2);
        
        f17 = new FadeInUpTransition(l15);
        f17.setDelay(Duration.ZERO);
        f17.setRate(1.2);
        
        f18 = new FadeInUpTransition(b15);
        f18.setDelay(Duration.ZERO);
        f18.setRate(1.2);
        
        ff = new FadeInUpTransition(b9);
        ff.setDelay(Duration.ZERO);
        ff.setRate(1.2);
        
        ff2 = new FadeInUpTransition(l1);
        ff2.setDelay(Duration.ZERO);
        ff2.setRate(1.2);
        
        ff3 = new FadeInUpTransition(b2);
        ff3.setDelay(Duration.ZERO);
        ff3.setRate(1.2);
        
        ff4 = new FadeInUpTransition(b3);
        ff4.setDelay(Duration.ZERO);
        ff4.setRate(1.2);
        
        ff5 = new FadeInUpTransition(b4);
        ff5.setDelay(Duration.ZERO);
        ff5.setRate(1.2);
        
        ff6 = new FadeInUpTransition(b5);
        ff6.setDelay(Duration.ZERO);
        ff6.setRate(1.2);
        
        ff7 = new FadeInUpTransition(b6);
        ff7.setDelay(Duration.ZERO);
        ff7.setRate(1.2);
        
        ff8 = new FadeInUpTransition(b7);
        ff8.setDelay(Duration.ZERO);
        ff8.setRate(1.2);
        
        ff9 = new FadeInUpTransition(b8);
        ff9.setDelay(Duration.ZERO);
        ff9.setRate(1.2);
        
        ff10 = new FadeInUpTransition(l2);
        ff10.setDelay(Duration.ZERO);
        ff10.setRate(1.2);
        
        ff11 = new FadeInUpTransition(l3);
        ff11.setDelay(Duration.ZERO);
        ff11.setRate(1.2);
        
        ff12 = new FadeInUpTransition(l4);
        ff12.setDelay(Duration.ZERO);
        ff12.setRate(1.2);
        
        ff13 = new FadeInUpTransition(l5);
        ff13.setDelay(Duration.ZERO);
        ff13.setRate(1.2);
        
        ff14 = new FadeInUpTransition(t1);
        ff14.setDelay(Duration.ZERO);
        ff14.setRate(1.2);
        
        ff15 = new FadeInUpTransition(t2);
        ff15.setDelay(Duration.ZERO);
        ff15.setRate(1.2);
        
        ff16 = new FadeInUpTransition(t3);
        ff16.setDelay(Duration.ZERO);
        ff16.setRate(1.2);
        
        ff17 = new FadeInUpTransition(cb);
        ff17.setDelay(Duration.ZERO);
        ff17.setRate(1.2);
        
        ff18 = new FadeInUpTransition(l6);
        ff18.setDelay(Duration.ZERO);
        ff18.setRate(1.2);
        
        ff19 = new FadeInUpTransition(b11);
        ff19.setDelay(Duration.ZERO);
        ff19.setRate(1.2);
        
        f20 = new FadeInUpTransition(l7);
        f20.setDelay(Duration.ZERO);
        f20.setRate(1.2);
    
        f21 = new FadeInUpTransition(l8);
        f21.setDelay(Duration.ZERO);
        f21.setRate(1.2);
        
        f22 = new FadeOutDownTransition(l8);
        f22.setDelay(Duration.millis(2000));
        f22.setRate(1.2);
        
        f23 = new FadeInUpTransition(p1);
        f23.setDelay(Duration.ZERO);
        f23.setRate(1.2);
        
        f24 = new FadeInUpTransition(p2);
        f24.setDelay(Duration.ZERO);
        f24.setRate(1.2);
        
        f25 = new FadeInUpTransition(p3);
        f25.setDelay(Duration.ZERO);
        f25.setRate(1.2);
        
        f26 = new FadeInUpTransition(l9);
        f26.setDelay(Duration.ZERO);
        f26.setRate(1.2);
        
        f27 = new FadeInUpTransition(l10);
        f27.setDelay(Duration.ZERO);
        f27.setRate(1.2);
        
        f28 = new FadeInUpTransition(l11);
        f28.setDelay(Duration.ZERO);
        f28.setRate(1.2);
        
        f29 = new FadeInUpTransition(l12);
        f29.setDelay(Duration.ZERO);
        f29.setRate(1.2);
        
        f30 = new FadeInUpTransition(b13);
        f30.setDelay(Duration.ZERO);
        f30.setRate(1.2);
        
        f31 = new FadeInUpTransition(l13);
        f31.setDelay(Duration.ZERO);
        f31.setRate(1.2);
        
        f32 = new FadeOutUpTransition(l14);
        f32.setDelay(Duration.millis(2000));
        f32.setRate(1.2);
        
        f33 = new FadeInUpTransition(l14);
        f33.setDelay(Duration.ZERO);
        f33.setRate(1.2);
        
        f34 = new FadeOutUpTransition(l16);
        f34.setDelay(Duration.millis(2000));
        f34.setRate(1.2);
        
        f35 = new FadeInUpTransition(l17);
        f35.setDelay(Duration.ZERO);
        f35.setRate(1.2);
        
        f36 = new FadeInUpTransition(l18);
        f36.setDelay(Duration.ZERO);
        f36.setRate(1.2);
        
        f37 = new FadeInUpTransition(l19);
        f37.setDelay(Duration.ZERO);
        f37.setRate(1.2);
        
        f38 = new FadeInUpTransition(l20);
        f38.setDelay(Duration.ZERO);
        f38.setRate(1.2);
        
        f39 = new FadeInUpTransition(l21);
        f39.setDelay(Duration.ZERO);
        f39.setRate(1.2);
        
        f40 = new FadeInUpTransition(l22);
        f40.setDelay(Duration.ZERO);
        f40.setRate(1.2);
        
        f41 = new FadeInUpTransition(t12);
        f41.setDelay(Duration.ZERO);
        f41.setRate(1.2);
        
        f42 = new FadeInUpTransition(t14);
        f42.setDelay(Duration.ZERO);
        f42.setRate(1.2);
        
        f43 = new FadeInUpTransition(t15);
        f43.setDelay(Duration.ZERO);
        f43.setRate(1.2);
        
        
        f45 = new FadeInUpTransition(cb3);
        f45.setDelay(Duration.ZERO);
        f45.setRate(1.2);
        
        f46 = new FadeInUpTransition(b17);
        f46.setDelay(Duration.ZERO);
        f46.setRate(1.2);
        
        MySqlCommands command = new MySqlCommands();
        
        companyName = command.getCompanyList();
        cb2 = new ComboBox(companyName);
        cb2.setLayoutX(710);
        cb2.setLayoutY(205);
        cb2.setPrefSize(310, 30);
        cb2.getStyleClass().add("combobox");
        cb2.getSelectionModel().selectFirst();
        
        f44 = new FadeInUpTransition(cb2);
        f44.setDelay(Duration.ZERO);
        f44.setRate(1.2);
        
        f47 = new FadeInUpTransition(l23);
        f47.setDelay(Duration.ZERO);
        f47.setRate(1.2);
        
        f48 = new FadeOutUpTransition(l24);
        f48.setDelay(Duration.millis(2000));
        f48.setRate(1.2);
        
        f49 = new FadeInUpTransition(l24);
        f49.setDelay(Duration.ZERO);
        f49.setRate(1.2);
        
        f50 = new FadeInUpTransition(l16);
        f50.setDelay(Duration.ZERO);
        f50.setRate(1.2);
        
        f51 = new FadeInUpTransition(v1);
        f51.setDelay(Duration.ZERO);
        f51.setRate(1.2);
        
        f52 = new FadeInUpTransition(l25);
        f52.setDelay(Duration.ZERO);
        f52.setRate(1.2);
        
    }
    
    public void main(Pane root, Login login, Admin admin, Seeker seeker, Provider provider, String user) throws Exception {
        
        MySqlCommands command = new MySqlCommands();
        
        l1.setOpacity(0);
        b2.setOpacity(0);
        b3.setOpacity(0);
        b4.setOpacity(0);
        b5.setOpacity(0);
        b6.setOpacity(0);
        b7.setOpacity(0);
        b8.setOpacity(0);
        
        root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9, b9, l1);
     
        ff2.play();
        ff3.play();
        ff4.play();
        ff5.play();
        ff6.play();
        ff7.play();
        ff8.play();
        ff9.play();
        
        t1.clear();
        t2.clear();
        t3.clear();
        
        
        b2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                l1.setOpacity(0);
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9, b9, l1);
                
                ff2.play();
            }
        });
        
        b8.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                login.main(root, login, admin, seeker, provider);
            }
        });
        
        b5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                l2.setOpacity(0);
                l3.setOpacity(0);
                l4.setOpacity(0);
                l5.setOpacity(0);
                l6.setOpacity(0);
                t1.setOpacity(0);
                t2.setOpacity(0);
                t3.setOpacity(0);
                cb.setOpacity(0);
                b11.setOpacity(0);
                cb.getSelectionModel().selectFirst();
                t1.clear();
                t2.clear();
                t3.clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9, b10, l2, l3, l4, l5, t1, t2, t3, l6, cb);
                root.getChildren().addAll(b11);
                ff10.play();
                ff11.play();
                ff12.play();
                ff13.play();
                ff14.play();
                ff15.play();
                ff16.play();
                ff17.play();
                ff18.play();
                ff19.play();
            }
        });
        
        b11.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                companyname = t1.getText();
                type = cb.getValue().toString();
                location = t2.getText();
                details = t3.getText();
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9, b10, l2, l3, l4, l5, t1, t2, t3, l6, cb);
                root.getChildren().addAll(b11);
                if (companyname.equals("") || location.equals("") || details.equals("")) {
                    l7.setOpacity(0);
                    root.getChildren().add(l7);
                    f20.play();
                }
                else {
                    t1.clear();
                    t2.clear();
                    t3.clear();
                    cb.getSelectionModel().selectFirst();
                    l8.setOpacity(0);
                    try {
                        command.addOrganisation(companyname, type, location, details);
                    } catch (Exception ex) {
                        Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    root.getChildren().add(l8);
                    f21.play();
                    f22.play();
                }
            }
        });
        
        b4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                p1.setOpacity(0);
                p2.setOpacity(0);
                p3.setOpacity(0);
                l9.setOpacity(0);
                l10.setOpacity(0);
                l11.setOpacity(0);
                l12.setOpacity(0);
                b13.setOpacity(0);
                p1.clear();
                p2.clear();
                p3.clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9, b12, l9, p1, p2, p3, l10, l11, l12, b13);
                f23.play();
                f24.play();
                f25.play();
                f26.play();
                f27.play();
                f28.play();
                f29.play();
                f30.play();
            }
        });
        
        b13.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                pass1 = p1.getText();
                pass2 = p2.getText();
                pass3 = p3.getText();
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9, b12, l9, p1, p2, p3, l10, l11, l12, b13);
                try {
                    if (pass2.equals(pass3) && command.oldPass(user, pass1) == true) {
                        command.updateNewPass(user, pass2);
                        l14.setOpacity(0);
                        root.getChildren().addAll(l14);
                        f33.play();
                        f32.play();
                        p1.clear();
                        p2.clear();
                        p3.clear();
                    }
                    else {
                        l13.setOpacity(0);
                        root.getChildren().addAll(l13);
                        f31.play();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9);
                try {
                    getValues(user);
                } catch (Exception ex) {
                    Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                }
                x1.setOpacity(0);
                x2.setOpacity(0);
                x3.setOpacity(0);
                x4.setOpacity(0);
                x5.setOpacity(0);
                x6.setOpacity(0);
                x7.setOpacity(0);
                x8.setOpacity(0);
                t4.setOpacity(0);
                t5.setOpacity(0);
                t6.setOpacity(0);
                t7.setOpacity(0);
                t8.setOpacity(0);
                t9.setOpacity(0);
                t10.setOpacity(0);
                t11.setOpacity(0);
                b15.setOpacity(0);
                l15.setOpacity(0);
                root.getChildren().addAll(b14, l15, x1, x2, x3, x4, x5, x6, x7, x8, t4, t5, t6, t7, t8, t9, t10, t11, b15);
                f1.play();
                f2.play();
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
            }
        });
        
        b15.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                l16.setOpacity(0);
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9);
                root.getChildren().addAll(b14, l15, x1, x2, x3, x4, x5, x6, x7, x8, t4, t5, t6, t7, t8, t9, t10, t11, b15, l16);
                fname = t4.getText();
                lname = t8.getText();
                email = t5.getText();
                pnum = t9.getText();
                street = t6.getText();
                city = t10.getText();
                state = t7.getText();
                zipcode = t11.getText();
                f50.play();
                f34.play();
                try {
                    command.updatePerson(user, fname, lname, email, pnum, street, city, state, zipcode);
                } catch (Exception ex) {
                    Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                t12.clear();
                t14.clear();
                t15.clear();
                try {
                    companyName = command.getCompanyList();
                } catch (Exception ex) {
                    Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                }
                cb2 = new ComboBox(companyName);
                cb2.setLayoutX(710);
                cb2.setLayoutY(205);
                cb2.setPrefSize(310, 30);
                cb2.getStyleClass().add("combobox");
                cb2.getSelectionModel().selectFirst();
                cb3.getSelectionModel().selectFirst();
                l17.setOpacity(0);
                l18.setOpacity(0);
                l19.setOpacity(0);
                l20.setOpacity(0);
                l21.setOpacity(0);
                l22.setOpacity(0);
                t12.setOpacity(0);
                t14.setOpacity(0);
                t15.setOpacity(0);
                cb2.setOpacity(0);
                cb3.setOpacity(0);
                b17.setOpacity(0);
                f44 = new FadeInUpTransition(cb2);
                f44.setRate(1.2);
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9, b16);
                root.getChildren().addAll(l17, l18, l19, l20, l21, l22, t12, t14, t15, cb2, cb3, b17);
                f35.play();
                f36.play();
                f37.play();
                f38.play();
                f39.play();
                f40.play();
                f41.play();
                f42.play();
                f43.play();
                f44.play();
                f45.play();
                f46.play();
            }
        });
        
        b17.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9, b16);
                root.getChildren().addAll(l17, l18, l19, l20, l21, l22, t12, t14, t15, cb2, cb3, b17);
                title = t12.getText();
                cname = cb2.getValue().toString();
                type = cb3.getValue().toString();
                date = t14.getText();
                desc = t15.getText();
                if (title.equals("") || date.equals("") || desc.equals("")) {
                    l23.setOpacity(0);
                    root.getChildren().addAll(l23);
                    f47.play();
                }
                else {
                    l24.setOpacity(0);
                    root.getChildren().add(l24);
                    t12.clear();
                    t14.clear();
                    t15.clear();
                    cb2.getSelectionModel().selectFirst();
                    cb3.getSelectionModel().selectFirst();
                    f49.play();
                    f48.play();
                    try {
                        command.updateCompany(title, cname, type, date, desc, user);
                    } catch (Exception ex) {
                        Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        
        b7.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                v1.getChildren().clear();
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9);
                int job = 0;
                try {
                    job = addDetailstoVBox(user, root);
                } catch (Exception ex) {
                    Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                }
                v1.setOpacity(0);
                scr = new ScrollPane();
                scr.setLayoutX(270);
                scr.setLayoutY(150);
                scr.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scr.setPrefSize(440, 350);
                scr.setContent(v1);
                
                if (job == 0) {
                    l25.setOpacity(0);
                    root.getChildren().addAll(b19, l25);
                    f52.play();
                }
                else {
                    root.getChildren().addAll(b18, scr);
                    f51.play();
                }
                
            }
        });
    }
    
    
    
    public int addDetailstoVBox(String user, Pane root) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from post");
        int i = 0;
        while (rs.next()) {
            if (rs.getString("userid").equals(user)) {
                jb = rs.getInt("jobid");
                Statement st1 = connect.createStatement();
                ResultSet rs1 = st1.executeQuery("select * from job");
                while (rs1.next()) {
                    if (rs1.getInt("jobid") == jb) {
                        tit[i] = rs1.getString("jobtitle");
                        company[i] = rs1.getString("cname");
                        jobtype[i] = rs1.getString("type");
                        description[i] = rs1.getString("description");
                        app[i] = rs1.getString("approved");
                        Statement st2 = connect.createStatement();
                        ResultSet rs2 = st2.executeQuery("select * from company");
                        while (rs2.next()) {
                            if (rs2.getString("cname").equals(company[i])) {
                                loc[i] = rs2.getString("location");
                                break;
                            }
                        }
                        i++;
                        break;
                    }
                }
            }
        }
        for (int j = 0; j < i; j++) {
            v[j] = new VBox();
            jnum[j] = new Label("Job Number " + (j+1) + "\n\n");
            jnum[j].getStyleClass().add("label8");
            titl[j] = new Label("Job Title :      " + tit[j]);
            titl[j].getStyleClass().add("label8");
            companyl[j] = new Label("Company :    " + company[j]);
            companyl[j].getStyleClass().add("label8");
            jobtypel[j] = new Label("Job Type :     " + jobtype[j]);
            jobtypel[j].getStyleClass().add("label8");
            descriptionl[j] = new Label("Description : " + description[j]);
            descriptionl[j].getStyleClass().add("label8");
            if (app[j].equals("no"))
                app[j] = "Not Approved";
            else 
                app[j] = "Approved";
            appl[j] = new Label("Status :          " + app[j]);
            if (app[j].equals("Not Approved"))
                appl[j].getStyleClass().add("label5");
            else
                appl[j].getStyleClass().add("label6");
            locl[j] = new Label("Location :      " + loc[j]);
            locl[j].getStyleClass().add("label8");
            v[j].getChildren().addAll(jnum[j], new Label("        "), titl[j], companyl[j], jobtypel[j], locl[j], descriptionl[j], appl[j]);
            if (app[j].equals("Approved")) {
                but[j] = new Button("View Applicants");
                but[j].getStyleClass().add("button5");
                but[j].setOnAction(new EventHandler<ActionEvent>() {
                    int as = jb;
                    @Override
                    public void handle(ActionEvent e1) {
                        try {
                            function(jb, root);
                        } catch (Exception ex) {
                            Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                v[j].getChildren().addAll(but[j]);
            }
            v[j].getChildren().addAll(new Label("        "), new Label("        "));
            v1.getChildren().addAll(v[j]);
            
        }
        return i;
    }
    
    int it = 0;
    
    public void function (int jb, Pane root) throws Exception {
        root.getChildren().clear();
        root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, bg9, b18, scr);
        VBox tmpv = new VBox();
        Button but = new Button();
        but.setLayoutX(720);
        but.setLayoutY(150);
        but.setPrefSize(400, 350);
        but.setOpacity(0.4);
        but.setStyle("-fx-background-color: #373836;");
        ScrollPane s = new ScrollPane();
        s.setLayoutX(730);
        s.setLayoutY(160);
        s.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        s.setPrefSize(380, 330);
        s.setContent(tmpv);
        
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from applied");

        
        it = 0;
        
        while (rs.next()) {
            if (rs.getInt("jobid") == jb) {
                Label d1 = new Label(rs.getString("userid"));
                d1.getStyleClass().add("label4");
                Button ba= new Button("Approve");
                ba.getStyleClass().add("button10");
                ba.setPrefSize(200, 20);
                Button bd = new Button("Disaprove");
                bd.getStyleClass().add("button11");
                bd.setPrefSize(200, 20);
                ba.setOnAction(new EventHandler<ActionEvent>() {
                    String sp = rs.getString("userid");
                    int tmp = rs.getInt("jobid");
                    @Override
                    public void handle(ActionEvent e1) {
                        try {
                            PreparedStatement ps1 = connect.prepareStatement("update applied set status = ? where jobid = ? and userid = ?");
                            ps1.setString(1, "shortlisted");
                            ps1.setInt(2, tmp);
                            ps1.setString(3, sp);
                            System.out.println(sp + " " + tmp);
                            ps1.executeUpdate();
                        } catch (SQLException ex) {
                            Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                bd.setOnAction(new EventHandler<ActionEvent>() {
                    String sp = rs.getString("userid");
                    int tmp = rs.getInt("jobid");
                    @Override
                    public void handle(ActionEvent e1) {
                        try {
                            PreparedStatement ps1 = connect.prepareStatement("update applied set status = ? where jobid = ? and userid = ?");
                            ps1.setString(1, "rejected");
                            ps1.setInt(2, tmp);
                            ps1.setString(3, sp);
                            ps1.executeUpdate();
                        } catch (SQLException ex) {
                            Logger.getLogger(Provider.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                tmpv.getChildren().addAll(d1, ba, bd, new Label(), new Label());
                it++;
            }
        }
        
        Transition st1 = new FadeInUpTransition(s);
        
        s.setOpacity(0);
        
        root.getChildren().addAll(but, s);
        
        st1.play();
    }
    
    public void getValues(String user) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from person");
        while (rs.next()) {
            if (rs.getString("userid").equals(user)) {
                t4.setText(rs.getString("fname"));
                t8.setText(rs.getString("lname"));
                t5.setText(rs.getString("emailid"));
                t9.setText(rs.getString("phone"));
                t6.setText(rs.getString("street"));
                t11.setText(Integer.toString(rs.getInt("zipcode")));
                break;
            }
        }
        ResultSet rs1 = st.executeQuery("select * from zip");
        while (rs1.next()) {
            if (rs1.getInt("zipcode") == Integer.parseInt(t11.getText())) {
                t10.setText(rs1.getString("city"));
                t7.setText(rs1.getString("state"));
                break;
            }
        }
    }
    
}
