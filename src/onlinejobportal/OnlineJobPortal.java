package onlinejobportal;

import com.fxexperience.javafx.animation.RotateInTransition;
import com.fxexperience.javafx.animation.RotateOutTransition;
import static java.util.concurrent.TimeUnit.SECONDS;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class OnlineJobPortal extends Application {
    
    Pane root;
    Scene scene;
    
    private ImageView bgd1;
    private Transition fd1, fd2;
    private boolean check  = false;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        root = new Pane();
        
        /*bgd1 = new ImageView(new Image(Admin.class.getResourceAsStream("files/splash.png")));
        bgd1.setX(350);
        bgd1.setY(100);
        
        bgd1.setOpacity(0);
        
        fd1 = new RotateInTransition(bgd1);
        fd1.setRate(1);
        
        fd2 = new RotateOutTransition(bgd1);
        fd2.setRate(1);
        fd2.setDelay(Duration.millis(5000));
        
        root.getChildren().add(bgd1);
        
        fd1.play();
        fd2.play();*/
        
        Login login = new Login();
        Admin admin = new Admin();
        Seeker seeker = new Seeker();
        Provider provider = new Provider();
        
        login.layout();
        admin.layout();
        seeker.layout();
        provider.layout();
        
        DropShadow ds = new DropShadow();
        ds.setRadius(10);
        ds.setColor(Color.color(0, 0, 0, 0.9));
        
        root.setEffect(ds);
        root.setPrefSize(1200, 600);
        root.setLayoutX(10);
        root.setLayoutY(10);
        
        
        root.getStylesheets().add(getClass().getResource("CSS.css").toExternalForm());
        
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        
        Group g = new Group();
        g.getChildren().add(root);
        
        scene = new Scene(g, 1220, 620);
        scene.setFill(null);
        login.main(root, login, admin, seeker, provider);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


    
}
