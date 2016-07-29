package logic;

import farm.Person;

import java.util.List;

/**
 * Created by ashleygrayson on 29/07/2016.
 */
public class LogicPuzzles2 {

    public double getAverageOfNumbers(int[] numbers) {

        double sum = 0;
        double average = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }

        average = sum / numbers.length;
        return average;
    }

    public int sumDouble(int[] numbers) {

        int sum = 0;
        int sumDoubled = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }

        sumDoubled = sum * 2;
        return sumDoubled;
    }



}
