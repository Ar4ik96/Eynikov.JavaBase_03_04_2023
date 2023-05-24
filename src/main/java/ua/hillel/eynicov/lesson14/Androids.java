package ua.hillel.eynicov.lesson14;

public class Androids implements Smartphones,LinuxOS{
    @Override
    public void call() {
        System.out.println("Making a call from an Android phone");
    }

    @Override
    public void sms() {
        System.out.println("Sending an SMS from an Android phone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on an Android phone");
    }

    @Override
    public void runLinuxCommands() {
        System.out.println("Running Linux commands on an Android phone");
    }
}
