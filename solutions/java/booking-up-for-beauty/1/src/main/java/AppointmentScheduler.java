import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(
            appointmentDateDescription,
            DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss")
        );
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
       return appointmentDate.isBefore(
           LocalDateTime.now()
       );
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18 ? true : false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String date = appointmentDate.format(
            DateTimeFormatter.ofPattern("EEEE, MMMM d, uuuu,")
        );
        String time = appointmentDate.format(
            DateTimeFormatter.ofPattern("h:mm a.")
        );

        return "You have an appointment on "+date+" at "+time;
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(
            LocalDate.now().getYear(),
            9,
            15
        );
    }
}
