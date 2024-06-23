public class ContinueKeyword {
    public static void main(String[] args) {

        //Using labels with continue and break keywords for example
//        outer: for(int n=0; n<=10; n++){
//            inner: for(int m=0; m<=15; m++){
//                break outer;
//            }
//        }
        //Print all the values between 1 an d50 except for the multiples of 3.
//        for(int num=1; num<=50; num++){
//            if(num%3 ==0){
//                continue;
//            }
//            System.out.println(num);
//        }

        //Using While loop
        int num = 1;


        while (num <= 50) {
            if (num % 3 == 0) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
