package ormi0614;

public class Test0614 {

    public static void main(String[] args){
        try{
            int result = 10 / 0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

    System.out.println("정상적으로 종료되었습니다.");
  }
}
