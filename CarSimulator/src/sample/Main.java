package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.scene.Parent;
import javafx.scene.control.Button;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("simulator.fxml"));
        GridPane box = (GridPane)loader.load();
        Controller controller = (Controller)loader.getController();
        primaryStage.setTitle("Car Simulator");
        controller.Init();

        Scene scene = new Scene(box);

        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
            if (ev.getCode() == KeyCode.E) {
            controller.silnikON();
            }
            else if(ev.getCode()== KeyCode.F){
                controller.silnikOFF();
            }
            else if(ev.getCode()==KeyCode.G){
                controller.biegUp();
            }
            else if(ev.getCode()==KeyCode.H){
                controller.biegDown();
            }
            else if(ev.getCode()==KeyCode.W){
                controller.Przys();
            }
            else if(ev.getCode()==KeyCode.S){
                controller.Ham();
            }
            else if(ev.getCode()==KeyCode.A){
                controller.Lewo();
            }
            else if(ev.getCode()==KeyCode.D){
                controller.Prawo();
            }

            });

                primaryStage.setScene(scene);
        primaryStage.show();



    }




    public static void main(String[] args) {
        launch(args);
    }
}
