package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;

import static java.math.BigDecimal.*;

public class NthSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(15));
    }
    public static String seriesSum(int n) {
        ArrayList<Double> arr = new ArrayList<>();
        ArrayList<Double> arr2 = new ArrayList<>();
        ArrayList<BigDecimal> arr3 = new ArrayList<>();

        for (double i = 1; i < n * 3; i = i + 3) {
            arr.add(i);
        }



        for (double i = 1; i <= n; i++) {
            arr2.add(1.0);
        }



        for (int i = 0; i < arr.size(); i++) {
            BigDecimal bd;
            arr3.add(new BigDecimal(( (double)arr2.get(i) / arr.get(i))).setScale(15, ROUND_CEILING));
        }
        System.out.println(arr3);

        BigDecimal sum = new BigDecimal(0.0);
        for (int i = 0; i < arr3.size(); i++) {
            sum = sum.add(arr3.get(i));
        }


        String result = String.format(Locale.ENGLISH, "%(.2f", sum);

        return result;

    }
}