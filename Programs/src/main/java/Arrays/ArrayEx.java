package Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        String[] a = new String[3];
        a[1] = "My";
        a[2] = "Phone";

        for(int i=0;i<a.length;i++){
            System.out.println(a[i].length());
        }
    }
}
