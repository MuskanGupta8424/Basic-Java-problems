import java.util.Scanner;

public class Agesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
//Use if , else if, else condition
        if(num <= 12){
            System.out.println("child");
        } else if ((num > 12) && (num < 18)) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
    }
}
