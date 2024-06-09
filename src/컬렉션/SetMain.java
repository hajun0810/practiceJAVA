package 컬렉션;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

        //set 선언
        Set<Integer> set = new HashSet<>();

        // 추가
        set.add(1);// 중복 확인
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

        //값 지우기
        set.remove(3);
        System.out.println(set);

        //값 전체 지우기
       // set.clear(); //객체의 형태는 남겨두고 내용(데이터)만 삭제한다.
       // System.out.println(set);

        System.out.println("set의 크기 : "+set.size());
        System.out.println("set안에 1 데이터 존재 : "+set.contains(1));





    }
}
