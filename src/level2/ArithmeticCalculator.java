package level2;

public class ArithmeticCalculator extends Calculator{

    public double calculate(int firstNum, int secondNum, String operator) throws Exception {
        if (secondNum == 0 && operator.equals("/")){
            throw new ArithmeticException("can't divide by zero");
        }

        double result = switch (operator){
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            case "/" -> (double) firstNum / secondNum;
            default -> throw new Exception("잘못된 연산 기호입니다.");
        };

        return result;
    }

}
