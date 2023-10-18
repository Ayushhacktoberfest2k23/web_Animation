import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CollegeWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollegeWebsiteApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the College Website!";
    }

    @GetMapping("/courses")
    public String courses() {
        return "List of available courses: Computer Science, Mathematics, Physics, History, and more.";
    }

    @GetMapping("/faculties")
    public String faculties() {
        return "Our experienced faculty members are dedicated to providing quality education to students.";
    }

    @GetMapping("/contact")
    public String contact() {
        return "For any inquiries, please contact us at college@example.com or call us at 123-456-7890.";
    }
}
