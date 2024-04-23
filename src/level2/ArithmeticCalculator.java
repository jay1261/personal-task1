package level2;

public class ArithmeticCalculator extends Calculator{

    public double calculate(int firstNum, int secondNum, String operatorSign) throws Exception {
        if (secondNum == 0 && operatorSign.equals("/")){
            throw new ArithmeticException("can't divide by zero");
        }

        Operator operator = switch (operatorSign){
            case "+" -> new AddOperator();
            case "-" -> new SubstractOperator();
            case "*" -> new MultiPlyOperator();
            case "/" -> new DivideOperator();
            case "%" -> new ModOperator();
            default -> throw new Exception("잘못된 연산 기호입니다.");
        };

        return operator.operate(firstNum, secondNum);
    }

}
