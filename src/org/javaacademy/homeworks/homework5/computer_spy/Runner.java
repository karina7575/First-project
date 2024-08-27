package org.javaacademy.homeworks.homework5.computer_spy;

public class Runner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerSpy computerSpy = new ComputerSpy(computer);
        computerSpy.enterUser("Константин");
        computerSpy.sendMessage("Hello");
        computerSpy.exitUser();
    }
}
