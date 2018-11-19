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

      int cashBack = service.cashBack(1_400, 15_000, 7_000);
      assertEquals(2_864, cashBack);
    }
    {
      CashbackService service = new CashbackService();

      int cashBack = service.cashBack(15_000, 15_000, 7_000);
      assertEquals(3000, cashBack);
    }
    {
      CashbackService service = new CashbackService();

      int cashBack = service.cashBack(15_000, 15_001, 7_000);
      assertEquals(3_000, cashBack);
    }
    {
      CashbackService service = new CashbackService();

      int cashBack = service.cashBack(15_000, 15_000, 7_001);
      assertEquals(3_000, cashBack);
    }
    {
      CashbackService service = new CashbackService();

      int cashBack = service.cashBack(16_000, 15_000, 7_000);
      assertEquals(3_000, cashBack);
    }

  }
}