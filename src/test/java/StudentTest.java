import com.ycm.Student;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StudentTest {

    private String name;

    public static void main(String[] args) {
        StudentTest m = new StudentTest();
        m.run();
    }

    private void run() {
        Student s1 = new Student();
        s1.setName("ycm");
        s1.setAge(18);
        s1.setGender("male");
        s1.setMatricNum("12345");

        Student s2 = new Student();
        s2.setName("ycm");
        s2.setAge(18);
        s2.setGender("male");
        s2.setMatricNum("12345");

        assertTrue(s1.equals(s2));
        s2.setMatricNum("67890");
        assertFalse(s1.equals(s2));
    }
}
