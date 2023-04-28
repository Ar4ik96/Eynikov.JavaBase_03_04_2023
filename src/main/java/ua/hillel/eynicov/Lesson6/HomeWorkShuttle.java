package ua.hillel.eynicov.Lesson6;

public class HomeWorkShuttle {
    public static void main(String[] args) {
        System.out.println("Lucky shuttle numbers:");
        int counter = 0;

        for (int i = 1; counter < 100; i++) {
          if ((String.valueOf(i).contains("4") || String.valueOf(i).contains("9"))){
              continue;
            }
            System.out.println("Shuttle number: " + i);
          counter++;
        }
        System.out.println("Counter shuttle = " + counter);
    }
}
