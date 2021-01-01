package Interfaces;

import java.util.*;
     class Shape {}
     interface ShapeFactory { public java.util.List<Shape> getShapes(); }
     public class Main {
     public static void main(String[] args) {
        ShapeFactory house = new MyShapeFactory();
        Shape chicken = house.getShapes().get(0);
        for(int i=0; i<house.getShapes().size();
                   chicken = house.getShapes().get(i++)) {
            System.out.println("Shape");
            }
        }
     }
     class MyShapeFactory implements ShapeFactory{
     public java.util.List<Shape> getShapes(){
        List<Shape> list = new LinkedList<>();
        list.add(new Shape());
        list.add(new Shape());
        list.add(new Shape());
        list.add(new Shape());
        list.add(new Shape());
        return list;
        }
     }