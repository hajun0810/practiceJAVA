package 컬렉션;


public class TextMessage {

    //메세지 식별번호
    private String msgNumber;
    private String message;


    public TextMessage(String msgNumber, String message) {
        //private 변수는 내부에서도 get/setter 이용 추천
        this.setMsgNumber(msgNumber);
        this.setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMsgNumber() {
        return msgNumber;
    }

    public void setMsgNumber(String msgNumber) {
        this.msgNumber = msgNumber;
    }

    //메서드 재정의 이유 : 데이터 중복을 처리하기 위함

    //hashCode 메서드 재정의
    @Override
    public int hashCode() {
        return this.getMsgNumber().hashCode(); // 식별 데이터
    }

    //equals 메서드 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TextMessage) {
            TextMessage compare = (TextMessage) obj;
            if(this.getMessage().equals(compare.getMessage())){
                return  true; // 빠른 반환
            }
        }

        return  false;
    }



}
