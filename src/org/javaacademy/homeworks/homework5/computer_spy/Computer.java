package org.javaacademy.homeworks.homework5.computer_spy;

public class Computer {

    protected String user;

    /**
     * вход пользователя
     */
    public void enterUser(String user) {
        this.user = user;
    }

    /**
     * выход пользователя
     */
    public void exitUser() {
        this.user = null;
    }

    /**
     * отправлять сообщение
     */
    public void sendMessage(String text) {
        System.out.println("сообщение: {" + text + "}");
    }


}
