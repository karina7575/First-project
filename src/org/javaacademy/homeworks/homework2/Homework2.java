package org.javaacademy.homeworks.homework2;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex5();
    }

    public static void ex1() {
        String[] words = {"Это", "шашлык", "на", "шампуре"};
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = result.concat(words[i].concat("-"));
        }
        System.out.println(result.substring(0, result.length() - 1));
        System.out.println();
    }

    public static void ex2() {
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};

        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                if (j == i) {
                    leftUpToRightDownSum += arrayOfNumbers[i][j];
                } else if (j == (arrayOfNumbers.length - i - 1)) {
                    leftDownToRightUpSum += arrayOfNumbers[i][j];
                }
            }
        }
        System.out.println("Сумма чисел с левого верхнего угла к нижнему правому: " + leftUpToRightDownSum);
        System.out.println("С левого нижнего угла к верхнему правому: " + leftDownToRightUpSum);
    }

    public static void ex3() {
        Random random = new Random(1);
        int number, tries = 0;
        do {
            number = random.nextInt(1000);
            tries++;
        }
        while (number != 999);
        System.out.println("число " + number + " сгенерировалось за " + tries + " попыток");
    }

    public static void ex4() {
    }

    /**
     * Для продвинутых
     */
    public static void ex5() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num;
        for (int i = 0; i < numbers.length / 2; i++) {
            num = numbers[i];
            numbers[i] = numbers[numbers.length - (i + 1)];
            numbers[numbers.length - (i + 1)] = num;
        }
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
