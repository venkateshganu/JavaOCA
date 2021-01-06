package Arrays;

public class ArrayInstanceOf {
    public static void main(String[] args) {
        int elements = 0;
        Object [] arr = {"A", "E", "I", new Object(), "O", "U"}; //Line n1
        for(Object obj : arr) { //Line n2
            if(obj instanceof String) {
                continue;
            } else {
                break;
            }
//            elements++; //Line n3
        }
        System.out.println(elements); //Line n4
    }
}
