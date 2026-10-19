public class Date {

    private int day;
    private int month;
    private int year;

    // Set Date
    public void setDay(int dd, int mm, int yy) {

        year = yy;

        if (mm < 1 || mm > 12)
            month = 1;
        else
            month = mm;

        if (month == 1 || month == 3 || month == 5 ||
            month == 7 || month == 8 || month == 10 ||
            month == 12) {

            if (dd < 1 || dd > 31)
                day = 1;
            else
                day = dd;
        }

        else if (month == 4 || month == 6 ||
                 month == 9 || month == 11) {

            if (dd < 1 || dd > 30)
                day = 1;
            else
                day = dd;
        }

        else {

            // February
            if (isLeapYear()) {

                if (dd < 1 || dd > 29)
                    day = 1;
                else
                    day = dd;
            }

            else {

                if (dd < 1 || dd > 28)
                    day = 1;
                else
                    day = dd;
            }
        }
    }


    // Check leap year
    private boolean isLeapYear() {

        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }


    // Get number of days in current month
    private int getDaysInMonth() {

        if (month == 1 || month == 3 || month == 5 ||
            month == 7 || month == 8 || month == 10 ||
            month == 12) {

            return 31;
        }

        else if (month == 4 || month == 6 ||
                 month == 9 || month == 11) {

            return 30;
        }

        else {

            if (isLeapYear())
                return 29;
            else
                return 28;
        }
    }


    // Add Days
    public void addDays(int addedDays) {

        while (addedDays > 0) {

            int daysInMonth = getDaysInMonth();

            int remainingDays = daysInMonth - day;

            if (addedDays <= remainingDays) {

                day = day + addedDays;
                addedDays = 0;
            }

            else {

                addedDays = addedDays - (remainingDays + 1);

                day = 1;

                if (month == 12) {

                    month = 1;
                    year++;
                }

                else {

                    month++;
                }
            }
        }
    }


    // Add Months
    public void addMonths(int addedMonths) {

        int totalMonths = month + addedMonths - 1;

        year = year + totalMonths / 12;

        month = totalMonths % 12 + 1;

        // If current day doesn't exist in new month
        int daysInMonth = getDaysInMonth();

        if (day > daysInMonth)
            day = daysInMonth;
    }


    // Add Years
    public void addYear(int addedYear) {

        year = year + addedYear;

        // Handle 29 February when resulting year isn't leap
        if (month == 2 && day == 29 && !isLeapYear())
            day = 28;
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}