import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int temp = n;
        int digitCount=0;
        while(temp>0){
            temp /=10;
            digitCount++;
        }
        System.out.println("Found count number of "+ n +" = "+ digitCount);
    }
}
