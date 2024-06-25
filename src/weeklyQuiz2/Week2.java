package weeklyQuiz2;

import java.util.Scanner;

public class Week2 {
  public static void main(String[] args) {

    BookShelf<String> bookShelf = new BookShelf<>();
    BookStack<Integer> bookStack = new BookStack<>();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("실행시킬 기능의 번호를 입력하세요");
      System.out.println("0. 입력 종료하기");
      System.out.println("1. 도서 등록하기");
      System.out.println("2. 도서 조회하기");
      int inputType = scanner.nextInt();

      switch (inputType) {
        case 0:
          break;
        case 1:
          System.out.println("입력할 도서 정보의 타입을 선택하세요");
          System.out.println("1. BOOKSHELF타입 도서 등록");
          System.out.println("2. BOOKSTACK타입 도서 등록");

          int bookType = scanner.nextInt();
          scanner.nextLine();

          System.out.println("도서 제목을 입력하세요");
          String bookTitle = scanner.nextLine();

          System.out.println("도서 저자를 입력하세요");
          String bookAuthor = scanner.nextLine();

          System.out.println("도서 식별자를 입력하세요");
          if (bookType == 1) {
            String bookShelfIdentifier = scanner.nextLine();
            Book<String> shelfBook = new Book<>(bookTitle, bookAuthor, bookShelfIdentifier);
            bookShelf.addBook(shelfBook);
          } else {
            Integer bookStackIdentifier = scanner.nextInt();
            Book<Integer> shelfBook = new Book<>(bookTitle, bookAuthor, bookStackIdentifier);
            bookStack.pushBook(shelfBook);
          }
        case 2:
          System.out.println("조회할 방법을 선택하세요");
          System.out.println("1. 제목으로 검색");
          System.out.println("2. 저자로 검색");
          int searchNum = scanner.nextInt();

          if(searchNum == 1){

          } else{
            System.out.println("저자를 입력하세요");
            String authorName = scanner.nextLine();
            searchByAuthor(authorName, bookShelf);
          }
        default:
          System.out.println("잘못된 값을 입력하셨습니다.");
      }
    }
  }


  // 저자로 도서 조회
  static void searchByAuthor(String authorName, BookShelf<String> bookShelf) {
    System.out.println();
    System.out.println("=====" + authorName + "저자로 검색한 도서 목록 =====");
    for (int i = 0; i < bookShelf.searchByAuthor(authorName).size(); i++) {
      System.out.print(i + "| ");
      System.out.print("제목:" + bookShelf.searchByAuthor(authorName).get(i).getTitle());
      System.out.println(", 저자: " + bookShelf.searchByAuthor(authorName).get(i).getAuthor());
    }
  }
}
