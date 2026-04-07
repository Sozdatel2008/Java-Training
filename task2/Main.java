package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //      Write a program which reads a natural number n greater than 2, and then prints
    //      something like the letter N with height n. For example, if the number is 7, the result
    //      should look like this:
    //      *     * *  * *    *
    //      **    * ** * **   *
    //      * *   * *  * * *  *
    //      *  *  *      *  * *
    //      *   * *      *   **
    //      *    **      *    *
    //      *     *
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number to make a letter 'N' with your height: ");
        int n = scanner.nextInt();
        if(n <= 2){
            System.out.println("To make 'N' figure, please input number greater than 2!");
        }
        if(n > 2){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                   if(j == 0 || j == n - 1 || j == i){
                        System.out.print("*");
                   } else{
                        System.out.print(" ");
                   }
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
