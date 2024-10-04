/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Applicazione di test in cui viene creata una coda di elementi
 * di tipo Integer, sulla quale vengono fatte alcune operazioni.
 *
 * @author liliana
 */
public class QueueApp {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34); numbers.add(56);
        System.out.println("qui");
        Queue<Integer> queue = new Queue<>(numbers);
        System.out.println("La coda e' vuota? " + queue.empty());
        for (int i=0; i<10; i++) {
            queue.enqueue(r.nextInt(100));
        }
        queue.print();
        // esegue alcune operazioni che possono essere di enqueue o dequeue
        for (int i=0; i<10; i++) {
            if (r.nextFloat() < 0.5) {
                queue.enqueue(r.nextInt(100));
                queue.print();
            } else {
                System.out.println("Rimosso " + queue.dequeue());
            }
        }
        System.out.println("\nRisultato finale:");
        queue.print();
        System.out.println("La coda e' vuota? " + queue.empty());

        LinkedList<String> words = new LinkedList<>();
        Queue<String> queue1 = new Queue<>(words);
        queue1.enqueue("first");
        queue1.enqueue("second");
        queue1.print();
    }
}


