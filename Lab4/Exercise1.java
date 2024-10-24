package Lab4;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Visualizer v = new Visualizer();uh
        Filter f = new Filter();
        f.addObserver(v);
        Counter c = new Counter(f);
        c.start();
    }
}
interface Observer {
    void update(List<Integer> list);
}

class Counter{

    private int c;
    private Filter filter;

    public Counter(Filter f) {
        c = 0;
        filter = f;
    }

    public void start() {

        for (int i=0; i<50; i++) {
            c++;
            if (c%5==0) {
                filter.filter(c);
            }
        }
    }
}

class Filter {
    private List<Integer> list;
    private List<Observer> observers;

    public Filter() {
        list = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void filter(int c) {
        list.add(c);
        if (list.size() % 2 == 0) {
            System.out.println("lista size: " + list.size());
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(list);
        }
    }
}

class Visualizer implements Observer {
    @Override
    public void update(List<Integer> list) {
        visualize(list);
    }

    public void visualize(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i.intValue());
        }
        System.out.println();
    }
}