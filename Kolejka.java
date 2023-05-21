import java.util.ArrayDeque;
import  java.util.Queue;

public class Kolejka {
    public static void main(String[] args) {
        System.out.println("-------Queue------");
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Jeden");
        queue.add("Dwa");
        queue.add("Trzy");
        queue.add("Cztery");
        System.out.println(queue);
        queue.poll();
        queue.poll();
        System.out.println(queue + "\t 2 osoby załatwione");
    }
}
