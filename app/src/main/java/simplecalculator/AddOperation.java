package simplecalculator;

public class AddOperation implements Operation{

    @Override
    public boolean matches(String operator) {
       
       return operator.equalsIgnoreCase("add"); 
    }

    @Override
    public int apply(int a, int b) {
        return (a+b);
    }
    
}
