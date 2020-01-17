package bitset;

import java.util.BitSet;

public class BitsetEx {
    public static void main(String[] args) {
        BitSet b1=new BitSet(16);
        BitSet b2=new BitSet(16);

        for (int i=0;i<16;i++){
            if((i%3)==0)b1.set(i);
            if((i%5)!=0)b2.set(i);
        }
        System.out.println("Bit values of first set : "+b1);
        System.out.println("\nBit values of second set : "+b2);

    b1.and(b2);
        System.out.println("Common values of both set : "+b1);

        b2.or(b1);
        System.out.println("Bit OR : "+b2);

        b1.xor(b2);
        System.out.println("Bit XOR : "+b1);
    }

}
