package school.model;

        import org.junit.Test;

        import static org.junit.Assert.*;

/**
 * Created by michal on 20.06.15.
 */
public class StudentTest {

    @Test
    public void testHashCode() throws Exception {
        Student student = new Student("Kamil", "Kowalski");
        Student student2 = new Student("Kamil", "Kowalski");

        assertTrue("hash codes are not equal", student.hashCode()==student2.hashCode());
    }
}