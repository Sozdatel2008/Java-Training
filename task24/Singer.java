package task24;

public abstract class Singer {
    private static int counter = 0;
    private int number;
    
    private final String name;

    public Singer(String name) {
        this.name = name;
        this.number = ++counter;
    }

    abstract String sing();

    @Override
    public String toString(){
        return "(" + number + ") " + name + ": " + sing();
    };

    static Singer loudest(Singer[] singers){
        Singer loudestSinger = singers[0];
        int maxCaps = 0;
        
        for (Singer s : singers) {
            int caps = 0;
            
            for (char c : s.sing().toCharArray()) {
                if (Character.isUpperCase(c) == true){
                    caps++;
                }
            } 

            if(caps > maxCaps){
                maxCaps = caps;
                loudestSinger = s;
            }
        }
        return loudestSinger;
    };
}
