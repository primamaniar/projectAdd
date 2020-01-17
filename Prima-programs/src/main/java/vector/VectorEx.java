package vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
    public static void main(String args[]) {

        Vector v = new Vector(3);
                System.out.println("Initial size of vector : " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.addElement(new Integer(10));
        v.addElement(new Integer(12));
        v.addElement(new Integer(23));
        v.addElement(new Integer(54));
        System.out.println("Capacity after four additions: " + v.capacity());

        v.addElement(new Double(25.45));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Double(16.08));
        v.addElement(new Integer(37));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Float(9.4));
        v.addElement(new Integer(50));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element in vector : " + (Integer)v.firstElement());
        System.out.println("Last element in vector : " + (Integer)v.lastElement());

        if(v.contains(new Integer(37)))
            System.out.println("Vector contains 37.");

        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");

        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}
