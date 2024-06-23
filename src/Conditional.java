import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        //Check Even or odd number
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
//        if(num %2==0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
        //Print the value if it is even and divisible by 3
//        if( (num %2==0) && (num%3 ==0) ){
//            System.out.println(num);
//        }

//        //Print the value if it is divisible by 3 or 5
//        if( (num %3 == 0) || (num%5 == 0) ){
//            System.out.println("divide by 3 or 5 "+num);
//        }

//          Ternary operator
        String r;
        r = (num%2==0) ? "even ":"odd";
        System.out.println(r);

        }
}
