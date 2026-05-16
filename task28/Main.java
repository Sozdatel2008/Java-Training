package task28;

public class Main {
    public static void main(String[] args) {
        JeansPants jeansPants1 = new JeansPants(40, 70);
        WoolSweater woolSweater1 = new WoolSweater("Ussual", "Black");
        JeansPants jeansPants2 = new JeansPants(25, 45);
        WoolSweater woolSweater2 = new WoolSweater("Ussual", "Red");
        
        Washing[] clothes = {jeansPants1, woolSweater1, jeansPants2, woolSweater2};

        for(Washing cloth : clothes){
            System.out.println(cloth);
        }
    }
}
