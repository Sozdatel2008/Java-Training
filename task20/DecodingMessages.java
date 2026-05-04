package task20;

import java.io.BufferedReader;
import java.io.FileReader;

public class DecodingMessages {
    public static void main(String[] args) throws Exception{
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("messages.txt"));
            String tmp = null;
            
            while((tmp = br.readLine()) != null){
                System.out.println(tmp);

                String[] words = tmp.split(" ");
                
                System.out.println();

                for(int i = 0; i < words.length; i += 2){
                    System.out.print(words[i] + " ");
                }

                System.out.println();

                for(int i = 1; i < words.length; i += 2){
                    System.out.print(words[i] + " ");
                }
            }

        } finally {
            if(br != null){
                br.close();
            }
        }
    }
}
