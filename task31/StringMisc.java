package task31;

public class StringMisc {

    public static String norm(String name) {
        String firstLetter = name.substring(0, 1).toUpperCase();
        String remaining = name.substring(1).toLowerCase();
        String result = firstLetter + remaining;
        return result;
    }

    public static String init(String name) {
        String firstName;
        String middleName;
        String lastName;
        String answer;

        int counter = 0;
        String[] words = name.split(" ");
        
        for(String word : words){
            counter++;
        }

        answer = switch(counter){
            case 2:
                firstName = words[0].substring(0, 1).toUpperCase() + ". ";
                String firstLetter = words[1].substring(0, 1).toUpperCase();
                String remaining = words[1].substring(1).toLowerCase();
                lastName = firstLetter + remaining;
                String result = firstName + lastName;
                yield result;
            case 3:
                firstName = words[0].substring(0, 1).toUpperCase() + ". ";
                middleName = words[1].substring(0, 1).toUpperCase() + ". ";
                firstLetter = words[2].substring(0, 1).toUpperCase();
                remaining = words[2].substring(1).toLowerCase();
                lastName = firstLetter + remaining;
                result = firstName + middleName + lastName;
                yield result;
            default:
                yield null;
        };
        
        return answer;
    }

    public static String tr(String s, String from, String to) {
        char[] s_chars = s.toCharArray();
        char[] from_chars = from.toCharArray();
        char[] to_chars = to.toCharArray();

        for(int i = 0; i < s_chars.length; i++){
            for(int j = 0; j < from_chars.length; j++){
                if(s_chars[i] == from_chars[j]){
                    s_chars[i] = to_chars[j];
                }
            }
        }

        String result = new String(s_chars);
        return result;
    }

    public static void main (String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));
        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("Mississippi", "abcdefghijklmnopqrstuvwyz", "BCDEFGHIJKLMNOPQRSTUVWYZA"));
        System.out.println(tr("abcXYZ","aZcX","||Cx"));
    }
}
