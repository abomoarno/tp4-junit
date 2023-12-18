package example;

import org.example.Employe;
import org.junit.Assert;
import org.junit.Test;

public class EmployeTest {

    @Test
    public void testToString() {
        Employe employe = new Employe(
                "ARNO",
                30,
                2500.0,
                0
        );

        Assert.assertEquals("ARNO - 30 - 2500.0 - 0", employe.toString());
    }
}