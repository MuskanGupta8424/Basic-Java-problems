import java.util.Scanner;

public class SumofNaturalNumbers {
    public static void main(String[] args) {

        //Print the sum of first n natural numbers, where n is the input
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;
        for(int i=1; i<=n;i++){
            sum +=i;
        }
        System.out.println("Sum of first n natral numbers is "+sum);

    }
}
