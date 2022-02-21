import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegExValidatorTest {

    void testIp(String ip, boolean expected) {
        boolean actual = RegExValidator.isValidIp(ip);
        assertEquals(expected, actual);
    }

    @Test
    void isValidIp() {
        testIp("0.0.0.0", true);
        testIp("10.10.10.10", true);
        testIp("100.100.100.100", true);
        testIp("200.200.200.200", true);
        testIp("255.255.255.255", true);
    }

    @Test
    void isNotValidIp() {
        testIp("0.0.0.999", false);
        testIp("999.260.255.255", false);
    }

    @Test
    void isValidIpLoop() {
        for (int i = 0; i <= 255; i++) {
            testIp(String.format("%d.%d.%d.%d", i, i, i, i), true);
        }
    }

}
