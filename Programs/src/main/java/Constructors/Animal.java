package Constructors;

public class Animal {


    int objectSpecificValue;

    public Animal(int i) {
        this.objectSpecificValue = i;
    }

    //Constructor are nothing but setting/getting some values to objects for that particular class
    public static void main(String args[]){



    Animal a = new Animal(7); //Whenever an object is created default constructor is called

        //When you want to get/set values to an object you will write a constructor code

        System.out.println(a.objectSpecificValue);
    }

}
