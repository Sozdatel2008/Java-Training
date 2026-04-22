package task14;


// Try to create a class Hailstone whose objects represent a single Collatz sequence. The con-
// structor takes the starting number (a0), which you may assume is always greater than 1.
// The object itself is iterable, i.e., it implements the Iterable interface and, on each iteration,
// returns successive elements of the sequence starting from the initial value. The iteration
// should end after returning the number 1 as the last element. The implementation of the
// Hailstone class must not create any arrays or use collections.


public class Main {

    public static void main(String... args) {

        int ini = 7, count = -1, maxel = 0;

        Hailstone hailstone = new Hailstone(ini);

        for (int h : hailstone) {
            if (h > maxel) maxel = h;
            ++count;
        }
        System.out.println(ini + " " + count + " " + maxel);

    }
}
