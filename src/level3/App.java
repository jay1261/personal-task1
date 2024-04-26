package level3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
        while (true) {
            System.out.println("원하는 계산을 선택해주세요");
            System.out.print("1. 사칙연산, 2. 원의 넓이, 3 사칙연산 결과 조회: ");
            String mode = sc.nextLine();

            // 사칙연산
            if (mode.equals("1")) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double num1 = sc.nextDouble();
                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = sc.nextDouble();
                sc.nextLine();

                System.out.print("사칙연산 기호를 입력하세요: ");
                String operator = sc.nextLine();

                try {
                    double result = calculator.calculate(num1, num2, operator);
                    if (calculator.getList().size() > 10) {
                        calculator.removeResult();
                    }
                    calculator.getList().add(result);
                    calculator.inquiryResults();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            // 원의 넓이
            else if(mode.equals("2")){
                System.out.print("반지름을 입력하세요: ");
                int radius = sc.nextInt();
                sc.nextLine();
                double result = circleCalculator.calculateCircleArea(radius);
                circleCalculator.getList().add(result);
                circleCalculator.inquiryResults();
            }

            else if(mode.equals("3")){
                System.out.print("n보다 큰 결과들을 조회합니다. 숫자 n을 입력해주세요: ");
                double input = sc.nextDouble();
                calculator.printBiggerThanInput(input);
                sc.nextLine();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String exitRequest = sc.nextLine();
            if (exitRequest.equals("exit")) {
                break;
            }
        }
        /* 반복문 종료 */
    }
}
