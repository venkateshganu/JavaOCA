package Arrays;

public class Main {
    public static void getSum(int... a){
        int sum = 0;
        for(int i=0;i<a.length;i++)
            sum=sum+a[i];
        System.out.println(sum);
    }
    public static void main(String[] args) {
        getSum(3,4);
    }
}
