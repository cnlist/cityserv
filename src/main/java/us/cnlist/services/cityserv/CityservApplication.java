package us.cnlist.services.cityserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"us.cnlist.services.cityserv"})
public class CityservApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityservApplication.class, args);
    }

}
