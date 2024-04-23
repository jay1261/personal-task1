package level1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double[] arr = new double[10];
//        int index = 0;
        List<Double> list = new LinkedList<>();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int secondNum = sc.nextInt();
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.nextLine();
            double result = switch (operator) {
                case "+" -> firstNum + secondNum;
                case "-" -> firstNum - secondNum;
                case "*" -> firstNum * secondNum;
                case "/" -> {
                    if (secondNum == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        yield 0;
                    }
                    yield (double) firstNum / secondNum;
                }

                default -> 0;
            };
            System.out.println("결과: " + result);

//            if (index >= 9){
//                for (int i = 0; i < 9; i++) {
//                    arr[i] = arr[i+1];
//                }
//                arr[9] = result;
//            } else {
//                arr[index++] = result;
//            }
            list.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeInput = sc.nextLine();
            if(removeInput.equals("remove")){
                list.remove(0);
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String answer = sc.nextLine();
            if (answer.equals("exit")){
                break;
            }
        }
    }
}