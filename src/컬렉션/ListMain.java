package 컬렉션;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        /*
         * studentList 라는 list 만들고
         * student 1 2 3 4 추가
         */

        List<String> studentList = new ArrayList<>();

        for(int i=0; i<4; i++){
            studentList.add("student"+(i+1));
        }

        for(String student : studentList){
        System.out.println(student);
        }
        studentList.remove("student1");

        for(String student : studentList){
            System.out.println(student);
        }
    }
}
