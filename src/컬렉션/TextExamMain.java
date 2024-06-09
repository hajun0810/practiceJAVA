package 컬렉션;

import java.util.HashSet;
import java.util.Set;

public class TextExamMain {
    public static void main(String[] args) {

        TextMessage msg1 = new TextMessage("1001","좋은아침");
        TextMessage msg2 = new TextMessage("1001","좋은아침");
        TextMessage msg3 = new TextMessage("1001","좋은아침");
        TextMessage msg4 = new TextMessage("1002","잘자요");

        Set<TextMessage> txset = new HashSet<>();

        txset.add(msg1);
        txset.add(msg2);
        txset.add(msg3);
        txset.add(msg4);

        System.out.println(txset);
        System.out.println("set 사이즈 : "+txset.size());


        //향상된  for 문
        for(TextMessage ts : txset){
            System.out.println("메시지 번호 : "+ts.getMsgNumber());
            System.out.println("메시지 번호 : "+ts.getMessage());
            System.out.println("--------------------------------------------");
        }
    }
}
