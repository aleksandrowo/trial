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
        Collections.reverse(list);
        System.out.println("------sort DESC------");
        display(list);
        System.out.println("---wybieramy 3 elementy listy " + list.get(3));
    }

    static void display (ArrayList<String> list){
        int i=0;
        for (String e: list) {
            System.out.println(i++ +") \t" +e);
        }

    }
}
