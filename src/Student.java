public class Student {
  int level;

  public Student() {
    this.level = 1;
  }

  public void levelUp() {
    level++;
    System.out.println("레벨이 1증가 했습니다.");
    System.out.println(String.format("현재 레벨은 %d입니다.", level));
  }

  public void levelDown() {
    if (level > 1) {
      level--;
      System.out.println("레벨이 1하락 했습니다.");
      System.out.println("현재 레벨은 " + level + " 입니다.");
    }
  }
}
