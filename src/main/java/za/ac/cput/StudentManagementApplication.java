
package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StudentManagementApplication {
    @RequestMapping("/")
    public String home() {
        return "Student Management Application";
    }
    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }
}