package level2;

import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private ArrayList<Double> list;

    public Calculator(ArrayList<Double> list) {
        this.list = list;
    }

    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }

    public double calculate(int firstNum, int secondNum, String operator) throws Exception {
        /* 위 요구사항에 맞게 구현 */
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

        /* return 연산 결과 */
        return result;
    }
}