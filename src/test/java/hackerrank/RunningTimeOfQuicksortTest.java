package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class RunningTimeOfQuicksortTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/running-time-of-quicksort/test1.txt"));
        RunningTimeOfQuicksort.main(new String[]{});
    }
}