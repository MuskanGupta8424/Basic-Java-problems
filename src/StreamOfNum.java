import java.util.Scanner;

public class StreamOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int sum=0;
// when input -1 stop printing sum of numbers
        while(num != -1){
            sum =sum +num;
            num =sc.nextInt();
        }
        System.out.println(sum);
    }
}
