package ua.hillel.eynicov.lesson12;

public class Main {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("Jora", 1990,05,06,"Jora@Jora.com", "1234567");
        user1.setLastName("Joricov");
        user1.setWeight(90);
        user1.setBloodPressure("120/90");
        user1.setStepsPerDay(10000);

        FitnessTracker user2 = new FitnessTracker("Vartan", 1970,04,03,"Vartan@.com", "21324212");
        user2.setLastName("Vartanov");
        user2.setWeight(120);
        user2.setBloodPressure("120/110");
        user2.setStepsPerDay(1000);

        FitnessTracker user3 = new FitnessTracker("Miha", 2000,01,02,"Miha@.com", "89328992");
        user3.setLastName("Mestniy");
        user3.setWeight(70);
        user3.setBloodPressure("110/80");
        user3.setStepsPerDay(15000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setWeight(85);
        user1.setStepsPerDay(12000);
        user1.printAccountInfo();

        user2.setWeight(115);
        user2.setBloodPressure("130/100");
        user2.printAccountInfo();
    }
}
