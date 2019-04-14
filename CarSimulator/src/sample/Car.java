package sample;

public class Car {
    public Car(){
    launchedEngine=false;
    gear=0;
    speed=0;
    engineSpeed=0;
    }

    private boolean launchedEngine;
    private int gear;
    private int speed;
    private float engineSpeed;


    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public void setEngineSpeed(float engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public boolean isLaunchedEngine() {
        return launchedEngine;
    }

    public void setLaunchedEngine(boolean launchedEngine) {
        this.launchedEngine = launchedEngine;
    }

    public void odpalCar() {
        this.engineSpeed=0;
        this.speed=0;
        this.gear=1;
        this.launchedEngine=true;

    }

    public void turnOff() {
        this.engineSpeed=0;
        this.speed=0;
        this.gear=0;
        this.launchedEngine=false;
    }

    public void accelarate() {
        this.speed+=1;
        
    }

    public void gearUp() {
        this.gear++;
    }
    public void gearDown(){
        this.gear--;
    }

    public void brake() {
        this.speed--;
    }
}
