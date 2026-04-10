package task6;

public class Counter {
    public static void main(String[] args) {
        Boolean[] sheepList = {
                    true,  true,  true,  false,
                    true,  true,  true,  true ,
                    null,  false, true,  false,
                    true,  false, false, true ,
                    true,  true,  true,  true ,
                    false, false, true,  true};
        System.out.println(countSheeps(sheepList));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int presentSheeps = 0;
        for(int i = 0; i < arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i] == null){
                arrayOfSheeps[i] = false;
            }
            if(arrayOfSheeps[i] == true){
                presentSheeps++;
            }
        }
        return presentSheeps;
    }
}
