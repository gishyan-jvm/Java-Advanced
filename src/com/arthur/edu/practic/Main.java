package com.arthur.edu.practic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Integer[][] matrix = {
//                {5, 2},
//                {8, 1}
//        };

//        Integer[][] result = DataAnalyzer.sortMatrix(matrix);

//        float result = calculator(5, 6, '+');
//        System.out.println(result);
//
//        Rectangle rectangle = new Rectangle(3, 4);
//
//        System.out.println(rectangle.diagonal());
//        System.out.println(rectangle.perimeter());
//        System.out.println(rectangle.square());

//        temperatureConverter();
//        secondConverter();
//        calculatePrice();
    }


    public static void calculatePrice() {
        Scanner s = new Scanner(System.in);

        float TAX = 0.2f;

        System.out.println("Enter price");
        double price = s.nextDouble();
        System.out.println("Enter quantity");
        int quantity = s.nextInt();

        double total = price * quantity;
        double taxPrice = (TAX * total) + total;

        System.out.printf("Price: %.2f, \nQuantity: %d, \nTotal: %.2f, \nTax %.2f, \nPrice with tax: %.2f", price, quantity, total, TAX * total, taxPrice);

    }

    public static void secondConverter() {
        Scanner s = new Scanner(System.in);

        int seconds = s.nextInt();
        int day = seconds / 86400;
        seconds %= 86400;

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        System.out.printf("Days: %d, \n Hour: %d, \n Minutes: %d", day, hours, minutes);
    }

    public static void temperatureConverter() {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        float celsius = s.nextFloat();

        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Fahrenheit: %f \n Kelvin: %f", fahrenheit, kelvin);
    }

    public static float calculator(float a, float b, char operation) {

        float result = switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };

        return result;

    }

    public static void stringFormat() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter your city");
        String city = s.nextLine();
        System.out.println("Enter your age");
        int age = s.nextInt();

        if (name.isBlank() || city.isBlank())
            throw new RuntimeException("You don`t entered any value");
        else if (age < 0) {
            throw new RuntimeException("Age cannot be negative");
        }

        System.out.printf("Hello, %s! \n You are %d years old and \n You live in %s.", name, age, city);
    }
}
