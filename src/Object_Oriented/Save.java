package Object_Oriented;

import java.util.LinkedList;

public class Save {
    //필드
    //필드는 무조건 프라이빗
    // !! 공부
    //
    private LinkedList<String> list = new LinkedList<String>();
    private Calculation cal = new Calculation();
    // LinkedList 의 인스턴스화 기억하자

    //기본생성자 - 생략

    void save_log(String log_piece) {
        if (this.list.size() == 5) {
            this.list.remove(0);
        }
        this.list.add(log_piece);
    }
    LinkedList req_li(){
        return this.list;
    }
}