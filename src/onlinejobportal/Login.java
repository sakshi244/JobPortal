package onlinejobportal;

import com.fxexperience.javafx.animation.FadeInUpTransition;
import com.fxexperience.javafx.animation.FadeOutUpTransition;
import com.fxexperience.javafx.animation.RotateInTransition;
import com.fxexperience.javafx.animation.RotateOutTransition;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Login {
    
    private ImageView bgd1;
    private Transition fd1, fd2;

    private ImageView bg1, bg2, bg3;
    private TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    private PasswordField p1, p2;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    private int btn;
    private Label l1, l2, l3, l4, l5, l6, l7;
    private String user, pass, tmp, userid, emailid, password, fname, lname, pnum, dob, type, sex, street, city, state, pincode;
    private Transition f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17;
    private Transition f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34;
    private ToggleGroup g1, g2;
    private RadioButton male, female, provide, seek;
    private boolean check = false;
    
    public void layout() {
        
        bg1 = new ImageView(new Image(Admin.class.getResourceAsStream("files/21.jpg")));
        bg1.setFitWidth(1200);
        bg1.setFitHeight(600);
        
        b1 = new Button("USER LOGIN");
        b1.setLayoutX(95);
        b1.setLayoutY(420);
        b1.setPrefSize(300, 35);
        b1.getStyleClass().addAll("button6");
        
        b2 = new Button("ADMIN LOGIN");
        b2.setLayoutX(95);
        b2.setLayoutY(360);
        b2.setPrefSize(300, 35);
        b2.getStyleClass().addAll("button6");
        
        b3 = new Button("NEXT");
        b3.setLayoutX(995);
        b3.setLayoutY(420);
        b3.setPrefSize(100, 35);
        b3.getStyleClass().addAll("button6");
        
        b4 = new Button("NEXT");
        b4.setLayoutX(995);
        b4.setLayoutY(420);
        b4.setPrefSize(100, 35);
        b4.getStyleClass().addAll("button6");
        
        b7 = new Button("PREVIOUS");
        b7.setLayoutX(795);
        b7.setLayoutY(420);
        b7.setPrefSize(100, 35);
        b7.getStyleClass().addAll("button6");
        
        
        
        b8 = new Button("NEXT");
        b8.setLayoutX(995);
        b8.setLayoutY(420);
        b8.setPrefSize(100, 35);
        b8.getStyleClass().addAll("button6");
        
        b9 = new Button("PREVIOUS");
        b9.setLayoutX(795);
        b9.setLayoutY(420);
        b9.setPrefSize(100, 35);
        b9.getStyleClass().addAll("button6");
        
        
        b10 = new Button("SUBMIT");
        b10.setLayoutX(995);
        b10.setLayoutY(420);
        b10.setPrefSize(100, 35);
        b10.getStyleClass().addAll("button6");
        
        b11 = new Button("PREVIOUS");
        b11.setLayoutX(795);
        b11.setLayoutY(420);
        b11.setPrefSize(100, 35);
        b11.getStyleClass().addAll("button6");
        
        
        
        b5 = new Button();
        b5.setPrefSize(400, 400);
        b5.setLayoutX(750);
        b5.setLayoutY(100);
        b5.setStyle("-fx-background-color: #373836;");
        b5.setOpacity(0.5);
        
        b6 = new Button();
        b6.setPrefSize(400, 400);
        b6.setLayoutX(50);
        b6.setLayoutY(100);
        b6.setStyle("-fx-background-color: #373836;");
        b6.setOpacity(0.5);
        
        t1 = new TextField();
        t1.setPromptText("\t\t\t\t     USER ID");
        t1.setLayoutX(95);
        t1.setLayoutY(220);
        t1.setPrefSize(300, 35);
        
        t4 = new TextField();
        t4.setPromptText("\t\t\t\t  FIRST NAME");
        t4.setLayoutX(795);
        t4.setLayoutY(220);
        t4.setPrefSize(300, 35);
        
        t2 = new TextField();
        t2.setPromptText("\t\t\t\t     USER ID");
        t2.setLayoutX(795);
        t2.setLayoutY(220);
        t2.setPrefSize(300, 35);
        
        t5 = new TextField();
        t5.setPromptText("\t\t\t\t  LAST NAME");
        t5.setLayoutX(795);
        t5.setLayoutY(290);
        t5.setPrefSize(300, 35);
        
        t3 = new TextField();
        t3.setPromptText("\t\t\t\t    EMAIL ID");
        t3.setLayoutX(795);
        t3.setLayoutY(290);
        t3.setPrefSize(300, 35);
        
        t6 = new TextField();
        t6.setPromptText("\t\t\t\tPHONE NUMBER");
        t6.setLayoutX(795);
        t6.setLayoutY(360);
        t6.setPrefSize(300, 35);
        
        t7 = new TextField();
        t7.setPromptText("\t\t\tDATE OF BIRTH (DD/MM/YYYY)");
        t7.setLayoutX(795);
        t7.setLayoutY(220);
        t7.setPrefSize(300, 35);
        
        t8 = new TextField();
        t8.setPromptText("\t\t\t\tSTREET NUMBER");
        t8.setLayoutX(795);
        t8.setLayoutY(220);
        t8.setPrefSize(300, 35);
        
        t9 = new TextField();
        t9.setPromptText("\t\t\t\t   CITY");
        t9.setLayoutX(795);
        t9.setLayoutY(290);
        t9.setPrefSize(300, 35);
        
        t10 = new TextField();
        t10.setPromptText("\t   STATE");
        t10.setLayoutX(795);
        t10.setLayoutY(360);
        t10.setPrefSize(140, 35);
        
        t11 = new TextField();
        t11.setPromptText("\t  PIN CODE");
        t11.setLayoutX(955);
        t11.setLayoutY(360);
        t11.setPrefSize(140, 35);
        
        p2 = new PasswordField();
        p2.setPromptText("\t\t\t\t  PASSWORD");
        p2.setLayoutX(795);
        p2.setLayoutY(360);
        p2.setPrefSize(300, 35);
        
        p1 = new PasswordField();
        p1.setPromptText("\t\t\t\t  PASSWORD");
        p1.setLayoutX(95);
        p1.setLayoutY(290);
        p1.setPrefSize(300, 35);
        
        l1 = new Label("LOGIN");
        l1.setLayoutX(180);
        l1.setLayoutY(130);
        l1.getStyleClass().add("label2");
        
        l3 = new Label("Enter Valid Details");
        l3.setLayoutX(180);
        l3.setLayoutY(190);
        l3.getStyleClass().add("label1");
        
        l6 = new Label("User Id already exist");
        l6.setLayoutX(870);
        l6.setLayoutY(190);
        l6.getStyleClass().add("label1");
        
        l7 = new Label("Email Id already exist");
        l7.setLayoutX(870);
        l7.setLayoutY(190);
        l7.getStyleClass().add("label1");
        
        l4 = new Label("Enter Valid Details");
        l4.setLayoutX(880);
        l4.setLayoutY(190);
        l4.getStyleClass().add("label1");
        
        l5 = new Label("Your account has been created successfully");
        l5.setLayoutX(795);
        l5.setLayoutY(190);
        l5.getStyleClass().add("label1");
        
        l2 = new Label("SIGN UP");
        l2.setLayoutX(870);
        l2.setLayoutY(130);
        l2.getStyleClass().add("label2");
        
        
        g1 = new ToggleGroup();
        male = new RadioButton("Male");
        male.setToggleGroup(g1);
        female = new RadioButton("Female");
        female.setToggleGroup(g1);
        
        male.setLayoutX(845);
        male.setLayoutY(290);
        
        female.setLayoutX(970);
        female.setLayoutY(290);
        
        male.getStyleClass().add("radiobutton");
        female.getStyleClass().add("radiobutton");
        male.setSelected(true);
       
        g2 = new ToggleGroup();
        provide = new RadioButton("Provider");
        provide.setToggleGroup(g2);
        seek = new RadioButton("Seeker");
        seek.setToggleGroup(g2);
        seek.setSelected(true);
        
        
        seek.setLayoutX(845);
        seek.setLayoutY(360);
        
        provide.setLayoutX(970);
        provide.setLayoutY(360);
        
        seek.getStyleClass().add("radiobutton");
        provide.getStyleClass().add("radiobutton");
        
        
        
        f1 = new FadeInUpTransition(t1);
        f1.setDelay(Duration.ZERO);
        f1.setRate(1.2);
        
        f2 = new FadeInUpTransition(t2);
        f2.setDelay(Duration.ZERO);
        f2.setRate(1.2);
        
        f3 = new FadeInUpTransition(t3);
        f3.setDelay(Duration.ZERO);
        f3.setRate(1.2);
        
        f4 = new FadeInUpTransition(p1);
        f4.setDelay(Duration.ZERO);
        f4.setRate(1.2);
        
        f5 = new FadeInUpTransition(p2);
        f5.setDelay(Duration.ZERO);
        f5.setRate(1.2);
        
        f6 = new FadeInUpTransition(b1);
        f6.setDelay(Duration.ZERO);
        f6.setRate(1.2);
        
        f7 = new FadeInUpTransition(b2);
        f7.setDelay(Duration.ZERO);
        f7.setRate(1.2);
        
        f8 = new FadeInUpTransition(b3);
        f8.setDelay(Duration.ZERO);
        f8.setRate(1.2);
        
        f9 = new FadeInUpTransition(l1);
        f9.setDelay(Duration.ZERO);
        f9.setRate(1.2);
        
        f10 = new FadeInUpTransition(l2);
        f10.setDelay(Duration.ZERO);
        f10.setRate(1.2);
        
        f11 = new FadeInUpTransition(l3);
        f11.setDelay(Duration.ZERO);
        f11.setRate(1.2);
        
        f12 = new FadeInUpTransition(l4);
        f12.setDelay(Duration.ZERO);
        f12.setRate(1.2);
        
        f13 = new FadeInUpTransition(t4);
        f13.setDelay(Duration.ZERO);
        f13.setRate(1.2);
        
        f14 = new FadeInUpTransition(t5);
        f14.setDelay(Duration.ZERO);
        f14.setRate(1.2);
        
        f15 = new FadeInUpTransition(t6);
        f15.setDelay(Duration.ZERO);
        f15.setRate(1.2);
        
        f16 = new FadeInUpTransition(b4);
        f16.setDelay(Duration.ZERO);
        f16.setRate(1.2);
        
        f17 = new FadeInUpTransition(b7);
        f17.setDelay(Duration.ZERO);
        f17.setRate(1.2);
        
        f18 = new FadeInUpTransition(t7);
        f18.setDelay(Duration.ZERO);
        f18.setRate(1.2);
        
        f19 = new FadeInUpTransition(male);
        f19.setDelay(Duration.ZERO);
        f19.setRate(1.2);
        
        f20 = new FadeInUpTransition(female);
        f20.setDelay(Duration.ZERO);
        f20.setRate(1.2);
        
        f21 = new FadeInUpTransition(seek);
        f21.setDelay(Duration.ZERO);
        f21.setRate(1.2);
        
        f22 = new FadeInUpTransition(provide);
        f22.setDelay(Duration.ZERO);
        f22.setRate(1.2);
        
        f23 = new FadeInUpTransition(b8);
        f23.setDelay(Duration.ZERO);
        f23.setRate(1.2);
        
        f24 = new FadeInUpTransition(b9);
        f24.setDelay(Duration.ZERO);
        f24.setRate(1.2);
        
        f25 = new FadeInUpTransition(t8);
        f25.setDelay(Duration.ZERO);
        f25.setRate(1.2);
        
        f26 = new FadeInUpTransition(t9);
        f26.setDelay(Duration.ZERO);
        f26.setRate(1.2);
        
        f27 = new FadeInUpTransition(t10);
        f27.setDelay(Duration.ZERO);
        f27.setRate(1.2);
        
        f28 = new FadeInUpTransition(t11);
        f28.setDelay(Duration.ZERO);
        f28.setRate(1.2);
        
        f29 = new FadeInUpTransition(b10);
        f29.setDelay(Duration.ZERO);
        f29.setRate(1.2);
        
        f30 = new FadeInUpTransition(b11);
        f30.setDelay(Duration.ZERO);
        f30.setRate(1.2);
        
        f31 = new FadeOutUpTransition(l5);
        f31.setDelay(Duration.millis(2000));
        
        f32 = new FadeInUpTransition(l5);
        f32.setDelay(Duration.ZERO);
        f32.setRate(1.2);
        
        f33 = new FadeInUpTransition(l6);
        f33.setDelay(Duration.ZERO);
        f33.setRate(1.2);
        
        f34 = new FadeInUpTransition(l7);
        f34.setDelay(Duration.ZERO);
        f34.setRate(1.2);
    }
    
    public void main(Pane root, Login login, Admin admin, Seeker seeker, Provider provider) {
       
        t1.clear();
        p1.clear();
        t2.clear();
        p2.clear();
        t3.clear();
        t4.clear();
        t5.clear();
        t6.clear();
        t7.clear();
        t8.clear();
        t9.clear();
        t10.clear();
        t11.clear();
        
        t1.setOpacity(0);
        p1.setOpacity(0);
        t2.setOpacity(0);
        t3.setOpacity(0);
        p2.setOpacity(0);
        b1.setOpacity(0);
        b2.setOpacity(0);
        l1.setOpacity(0);
        l2.setOpacity(0);
        b3.setOpacity(0);
        
        MySqlCommands command = new MySqlCommands();
        
        
        
        root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t2, t3, p2, b3);
        
        f1.play();
        f2.play();
        f3.play();
        f4.play();
        f5.play();
        f6.play();
        f7.play();
        f7.play();
        f8.play();
        f9.play();
        f10.play();
        
        
        b1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                user = t1.getText();
                pass = p1.getText();
                t2.clear();
                p2.clear();
                t3.clear();
                t4.clear();
                t5.clear();
                t6.clear();
                t7.clear();
                t8.clear();
                t9.clear();
                t10.clear();
                t11.clear();
                root.getChildren().clear();
                if (user.equals("") || pass.equals("")) {
                    root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t2, t3, p2, b3);
                    l3.setOpacity(0);
                    root.getChildren().add(l3);
                    f11.play();
                }
                else {
                    try {
                        tmp = command.UserLogin(user, pass);
                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (tmp.equals("seeker"))
                        seeker.main(root, login, admin, seeker, provider, user);
                    else if (tmp.equals("provider"))
                        try {
                            provider.main(root, login, admin, seeker, provider, user);
                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    else {
                        root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t2, t3, p2, b3);
                        l3.setOpacity(0);
                        root.getChildren().add(l3);
                        f11.play();
                    }
                }
            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                user = t1.getText();
                pass = p1.getText();
                t2.clear();
                p2.clear();
                t3.clear();
                t4.clear();
                t5.clear();
                t6.clear();
                t7.clear();
                t8.clear();
                t9.clear();
                t10.clear();
                t11.clear();
                root.getChildren().clear();
                try {
                    if (user.equals("") || pass.equals("") || command.AdminLogin(user, pass) == false) {
                        root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t2, t3, p2, b3);
                        l3.setOpacity(0);
                        root.getChildren().add(l3);
                        f11.play();
                    }
                    else {
                        admin.main(root, login, admin, seeker, provider);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                userid = t2.getText();
                emailid = t3.getText();
                password = p2.getText();
                t1.clear();
                p1.clear();
                root.getChildren().clear();
                try {
                    if (userid.equals("") || emailid.equals("") || password.equals("")) {
                        root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t2, t3, p2, b3);
                        l4.setOpacity(0);
                        root.getChildren().add(l4);
                        f12.play();
                    }
                    else if (command.userIdExist(userid) == true) {
                        root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t2, t3, p2, b3);
                        l6.setOpacity(0);
                        root.getChildren().add(l6);
                        f33.play();
                    }
                    else if (command.emailIdExist(emailid) == true) {
                        root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t2, t3, p2, b3);
                        l7.setOpacity(0);
                        root.getChildren().add(l7);
                        f34.play();
                    }
                    else {
                        t4.setOpacity(0);
                        t5.setOpacity(0);
                        t6.setOpacity(0);
                        b4.setOpacity(0);
                        b7.setOpacity(0);
                        root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t4, t5, t6, b4, b7);
                        f13.play();
                        f14.play();
                        f15.play();
                        f16.play();
                        f17.play();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b7.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                t1.clear();
                p1.clear();
                t2.setOpacity(0);
                t3.setOpacity(0);
                p2.setOpacity(0);
                b3.setOpacity(0);
                
                root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t2, t3, p2, b3);
                
                f2.play();
                f3.play();
                f8.play();
                f5.play();
            }
        });
        
        b4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
               root.getChildren().clear();
               fname = t4.getText();
               lname = t5.getText();
               pnum = t6.getText();
               t1.clear();
                p1.clear();
               
               if (fname.equals("") || lname.equals("") || pnum.equals("")) {
                   root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t4, t5, t6, b4, b7);
                   l4.setOpacity(0);
                   root.getChildren().add(l4);
                   f12.play();
               }
               else {
                   t7.setOpacity(0);
                   male.setOpacity(0);
                   female.setOpacity(0);
                   seek.setOpacity(0);
                   provide.setOpacity(0);
                   b8.setOpacity(0);
                   b9.setOpacity(0);
                   root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1);
                   root.getChildren().addAll(l2, t7, male, female, seek, provide, b8, b9);
                   f18.play();
                   f19.play();
                   f20.play();
                   f21.play();
                   f22.play();
                   f23.play();
                   f24.play();
               }
            }
        });
        
        b9.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                t4.setOpacity(0);
                t5.setOpacity(0);
                t1.clear();
                p1.clear();
                t6.setOpacity(0);
                b4.setOpacity(0);
                b7.setOpacity(0);
                root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, t4, t5, t6, b4, b7);
                f13.play();
                f14.play();
                f15.play();
                f16.play();
                f17.play();
                 
            }
        });
        
        b8.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                t1.clear();
                p1.clear();
                if (g1.getSelectedToggle().toString().length() == 63)
                    sex = "male";
                else
                    sex = "female";
                if (g2.getSelectedToggle().toString().length() == 65)
                    type = "seeker";
                else
                    type = "provider";
                dob = t7.getText();
                if (dob.equals("")) {
                    root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1);
                    root.getChildren().addAll(l2, t7, male, female, seek, provide, b8, b9);
                    l4.setOpacity(0);
                    root.getChildren().add(l4);
                    f12.play();
                }
                else {
                    t8.setOpacity(0);
                    t9.setOpacity(0);
                    t10.setOpacity(0);
                    t11.setOpacity(0);
                    b10.setOpacity(0);
                    b11.setOpacity(0);
                    root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1);
                    root.getChildren().addAll(l2, t8, t9, t10, t11, b10, b11);
                    f25.play();
                    f26.play();
                    f27.play();
                    f28.play();
                    f29.play();
                    f30.play();
                }
            }
        });
        
        b11.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                t7.setOpacity(0);
                male.setOpacity(0);
                female.setOpacity(0);
                seek.setOpacity(0);
                t1.clear();
                p1.clear();
                provide.setOpacity(0);
                b8.setOpacity(0);
                b9.setOpacity(0);
                root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1);
                root.getChildren().addAll(l2, t7, male, female, seek, provide, b8, b9);
                f18.play();
                f19.play();
                f20.play();
                f21.play();
                f22.play();
                f23.play();
                f24.play();
            }
        });
        
        b10.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                street = t8.getText();
                city = t9.getText();
                state = t10.getText();
                pincode = t11.getText();
                t1.clear();
                p1.clear();
                if (street.equals("") || city.equals("") || state.equals("") || pincode.equals("")) {
                    root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1);
                    root.getChildren().addAll(l2, t8, t9, t10, t11, b10, b11);
                    l4.setOpacity(0);
                    root.getChildren().add(l4);
                    f12.play();
                }
                else {
                    l5.setOpacity(0);
                    root.getChildren().addAll(bg1, b6, b5, t1, p1, b1, b2, l1, l2, l5);
                    f32.play();
                    f31.play();
                    try {
                        command.addProfile(userid, emailid, password, fname, lname, pnum, dob, type, sex, street, city, state, pincode);
                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    t1.clear();
                    p1.clear();
                    t2.clear();
                    p2.clear();
                    t3.clear();
                    t4.clear();
                    t5.clear();
                    t6.clear();
                    t7.clear();
                    t8.clear();
                    t9.clear();
                    t10.clear();
                    t11.clear();
                    t2.setOpacity(0);
                    t3.setOpacity(0);
                    p2.setOpacity(0);
                    b3.setOpacity(0);
                    root.getChildren().addAll(t2, t3, p2, b3);
                    f2.play();
                    f3.play();
                    f5.play();
                    f8.play();
                }
            }
        });
    }
    
}
