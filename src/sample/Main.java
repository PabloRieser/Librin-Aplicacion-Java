package sample;

import Vistas.Factura;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Cargo la imagen de la Oveja negra
        Image imageOveja = new Image("file:C:\\Users\\Escritorio\\Downloads\\sheep_black.png");
        ImageView imageViewOveja = new ImageView();
        imageViewOveja.setImage(imageOveja);

        Image imageArticulos = new Image("file:C:\\Users\\Escritorio\\Pictures\\Librin recursos\\articulos_portada.jpg");
        ImageView imageViewArticulos = new ImageView();
        imageViewArticulos.setImage(imageArticulos);

        // Configuro el tamaño y la posicion de la imagen de la oveja
        imageViewOveja.setFitWidth(100);
        imageViewOveja.setPreserveRatio(true);
        String cssBordering = "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);";

        // Creo el titulo que acompaña a la imagen de la Oveja
        Text titulo = new Text("Librin: La oveja negra de las aplicaciones de facturacion");
        titulo.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        // Creo el panel
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setGridLinesVisible(false);

        // Agrego la imagen de la Oveja y el banner de Articulos
        grid.add(imageViewOveja,1,0);
        grid.add(titulo,2,0);
        grid.add(imageViewArticulos,2,1);
        grid.setStyle(cssBordering);


        // Configuracion de la ventana
        primaryStage.setTitle("Librin: Asistente para la venta de articulos de libreria");
        primaryStage.setScene(new Scene(grid, 800, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
