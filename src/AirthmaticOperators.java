import java.util.Scanner;

public class AirthmaticOperators {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        int a =sc.nextInt();
        System.out.println("Enter 2nd value: ");
        int b =sc.nextInt();


        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
}
