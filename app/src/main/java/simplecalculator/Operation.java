package simplecalculator;

public interface Operation {

    boolean matches(String operator);
    int apply(int a,int b);
}