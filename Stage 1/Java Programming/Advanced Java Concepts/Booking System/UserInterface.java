import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class UserInterface {
    private LocalDateTime checkInDateTime;
    private int durationHours;

    public UserInterface() {
        this.checkInDateTime = null;
        this.durationHours = 0;
    }

    public boolean getCheckInDateTime() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter check in date and time");
        String checkInInput = scanner.nextLine();
        
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        try {
            checkInDateTime = LocalDateTime.parse(checkInInput, inputFormatter);
        } catch (DateTimeParseException e) {
            System.out.println(checkInInput + " is an invalid check in date or time");
            return false;
        }
        return true;
    }

    public void getDurationHours() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of hours of stay");
        durationHours = scanner.nextInt();
    }

    public void calculateAndDisplayDates() {
        if (checkInDateTime == null) {
            System.out.println("Please enter check-in date and time first.");
            return;
        }

        LocalDateTime checkOutDateTime = checkInDateTime.plusHours(durationHours);

        DateTimeFormatter outputFormatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputFormatterTime = DateTimeFormatter.ofPattern("hh:mm a");

        String checkInDate = checkInDateTime.format(outputFormatterDate);
        String checkInTime = checkInDateTime.format(outputFormatterTime);
        String checkOutDate = checkOutDateTime.format(outputFormatterDate);
        String checkOutTime = checkOutDateTime.format(outputFormatterTime);

        System.out.println("Check in Date and Time is " + checkInDate + " " + checkInTime);
        System.out.println("Check out Date and Time is " + checkOutDate + " " + checkOutTime);
    }

    public void run() {
        if (getCheckInDateTime()) {
            getDurationHours();
            calculateAndDisplayDates();
        }
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.run();
    }
}
