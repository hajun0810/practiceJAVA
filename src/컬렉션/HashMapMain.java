package 컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        /*
         * 사전검색 기능
         * 검색어: 축구
         * 축구 =-> soccer
         *
         * 검색어: 야구
         * 야구 -> baseball
         *
         * 검색어: 농구
         * 농구 -> basketball
         *
         * 검색어: 골프
         * 골프 -> golf
         *
         * 검색어: 수영
         * 지원하지 않는 단어 입니다.
         *
         * 검색어: exit
         * 프로그램이 종료되었습니다.
         *
         */
        Scanner sc = new Scanner(System.in);
        HashMap<String ,String> str = new HashMap<>();
        for(int i=0; i< 4; i++){
            System.out.println("한글 단어를 입력하시오");
            String addWord = sc.nextLine();
            System.out.println("영어 단어를 입력하시오");
            String addWord2 = sc.nextLine();
            str.put(addWord,addWord2);
        }

        Set<Map.Entry<String,String>> entries = str.entrySet();

        while(true){
            System.out.println("검색할 단어를 입력하시오 그만은 그만");
            String findWord = sc.nextLine();
            for(Map.Entry<String,String> entry : entries){
                if(entry.getKey().equals(findWord)){
                    System.out.println("단어 : "+findWord);
                    System.out.println("뜻 : " + entry.getValue());
                    continue;
                }
            }


            if(findWord.equals("그만")){
                break;
            }


        }



    }
}
