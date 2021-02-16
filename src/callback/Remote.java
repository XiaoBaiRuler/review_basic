package callback;

/**
 * @Author xiaobai
 * @Date 2021/2/16 13:08
 * @Version 1.0
 */
public class Remote {
    public void executeMessage(String msg, CallBack callBack){
        for (int i = 0; i < 100; i++) {
            ;
        }
        System.out.println("execute msg:" + msg);
        msg += "msg change ...";
        callBack.execute(msg);
    }
}
