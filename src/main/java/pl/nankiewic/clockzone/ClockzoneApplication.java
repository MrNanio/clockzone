package pl.nankiewic.clockzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@SpringBootApplication
public class ClockzoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClockzoneApplication.class, args);
    }

    @GetMapping
    public String showClock(Model model){
        ZoneId zoneIdNY=ZoneId.of("America/New_York");
        ZoneId zoneIdWarsaw=ZoneId.of("Europe/Warsaw");
        ZoneId zoneIdSydney=ZoneId.of("Australia/Sydney");
        ZonedDateTime dateNY = ZonedDateTime.now(zoneIdNY);
        ZonedDateTime dateWarsaw = ZonedDateTime.now(zoneIdWarsaw);
        ZonedDateTime dateSydney = ZonedDateTime.now(zoneIdSydney);
        model.addAttribute("ny", dateNY.format(DateTimeFormatter.ofPattern("dd-MM HH:mm")));
        model.addAttribute("warsaw", dateWarsaw.format(DateTimeFormatter.ofPattern("dd-MM HH:mm")));
        model.addAttribute("sydney", dateSydney.format(DateTimeFormatter.ofPattern("dd-MM HH:mm")));
        return "clock";
    }
}
