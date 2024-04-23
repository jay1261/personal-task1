package level2;

public class AddOperator implements Operator{
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
