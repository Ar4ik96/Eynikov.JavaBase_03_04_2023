package ua.hillel.eynicov.lesson12;

import java.time.LocalDate;
import java.time.Period;

public class FitnessTracker {
    private final String firstName;
    private final LocalDate dayOfBirth;
    private final String mail;
    private final String phone;


    public FitnessTracker(String firstName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String mail, String phone) {
        this.firstName = firstName;
        this.dayOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.mail = mail;
        this.phone = phone;
        this.age = calculateAge();

    }

    private String lastName;
    private double weight;
    private String bloodPressure;
    private int stepsPerDay;
    private final int age;

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    private int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dayOfBirth, currentDate).getYears();
    }

    public int getAge() {
        return age;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;

    }
    public void printAccountInfo() {
        System.out.println("Ім'я: " + firstName + " " + lastName);
        System.out.println("Дата народження: " + dayOfBirth);
        System.out.println("Емейл: " + mail);
        System.out.println("Телефон: " + phone);
        System.out.println("Вага: " + weight);
        System.out.println("Тиск: " + bloodPressure);
        System.out.println("Кількість пройдених за день кроків: " + stepsPerDay);
        System.out.println("Вік: " + age);
        System.out.println();

    }

}


