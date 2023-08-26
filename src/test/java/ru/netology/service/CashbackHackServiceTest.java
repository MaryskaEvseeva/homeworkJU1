package ru.netology.service;
import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTest {
    @org.junit.Test
    public void TestRemain (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestRemain2000 (){
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestRemainMultiple1000 (){
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestRemainLimitCashbackLessThan1000 (){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestRemainLimitCashbackMoreThan1000 (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(expected, actual);
    }
}
