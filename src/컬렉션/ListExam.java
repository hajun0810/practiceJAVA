package 컬렉션;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        // List는 이렇게 선언 x
        // ArrayList<Integer> list01 = new ArrayList<>();
        // 형변환을 이용하여 부모타입인 List로 선언
        List<Integer> list = new ArrayList<>();

        //추가
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        //중간 삽입
        list.add(5,10);

        System.out.println(list);
        //치환
        list.set(0,5);

        System.out.println(list);
        //삭제 - 공간도 같이 지워진다. 배열과 다른점.
        list.remove(4);
        list.remove(3);

        System.out.println(list);

        //출력
        for(int i=0;i<list.size();i++){//기본 for
            System.out.print(list.get(i)+"\t");
        }
        System.out.println();
        for(Integer val : list){ // for-each
            System.out.print(val+"\t");
        }
        System.out.println();
        //iterator를 이용한 출력
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+"\t");
        }



    }
}
