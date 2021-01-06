package Interfaces.p3;

public class Test implements GetSetGo{
    public static void main(String[] args) {
//        GetSetGo [] arr = new GetSetGo[5]; //Line n2
//        for(GetSetGo obj : arr) {
//            obj.count++; //Line n3
//        }

        GetSetGo a = new Test();
//        a.count = 5;
        System.out.println(GetSetGo.count); //Line n4
    }
}