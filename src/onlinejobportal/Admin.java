package onlinejobportal;

import com.fxexperience.javafx.animation.FadeInUpTransition;
import com.fxexperience.javafx.animation.FadeOutUpTransition;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class Admin {

    private Button b1, b2, b3, b4, b5, b6, b7, b8, bgB, b10, b11, b12, b13;
    private ImageView bg1, bg2, bg3, bg4, bg5, bg6, bg7, bg8;
    private Label l1, l2, l3, l4, l5, l6, l7;
    private Label d1, d2, d3, d4, d5, d6, d7, d8;
    private PasswordField p1, p2, p3;
    private Transition f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13;
    private Transition ff1, ff2, ff3, ff4, ff5, ff6, ff7, ff8;
    private String pass1, pass2, pass3;
    private String seek[] = new String[20];
    private Button butseek[] = new Button[20];
    private String prov[] = new String[20];
    private String org[] = new String[20];
    private String stat[] = new String[20];
    private Integer tsk[] = new Integer[20];
    private Button butprov[] = new Button[20];
    private Button butorg[] = new Button[20];
    private Button butapp[] = new Button[20];
    private Button butdis[] = new Button[20];
    private Button buttsk[] = new Button[20];
    private Label lp[] = new Label[20];
    private Label ls[] = new Label[20];
    private Label lo[] = new Label[20];
    private Label lt[] = new Label[20];
    private VBox vp, vs, vo, vt;
    private int num, i1;
    private ScrollPane scr, scr2, scr3, scr4;

    public void layout() {
        b1 = new Button();
        b1.setPrefSize(200, 600);
        b1.setStyle("-fx-background-color: #373836;");

        bg2 = new ImageView(new Image(Admin.class.getResourceAsStream("files/0.png")));
        bg3 = new ImageView(new Image(Admin.class.getResourceAsStream("files/2.png")));
        bg4 = new ImageView(new Image(Admin.class.getResourceAsStream("files/1.png")));
        bg5 = new ImageView(new Image(Admin.class.getResourceAsStream("files/1.png")));
        bg6 = new ImageView(new Image(Admin.class.getResourceAsStream("files/3.png")));
        bg7 = new ImageView(new Image(Admin.class.getResourceAsStream("files/4.png")));
        bg8 = new ImageView(new Image(Admin.class.getResourceAsStream("files/45.png")));

        bg1 = new ImageView(new Image(Admin.class.getResourceAsStream("files/img.jpg")));
        bg1.setX(200);
        bg1.setY(0);
        bg1.setFitWidth(1000);
        bg1.setFitHeight(600);

        bg3.setFitHeight(30);
        bg3.setFitWidth(30);

        bg4.setFitHeight(30);
        bg4.setFitWidth(30);

        bg5.setFitHeight(30);
        bg5.setFitWidth(30);

        bg6.setFitHeight(30);
        bg6.setFitWidth(30);

        bg7.setFitHeight(30);
        bg7.setFitWidth(30);

        bg8.setFitHeight(30);
        bg8.setFitWidth(30);

        b2 = new Button("   Home", bg2);
        b2.setPrefSize(200, 60);
        b2.getStyleClass().addAll("button7");

        b3 = new Button("   Change Password", bg3);
        b3.setPrefSize(200, 60);
        b3.getStyleClass().addAll("button7");
        b3.setLayoutY(60);

        b4 = new Button("   Seeker's Profile", bg4);
        b4.setPrefSize(200, 60);
        b4.getStyleClass().addAll("button7");
        b4.setLayoutY(120);

        b5 = new Button("   Provider's Profile", bg5);
        b5.setPrefSize(200, 60);
        b5.getStyleClass().addAll("button7");
        b5.setLayoutY(180);

        b6 = new Button("   All Organisations", bg6);
        b6.setPrefSize(200, 60);
        b6.getStyleClass().addAll("button7");
        b6.setLayoutY(240);

        b7 = new Button("   All jobs", bg7);
        b7.setPrefSize(200, 60);
        b7.getStyleClass().addAll("button7");
        b7.setLayoutY(300);

        b8 = new Button("   Sign Out", bg8);
        b8.setPrefSize(200, 60);
        b8.getStyleClass().addAll("button7");
        b8.setLayoutY(360);

        b2.setAlignment(Pos.BASELINE_LEFT);
        b3.setAlignment(Pos.BASELINE_LEFT);
        b4.setAlignment(Pos.BASELINE_LEFT);
        b5.setAlignment(Pos.BASELINE_LEFT);
        b6.setAlignment(Pos.BASELINE_LEFT);
        b7.setAlignment(Pos.BASELINE_LEFT);
        b8.setAlignment(Pos.BASELINE_LEFT);

        bgB = new Button();
        bgB.setPrefSize(600, 400);
        bgB.setLayoutX(400);
        bgB.setLayoutY(100);
        bgB.setOpacity(0.4);
        bgB.setStyle("-fx-background-color: #373836;");

        b11 = new Button();
        b11.setPrefSize(300, 300);
        b11.setLayoutX(230);
        b11.setLayoutY(150);
        b11.setOpacity(0.4);
        b11.setStyle("-fx-background-color: #373836;");
        
        b13 = new Button();
        b13.setPrefSize(300, 100);
        b13.setLayoutX(700);
        b13.setLayoutY(80);
        b13.setOpacity(0.4);
        b13.setStyle("-fx-background-color: #373836;");
        
        b12 = new Button();
        b12.setPrefSize(500, 400);
        b12.setLayoutX(580);
        b12.setLayoutY(150);
        b12.setOpacity(0.6);
        b12.setStyle("-fx-background-color: #373836;");

        l1 = new Label("Change Password");
        l1.setLayoutX(580);
        l1.setLayoutY(120);
        l1.getStyleClass().add("label4");
        
        l7 = new Label("Choose Wisely");
        l7.setLayoutX(720);
        l7.setLayoutY(100);
        l7.getStyleClass().add("label2");

        l2 = new Label("Old Password");
        l2.setLayoutX(450);
        l2.setLayoutY(200);
        l2.getStyleClass().add("label3");

        l3 = new Label("New Passowrd");
        l3.setLayoutX(450);
        l3.setLayoutY(270);
        l3.getStyleClass().add("label3");

        l4 = new Label("Verify Password");
        l4.setLayoutX(450);
        l4.setLayoutY(340);
        l4.getStyleClass().add("label3");

        l5 = new Label("Enter correct details");
        l5.setLayoutX(630);
        l5.setLayoutY(170);
        l5.getStyleClass().add("label10");

        l6 = new Label("Your Pasword has been Updated");
        l6.setLayoutX(590);
        l6.setLayoutY(170);
        l6.getStyleClass().add("label10");

        p1 = new PasswordField();
        p1.setPromptText("Old Password");
        p1.setLayoutX(650);
        p1.setLayoutY(200);
        p1.setPrefSize(280, 35);

        p2 = new PasswordField();
        p2.setPromptText("New Password");
        p2.setLayoutX(650);
        p2.setLayoutY(270);
        p2.setPrefSize(280, 35);

        p3 = new PasswordField();
        p3.setPromptText("Verify New Password");
        p3.setLayoutX(650);
        p3.setLayoutY(340);
        p3.setPrefSize(280, 35);

        b10 = new Button("Update Password");
        b10.setPrefSize(150, 30);
        b10.setLayoutX(780);
        b10.setLayoutY(400);
        b10.getStyleClass().add("button8");

        f1 = new FadeInUpTransition(b10);
        f1.setDelay(Duration.ZERO);
        f1.setRate(1.2);

        f2 = new FadeInUpTransition(l1);
        f2.setDelay(Duration.ZERO);
        f2.setRate(1.2);

        f3 = new FadeInUpTransition(l2);
        f3.setDelay(Duration.ZERO);
        f3.setRate(1.2);

        f4 = new FadeInUpTransition(l3);
        f4.setDelay(Duration.ZERO);
        f4.setRate(1.2);

        f5 = new FadeInUpTransition(l4);
        f5.setDelay(Duration.ZERO);
        f5.setRate(1.2);

        f6 = new FadeInUpTransition(p1);
        f6.setDelay(Duration.ZERO);
        f6.setRate(1.2);

        f7 = new FadeInUpTransition(p2);
        f7.setDelay(Duration.ZERO);
        f7.setRate(1.2);

        f8 = new FadeInUpTransition(p3);
        f8.setDelay(Duration.ZERO);
        f8.setRate(1.2);

        f9 = new FadeInUpTransition(l5);
        f9.setDelay(Duration.ZERO);
        f9.setRate(1.2);

        f10 = new FadeOutUpTransition(l6);
        f10.setDelay(Duration.millis(2000));
        f10.setRate(1.2);

        f11 = new FadeInUpTransition(l6);
        f11.setDelay(Duration.ZERO);
        f11.setRate(1.2);
        
        ff1 = new FadeInUpTransition(b8);
        ff1.setDelay(Duration.ZERO);
        ff1.setRate(1.2);
        
        ff2 = new FadeInUpTransition(b2);
        ff2.setDelay(Duration.ZERO);
        ff2.setRate(1.2);
        
        ff3 = new FadeInUpTransition(b3);
        ff3.setDelay(Duration.ZERO);
        ff3.setRate(1.2);
       
        ff4 = new FadeInUpTransition(b4);
        ff4.setDelay(Duration.ZERO);
        ff4.setRate(1.2);
        
        ff5 = new FadeInUpTransition(b5);
        ff5.setDelay(Duration.ZERO);
        ff5.setRate(1.2);
        
        ff6 = new FadeInUpTransition(b6);
        ff6.setDelay(Duration.ZERO);
        ff6.setRate(1.2);
        
        ff7 = new FadeInUpTransition(b7);
        ff7.setDelay(Duration.ZERO);
        ff7.setRate(1.2);
        
        ff8 = new FadeInUpTransition(l7);
        ff8.setDelay(Duration.ZERO);
        ff8.setRate(1.2);
    }

    public void main(Pane root, Login login, Admin admin, Seeker seeker, Provider provider) {

        MySqlCommands command = new MySqlCommands();
        
        b2.setOpacity(0);
        b3.setOpacity(0);
        b4.setOpacity(0);
        b5.setOpacity(0);
        b6.setOpacity(0);
        b7.setOpacity(0);
        b8.setOpacity(0);
        l7.setOpacity(0);
        
        

        root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, b13, l7);
        
        ff1.play();
        ff2.play();
        ff3.play();
        ff4.play();
        ff5.play();
        ff6.play();
        ff7.play();
        ff8.play();
        
        b2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e1) {
               
                l7.setOpacity(0);


                root.getChildren().clear();    
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8, b13, l7);

            
                ff8.play();
            }
        });

        b3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);

                l1.setOpacity(0);
                l2.setOpacity(0);
                l3.setOpacity(0);
                l4.setOpacity(0);
                p1.setOpacity(0);
                p2.setOpacity(0);
                p3.setOpacity(0);
                b10.setOpacity(0);

                p1.clear();
                p2.clear();
                p3.clear();

                root.getChildren().addAll(bgB, l1, l2, l3, l4, p1, p2, p3, b10);

                f1.play();
                f2.play();
                f3.play();
                f4.play();
                f5.play();
                f6.play();
                f7.play();
                f8.play();

            }
        });

        b10.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e1) {
                pass1 = p1.getText();
                pass2 = p2.getText();
                pass3 = p3.getText();
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
                root.getChildren().addAll(bgB, l1, l2, l3, l4, p1, p2, p3, b10);
                try {
                    if (pass2.equals(pass3) && command.isPasswordSame(pass1)) {
                        command.updateAdminPass(pass2);
                        p1.clear();
                        p2.clear();
                        p3.clear();
                        l6.setOpacity(0);
                        root.getChildren().add(l6);
                        f11.play();
                        f10.play();
                    } else {
                        l5.setOpacity(0);
                        root.getChildren().add(l5);
                        f9.play();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        b5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
                vp = new VBox();
                vp.setLayoutX(280);
                vp.setLayoutY(200);
                scr = new ScrollPane();
                scr.setLayoutX(230);
                scr.setLayoutY(150);
                scr.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scr.setPrefSize(300, 300);
                scr.setContent(vp);
                f12 = new FadeInUpTransition(vp);
                f12.setDelay(Duration.ZERO);
                f12.setRate(1.2);
                try {
                    num = getAllProvider();
                    for (i1 = 0; i1 < num; i1++) {
                        butprov[i1].setOnAction(new EventHandler<ActionEvent>() {
                            int as = i1;
                            @Override
                            public void handle(ActionEvent e1) {
                                try {
                                    function(root, as);
                                } catch (Exception ex) {
                                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                vp.setOpacity(0);
                root.getChildren().addAll(b11, scr);
                f12.play();
            }
        });
        
        b4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
                vs = new VBox();
                vs.setLayoutX(280);
                vs.setLayoutY(200);
                scr2 = new ScrollPane();
                scr2.setLayoutX(230);
                scr2.setLayoutY(150);
                scr2.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scr2.setPrefSize(300, 300);
                scr2.setContent(vs);
                f12 = new FadeInUpTransition(vs);
                f12.setDelay(Duration.ZERO);
                f12.setRate(1.2);
                try {
                    num = getAllSeeker();
                    for (i1 = 0; i1 < num; i1++) {
                        butseek[i1].setOnAction(new EventHandler<ActionEvent>() {
                            int as = i1;
                            @Override
                            public void handle(ActionEvent e1) {
                                try {
                                    function1(root, as);
                                } catch (Exception ex) {
                                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                vs.setOpacity(0);
                root.getChildren().addAll(b11, scr2);
                f12.play();
            }
        });
        
        b6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
                vo = new VBox();
                vo.setLayoutX(280);
                vo.setLayoutY(200);
                scr3 = new ScrollPane();
                scr3.setLayoutX(230);
                scr3.setLayoutY(150);
                scr3.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scr3.setPrefSize(300, 300);
                scr3.setContent(vo);
                f12 = new FadeInUpTransition(vo);
                f12.setDelay(Duration.ZERO);
                f12.setRate(1.2);
                try {
                    num = getAllOrg();
                    for (i1 = 0; i1 < num; i1++) {
                        butorg[i1].setOnAction(new EventHandler<ActionEvent>() {
                            int as = i1;
                            @Override
                            public void handle(ActionEvent e1) {
                                try {
                                    function2(root, as, command);
                                } catch (Exception ex) {
                                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                vo.setOpacity(0);
                root.getChildren().addAll(b11, scr3);
                f12.play();
            }
        });
        
        b7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
                vt = new VBox();
                vt.setLayoutX(280);
                vt.setLayoutY(200);
                scr4 = new ScrollPane();
                scr4.setLayoutX(230);
                scr4.setLayoutY(150);
                scr4.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
                scr4.setPrefSize(300, 300);
                scr4.setContent(vt);
                f12 = new FadeInUpTransition(vt);
                f12.setDelay(Duration.ZERO);
                f12.setRate(1.2);
                try {
                    num = getAllTask();
                    for (i1 = 0; i1 < num; i1++) {
                        buttsk[i1].setOnAction(new EventHandler<ActionEvent>() {
                            int as = i1;
                            @Override
                            public void handle(ActionEvent e1) {
                                try {
                                    function3(root, as, command);
                                } catch (Exception ex) {
                                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                vt.setOpacity(0);
                root.getChildren().addAll(b11, scr4);
                f12.play();
            }
        });

        b8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                login.main(root, login, admin, seeker, provider);
            }
        });
        
    }

    int getAllProvider() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from person");
        int i = 0;
        while (rs.next()) {
            if (rs.getString("type").equals("provider")) {
                prov[i] = rs.getString("userid");
                i++;
            }
        }
        for (int j = 0; j < i; j++) {
            butprov[j] = new Button("View Profile");
            butprov[j].getStyleClass().add("button8");
            lp[j] = new Label("User id : " + prov[j]);
            lp[j].getStyleClass().add("label9");
            vp.getChildren().addAll(lp[j], butprov[j], new Label("   "), new Label("    "));
        }
        return i;
    }
    
    int getAllSeeker() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from person");
        int i = 0;
        while (rs.next()) {
            if (rs.getString("type").equals("seeker")) {
                seek[i] = rs.getString("userid");
                i++;
            }
        }
        for (int j = 0; j < i; j++) {
            butseek[j] = new Button("View Profile");
            butseek[j].getStyleClass().add("button8");
            ls[j] = new Label("User id : " + seek[j]);
            ls[j].getStyleClass().add("label9");
            vs.getChildren().addAll(ls[j], butseek[j], new Label("   "), new Label("    "));
        }
        return i;
    }

    int getAllOrg() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from company");
        int i = 0;
        while (rs.next()) {
            org[i] = rs.getString("cname");
            i++;
        }
        Label tmp = new Label("Organisation");
        tmp.getStyleClass().add("label11");
        vo.getChildren().addAll(tmp, new Label(), new Label());
        for (int j = 0; j < i; j++) {
            butorg[j] = new Button("View Organisation");
            butorg[j].getStyleClass().add("button8");
            lo[j] = new Label(org[j]);
            lo[j].getStyleClass().add("label9");
            vo.getChildren().addAll(lo[j], butorg[j], new Label(), new Label());
        }
        return i;
    }
    
    int getAllTask() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from job");
        int i = 0;
        while (rs.next()) {
            tsk[i] = rs.getInt("jobid");
            i++;
        }
        Label tmp = new Label("Jobs");
        tmp.getStyleClass().add("label11");
        vt.getChildren().addAll(tmp, new Label(), new Label());
        for (int j = 0; j < i; j++) {
            buttsk[j] = new Button("View Job Details");
            buttsk[j].getStyleClass().add("button8");
            lt[j] = new Label("Job : " + (j+1));
            lt[j].getStyleClass().add("label9");
            vt.getChildren().addAll(lt[j], buttsk[j], new Label(), new Label());
        }
        return i;
    }
    
    void function(Pane root, int i2) throws Exception {
        root.getChildren().clear();
        root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
        root.getChildren().addAll(b11, scr);
        root.getChildren().addAll(b12);
        VBox vtmp = new VBox();
        vtmp.setOpacity(0);
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from person");
        while (rs.next()) {
            if (rs.getString("userid").equals(prov[i2])) {
                d1 = new Label("Name :                " + rs.getString("fname") + " " + rs.getString("lname"));
                d1.getStyleClass().add("label9");
                d2 = new Label("Email Id  :           " + rs.getString("emailid"));
                d2.getStyleClass().add("label9");
                d3 = new Label("Date of Birth :    " + rs.getDate("dob"));
                d3.getStyleClass().add("label9");
                d4 = new Label("Phone Number : " + rs.getString("phone"));
                d4.getStyleClass().add("label9");
                d5 = new Label("Sex :                     " + rs.getString("sex"));
                d5.getStyleClass().add("label9");
                d6 = new Label("Address :             " + rs.getString("street"));
                d6.getStyleClass().add("label9");
                int zip = rs.getInt("zipcode");
                Statement st1 = connect.createStatement();
                ResultSet rs1 = st1.executeQuery("select * from zip");
                while (rs1.next()) {
                    if (rs1.getInt("zipcode") == zip) {
                        d7 = new Label("                             " + rs1.getString("city") + ", " + rs1.getString("state"));
                        d7.getStyleClass().add("label9");
                        break;
                    }
                }
                d8 = new Label("PinCode :             " + zip);
                d8.getStyleClass().add("label9");
                vtmp.getChildren().addAll(d1, new Label(),d2,new Label(), d3, new Label(),d4,new Label(), d5,new Label(), d6, d7, new Label(),d8);
                break;
            }
        }
        f13 = new FadeInUpTransition(vtmp);
        f13.setDelay(Duration.ZERO);
        f13.setRate(1.2);
        f13.play();
        vtmp.setLayoutX(600);
        vtmp.setLayoutY(180);
        root.getChildren().addAll(vtmp);
    }
    
    void function1(Pane root, int i2) throws Exception {
        root.getChildren().clear();
        root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
        root.getChildren().addAll(b11, scr2);
        root.getChildren().addAll(b12);
        VBox vtmp = new VBox();
        vtmp.setOpacity(0);
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from person");
        while (rs.next()) {
            if (rs.getString("userid").equals(seek[i2])) {
                d1 = new Label("Name :                " + rs.getString("fname") + " " + rs.getString("lname"));
                d1.getStyleClass().add("label9");
                d2 = new Label("Email Id  :           " + rs.getString("emailid"));
                d2.getStyleClass().add("label9");
                d3 = new Label("Date of Birth :    " + rs.getDate("dob"));
                d3.getStyleClass().add("label9");
                d4 = new Label("Phone Number : " + rs.getString("phone"));
                d4.getStyleClass().add("label9");
                d5 = new Label("Sex :                     " + rs.getString("sex"));
                d5.getStyleClass().add("label9");
                d6 = new Label("Address :             " + rs.getString("street"));
                d6.getStyleClass().add("label9");
                int zip = rs.getInt("zipcode");
                Statement st1 = connect.createStatement();
                ResultSet rs1 = st1.executeQuery("select * from zip");
                while (rs1.next()) {
                    if (rs1.getInt("zipcode") == zip) {
                        d7 = new Label("                             " + rs1.getString("city") + ", " + rs1.getString("state"));
                        d7.getStyleClass().add("label9");
                        break;
                    }
                }
                d8 = new Label("PinCode :             " + zip);
                d8.getStyleClass().add("label9");
                vtmp.getChildren().addAll(d1, new Label(),d2,new Label(), d3, new Label(),d4,new Label(), d5,new Label(), d6, d7, new Label(),d8);
                break;
            }
        }
        f13 = new FadeInUpTransition(vtmp);
        f13.setDelay(Duration.ZERO);
        f13.setRate(1.2);
        f13.play();
        vtmp.setLayoutX(600);
        vtmp.setLayoutY(180);
        root.getChildren().addAll(vtmp);
    }
    
    void function2(Pane root, int i2, MySqlCommands command) throws Exception {
        root.getChildren().clear();
        root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
        root.getChildren().addAll(b11, scr3);
        root.getChildren().addAll(b12);
        VBox vtmp = new VBox();
        vtmp.setOpacity(0);
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from company");
        while (rs.next()) {
            if (rs.getString("cname").equals(org[i2])) {
                d1 = new Label("   Name :           " + rs.getString("cname"));
                d1.getStyleClass().add("label9");
                d2 = new Label("   Type :             " + rs.getString("type"));
                d2.getStyleClass().add("label9");
                d3 = new Label("   Location :       " + rs.getString("location"));
                d3.getStyleClass().add("label9");
                d4 = new Label("   Description :   " + rs.getString("description"));
                d4.getStyleClass().add("label9");
                vtmp.getChildren().addAll(d1, new Label(), d2, new Label(), d3,new Label(), d4);
                if (rs.getString("approved").equals("no")) {
                    Button r1, r2;
                    r1 = new Button("Approve");
                    r1.getStyleClass().add("button10");
                    r2 = new Button("Dissapprove");
                    r2.getStyleClass().add("button11");
                    r1.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent e1) {
                            root.getChildren().clear();
                            root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
                            root.getChildren().addAll(b11, scr3);
                            root.getChildren().addAll(b12);
                            vtmp.getChildren().clear();
                            vtmp.getChildren().addAll(d1, new Label(), d2, new Label(), d3,new Label(), d4);
                            root.getChildren().addAll(vtmp);
                            try {
                                command.updateApproval(org[i2]);
                            } catch (Exception ex) {
                                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            Label pl = new Label("This Organisation has been Approved");
                            pl.getStyleClass().add("label10");
                            pl.setLayoutX(620);
                            pl.setLayoutY(350);
                            pl.setOpacity(0);
                            root.getChildren().add(pl);
                            Transition w1 = new FadeInUpTransition(pl);
                            w1.setDelay(Duration.ZERO);
                            w1.setRate(1.2);
                            w1.play();
                            Transition w2 = new FadeOutUpTransition(pl);
                            w2.setDelay(Duration.millis(2000));
                            w2.setRate(1.2);
                            w2.play();
                        }
                    });
                    r2.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent e1) {
                            try {
                                command.deleteCompany(org[i2]);
                            } catch (Exception ex) {
                                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            root.getChildren().clear();
                            root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
                            vo.setOpacity(0);
                            root.getChildren().addAll(b11, scr3);
                            Transition ol = new FadeInUpTransition(vo);
                            ol.setRate(1.2);
                            vo.getChildren().removeAll(lo[i2], butorg[i2]);
                            ol.play();
                        }
                    });
                    HBox htmp = new HBox();
                    htmp.getChildren().addAll(r1,new Label("    "), r2);
                    vtmp.getChildren().addAll(new Label(), htmp);
                }
            }
        }
        f13 = new FadeInUpTransition(vtmp);
        f13.setDelay(Duration.ZERO);
        f13.setRate(1.2);
        f13.play();
        vtmp.setLayoutX(600);
        vtmp.setLayoutY(180);
        root.getChildren().addAll(vtmp);
    }
    
    void function3(Pane root, int i2, MySqlCommands command) throws Exception {
        root.getChildren().clear();
        root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
        root.getChildren().addAll(b11, scr4);
        root.getChildren().addAll(b12);
        VBox vtmp = new VBox();
        vtmp.setOpacity(0);
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from job");
        while (rs.next()) {
            if (rs.getInt("jobid") == tsk[i2]) {
                d1 = new Label("   Job Title :               " + rs.getString("jobtitle"));
                d1.getStyleClass().add("label9");
                d2 = new Label("   Compan Name :    " + rs.getString("cname"));
                d2.getStyleClass().add("label9");
                d3 = new Label("   Job Type :              " + rs.getString("type"));
                d3.getStyleClass().add("label9");
                d4 = new Label("   Deadline :              " + rs.getString("deadline"));
                d4.getStyleClass().add("label9");
                d5 = new Label("   Description :          " + rs.getString("description"));
                d5.getStyleClass().add("label9");
                vtmp.getChildren().addAll(d1, new Label(), d2, new Label(), d3,new Label(), d4, new Label(), d5);
                if (rs.getString("approved").equals("no")) {
                    Button r1, r2;
                    r1 = new Button("Approve");
                    r1.getStyleClass().add("button10");
                    r2 = new Button("Dissapprove"); 
                    r2.getStyleClass().add("button11");  
                    r1.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent e1) {
                            root.getChildren().clear();
                            root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
                            root.getChildren().addAll(b11, scr4);
                            root.getChildren().addAll(b12);
                            vtmp.getChildren().clear();
                            vtmp.getChildren().addAll(d1, new Label(), d2, new Label(), d3,new Label(), d4, new Label(), d5);
                            root.getChildren().addAll(vtmp);
                            try {
                                command.updateJobApproval(tsk[i2]);
                            } catch (Exception ex) {
                                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            Label pl = new Label("This Job has been Approved");
                            pl.getStyleClass().add("label10");
                            pl.setLayoutX(620);
                            pl.setLayoutY(420);
                            pl.setOpacity(0);
                            root.getChildren().add(pl);
                            Transition w1 = new FadeInUpTransition(pl);
                            w1.setDelay(Duration.ZERO);
                            w1.setRate(1.2);
                            w1.play();
                            Transition w2 = new FadeOutUpTransition(pl);
                            w2.setDelay(Duration.millis(2000));
                            w2.setRate(1.2);
                            w2.play();
                        }
                    });
                    r2.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent e1) {
                            try {
                                command.deleteJob(tsk[i2]);
                            } catch (Exception ex) {
                                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            root.getChildren().clear();
                            root.getChildren().addAll(bg1, b1, b2, b3, b4, b5, b6, b7, b8);
                            vt.setOpacity(0);
                            root.getChildren().addAll(b11, scr4);
                            Transition ol = new FadeInUpTransition(vt);
                            ol.setRate(1.2);
                            vt.getChildren().removeAll(lt[i2], buttsk[i2]);
                            ol.play();
                        }
                    });
                    HBox htmp = new HBox();
                    htmp.getChildren().addAll(r1,new Label("    "), r2);
                    vtmp.getChildren().addAll(new Label(), htmp);
                }
            }
        }
        f13 = new FadeInUpTransition(vtmp);
        f13.setDelay(Duration.ZERO);
        f13.setRate(1.2);
        f13.play();
        vtmp.setLayoutX(600);
        vtmp.setLayoutY(180);
        root.getChildren().addAll(vtmp);
    }

}
