//program that predicts next full moon
package com.company;
        import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {

        //Create a program that tells you when the next full moon is based on the current date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate today = LocalDate.now();
        LocalDate nextFullMoon;

        LocalDate nextMoonConstant = LocalDate.of(2019,2,19);
        String dateToday = today.format(dtf);

        System.out.print("Today's date is: " + dateToday + "\n");

        if (today.isBefore(nextMoonConstant)) {

            nextFullMoon = nextMoonConstant;
        } else {
            nextFullMoon = today.plusDays(29);
        }
        System.out.println("The next full moon will be " + nextFullMoon.format(dtf));
    }
}