public class UnaryOperators {
    public static void main(String[] args){
        int p =10, q=12;

        System.out.println(p++);//10
        System.out.println(q--);//12
        int x=++p;
        int y=q++;
        System.out.println(x);//12
        System.out.println(y);//11

        System.out.println(p);//12
        System.out.println(q);//12
    }
}
