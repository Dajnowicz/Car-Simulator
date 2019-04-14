package sample;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Controller {
    @FXML
    private Line line;
    @FXML
    private Text engineStatus;
    @FXML
    private Text speedValue;
    @FXML
    private Text wiadomosc;
    
    @FXML
    private Text biegValue1;
    @FXML
    private Text biegValue2;
    @FXML
    private Text biegValue3;
    @FXML
    private Text biegValue4;
    @FXML
    private Text biegValue5;
    @FXML
    private Text biegValue6;


    @FXML
    private ImageView carImage;

    Car car;

    public void Init() {
        car = new Car();
        
    }




    @FXML
    int i;
    int z;
    public void Przys(){
    if(car.isLaunchedEngine()){
        i--;
        
        if (car.getGear()==1 && car.getSpeed() <30) {
            car.accelarate();
            this.carImage.setY(i);
        }
        if (car.getGear()==2 && car.getSpeed() >25 && car.getSpeed() <45) {
            car.accelarate();
            this.carImage.setY(i);
        }
        if (car.getGear()==3 && car.getSpeed() >40 && car.getSpeed() <75) {
            car.accelarate();
            this.carImage.setY(i);
        }
        if (car.getGear()==4 && car.getSpeed() >70 && car.getSpeed() <115) {
            car.accelarate();
            this.carImage.setY(i);
        }
        if (car.getGear()==5 && car.getSpeed() >110 && car.getSpeed() <185) {
            car.accelarate();
            this.carImage.setY(i);
        }
        if (car.getGear()==6 && car.getSpeed() >180 && car.getSpeed() <210) {
            car.accelarate();
            this.carImage.setY(i);
        }
        this.odswiezPola();
    }
    else{
        this.wiadomosc.setText("Musisz najpierw uruchomić samochód");
    }
    }
    @FXML
    public void Ham(){
        if(car.isLaunchedEngine()){
            i++;
            if (car.getSpeed() >0) {
            car.brake();
            this.carImage.setY(i);
            }
            this.odswiezPola();
            this.odswiezPola();
        }
        else{
            this.wiadomosc.setText("Musisz najpierw uruchomić samochód");
        }
    }
    @FXML
    public void Lewo(){
        if(car.isLaunchedEngine()){
            z--;  
            this.carImage.setX(z);        
            this.odswiezPola();
            this.odswiezPola();
        }
        else{
            this.wiadomosc.setText("Musisz najpierw uruchomić samochód");
        }
    }
    @FXML
    public void Prawo(){
        if(car.isLaunchedEngine()){
            z++;
            this.carImage.setX(z);
            this.odswiezPola();
            this.odswiezPola();
        }
        else{
            this.wiadomosc.setText("Musisz najpierw uruchomić samochód");
        }
    }
    @FXML
    public void biegUp(){
        if(car.isLaunchedEngine()){

            if(car.getGear()==6) {
                this.wiadomosc.setText("Bieg 6 jest najwyższy");
            }
            else {
                car.gearUp();
                if(car.getGear()==1) {
                this.biegValue1.setOpacity(1);
                }
                if(car.getGear()==2) {
                this.biegValue1.setOpacity(0.1);
                this.biegValue2.setOpacity(1);
                }
                if(car.getGear()==3) {
                this.biegValue2.setOpacity(0.1);
                this.biegValue3.setOpacity(1);
                }
                if(car.getGear()==4) {
                this.biegValue3.setOpacity(0.1);
                this.biegValue4.setOpacity(1);
                }
                if(car.getGear()==5) {
                this.biegValue4.setOpacity(0.1);
                this.biegValue5.setOpacity(1);
                }
                if(car.getGear()==6) {
                this.biegValue5.setOpacity(0.1);
                this.biegValue6.setOpacity(1);
                }
                this.odswiezPola();
            }
        }
        else{
            this.wiadomosc.setText("Musisz najpierw uruchomić samochód");
        }
    }
    @FXML
    public void biegDown(){
        if(car.isLaunchedEngine()){
            if(car.getGear()==1) {
                this.wiadomosc.setText("Nie mozna przejsc na nizszy bieg");
            }
            else{
            
                if(car.getGear()==1) {
                this.biegValue1.setOpacity(1);
                }
                if(car.getGear()==2) {
                this.biegValue2.setOpacity(0.1);
                this.biegValue1.setOpacity(1);
                }
                if(car.getGear()==3) {
                this.biegValue3.setOpacity(0.1);
                this.biegValue2.setOpacity(1);
                }
                if(car.getGear()==4) {
                this.biegValue4.setOpacity(0.1);
                this.biegValue3.setOpacity(1);
                }
                if(car.getGear()==5) {
                this.biegValue5.setOpacity(0.1);
                this.biegValue4.setOpacity(1);
                }
                if(car.getGear()==6) {
                this.biegValue6.setOpacity(0.1);
                this.biegValue5.setOpacity(1);
                }
                car.gearDown();
            this.odswiezPola();
            }
        }
        else{
            this.wiadomosc.setText("Musisz najpierw uruchomić samochód");
        }
    }
    @FXML
    public void silnikON(){
        if(car.isLaunchedEngine()){
            this.wiadomosc.setText("Samochód juz jest Uruchomiony");
        }
        else{
            this.wiadomosc.setText("Samochód został Uruchomiony");
        car.odpalCar();
        car.setGear(1); 
        this.biegValue1.setOpacity(1);
                
        this.engineStatus.setOpacity(1);
        }
    }
    @FXML
    public void silnikOFF(){
        if(car.getGear() !=1) {
            this.wiadomosc.setText("Nie mozna wyłączyć na wyższym biegu");
        }
        else {  
            if(car.isLaunchedEngine()){
            this.wiadomosc.setText("Samochód Wylaczony");
            car.turnOff();
            this.engineStatus.setOpacity(0);
            this.odswiezPola();
            }
            else{
            this.wiadomosc.setText("Musisz najpierw uruchomić samochód");
            }
        }
    }
    private void odswiezPola(){
        this.speedValue.setText(Integer.toString(car.getSpeed()));
        setLine(car.getGear());

    }
    private void setLine(int Gear){
        if(Gear==1){
            this.line.setRotate(0);
        }
        else if(Gear==2){
            this.line.setRotate(26);
        }
        else if(Gear==3){
            this.line.setRotate(58);
        }
        else if(Gear==4){
            this.line.setRotate(81);
        }
        else if(Gear==5){
            this.line.setRotate(125);
        }
        else if(Gear==6){
            this.line.setRotate(145);
        }
        
    }
}
