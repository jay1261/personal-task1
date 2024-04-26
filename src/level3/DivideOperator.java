package level3;

public class DivideOperator implements Operator {
    @Override
    public double operate(double firestNum, double secondNum) {
        return (double) firestNum / secondNum;
    }
}
