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