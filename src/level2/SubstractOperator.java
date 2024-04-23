package level2;

public class SubstractOperator implements Operator{
    @Override
    public double operate(int firstNum, int secondNum){
        return firstNum - secondNum;
    }
}
