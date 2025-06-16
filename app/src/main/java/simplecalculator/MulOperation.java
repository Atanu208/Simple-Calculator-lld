package simplecalculator;

public class MulOperation implements Operation{

    @Override
    public boolean matches(String operator) {
        return operator.equalsIgnoreCase("mul");
    }

    @Override
    public int apply(int a, int b) {
        return a*b;
    }
    
}
