package task25;

public class Main {
    public static void main(String[] args) {

        Planet core = new Planet(false, 150000){

            String name = "Earth";

            @Override
            public String toString() {
                return super.toString() + "; name: " + name;
            }

        };
        System.out.println(core);
    }

}
