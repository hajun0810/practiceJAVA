package Class.member;

public class Calculator {
    private int val1;
    private int val2;

    public Calculator(int val1,int val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    //내클래스 - 인스턴스클래스 선언
    // 인스턴스 클래스는 외부 클래스의 변수/메서드 사용 가능
    public class Calc{
        public int add(){
            return  val1+val2;
        }
    }
}
