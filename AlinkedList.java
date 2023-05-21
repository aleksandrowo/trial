import java.util.LinkedList;

public class AlinkedList {
    public static void main(String[] args) {
        System.out.println("-------Linked List-----");
        LinkedList<String> list = new LinkedList<>();
        list.add("Zabrze");
        list.add("Otwock");
        list.add("Wrocław");
        list.add("Gdańsk");
        list.add("Łomianki");
        System.out.println(list);
        wyswietlMiasta(list);
        System.out.println("-----po usunieciu index 4----" + list.get(4));
        list.remove( 4);
        wyswietlMiasta(list);
    }
    static void wyswietlMiasta (LinkedList<String> list){
        for (String e: list)
            System.out.println(e);
    }
}