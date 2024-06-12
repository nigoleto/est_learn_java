package ormi0611;

public class Person {
  String name;
  int emotionalScore = 0;

  public Person(String name) {
    this.name = name;
  }

  public void game() {
    emotionalScore += 3;
    System.out.println(name +"의 기분이 [" + emotionalScore + "]이 되었습니다.");
  }

  public void myDrink(int howManyBottles){
    emotionalScore += howManyBottles * 10;
    System.out.println(name +"의 기분이 [" + emotionalScore + "]이 되었습니다.");
  }


  public void party(Friend... frds) {
    if (frds.length > 3) {
      int howManyBottles = frds.length * 2;
      System.out.println("===== 많이 마신다 =====");
      myDrink(howManyBottles);
      for (Friend frd : frds) {
        frd.drink(howManyBottles);
      }
    }
    else if (frds.length > 1) {
      System.out.println("===== 한잔만 하자 =====");
      for (Friend frd : frds) {
        frd.drink(1);
      }
    } else {
      System.out.println("===== 게임이나 하자 =====");
      game();
        for (Friend frd : frds) {
            frd.game();
        }
    }
  }
}
