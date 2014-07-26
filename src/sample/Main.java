package sample;

import Vistas.Factura;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Cargo la imagen
        Image image = new Image("file:C:\\Users\\Escritorio\\Downloads\\sheep_black.png");
        ImageView imageView = new ImageView();
        imageView.setImage(image);

        // Configuro el tamaño y la posicion de la imagen de la oveja
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);

        // Creacion de los botones
        Button button2 = new Button("Crear una nueva factura");

        // Agregando los elementos a la vista
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        root.getChildren().add(button2);

        // Configuracion de la ventana
        primaryStage.setTitle("Librin: Asistente para la venta de articulos de libreria");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
