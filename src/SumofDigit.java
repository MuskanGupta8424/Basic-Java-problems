import java.util.Scanner;

public class SumofDigit {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int temp = n;
        int rem=0;
        int sumOfDigit=0;
        while(temp>0){
            rem = temp%10;
            sumOfDigit += rem;
            temp /=10;
        }
        System.out.println(" Sum of Digit number is " + "= "+ sumOfDigit);
    }
}
