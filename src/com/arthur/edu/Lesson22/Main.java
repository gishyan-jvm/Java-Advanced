package com.arthur.edu.Lesson22;

public class Main {
    public static void main(String[] args) {
//        Singleton instance = Singleton.getInstance();
//        Singleton instance1 = Singleton.getInstance();
//
//        System.out.println(instance == instance1);
//
//        int sum = instance.sum(1, 2, 4);
//        System.out.println(sum);

        DayOfWeek monday = DayOfWeek.MONDAY; //enum object constant

        workDayPrinter(monday);

        System.out.println(DayOfWeek.SUNDAY.getWeekday());

        InterfaceImplementation interfaceImplementation = new InterfaceImplementation();

        System.out.println(InterfaceFeatures.SOME_STRING);

        //interface section

        interfaceImplementation.sayHelloFromInterface();

        InterfaceFeatures.interfaceStaticMethod();



    }

    public static void workDayPrinter(DayOfWeek day) {
        switch (day) {
            case MONDAY, FRIDAY, TUESDAY, WEDNESDAY, THURSDAY:
                System.out.println("Work");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("No-Work");
                break;
        }

    }
}
