package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashBackHackServiceTest {

   @Test
public void shouldRemain100() {
    CashBackHackService bonusService = new CashBackHackService();

    int actual = bonusService.remain(900);
    int expected = 100;

    Assert.assertEquals(actual, expected);
}

    @Test
   public void shouldRemain900() {
        CashBackHackService bonusService = new CashBackHackService();

        int actual = bonusService.remain(1100);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whatIf1000() {
        CashBackHackService bonusService = new CashBackHackService();

        int actual = bonusService.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}