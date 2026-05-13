package task27;

public interface Pet {
    void conditions();

    default String commonProblem(){
        return "";
    }
}
