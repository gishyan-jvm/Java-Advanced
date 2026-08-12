package com.arthur.edu.Lesson22;

public enum DayOfWeek implements Runnable{

    //this day are singletons

    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    final String weekDay;

    DayOfWeek(String day) {
        this.weekDay = day;
    }

    public String getWeekday() {
        return weekDay;
    }

    @Override
    public void run() {

    }
}