class Main { // ここにクラスを記述
  public static void main(String[] args) { // ここにメゾットを記述
    //
    System.out.println("Hello Java"); // ここに処理を記述

    System.out.println(3); // 数値
    System.out.println(1 + 2); // 結果：3
    System.out.println(5 - 2); // 結果：3

    System.out.println(5 * 2); // 結果：10
    System.out.println(6 / 2); // 結果：3
    System.out.println(8 % 5); // 結果：3

    //
    int a;
    a = 10;
    System.out.println(a); // 結果：10

    String b;
    b = "hello,world!"
    System.out.println(b); // 結果："hello,world!"

    //
    int hoge1 = 100;
    System.out.println(hoge1 + 200); // 結果：300

    int hoge2 = 10;
    System.out.println(hoge1 + hoge2); // 結果：110

    //
    String name1 = "Yamada";
    String name2 = "Taro";
    System.out.println(name1 + name2); // 結果：YamadaTaro

    //
    int number = 11;
    String text = "Ruby";
    System.out.println(number);
    System.out.println(text);

    number = 9;
    System.out.println(number); //結果：9

    text = "Java";
    System.out.println(text); //結果：Java


    //
    int number = 10;

    number += 40;
    number -= 40;
    number *= 40;
    number /= 40;
    number %= 40;

    number++; //変数に「1」を足す、もしくは「1」を引く場合はさらに省略できる
    number--;

    //
    double number1 = 10.0;
    double number2 = 3.3;

    System.out.println(number1 + number2); // 結果：13.3
    System.out.println(number1 - number2); // 結果：6.7

    //
    System.out.println(5 / 2.0); // 結果：2.5

    System.out.println(5 / 2); // 結果：2
    System.out.println(5.0 / 2.0); // 結果：2.5


    //
    int x = 13;
    int y = 4;
    System.out.println(x / y); // 結果：3（3.25ではない）

    System.out.println((double)x / y); // 結果：3.25
  }
}


```java:Main.java
class Main {
  public static void main(String[] args) {

    

  }
}
```