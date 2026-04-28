package task17;

import java.util.Arrays;

public class Match_Score {
    //The program calculates total score for each team 
    //(3 points for a win, 1 for a draw, 0 for a defeat), 
    //puts them into the array and then prints it.
    public static void main(String[] args) {
        String[][] arr =
            { {"Germany", "2", "Scotland", "1"},
            {"Poland", "2", "Germany", "0"},
            {"Germany", "1", "Ireland", "1"},
            {"Poland", "2", "Scotland", "2"},
            {"Scotland", "1", "Ireland", "0"},
            {"Ireland", "1", "Poland", "1"},
            {"Ireland", "1", "Scotland", "1"},
            {"Germany", "3", "Poland", "1"},
            {"Scotland", "2", "Germany", "3"},
            {"Ireland", "1", "Germany", "0"},
            {"Scotland", "2", "Poland", "2"},
            {"Poland", "2", "Ireland", "1"} };

        int Germany_Score = 0;
        int Ireland_Score = 0;
        int Poland_Score = 0;
        int Scotland_Score = 0;

        for(String[] row : arr){
            if(Integer.parseInt(row[1]) > Integer.parseInt(row[3])){
                if(null != row[0]){
                    switch (row[0]) {
                    case "Germany" -> Germany_Score = Germany_Score + 3;
                    case "Ireland" -> Ireland_Score = Ireland_Score + 3;
                    case "Poland" -> Poland_Score = Poland_Score + 3;
                    case "Scotland" -> Scotland_Score = Scotland_Score + 3;
                    }
                } else{
                    System.out.println("Error");
                }
            }
            
            else if(Integer.parseInt(row[1]) < Integer.parseInt(row[3])){
                if(null != row[2]){
                    switch (row[2]) {
                    case "Germany" -> Germany_Score = Germany_Score + 3;
                    case "Ireland" -> Ireland_Score = Ireland_Score + 3;
                    case "Poland" -> Poland_Score = Poland_Score + 3;
                    case "Scotland" -> Scotland_Score = Scotland_Score + 3;
                    }
                } else{
                    System.out.println("Error");
                }
            }
            
            else if(Integer.parseInt(row[1]) == Integer.parseInt(row[3])){
                if(null != row[0]){
                    switch (row[0]) {
                    case "Germany" -> Germany_Score++;
                    case "Ireland" -> Ireland_Score++;
                    case "Poland" -> Poland_Score++;
                    case "Scotland" -> Scotland_Score++;
                    }
                } else{
                    System.out.println("Error");
                }
                
                if(null != row[2]){
                    switch (row[2]) {
                    case "Germany" -> Germany_Score++;
                    case "Ireland" -> Ireland_Score++;
                    case "Poland" -> Poland_Score++;
                    case "Scotland" -> Scotland_Score++;
                    }
                } else{
                    System.out.println("Error");
                }
            }
        }
        int[] scores = {Germany_Score, Ireland_Score, Poland_Score, Scotland_Score};
        System.out.println(Arrays.toString(scores));
        
    }
}
