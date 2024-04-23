package level2;

public class ArithmeticCalculator extends Calculator{

    AddOperator addOperator;
    SubstractOperator substractOperator;
    MultiPlyOperator multiPlyOperator;
    DivideOperator divideOperator;

    public ArithmeticCalculator() {
        this.addOperator = new AddOperator();
        this.substractOperator = new SubstractOperator();
        this.multiPlyOperator = new MultiPlyOperator();
        this.divideOperator = new DivideOperator();
    }

    public double calculate(int firstNum, int secondNum, String operator) throws Exception {
        if (secondNum == 0 && operator.equals("/")){
            throw new ArithmeticException("can't divide by zero");
        }

        double result = switch (operator){
            case "+" -> addOperator.operate(firstNum,secondNum);
            case "-" -> substractOperator.operate(firstNum,secondNum);
            case "*" -> multiPlyOperator.operate(firstNum,secondNum);
            case "/" -> divideOperator.operate(firstNum,secondNum);
            default -> throw new Exception("잘못된 연산 기호입니다.");
        };

        return result;
    }

}
