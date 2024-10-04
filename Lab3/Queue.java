package Lab3;
import java.util.List;
import java.util.LinkedList;

public class Queue<T> {
    private List<T> elements;

    public Queue() {
        this.elements = new LinkedList<>();
    }

    public Queue(List<T> elements) {
        this.elements = elements;
    }

    public void enqueue(T element) {
        elements.add(element);
    }

    public T dequeue() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.remove(0);
    }

    public boolean empty() {
        return elements.isEmpty();
    }

    public void print() {
        for (T element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}