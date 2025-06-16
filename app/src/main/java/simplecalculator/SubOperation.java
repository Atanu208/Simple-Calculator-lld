package simplecalculator;

public class SubOperation implements Operation{

    @Override
    public boolean matches(String operator) {
       return operator.equalsIgnoreCase("sub");
    }

    @Override
    public int apply(int a, int b) {
        return (a-b);    
    }
    
}
