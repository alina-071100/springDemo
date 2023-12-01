package am.example.horseEmulatorXml.spring;

import am.example.horseEmulatorXml.service.HorseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");

        HorseService horseService = context.getBean("horseService", HorseService.class);

        System.out.println(horseService);
    }

}
