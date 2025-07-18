package org.example;

public class Nobel implements Book{
  public String readNobel(String nobelName){
    return "私が一番読んだ小説は" + nobelName + "です！";
  }

  @Override
  public String readBook(String bookName) {
    return bookName;
  }
}
