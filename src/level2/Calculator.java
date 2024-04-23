package level2;

import java.util.ArrayList;

public class Calculator {
    public static final double PI = 3.14; // 상수로 사용

    private ArrayList<Double> list;
    private ArrayList<Double> circleList;

    public Calculator() {
        this.list = new ArrayList<>();
        this.circleList = new ArrayList<>();
    }

    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }

    public ArrayList<Double> getCircleList() {
        return circleList;
    }

    public void setCircleList(ArrayList<Double> circleList) {
        this.circleList = circleList;
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

    public void removeResult() {
        /* 구현 */
        this.list.remove(0);
    }

    public void inquiryResults() {
        /* 구현 */
        System.out.println(this.list);
    }

    public double calculateCircleArea(double radius) {
        /* 원의 넓이 계산 구현 */
        return PI * radius * radius;
    }
    public void inquiryCircleAreas() {
        /* 구현 */
        System.out.println(this.circleList);
    }
}