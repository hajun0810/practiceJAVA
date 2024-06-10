package 컬렉션.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam02 {

    public static void main(String[] args) {
        String [] flowers = {"백합","장미","튤립","장미","장미","백합","튤립","안개꽃"};

        //꽃별로 몇개씩 사왔는지 분류해봅시다.
        Map<String,Integer> flMap = new HashMap<>();
        int count = 0;
        for(int i=0;i<flowers.length;i++){
            //꽃 이름 가져오기
            String flower = flowers[i];

            //꽃이름과 동일한 key값을 가지고 있다면
            if(flMap.containsKey(flower)){
                //현재 개수에 한개를 더한다.
                count = flMap.get(flower) +1;
                //맵에 치환 - key 중복 치환 이용
                flMap.put(flower,count);
            }else {
                // 중복이 없다면 맵에 등록
                flMap.put(flower,1);
            }
        }

        Set<String> keySet = flMap.keySet();

        for(String key : keySet){
            System.out.println("꽃 : "+key+", 개수 : "+flMap.get(key));
        }





    }
}
