package ormi0614;

public class DailyQuiz {


    public static void main(String[] args){


        try{
            int sum = sumNum(5, 10);
            System.out.println(sum);
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }


    }
    public static int sumNum(int a, int b) throws CustomException {
        if(b == 10){
            throw new CustomException("CustomException : b is 10");
        }
        int sum = a + b;
        return sum;
    }
}
