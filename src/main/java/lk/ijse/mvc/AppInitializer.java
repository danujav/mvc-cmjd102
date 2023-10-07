package lk.ijse.mvc;

/*
    @author DanujaV
    @created 10/7/23 - 3:22 PM   
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));
        Scene scene = new Scene(rootNode);

        stage.setTitle("Customer Form");
        stage.centerOnScreen();
        stage.setScene(scene);

        stage.show();
    }
}
