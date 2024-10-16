package synthesizer;

/**
 * @Author： Hengyi
 * @Date 2021-05-26 09:25
 * @Version 1.0
 */

public interface BoundedQueue<T> extends Iterable<T> {
    int capacity();     // return size of the buffer
    int fillCount();    // return number of items currently in the buffer
    void enqueue(T x);  // add item x to the end
    T dequeue();        // delete and return item from the front
    T peek();           // return (but do not delete) item from the front

    default boolean isEmpty() {
        if (fillCount() == 0) {
            return true;
        }
        return false;
    }

    default boolean isFull() {
        if (fillCount() == capacity()) {
            return true;
        }
        return  false;
    }
}
