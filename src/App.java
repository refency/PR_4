import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
  public static void main(String[] args) throws Exception {
    String text = input_text("Type the text to check: ");

    Brackets brackets = new Brackets();
    Numbers numbers = new Numbers();

    System.out.println("Result of brackets interface: " + brackets.check(text));
    System.out.println("Result of numbers interface: " + numbers.check(text));
  }

  public static String input_text(String label) { // Input text from console
    try {
      System.out.print(Color("yellow") + label + Color("reset"));
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Call of system.in to read input from console by bufferedreader
      String text = reader.readLine(); // Write string with stream from buffer

      return text;
    } catch (IOException exception) {
      exception.printStackTrace();
      return exception.toString();
    }
  }

  public static String Color(String color) { // Function of symbols of ANSI to change color of text in console
    switch(color) {
      case("red"):
        return "\u001B[31m";
      case("green"):
        return "\u001B[32m";
      case("blue"):
        return "\u001B[34m";
      case("reset"):
        return "\u001B[0m";
      case("yellow"):
        return "\u001B[33m";
      case("purple"):
        return "\u001B[35m";
      default:
        return "";
    }
  }
}
