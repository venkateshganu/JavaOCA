package Variables;

public class ShiftOperators {
        public static void main(String[] args) {
            int a = 10; //1010
            System.out.println(a>>3); //0001 1
            System.out.println(a<<3); //1010000 80
            System.out.println(a>>>3); //0001 1
            System.out.println(a>>33); //100001 a>>1 5
            System.out.println(a<<33);  //10100 20
            System.out.println(a>>>33);  //100001 5

            int b =-10; //1 1010000
            System.out.println(b>>3); //11 -> 2's complement //110
            System.out.println(b<<3);
            System.out.println(b>>>3);
            System.out.println(b>>33);
            System.out.println(b<<33);
            System.out.println(b>>>33);

            System.out.println(-1>>>1);

            //0001 00
        }
}

