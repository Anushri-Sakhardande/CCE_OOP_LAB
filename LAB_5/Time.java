package LAB_5;

import java.util.Scanner;

public class Time {
    int hours;
    int minutes;
    int seconds;

    Time() {
        hours = minutes = seconds = 0;
    }

    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    void display() {
        String h = Integer.toString(hours);
        String m = Integer.toString(minutes);
        String s = Integer.toString(seconds);
        if (h.length() < 2) {
            h = '0' + h;
        }
        if (m.length() < 2) {
            m = '0' + m;
        }
        if (s.length() < 2) {
            s = '0' + s;
        }
        System.out.println(h + ":" + m + ":" + s);
    }

    void add(Time obj1, Time obj2) {
        int tot = (obj1.hours + obj2.hours) * 3600 + (obj1.minutes + obj2.minutes) * 60 + (obj1.seconds + obj2.seconds);
        hours = tot / 3600;
        minutes = (tot % 3600) / 60;
        seconds = tot % 60;
    }

    public static void main(String[] args) {
        int h, m, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time 1");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        Time obj1 = new Time(h, m, s);
        System.out.println("Enter time 2");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        Time obj2 = new Time(h, m, s);
        System.out.println("\nTime 1:");
        obj1.display();
        System.out.println("Time 2:");
        obj2.display();
        Time obj3 = new Time();
        obj3.add(obj1, obj2);
        System.out.println("Time 3:");
        obj3.display();
    }
}
