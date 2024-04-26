package level3;

public class ArithmeticCalculator extends Calculator {

    public <T extends Number> double calculate(T firstNum, T secondNum, String operatorSign) throws Exception {
        if (secondNum.doubleValue() == 0 && (operatorSign.equals("/") || operatorSign.equals("%"))){
            throw new ArithmeticException("can't divide by zero");
        }

        OperatorType operatorType = OperatorType.ADD;
        Operator operator = operatorType.matchOperator(operatorSign);

        return operator.operate(firstNum.doubleValue(), secondNum.doubleValue());
    }

}
