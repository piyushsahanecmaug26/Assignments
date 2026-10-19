public class Program {

    public static void main(String[] args) {

        Date objDate = new Date();

        int menu;

        do {

            System.out.println("\nEnter the operation from the menu:");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Compare Dates");
            System.out.println("7. Exit");

            menu = ConsoleInput.getInt();

            switch (menu) {

            case 1:
                System.out.println("Set Date");

                System.out.println("Enter the day");
                int day = ConsoleInput.getInt();

                System.out.println("Enter the month");
                int month = ConsoleInput.getInt();

                System.out.println("Enter the year");
                int year = ConsoleInput.getInt();

                objDate.setDay(day, month, year);
                break;

            case 2:
                System.out.println("Add Days");

                System.out.println("Enter number of days");
                int addDays = ConsoleInput.getInt();

                objDate.addDays(addDays);
                break;

            case 3:
                System.out.println("Add Months");

                System.out.println("Enter number of months");
                int addMonths = ConsoleInput.getInt();

                objDate.addMonths(addMonths);
                break;

            case 4:
                System.out.println("Add Years");

                System.out.println("Enter number of years");
                int addYears = ConsoleInput.getInt();

                objDate.addYear(addYears);
                break;

            case 5:
                System.out.println("Display");

                System.out.println(
                    objDate.getDay() + "/" +
                    objDate.getMonth() + "/" +
                    objDate.getYear()
                );
                break;

            case 6:
                System.out.println("Compare Dates (Not implemented)");
                break;

            case 7:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid menu choice");
            }

        } while (menu != 7);
    }
}