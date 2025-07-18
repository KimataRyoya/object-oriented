package org.example;

public class Comic implements Book{
  public String readComic(String comicName){
    return "私が一番読んだ漫画は" + comicName + "です！";
  }

  @Override
  public String readBook(String bookName) {
    return bookName;
  }
}
