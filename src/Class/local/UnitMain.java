package Class.local;

public class UnitMain {
    public static void main(String[] args) {

        // 지역 클래스에서 메서드 내의 변수를 사용하려면 해당 변수는 final 이어야 한다.
        Unit unit = new Unit();

        unit.getUnit("tank","k9");

    }
}
