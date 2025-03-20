package lab_10.webProject;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = "spring.profiles.active=test")
public class ProfileControllerTest {
    @Autowired
    private ProfileController profileController;

    @Test
    public void testProfileMessage() {
        assertThat(profileController.getMessage()).isEqualTo("Welcome to the Test Environment!");
    }
}
