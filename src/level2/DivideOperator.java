package level2;

public class DivideOperator implements Operator{
    @Override
    public double operate(int firestNum, int secondNum) {
        return (double) firestNum / secondNum;
    }
}
