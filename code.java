import java.util.Random;

public class RandomNationalHoliday {
    public static void main(String[] args) {
        Holiday[] holidays = {
            new Holiday("New Year's Day", "January 1", "Celebrates the beginning of the new year."),
            new Holiday("Independence Day", "July 4", "Commemorates the Declaration of Independence."),
            new Holiday("Thanksgiving", "Fourth Thursday in November", "A day for giving thanks for the harvest."),
            new Holiday("Christmas", "December 25", "Celebrates the birth of Jesus Christ."),
            new Holiday("Memorial Day", "Last Monday in May", "Honors those who died in military service.")
        };

        Random rand = new Random();
        Holiday randomHoliday = holidays[rand.nextInt(holidays.length)];
        System.out.println("Random National Holiday: " + randomHoliday.name);
        System.out.println("Date: " + randomHoliday.date);
        System.out.println("Description: " + randomHoliday.description);
    }

    static class Holiday {
        String name;
        String date;
        String description;

        Holiday(String name, String date, String description) {
            this.name = name;
            this.date = date;
            this.description = description;
        }
    }
}
