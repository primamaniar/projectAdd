package encapsulation;

public class EncapExample {
    public static void main(String[] args) {
    EncapStudent st=new EncapStudent();
    st.setName("ABC");
    st.setMarks(98);
    System.out.println("Name of student : "+st.getName() + " Marks : "+st.getMarks());
    }
}
