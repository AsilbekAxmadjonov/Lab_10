package lab_10.webProject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "User") String name) {
        return "Hello, " + name + "!";
    }
}

