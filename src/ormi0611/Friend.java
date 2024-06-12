package ormi0611;

public class Friend extends Person {
  int lifeScore = 100;

  public Friend(String name) {
    super(name);
  }

  public void drink(int howManyBottles) {
    if (howManyBottles > 3) {
      emotionalScore += howManyBottles * 10;
      lifeScore -= howManyBottles * 10;
      System.out.println(
          name + "의 기분이 " + (howManyBottles * 10) + "상승하여 [" + emotionalScore + "]이 되었습니다.");
      System.out.println(name + "의 수명이 [" + lifeScore + "]이 되었습니다.");
    } else {
      emotionalScore += howManyBottles * 10;
      System.out.println(
          name + "의 기분이 " + (howManyBottles * 10) + "상승하여 [" + emotionalScore + "]이 되었습니다.");
    }
  }
}
