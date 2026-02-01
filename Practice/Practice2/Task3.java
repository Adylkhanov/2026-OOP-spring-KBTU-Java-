package Practice2;

public class Task3 {

    public static void main(String[] args) {

        Time t1 = new Time(23, 5, 6);
        Time t2 = new Time(4, 24, 33);

        System.out.println("Universal Time t1: " + t1.toUniversal());
        System.out.println("Standard Time t1: " + t1.toStandard());
        System.out.println("Universal Time t2: " + t2.toUniversal());
        System.out.println("Standard Time t2: " + t2.toStandard());

        System.out.println("Sum of t1 and t2: " + t1.add(t2));

    }

}

class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {

        if (hours >= 24 || minutes >= 60 || seconds >= 60 || hours < 0 || minutes < 0 || seconds < 0) {

            throw new IllegalArgumentException("Invalid time( mozhesh norm vremya napisat pzh)");

        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public void setTime(int hours, int minutes, int seconds) {
        
         if (hours >= 24 || minutes >= 60 || seconds >= 60 || hours < 0 || minutes < 0 || seconds < 0) {

            throw new IllegalArgumentException("Invalid time( mozhesh norm vremya napisat pzh)");

        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public String toUniversal() {

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }

    public String toStandard() {

        int standardHours = hours % 12;
        if (standardHours == 0) {
            standardHours = 12;
        }
        String period = (hours < 12) ? "AM" : "PM";

        return String.format("%02d:%02d:%02d %s", standardHours, minutes, seconds, period);

    }

    public String add(Time otherTime) {
        int totalSeconds = this.seconds + otherTime.seconds;
        int totalMinutes = this.minutes + otherTime.minutes + (totalSeconds / 60);
        int totalHours = this.hours + otherTime.hours + (totalMinutes / 60);

        int newHours = totalHours % 24;
        int newMinutes = (totalMinutes % 60);
        int newSeconds = totalSeconds % 60;

        return String.format("%02d:%02d:%02d", newHours, newMinutes, newSeconds);

    }

}
