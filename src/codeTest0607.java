public class codeTest0607 {

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


        public static void main(String[] args) {
            System.out.println("======= 문제1 =======");
            System.out.println(getMiddleThree("mangosteen"));
            System.out.println(getMiddleThree("mango"));
            System.out.println(getMiddleThree("go"));
            System.out.println("======= 문제2 =======");
            System.out.println(barkingDogProblem(true, 4));
            System.out.println(barkingDogProblem(false, 3));
            System.out.println(barkingDogProblem(true, 7));
            System.out.println(barkingDogProblem(true, 20));

            System.out.println("======= 문제3 =======");
            String str = "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on.";
            printCategory(str);

            System.out.println("======= 문제4 =======");
//        printToChar("Hello world NotNull String str");


            System.out.println(search(new int[]{1, 2, 3, 4, 5}, 5));
            System.out.println(search(new int[]{1, 2, 3, 4, 5}, 6));


            printHello(0);
        }

//    substring 이용

        public static String getMiddleThree(String str) {
            return str.length() < 3 ? str : str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        }


        public static String barkingDogProblem(boolean isBark, int hour) {
            if (hour >= 7 && hour <= 20) return "든든하군";
            return isBark ? "짖으면 안돼!!" : "든든하군";
        }

        public static void printCategory(String str) {
            int index = str.indexOf("category:");
            int findStr;
            int findFin;

            while (index > 0) {
                findStr = str.indexOf(" ", index) + 1;
                findFin = str.indexOf(",", index);
                index = str.indexOf("category:", index + 1);
                System.out.println(str.substring(findStr, findFin));
            }
        }

        public static void printToChar(String str) {
            char[] arr = str.toCharArray();

            for (char i : arr) {
                System.out.println(i);
            }

            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }

        public static int search(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;

        }

        public static void printHello(int num){
            num++;
            if(num < 5){
                System.out.println("hello");
                printHello(num);
            }
        }

//    -----------------------------------------------------

//    public static void main(String[] args) {
//
//        System.out.println(MyClass.staticNum);
//        MyClass.staticMethod();
//    }
//
//    public class MyClass{
//        public static int staticNum = 0;
//
//        public static void staticMethod(){
//            System.out.println("staticMethod");
//        }
//    }

//    static => 클래스 레벨의 필드와 메서드를 정의할 때 사용하는 키워드 입니다.
//    클래스 레벨 => 인스턴스에 속하는게 X
//    그래서 객체 없이 바로 사용가능하다.
//    클래스 실행시 딱 한번만 실행된다.

//    인스턴스를 만드는 이유?
    /*
    스태틱을 사용하면 할수록 메모리 누수가 심해진다
    인스턴스로 만들면 가비지콜렉터를 통해 사용이 끝나거나 사용되지 않는 것들에 대한 메모리를 삭제해주는데
    스태틱으로 만들면 메모리를 계속적으로 할당하고 있게 된다.
     */
}

