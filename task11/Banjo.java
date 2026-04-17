package task11;

public class Banjo {
    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("rostislav"));
        System.out.println(areYouPlayingBanjo("Rostislav"));
        System.out.println(areYouPlayingBanjo("tom"));
        System.out.println(areYouPlayingBanjo("Tom"));
    }

    public static String areYouPlayingBanjo(String name) {
        if(name.startsWith("r") || name.startsWith("R")){
            return name + " plays banjo";
        }

        return name + " does not play banjo";
    }
}
