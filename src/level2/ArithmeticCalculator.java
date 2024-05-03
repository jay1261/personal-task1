package level2;

public class ArithmeticCalculator extends Calculator{
    private AddOperator addOperator = new AddOperator();
    private SubstractOperator substractOperator = new SubstractOperator();
    private MultiPlyOperator multiPlyOperator = new MultiPlyOperator();
    private DivideOperator divideOperator = new DivideOperator();
    private ModOperator modOperator = new ModOperator();

    public double calculate(int firstNum, int secondNum, String operatorSign) throws Exception {
        if (secondNum == 0 && operatorSign.equals("/")){
            throw new ArithmeticException("can't divide by zero");
        }

        Operator operator = switch (operatorSign){
            case "+" -> addOperator;
            case "-" -> substractOperator;
            case "*" -> multiPlyOperator;
            case "/" -> divideOperator;
            case "%" -> modOperator;
            default -> throw new Exception("잘못된 연산 기호입니다.");
        };

        return operator.operate(firstNum, secondNum);
    }

}
