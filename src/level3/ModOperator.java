package level3;

public class ModOperator implements Operator {
    @Override
    public double operate(double firstNum, double secondNum) {
        return firstNum % secondNum;
    }
}
