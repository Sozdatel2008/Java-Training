package task13;

public class SmashWords {
    public static void main(String[] args) {
        String[] myStrings = {"Hello", "or", "not", "hello"};
        System.out.println(smash(myStrings));
    }

    public static String smash(String[] words) {
        String result = "";
        
        for(int i = 0; i < words.length; i++){
            result += words[i];

            if(i != words.length - 1){
                result += " ";
            }
        }
        return result;
    }
}
