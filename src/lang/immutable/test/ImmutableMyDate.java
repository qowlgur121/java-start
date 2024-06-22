package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    //불변 객체에서 값을 변경하는 경우 "with"로 시작하는 경우가 많다.
    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }


    public int getMonth() {
        return month;
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }


    public int getDay() {
        return day;
    }

    public ImmutableMyDate withDate(int newDate) {
        return new ImmutableMyDate(year, month, newDate);
    }


    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
