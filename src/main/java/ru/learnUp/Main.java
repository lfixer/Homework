package ru.learnUp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.learnUp.beans.Calculator;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Calculator calculator = context.getBean(Calculator.class);
        System.out.println("9/3 = " + calculator.divide(9, 3));
        System.out.println("9*3 = " + calculator.multiply(9, 3));
        System.out.println("9-3 = " + calculator.subtract(9, 3));
        System.out.println("9 + 3 = " + calculator.sum(9, 3));
    }
}
