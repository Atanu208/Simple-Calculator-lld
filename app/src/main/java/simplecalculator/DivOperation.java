package simplecalculator;

public class DivOperation implements Operation{

    @Override
    public boolean matches(String operator) {
        return operator.equalsIgnoreCase("div");
    }

    @Override
    public int apply(int a, int b) {
    
        return a/b;
    }
    
}
