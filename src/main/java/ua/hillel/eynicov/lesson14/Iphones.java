package ua.hillel.eynicov.lesson14;

public class Iphones implements Smartphones,Ios{
    @Override
    public void call() {
        System.out.println("Making a call from an iPhone");
    }

    @Override
    public void useFaceID() {
        System.out.println("Using Face ID on an iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Sending an SMS from an iPhone");

    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on an iPhone");
    }
}
