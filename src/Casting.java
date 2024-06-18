public class Casting {
    public static void main(String[] args) {

//        Type casting when you assign a value of one primitve datatype to another datatype
//        There are two types of casting in java-> Widening CAsting , Narrowing Casting
//        Converting a smaller type into larger type size - Widening casting
//        byte -> short -> char -> int -> long -> float -> double

//int myInt = 9;
//double myDouble =myInt; //Automatic casting int to double
//        System.out.println(myInt);
//        System.out.println(myDouble);


//        Converting a larger type into smaller size type - Narrowing Casting
//        double -> float -> long -> int -> char -> short -> byte
//        double myDouble = 9.78;
//        int myInt = (int) myDouble;  //manual casting: double to int
//
//        System.out.println(myDouble);
//        System.out.println(myInt);

//        Real world example - we create a program to calculate the percentage of user's score in relation to the maximum score in a game.
        int maxScore =500;
        int userScore = 423;
        //calculate the percentage of user's score
        float percentageOfUserScore = (float) userScore / maxScore * 100.0f;
        System.out.println(percentageOfUserScore);

    }
}
