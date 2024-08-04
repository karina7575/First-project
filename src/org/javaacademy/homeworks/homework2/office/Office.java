package org.javaacademy.homeworks.homework2.office;

public class Office {
    private Boss boss;
    private Secretary secretary;
    private Manager manager;
    private Security security;

    public Office(Boss boss, Secretary secretary, Manager manager, Security security) {
        this.boss = boss;
        this.secretary = secretary;
        this.manager = manager;
        this.security = security;
    }

    public void workDay () {
        boss.pushTheManager(manager);
        manager.panic();
        security.askForSalary(boss);
        secretary.keepCalm(boss, manager, security);
    }
}
