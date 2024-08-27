package org.javaacademy.homeworks.homework5.computer_spy;

import java.io.FileWriter;
import java.io.IOException;

public class ComputerSpy extends Computer {
    private final String PROJECT_PATH = "C:\\Users\\WPX99\\IdeaProjects\\First-project";
    private final String FILE_NAME = "comp.log";
    private final String PATH = PROJECT_PATH + "\\" + FILE_NAME;
    private Computer comp;

    public ComputerSpy(Computer comp) {
        this.comp = comp;
    }

    @Override
    public void enterUser(String user) {
        try (FileWriter fileWriter = new FileWriter(PATH, true);) {
            fileWriter.write("Пользователь {" + user + "} вошел\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        comp.enterUser(user);
    }

    @Override
    public void exitUser() {
        try (FileWriter fileWriter = new FileWriter(PATH, true);) {
            fileWriter.write("Пользователь {" + comp.user + "} вышел\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void sendMessage(String text) {
        try (FileWriter fileWriter = new FileWriter(PATH, true);) {
            fileWriter.write("Пользователь {" + comp.user + "} отправил сообщение {" + text + "}\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        comp.sendMessage(text);
    }
}
