package Interfaces;

public class Aeroplane implements Flyable {
    public void land() {
        System.out.println("Landing at " + -Flyable.horizontalDegree() + " degrees."); //Line n3
    }

    public static void main(String[] args) {
        new Aeroplane().fly();
        new Aeroplane().land();
    }
}