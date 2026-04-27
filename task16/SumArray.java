package task16;

import java.util.Arrays;

//Write a function that takes an array of numbers and returns the sum of the numbers.
//The numbers can be negative. If the array is empty, return 0.

public class SumArray {
    public static void main(String[] args) {
        double[] array = {2.2, 3, -5, 1}; 
        System.out.println(Arrays.toString(array));
        System.out.println(sum(array));
    }

    public static double sum(double[] numbers) {
        double result = 0.0;
        if (numbers == null || numbers.length == 0)
            return result;
        else{
            for(int i = 0; i < numbers.length; i++){
                result = result + numbers[i];
            }
        }
        return result;
    }
}
