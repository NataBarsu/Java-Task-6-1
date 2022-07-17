package ru.netology.sales.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {
    @Test
    public void shouldCalcTotalOfAllSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getSumOfSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCalcAverageOfAllSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSum = 15;
        long actualAverageSum = service.getAverageOfAllSales(sales);
        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }


    @Test
    public void shouldCalcMaxSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxSalesDay = 8;
        long actualMaxSalesDay = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSalesDay, actualMaxSalesDay);
    }

    @Test
    public void shouldCalcMinSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinSales = 9;
        long actualMinSales = service.minSales(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldCalcSumOfMinAverage() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSumOfMinAverageSalesDay = 5;
        long actualSumOfMinAverageSalesDay = service.getSumOfMinAverageSalesDay(sales);
        Assertions.assertEquals(expectedSumOfMinAverageSalesDay, actualSumOfMinAverageSalesDay);
    }

    @Test
    public void shouldCalcSumOfMaxAverage() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSumOfMaxAverageSalesDay = 5;
        long actualSumOfMaxAverageSalesDay = service.getSumOfMaxAverageSalesDay(sales);
        Assertions.assertEquals(expectedSumOfMaxAverageSalesDay, actualSumOfMaxAverageSalesDay);
    }

}

