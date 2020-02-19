package am.aca.homework2.armine;

import java.util.Scanner;

public class Problem6_2 {
    public static void main(String[] args) {
        System.out.println("Input seconds:");
        Scanner scanner = new Scanner(System.in);
        long seconds = scanner.nextLong();
        long days = seconds / 86000;
        seconds = seconds % 86000;
        long minutes = seconds / 60;
        long convertedSeconds = seconds % 60;
        long convertedMinutes = minutes % 60;
        long hours = minutes / 60;
        long convertedHours = hours % 24;
        String convertedSecondsStr;
        String convertedMinutesStr;
        String convertedHoursStr;

        if (convertedSeconds < 10) {
            convertedSecondsStr = "0" + convertedSeconds;
        } else {
            convertedSecondsStr = String.valueOf(convertedSeconds);
        }
        if (convertedMinutes < 10) {
            convertedMinutesStr = "0" + convertedMinutes;
        } else {
            convertedMinutesStr = String.valueOf(convertedMinutes);
        }
        if (convertedHours < 10) {
            convertedHoursStr = "0" + convertedHours;
        } else {
            convertedHoursStr = String.valueOf(convertedHours);
        }
        if (days > 0) {
            System.out.println(days + " days");
        }
        System.out.println(convertedHoursStr + ":" + convertedMinutesStr + ":" + convertedSecondsStr);
    }
}


