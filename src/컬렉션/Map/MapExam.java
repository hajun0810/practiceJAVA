package 컬렉션.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {

        Map<String ,Integer> map = new HashMap<>();

        //입력
        map.put("one",1);
        map.put("two",2);
        map.put("two",22);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);

        System.out.println("map의 사이즈 : "+map.size());

        //제거
        map.remove("five");
        System.out.println("map의 사이즈 : "+map.size());

        System.out.println("map 이 one 을 가지고 있는가? " +map.containsKey("one"));
        System.out.println("map 이 six 를 가지고 있는가? " +map.containsKey("six"));

        System.out.println("map 이 1 을 가지고 있는가? " +map.containsValue(1));
        System.out.println("map 이 2 를 가지고 있는가? " +map.containsValue(2));


        //출력 형태
        // key를 이용한 출력
        Set<String> keySet = map.keySet();

        for(String key : keySet){
            System.out.print("key: "+key+", value : "+ map.get(key));
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        //Entry 를 이용한 출력
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        for(Map.Entry<String,Integer> en : entrySet){
            System.out.println("key: "+en.getKey()+", value : "+ en.getValue());
        }



    }
}
