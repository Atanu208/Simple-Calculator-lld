package simplecalculator;

import java.util.List;

public class Calculator {
    private List<Operation> operations;

    public Calculator(List<Operation> operations) {
        this.operations = operations;
    }

    public int calculate(String operator,int a,int b)
    {
        for(Operation op:operations)
        {
            if(op.matches(operator))
            {
                return op.apply(a, b);
            }
        }
        throw new UnsupportedOperationException("Invalid Operation"); 
    }

}
