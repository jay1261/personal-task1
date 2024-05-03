package level3;

public enum OperatorType {
    ADD("+", new AddOperator()),
    SUBSTRACT("-", new SubstractOperator()),
    MULTIPLY("*", new MultiPlyOperator()),
    DIVIDE("/", new DivideOperator()),
    MOD("%", new ModOperator())
    ;

    private final String label;
    private final Operator operator;

    OperatorType(String label, Operator operator) {
        this.label = label;
        this.operator = operator;
    }

    public String getLabel() {
        return label;
    }

    public Operator getOperator(){
        return operator;
    }

    public static Operator matchOperator(String operatorSign) throws Exception {
        return switch (operatorSign) {
            case "+" -> ADD.operator;
            case "-" -> SUBSTRACT.operator;
            case "*" -> MULTIPLY.operator;
            case "/" -> DIVIDE.operator;
            case "%" -> MOD.operator;
            default -> throw new Exception("잘못된 연산자입니다.");
        };
    }
}
