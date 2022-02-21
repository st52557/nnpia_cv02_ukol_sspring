package cz.upce.fei.nnpia.cv02.nnpia_cv02_ukol_sspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class NnpiaCv02UkolSspringApplication {

    @Autowired
    LogInService logInService;

    @Autowired
    LogOutService logOutService;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cz.upce.fei.nnpia.cv02.nnpia_cv02_ukol_sspring");
        context.getBean(NnpiaCv02UkolSspringApplication.class).process();

    }

    private void process(){
        logInService.logIn("Lukas");
        logOutService.logOut("Lukas");
        logInService.logIn("Morty");
        logOutService.logOut("Morty");
    }
}
