package cicd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CiCdTest {

    @Test
    void testSuccess() {
        System.out.println("✅ Test Passed Successfully in GitHub Actions!");
        assertEquals(2, 1 + 1);
    }
}
