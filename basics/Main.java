package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeades(1);
    clock();
  }

  public static String pluralize(String animal, int countNum) {
    if (countNum == 0 || countNum > 1) {
      return animal + "s";
    } else {
      return animal;
    }
  }

  public static void flipNHeades(int heads) {
    Random rand = new Random();
    int flips = 0;
    int headCount = 0;
    while (headCount != heads) {
      float r = rand.nextInt(10) + 1;
      r /= 10;
      flips++;
      if (r < 0.5) {
        continue;
      } else {
        headCount++;
      }
      System.out.println("It took " + flips + " flips to flip " + heads + " in a row");
    }
  }

  public static void clock() {
    String tempTime = "";
    long startTime = System.nanoTime();
    while (true) {
      LocalDateTime present = LocalDateTime.now();
      DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("HH:mm:ss");
      String formatDateTime = present.format(formattedTime);
      if (!formatDateTime.equals(tempTime)) {
        long endTime = System.nanoTime();
        float formatTime = (endTime - startTime);
        System.out.println(formatDateTime + " " + formatTime + " MHz");
        startTime = endTime;
      }
      tempTime = formatDateTime;
    }
  }
}
