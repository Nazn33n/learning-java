package basics;

public class Vehicle {
    private String color;
    private int wheel;

    Vehicle(String color, int wheel){
        this.color = color;
        this.wheel = wheel;
    }


    public String getColor() {
        return color;
    }
    public int getWheel(){
        return wheel;
    }

}
