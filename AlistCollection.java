import java.util.ArrayList;
import java.util.Collections;

public class AlistCollection {
    public static void main(String[] args) {
        System.out.println("-------Array List-------");
        ArrayList<String> list = new ArrayList<>();
        list.add("Zbyszek");
        list.add("Adam");
        list.add("Maria");
        list.add("Renata");
        list.add("Łucja");
        System.out.println(list);
        display(list);
        Collections.sort(list);
        System.out.println("------sort ASC-------");
        display(list);
    }

    static void display (ArrayList<String> list){
        int i=0;
        for (String e: list) {
            System.out.println(i++ +") \t" +e);
        }

    }
}
