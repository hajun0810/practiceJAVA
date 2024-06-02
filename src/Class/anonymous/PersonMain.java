package Class.anonymous;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.introduce();

        //final이 생략
        String a ="한글";

        //익명 클래스
        //지역 클래스와 비슷한 성격을 가진다.
        Person p2 = new Person(){
            @Override
            public void introduce(){
               // a = "멋진" +a ; 메서드내의 변수를 사용하려면 final이 되어야 함. 에러
                System.out.println(a + "을 배우는 사람");
            }
        };

        p2.introduce();

    }
}
