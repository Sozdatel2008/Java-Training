package task4;

//Create a function that takes an integer as an argument
//and returns "Even" for even numbers or "Odd" for odd numbers.

public class Kata {

    //int number = 9;
    public static String evenOrOdd(int number) {
        String Answer = new String();
        if(number < 0){
            number = number * -1;
        }
        if(number % 2 == 0){
            Answer = "Even";
        }
        if(number % 2 == 1){
            Answer = "Odd";
        } 
        return Answer;
    }

    public static void main(String[] args) {
        int number = -2;
        System.out.println(evenOrOdd(number));
    }
}
