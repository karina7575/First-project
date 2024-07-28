package org.javaacademy.homeworks;

import java.math.BigDecimal;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        ex1();
        System.out.println("___________________________________________");
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
        System.out.println("___________________________________________");
        advanced();
    }

    public static void ex1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        double number1 = in.nextDouble();
        in.nextLine();
        System.out.println("Введите знак операции - \"+\", \"-\", \"*\", \"/\"");
        String sign = in.nextLine();
        System.out.println("Введите второе число");
        double number2 = in.nextDouble();

        if(sign.indexOf('+') == 0){
            System.out.println(number1 + number2);
        }
        if(sign.indexOf('-') == 0){
            System.out.println(number1 - number2);
        }
        if(sign.indexOf('*') == 0){
            System.out.println(number1 * number2);
        }
        if(sign.indexOf('/') == 0){
            System.out.println(number1 / number2);
        }
        else {
            System.out.println("Ошибка");
        }
    }

    public static void ex2() {
        String name = "     ПЕтРов Олег Иванович     ";
        String modifiedName = name.trim().toUpperCase();
        if(name.contains("ова ")){
            System.out.println("Уважаемая " + modifiedName);
        }
        else if(name.contains("ов ")){
            System.out.println("Уважаемый " + modifiedName);
        }
        else {
            System.out.println("Неизвестное лицо " + modifiedName);
        }
    }

    public static void ex3() {
        double fuel = 10;
        boolean isEngineWork = true;
        boolean hasErrors = false;
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (
                fuel >= 10
                        &&  (isWheelWork1 || isWheelWork2 || isWheelWork3 || isWheelWork4)
                        && !hasErrors
                        && isEngineWork
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        String simply = "this is simply. This is my favorite song.";
        String modifiedStr = simply.replaceAll("this is", "those are");
        int indexOfFirstO = modifiedStr.indexOf('o');
        int indexOfSecondO = modifiedStr.indexOf('o', (indexOfFirstO+1));
        System.out.println("Полученный индекс второго символа \"о\" : " + indexOfSecondO);
    }

    public static void advanced() {
        int madeSausage = 2000;                    //Колбасы 2000кг - это произведено и продано
        int madeHam = 8511;                        //Ветчины 8511кг - это произведено и продано
        int madePork = 6988;                       //Шейки 6988кг - это произведено и продано
        int primeCostSausage = primeCostSausageCount(madeSausage);  //себестоимость при производстве
        int primeCostHam = 275;
        int primeCostPork = primeCostPorkCount(madePork);
        int costOfSausage = 800;                                    //цена
        int costOfHam = 350;
        int costOfPork = 500;

        long sausageIncome = costOfSausage * madeSausage;           //доход от колбасы
        long hamIncome = costOfHam * madeHam;                       //доход от ветчины
        long porkIncome = costOfPork * madePork;                    //доход от шейки

        long sausageExpenditure = primeCostSausage * madeSausage; //расход от производства колбасы
        long hamExpenditure = primeCostHam * madeHam;             //расход от производства ветчины
        long parkExpenditure = primeCostPork * madePork;          //расход от производства шейки

        long allProfit = (sausageIncome + hamIncome + porkIncome)      //прибыль до вычета налогов
                - (sausageExpenditure + hamExpenditure + parkExpenditure + 1000000);
        BigDecimal allProfitNew = new BigDecimal(allProfit);
        BigDecimal tax = taxCount(allProfit);                            //налог
        BigDecimal profit = allProfitNew.subtract(tax);                  //прибыль после вычета налогов
        System.out.println(profit);
    }

    /** Расчет себестоимости при производстве колбасы */
    public static int primeCostSausageCount(int madeSausage){
        if(madeSausage < 1000){
            return 412;
        }
        else if(1000 < madeSausage && madeSausage < 2000){
            return 408;
        }
        else {
            return 404;
        }
    }
    /** Расчет себестоимости при производстве шейки */
    public static int primeCostPorkCount(int madePork){
        if(madePork < 500){
            return 311;
        }
        else {
            return 299;
        }
    }

    /** Расчет налоговой ставки */
    public static BigDecimal taxCount(long allProfit){
        System.out.println("allprofit " + allProfit);
        BigDecimal firstPartTax;
        BigDecimal secondPartTax;
        BigDecimal thirdPartTax;
        if(allProfit >=1000000) {
            allProfit -= 1000000;
            firstPartTax = BigDecimal.valueOf((1000000 * 0.08));
        }
        else {
            firstPartTax = BigDecimal.valueOf((allProfit * 0.08));
            allProfit = 0;
        }

        if(allProfit >= 1000000){
            allProfit -= 1000000;
            secondPartTax = BigDecimal.valueOf((1000000 * 0.10));
        }
        else {
            secondPartTax = BigDecimal.valueOf((allProfit * 0.10));
            allProfit = 0;
        }

        if (allProfit > 0){
            thirdPartTax = BigDecimal.valueOf((allProfit * 0.13));
        }
        else {
            thirdPartTax = BigDecimal.valueOf(0);
        }
        System.out.println(firstPartTax);
        System.out.println(secondPartTax);
        System.out.println(thirdPartTax);
        BigDecimal result = firstPartTax.add(secondPartTax).add(thirdPartTax);
        return result;
    }
}
