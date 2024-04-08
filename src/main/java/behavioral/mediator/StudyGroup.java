package main.java.behavioral.mediator;

import java.util.Date;

public class StudyGroup {
    public static void showMessage(User user, String message) {
        System.out.println("[" + (new Date()).toString() + "]" + "   [" + user.getName() + "]:" + message);
    }
}
