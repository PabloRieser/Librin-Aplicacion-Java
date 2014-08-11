package sample;

import Vistas.VistaFactura;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {

        /*********** Imagen de la oveja y titulo ***********/
        Image imagenOveja = new Image("file:C:\\Users\\Escritorio\\Downloads\\sheep_black.png");
        ImageView imageViewOveja = new ImageView();
        imageViewOveja.setImage(imagenOveja);
        imageViewOveja.setFitWidth(100);
        imageViewOveja.setPreserveRatio(true);

        Text titulo = new Text("Librín: La ovejita negra");
        titulo.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        /*********** Botones **********/
        Image imagenFacturacion = new Image("file:C:\\Users\\Escritorio\\Pictures\\Librin recursos\\Impresoras_Fiscales_01ve.jpeg");
        Image imagenArticulos = new Image("file:C:\\Users\\Escritorio\\Pictures\\Librin recursos\\articulos.jpg");
        Image imagenClientes = new Image("file:C:\\Users\\Escritorio\\Pictures\\Librin recursos\\Libreta-A5-papel-rayado-157396_38B.jpg");

        Button botonDeFacturacion = new Button("Facturación", new ImageView(imagenFacturacion));
        botonDeFacturacion.setStyle("-fx-font: 14px Verdana;");
        botonDeFacturacion.setContentDisplay(ContentDisplay.BOTTOM);

        Button botonDeArticulos = new Button("Artículos", new ImageView(imagenArticulos));
        botonDeArticulos.setStyle("-fx-font: 14px Verdana;");
        botonDeArticulos.setContentDisplay(ContentDisplay.BOTTOM);

        Button botonDeClientes = new Button("Clientes", new ImageView(imagenClientes));
        botonDeClientes.setStyle("-fx-font: 14px Verdana;");
        botonDeClientes.setContentDisplay(ContentDisplay.BOTTOM);

        /*********** Definicion de las acciones de los botones **********/
        botonDeFacturacion.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                VistaFactura f = new VistaFactura();
                try {
                    f.start(primaryStage);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        botonDeClientes.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
            }
        });

        botonDeArticulos.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
            }
        });

        /*********** Panel **********/
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        grid.setGridLinesVisible(false);

        grid.add(imageViewOveja, 0, 0);
        grid.add(titulo, 1, 0);
        grid.add(botonDeFacturacion,0,1);
        grid.add(botonDeClientes,1,1);
        grid.add(botonDeArticulos,2,1);

        /*********** Ventana **********/
        primaryStage.setTitle("Librín: Asistente para la venta de artículos de librería");
        primaryStage.setScene(new Scene(grid, 1200, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
