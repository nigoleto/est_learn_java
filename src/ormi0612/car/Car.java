package ormi0612.car;

public class Car {

    private int speed;

    private int gear;
    private String wheel;
    private int cc;
    private String logo;
    private String engine;

    public void setSpeed(int speed){
       this.speed = switch(this.gear){
            case 1 -> Math.min(speed, 30);
            case 2 -> speed < 30 ? 30 : Math.min(speed, 70);
            case 3 -> speed < 70 ? 70 : Math.min(speed, 120);
           default -> 0;
        };
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void checkSpeed(){
        System.out.println(this.speed);
    }

    public Car(int gear){
        this.gear = gear;
    }

}
