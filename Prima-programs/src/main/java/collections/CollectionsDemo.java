package collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        List a1 = new ArrayList();
        a1.add("Prima ");
        a1.add("Jolly");
        a1.add("Virangi");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        List l1 = new LinkedList();
        l1.add("Java");
        l1.add("Kotlin");
        l1.add("React JS");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        // HashSet
        Set s1 = new HashSet();
        s1.add("Zara");
        s1.add("Gucci");
        s1.add("H&M");
        System.out.println();
        System.out.println(" Set Elements");
        System.out.print("\t" + s1);

        // HashMap
        Map m1 = new HashMap();
        m1.put("Prims", "8");
        m1.put("Krush", "31");
        m1.put("Ritz", "12");
        m1.put("Veere", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
}
