package ua.hillel.eynicov.lesson14;

public class Main {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        Iphones iphone = new Iphones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.runLinuxCommands();

        iphone.call();
        iphone.sms();
        iphone.internet();
        iphone.useFaceID();
    }
}
