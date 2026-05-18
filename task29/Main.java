package task29;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(111) - 10;
        }

        print(arr, x -> x % 2 == 0);
    }

    public static void print(int[] tab, Filter filter){
        for(int value : tab){
            if(filter.filter(value)){
                System.out.println(value + " ");
            }
        }
    }
}
