package task15;

public class Negative {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(makeNegative(num));
    }

    public static int makeNegative(final int x) {
        if (x > 0){
            return x*(-1);
        }
        else if(x < 0 || x == 0){
            return x;
        }
        return x;
    }
}
