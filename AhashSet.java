import java.util.LinkedHashSet;

public class AhashSet {
    public static void main(String[] args) {
        System.out.println("--------Hash Set-------");

        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Texas");
        hashSet.add("Oklahoma");
        hashSet.add("Wyoming");
        hashSet.add("Tennesse");
        hashSet.add("Florida");
        System.out.println(hashSet);
    }
}
