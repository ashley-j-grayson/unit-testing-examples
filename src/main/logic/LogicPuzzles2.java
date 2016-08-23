package logic;

import farm.Car;
import farm.Person;

import java.util.List;
import java.util.StringJoiner;

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

    public boolean stringIsInString(String fullText, String textToFind) {


        if (fullText.contains(textToFind)) {

            return true;
        } else {

            return false;
        }
    }

    public String stringTimes(String text, int numberOfTimes) {

        String output = "";

        for (int i = 0; i < numberOfTimes; i++) {

            output = text + output;
        }

        return output;

    }

    public double getAverageAge(List<Person> people) {

        int age = 0;
        int sum = 0;
        double average = 0;
        for (int i = 0; i < people.size(); i++) {
            Person somePerson = people.get(i);
            age = somePerson.getAge();  //replace 0 with the persons age
            sum += age;
        }

        average = sum / people.size();

        return average;
    }


}
