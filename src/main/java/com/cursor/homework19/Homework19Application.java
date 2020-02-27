package com.cursor.homework19;

import com.cursor.homework19.controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Homework19Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Homework19Application.class, args);
        program(run);
    }

    static void program(ConfigurableApplicationContext run) {
        Controller controller = run.getBean(Controller.class);
        controller.executeSequenceOfCrudOperation();
    }
}
