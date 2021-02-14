package lambda;

/**
 * @Author xiaobai
 * @Date 2021/2/13 12:26
 * @Version 1.0
 */
@FunctionalInterface
public interface ConsumerInterface<T> {
    /**
     * 说
     * @param t str
     */
    void say(T t);
}
