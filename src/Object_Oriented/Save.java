package Object_Oriented;

import java.util.LinkedList;

public class Save {
    //필드
    private LinkedList<String> list = new LinkedList<String>();

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