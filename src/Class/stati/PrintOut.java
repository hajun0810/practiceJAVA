package Class.stati;

public class PrintOut {

   // private String line = "\n";

    //정적 클래스 선언
    public static class Out{
        public void println(String str){
            //정적 메서드 또는 클래스는 내부에서 맴버변수/인스턴스 호출이 불가능
           //System.out.println(str+ line);
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        PrintOut.Out out = new PrintOut.Out();
        String str = "내부 정적클래스";

        out.println(str);
    }
}
