package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

  @Test
  void cashBack() {

    {
      CashbackService service = new CashbackService();

      int cashBack = service.cashBack(0, 0, 0);
      assertEquals(0, cashBack);
    }
    {
      CashbackService service = new CashbackService();

      int cashBack = service.cashBack(1400, 15000, 7000);
      assertEquals(2864, cashBack);
    }
    {
      CashbackService service = new CashbackService();

      int cashBack = service.cashBack(15000, 15000, 7000);
      assertEquals(3000, cashBack);
    }
    {
      CashbackService service = new CashbackService();

      int cashBack = service.cashBack(15000, 15001, 7000);
      assertEquals(3000, cashBack);
    }
    {
      CashbackService service = new CashbackService();

      int cashBack = service.cashBack(15000, 15000, 7001);
      assertEquals(3000, cashBack);
    }
    {
      CashbackService service = new CashbackService();

      int cashBack = service.cashBack(16000, 15000, 7000);
      assertEquals(3000, cashBack);
    }

  }
}