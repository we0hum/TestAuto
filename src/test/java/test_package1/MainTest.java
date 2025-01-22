package test_package1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest {

    @BeforeClass
    public void setUp() {
    }

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
    }
}

