

public class MultipleOf5and7 {
    public static void main(String[] args) {
        // Print the first multiple of 5 which is also a multiple of 7

        int n = 1;

        while(true){
            if((n % 5 == 0) && (n % 7 == 0)){
                System.out.println("Found ANS: "+n);
                break;
            }
            n++;
        }
    }
}
