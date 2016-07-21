import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Chris on 18/07/2016.
 */
public class MainTest {
    @Test
    public void main() throws Exception {
        assertEquals("Hello GRADLE! - WORKS!!!", Main.helloString());
    }

}