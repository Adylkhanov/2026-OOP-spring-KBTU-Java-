package labs.lab3.problem5;

//ukral s practice 2 so vtoroy nedeli btw
public class Time implements Comparable<Time> {

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

    @Override
    public int compareTo(Time other) {
        if (this.hours != other.hours) return this.hours - other.hours;
        if (this.minutes != other.minutes) return this.minutes - other.minutes;
        return this.seconds - other.seconds;
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

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

}
