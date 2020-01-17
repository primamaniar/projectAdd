package hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableEx {
    public static void main(String args[]) {

        Hashtable marks = new Hashtable();
        Enumeration names;
        String str;
        int stmarks;

        marks.put("Prima", new Integer(89));
        marks.put("Dhyana", new Integer(55));
        marks.put("Rahil", new Integer(29));
        marks.put("Kushal", new Integer(76));
        marks.put("Jolly", new Integer(72));

        names = marks.keys();

        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + marks.get(str));
        }
        System.out.println();


        stmarks= ((Integer)marks.get("Kushal")).intValue();
        marks.put("Kushal", new Integer(stmarks + 10));
        System.out.println("Kushal's new marks: " + marks.get("Kushal"));
    }
}
