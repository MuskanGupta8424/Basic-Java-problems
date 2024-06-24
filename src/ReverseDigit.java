import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int rem=0,temp,rev=0;
        temp =n;
        while(temp>0){
            rem =temp%10;
            rev = rev*10+rem;
            temp /=10;
        }
        System.out.println(rev);

    }
}
