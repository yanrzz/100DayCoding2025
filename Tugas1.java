
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Tugas1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Silahkan tekan tombol");
        Button button = new Button("Klik saya");
        button.setOnAction(e -> label.setText("Tombol di tekan"));
        VBox root = new VBox(10);
        root.getChildren().addAll(label, button);
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Tugas 1 - Label Dan Tombol");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
