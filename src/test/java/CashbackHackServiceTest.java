import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemainIfAmountLess1000() {
        int amount = 900;
        int expected = 100;
        CashbackHackService hack = new CashbackHackService();
        int actual = hack.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAmountMore1000() {
        int amount = 1900;
        int expected = 100;
        CashbackHackService hack = new CashbackHackService();
        int actual = hack.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAmountEqual1000() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService hack = new CashbackHackService();
        int actual = hack.remain(amount);
        assertEquals(actual, expected);
    }
}
