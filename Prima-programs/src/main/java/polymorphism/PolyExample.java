package polymorphism;

public class PolyExample {
    public static void main(String [] args) {
        Marks m1 = new Marks("Prima", "Ahmedabad,Gujarat", 3, 75);
        Student st1 = new Marks("Khyati", "mumbai,Maharashtra", 2, 89);
        System.out.println("Call mailCheck using Marks reference --");
        m1.mailCheck();
        System.out.println("\n Call mailCheck using Student reference--");
        st1.mailCheck();
    }
}
