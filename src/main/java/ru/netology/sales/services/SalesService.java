package ru.netology.sales.services;

public class SalesService {
    public long getSumOfSales(long[] sales) {
        int sum = 0;
        for (long num : sales) {
            sum += num;
        }
        return sum;
    }

    public long getAverageOfAllSales(long[] sales) {
        long sum = getSumOfSales(sales);
        long averageSum = sum / sales.length;
        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long getSumOfMinAverageSalesDay(long[] sales) {
        int count = 0;
        long averageSum = getAverageOfAllSales(sales);
        for (long sale : sales) {
            if (sale < averageSum) {
                count++;
            }
        }
        return count;
    }

    public long getSumOfMaxAverageSalesDay(long[] sales) {
        int count = 0;
        long averageSum = getAverageOfAllSales(sales);
        for (long sale : sales) {
            if (sale > averageSum) {
                count++;
            }
        }
        return count;
    }
}







