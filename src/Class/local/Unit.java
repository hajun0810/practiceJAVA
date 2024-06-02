package Class.local;

public class Unit {
    private int speed = 10;


    public void getUnit(String type,String unitName){
        //메서드 변수가 final로 인정되지만
        //아래 처럼 final을 무시하고 새로 선언을 하면 에러가 난다.
        // unitName = "이름";
        class Tank{
            public void move(){
                System.out.println(unitName+"이(가)"+speed+"속도로 이동.");
            }
        }

        class Ship{
            public void move(){
                System.out.println(unitName+"이(가)"+speed+"속도로 이동.");
            }
        }

        Tank t = null;
        Ship s = null;

        if(type.equals("tank")){
            t = new Tank();
            t.move();
        }else if(type.equals("ship")){
            s = new Ship();
            s.move();
        }


    }
}
