import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        //print n numbers
        int num =1;

        int sum=0;
        while(num <= n){
            sum =sum +num;
            num++;
        }
        System.out.println(sum);
    }
}
