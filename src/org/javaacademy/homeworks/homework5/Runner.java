package org.javaacademy.homeworks.homework5;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        ex1();
    }

    private static void ex1() {
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        String filename = "donation.csv";
        BigDecimal russia = new BigDecimal("0");
        BigDecimal france = new BigDecimal("0");
        BigDecimal china = new BigDecimal("0");
        BigDecimal japan = new BigDecimal("0");
        BigDecimal turkey = new BigDecimal("0");
        String[] allInfo = new String[2];

        Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));
        scanner.nextLine();

        while (scanner.hasNext()) {
            allInfo = scanner.nextLine().split(";");
            try {
                checkIncorrectFormat(allInfo[1]);
            } catch (IncorrectDonationException e) {
                continue;
            }
            allInfo[1] = allInfo[1].replace(',', '.');

            BigDecimal donatSumForCountry = new BigDecimal(allInfo[1]);

            if (allInfo[0].equals(countries[0])) {
                russia = russia.add(donatSumForCountry);
            } else if (allInfo[0].equals(countries[1])) {
                france = france.add(donatSumForCountry);
            } else if (allInfo[0].equals(countries[2])) {
                china = china.add(donatSumForCountry);
            } else if (allInfo[0].equals(countries[3])) {
                japan = japan.add(donatSumForCountry);
            } else if (allInfo[0].equals(countries[4])) {
                turkey = turkey.add(donatSumForCountry);
            }
        }
        System.out.println("Список пожертвований по странам:");
        System.out.println("Россия " + russia);
        System.out.println("Франция " + france);
        System.out.println("Китай " + china);
        System.out.println("Япония " + japan);
        System.out.println("Турция " + turkey);

        scanner.close();
    }

    public static void checkIncorrectFormat(String info) throws IncorrectDonationException {
        Pattern pattern = Pattern.compile("^\\d*,\\d*$");
        if (!(pattern.matcher(info).find())) {
            throw new IncorrectDonationException();
        }
    }

    private static void ex2() {
        //класс Runner в пакете computer_spy
    }
}
