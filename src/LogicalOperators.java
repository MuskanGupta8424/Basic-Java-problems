

public class LogicalOperators {
    public static void main(String[] args) {

       int a=10;
       int  b=15;
       int c=16;
        //Logical operators -> ||, &&, !
        System.out.println((a>b) && (a<c));//false
        System.out.println((a<b) && (b>c));//false

        System.out.println((b<c) || (a>c));//true
        System.out.println((a>b) || (a<c));//true

        System.out.println(!(a==b));//true
        System.out.println(!(c>b));//false

    }
}
