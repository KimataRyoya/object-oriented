package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args)  {
    Greeting greeting = new Greeting();
    Printer printer = new Printer();

    String message = greeting.sayHello("RYOYA KIMATA");
    printer.printMassage(message);

    Speaking speaking = new Greeting();
    speaking.say("テスト");
  }
}







