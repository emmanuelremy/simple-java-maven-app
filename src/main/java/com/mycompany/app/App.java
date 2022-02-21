package com.mycompany.app;

import static java.lang.System.Logger.Level.INFO;

import java.lang.System.Logger;

import com.mycompany.lib.User;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        Greeter greeter = new Greeter();
        Logger logger =System.getLogger(App.class.getName());
        logger.log(INFO, greeter.sayHello());

        User me = new User("Manu", 53);
        System.out.println(me);
    }

    private final String getMessage() {
        return message;
    }

}
