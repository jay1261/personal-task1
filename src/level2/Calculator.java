package level2;

import java.util.ArrayList;

public abstract class Calculator  {
    public static final double PI = 3.14; // 상수로 사용
    private ArrayList<Double> list;

    public Calculator() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }

    public void removeResult() {
        this.list.remove(0);
    }

    public void inquiryResults() {
        System.out.println(this.list);
    }
}

/*
    계산기 - 계산 기능, 계산 결과를 담는 배열
    사칙연산 계산기 : ( + - * / ) 사칙연산 계산, 사칙연산 계산 결과를 담는 배열
    원의 넓이 계산기: 원의 넓이 계산, 결과 배열

    오퍼레이터: 사칙연산의 계산만을 신경쓰는 인터페이스를 만들어서 오퍼레이터 타입으로 만들고 쓸 수 있다.

    현재 Calculator가 이름처럼 계산기라는 역할이 없음. list 생성,접근 등의 코드를 줄여주는 정도의 역할만 하고있어서.
    calculate 함수를 여기에 오버로딩으로(사칙연산용, 원의 넓이용) 만들어두고 오버라이딩 하게 해야하는지.. 흠
 */
