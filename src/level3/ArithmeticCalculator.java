package level3;

public class ArithmeticCalculator extends Calculator {

    public double calculate(int firstNum, int secondNum, String operatorSign) throws Exception {
        if (secondNum == 0 && (operatorSign.equals("/") || operatorSign.equals("%"))){
            throw new ArithmeticException("can't divide by zero");
        }

        OperatorType operatorType = OperatorType.ADD;
        Operator operator = operatorType.matchOperator(operatorSign);

        return operator.operate(firstNum, secondNum);
    }

}
