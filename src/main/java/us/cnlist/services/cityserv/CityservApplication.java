package us.cnlist.services.cityserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"us.cnlist.services.cityserv"})
public class CityservApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CityservApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CityservApplication.class, args);
    }

}
