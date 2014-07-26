package Vistas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Escritorio on 25/07/2014.
 */
public class Factura extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Display image on screen
        StackPane root = new StackPane();

        // Configuracion de la ventana
        primaryStage.setTitle("Factura A");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();

    }
}
