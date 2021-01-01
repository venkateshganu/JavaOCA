package Constructors;

public class NoThis{
    public static void main(String[] args) {
        Rectangle e = new Rectangle();
        System.out.println("Color:" + e.color);
    }   //from ww  w . j a  va 2  s. c om
}

class Rectangle {
    public String color;
    public Rectangle() {
        this("white");
    }
    public Rectangle(String color) {
        color = color;
    }

}