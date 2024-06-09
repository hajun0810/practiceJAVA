package 컬렉션;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        Set<Integer> set = new HashSet<>(list);

        //list 를 iterator 를 이용하여 출력
        Iterator<Integer> intItor = list.iterator();

        while(intItor.hasNext()){
            System.out.println(intItor.next());
        }

        //set을 iterator를 이용해서 출력
        Iterator<Integer> setinter = set.iterator();

        while(setinter.hasNext()){
            System.out.println(setinter.next());
        }

    }
}
