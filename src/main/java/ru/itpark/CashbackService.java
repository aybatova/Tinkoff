package ru.itpark;

public class CashbackService {
  public int cashBack(int sumCategorySimple, int sumCategoryPriority, int sumCategorySuper) {


    int categoryPriorityPercent = 5;
    int categorySuperPersent = 30;
    int resultLimit = 3000;
    int resultCommon;


    resultCommon = (sumCategorySimple + sumCategoryPriority * categoryPriorityPercent + sumCategorySuper * categorySuperPersent) / 100;


    if (resultCommon < resultLimit) {
      return resultCommon;
    } else {

      return resultLimit;
    }

  }
}

