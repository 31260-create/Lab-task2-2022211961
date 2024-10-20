import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L2022211961_12_Test {
    @Test
    public void test(){
        Solution12 s = new Solution12() ;
        assertEquals("0", s.multiply("0", "0"));
        assertEquals("0", s.multiply("5", "0"));
        assertEquals("0", s.multiply("0", "5"));
        assertEquals("error", s.multiply("-5", "0"));
        assertEquals("error", s.multiply("a", "0"));
        assertEquals("50", s.multiply("5", "10"));
        assertEquals("567" + "0".repeat(233), s.multiply("567", "1" + "0".repeat(233)));
    }
}
