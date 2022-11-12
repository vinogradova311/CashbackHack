package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashBackHackServiceTest {

   @Test
public void shouldRemain100() {
    CashBackHackService bonusService = new CashBackHackService();

    int actual = bonusService.remain(900);
    int expected = 100;

    assertEquals(actual, expected);
}

    @Test
   public void shouldRemain900() {
        CashBackHackService bonusService = new CashBackHackService();

        int actual = bonusService.remain(1100);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    public void whatIf1000() {
        CashBackHackService bonusService = new CashBackHackService();

        int actual = bonusService.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

}