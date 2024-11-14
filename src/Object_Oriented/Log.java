package Object_Oriented;

import java.util.LinkedList;

public class Log {
    // 필드
    LinkedList<String> log_collection = new LinkedList<String>();

    // 기본생성자
    public Log(Save save_collection) {
        this.log_collection = save_collection.req_li();
    }


    void log_data() {
        if (this.log_collection == null) {

            System.out.println("출력가능한 log 데이터가 없습니다.");
        } else {
            for (int i = 0; i < this.log_collection.size(); i++) {
                System.out.println(this.log_collection.get(i));
            }
        }
    }
}
