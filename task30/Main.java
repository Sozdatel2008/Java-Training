package task30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(12);
        Square square2 = new Square(2);
        Square square3 = new Square(9);
        Square square4 = new Square(7);
        Square square5 = new Square(10);

        List<Square> squares = new ArrayList<>(List.of(square1, square2, square3, square4, square5));

        for(Square s : squares){
            System.out.println(s);
        }

        Collections.sort(squares);
        System.out.println();

        for(Square s2 : squares){
            System.out.println(s2);
        }
    }
}
