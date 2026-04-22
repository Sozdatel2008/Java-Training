package task14;

import java.util.Iterator;

public class Hailstone implements Iterable<Integer>{
    private final int givenNumber;

    public Hailstone(int givenNumber) {
        this.givenNumber = givenNumber;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int currentNum = givenNumber;
            private boolean finished = false;
            
            @Override
            public boolean hasNext() {
                return !finished;
            }

            @Override
            public Integer next() {
                int value = currentNum;

                if(currentNum == 1){
                    finished = true;
                } else if(currentNum % 2 == 0){
                    currentNum = currentNum/2;
                } else if (currentNum % 2 == 1) {
                    currentNum = 3*currentNum + 1;
                }
                return value;
            }
            
        };
    }
}
