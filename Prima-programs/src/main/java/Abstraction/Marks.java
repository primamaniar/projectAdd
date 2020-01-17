package Abstraction;

public class Marks extends Student {

    private int marks;

    public Marks(String name, String address, int number, int marks) {
        super(name, address, number);
        setMarks(marks);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of marks class ");
        System.out.println("Mailing check to " + getName()
                + " with marks " + marks);
    }

    public int marks() {
        return marks;
    }

    public void setMarks(int stMarks) {

        marks=stMarks;
    }


    public double percentage() {
        System.out.println("percentage of " + getName());
        return marks/100*100;
    }
}
