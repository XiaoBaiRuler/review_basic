package callback;

/**
 * @Author xiaobai
 * @Date 2021/2/16 13:06
 * @Version 1.0
 */
public class Local implements CallBack, Runnable{

    public Remote remote;
    public String message;

    public Local() {
    }

    public Local(Remote remote, String message) {
        this.remote = remote;
        this.message = message;
    }

    public void sendMessage(){
        System.out.println(Thread.currentThread().getName() + "now");
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void execute(Object... objects) {
        System.out.println(objects[0]);
        System.out.println(Thread.currentThread().getName());
        System.out.println("done");
    }

    @Override
    public void run() {
        remote.executeMessage(message, this);
    }

    public static void main(String[] args) {
        Local local = new Local(new Remote(), "hello world");
        local.sendMessage();
        System.out.println("next");
    }
}
