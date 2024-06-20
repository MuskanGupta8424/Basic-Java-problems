public class BitwiseOperators {
    public static void main(String[] args) {
        int p=9, q=10;

        System.out.println( p|q); //11
        System.out.println(p&q);//8
        System.out.println(p^q);//bitwise exclusive OR //3
        System.out.println(~p);//bitwise complement operator //-10
        System.out.println(~q);//bitwise complement operator //-11
        System.out.println( p << 1);//Left shift << //18
        System.out.println(q<<1);//a* 2^b //20
        System.out.println(q>>1);//Right shift >> //5
        System.out.println(p>>1);//a/2^b //4
        System.out.println(p>>2);//a/2^b //2
    }
}
