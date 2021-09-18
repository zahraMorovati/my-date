public class MyDate {

    public boolean isValidDate(int year, int month, int day) {

        if (year < 9999 && year >= 1) {
            if (month <= 12 && month >= 1) {
                if (day <= getMonthLastDay(month) && day >= 1)
                    return true;
            }
        }
        return false;
    }

    public int getMonthLastDay(int month) {

        for (MonthName name : MonthName.values()) {
            if (name.monthNumber == month) {
                return name.monthLastDay;
            }
        }
        return -1;
    }

    public MonthName getMonthName(int month) {

        for (MonthName name : MonthName.values()) {
            if (name.monthNumber == month) {
                return name;
            }
        }
        return null;
    }
}
