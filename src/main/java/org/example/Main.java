package org.example;

public class Main {

  public static void main(String[] args)  {
    Comic comic = new Comic();
    Nobel nobel = new Nobel();
    Book book1 = new Comic();
    Book book2 = new Nobel();
    Jamp jamp = new Jamp();

    System.out.println(comic.readComic("家庭教師ヒットマンリボーン"));
    System.out.println(nobel.readNobel("透明カメレオン"));
    book1.readBook("テスト"); //　ComicクラスにBookインタフェースを実装できたことの確認　　
    book2.readBook("テスト"); //　NobelクラスにBookインターフェースを実装できたことの確認
    jamp.readComic("テスト"); //　JampクラスからComicクラスのメソッドを使うことで継承できていることを確認

    //　ただこれだと実装できていることは確認できるけど、実際にコードが意味を成しているわけではないので課題としては微妙か。
  }
}

//　課題内容
// GreetingとSpeakingは使わずにinterfaceと実装を組み合わせて作る
//　interfaceの実装を二つ以上作る
//　継承（extends）を使う。
// 作った二つの実装クラスのどちらかを継承してクラスを作ってメソッドを呼び出す。
//　メソッド呼び出しは親子のどちらとも呼び出してみてください。





