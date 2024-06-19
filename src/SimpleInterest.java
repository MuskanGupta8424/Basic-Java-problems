import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float P =sc.nextFloat();
        float r =sc.nextFloat();
        float t =sc.nextFloat();
        System.out.println("Enter P value: " + P);
        System.out.println("Enter r value: "+ r);
        System.out.println("Enter t value: "+ t);
        float Simple_Interest = (P*r*t) /100;
        System.out.println("Simple_Interest:" + Simple_Interest);

        //Read one character
//        System.out.println("Enter a character:");
//       char ch = sc.next().charAt(4);
//        System.out.println(ch);
    }
}
