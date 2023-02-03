import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test

    void remainTest900() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = CashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected,actual);
    }

    @Test

    void remainTestMinus1() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = -1;

        int actual = CashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }
    @Test

    void remainTest0() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = CashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(expected,actual);
    }

    @Test

    void remainTest1() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1;

        int actual = CashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected,actual);
    }

    @Test

    void remainTest999() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = CashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected,actual);
    }
    @Test

    void remainTest1000() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = CashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }
    @Test

    void remainTest1001() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = CashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected,actual);
    }



    @Test

    void remainTest999_999_999() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 999_999_999;

        int actual = CashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected,actual);
    }
}
