package Lab3;
import java.util.List;
import java.util.LinkedList;

public class Queue<T> {
    private List<T> elements;

    public Queue() {
        this.elements = new LinkedList<>();
    }

    public Queue(List<T> elements) {
        this.elements = new LinkedList<>(elements);;
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
/**
 * ERRORI:
 * Bisogna creare un nuovo ogetto list della stessa classe di elements facendo getclass di elements
 * Bisogna fare un controllo su elements per vedere se le istanze sono corrette(opinabile)  
 * Bisogna fare un cast di elements per poterlo copiare in c
 */