import java.io.*;
        import java.util.*;

public class Calendar {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int yy = sc.nextInt();
        System.out.print("Enter month : ");
        int mm = sc.nextInt();
        int d = 1;
        int month = 1;
        int year = 1;
        int day = 1;

        // Storing the name of days
        String days[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        // Storing the name of months
        String months[]
                = { "JANUARY", "FEBRUARY", "MARCH","APRIL", "MAY",  "JUNE",
                "JULY", "AUGUST", "SEPTEMBER","OCTOBER", "NOVEMBER", "DECEMBER" };

        // Storing the number of days in each month
        int ar[] = { 31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31 };

        while (true) {
            if (d == 1 && month == mm && year == yy) {
                break;
            }
            if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0) {
                ar[1] = 29;
            }
            else {
                ar[1] = 28;
            }
            day++;d++;

            if (d > ar[month - 1]) {
                month++;
                d = 1;
            }
            if (month > 12) {
                month = 1;year++;
            }
            if (day == 7) {
                day = 0;
            }
        }
        int c = day;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            ar[1] = 29;
        }
        else {
            ar[1] = 28;
        }
        System.out.println("MONTH:" + months[mm - 1]);
        for (int k = 0; k < 7; k++) {
            System.out.print(" " + days[k]);
        }
        System.out.println();
        for (int j = 1; j <= (ar[mm - 1] + day); j++) {
            if (j > 6) {
                day = day % 6;
            }
        }
        int spaces = day;
        if (spaces < 0)
            spaces = 6;


        for (int i = 0; i < spaces; i++)
            System.out.print("   ");
        for (int i = 1; i <= ar[mm - 1]; i++) {
            System.out.printf(" %2d ", i);

            if (((i + spaces) % 7 == 0)
                    || (i == ar[mm - 1]))
                System.out.println();
        }
    }
}
