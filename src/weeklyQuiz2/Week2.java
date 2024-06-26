package weeklyQuiz2;

import java.util.Scanner;

public class Week2 {
  public static void main(String[] args) {

    BookShelf<String> bookShelf = new BookShelf<>();
    BookStack<Integer> bookStack = new BookStack<>();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("===실행시킬 기능의 번호를 입력하세요===");
      System.out.println("0. 입력 종료하기");
      System.out.println("1. 도서 등록하기");
      System.out.println("2. 도서 조회하기 - BOOKSHELF타입");
      System.out.println("3. 도서 조회하기 - BOOKSTACK타입");
      int inputType = scanner.nextInt();

      if (inputType == 0) { // 0. 입력 종료
        System.out.println("===입력을 종료합니다.===");
        scanner.close();
        break;
      }

      switch (inputType) {
        case 1: // 1. 도서 등록
          System.out.println("===입력할 도서 정보의 타입을 선택하세요===");
          System.out.println("1. BOOKSHELF타입 도서 등록");
          System.out.println("2. BOOKSTACK타입 도서 등록");
          int bookType = scanner.nextInt();
          scanner.nextLine();

          System.out.println("===도서 제목을 입력하세요===");
          String bookTitle = scanner.nextLine();

          System.out.println("===도서 저자를 입력하세요===");
          String bookAuthor = scanner.nextLine();

          if (bookType == 1) { // A. BOOKSHELF타입 도서 등록
            System.out.println("===도서 식별자(문자열)를 입력하세요===");
            String bookShelfIdentifier = scanner.nextLine();

            Book<String> shelfBook = new Book<>(bookTitle, bookAuthor, bookShelfIdentifier);
            bookShelf.addBook(shelfBook);
          } else {             // B. BOOKSTACK타입 도서 등록
            System.out.println("===도서 식별자(정수)를 입력하세요===");
            Integer bookStackIdentifier = scanner.nextInt();

            Book<Integer> shelfBook = new Book<>(bookTitle, bookAuthor, bookStackIdentifier);
            bookStack.pushBook(shelfBook);
          }
          break;
        case 2: // 2. 도서 조회 BOOKSHELF타입
          System.out.println("===조회할 방법을 선택하세요===");
          System.out.println("1. 제목으로 검색");
          System.out.println("2. 저자로 검색");
          int searchNum = scanner.nextInt();
          scanner.nextLine();

          if (searchNum == 1) {
            System.out.println("===제목을 입력하세요===");
            String titleName = scanner.nextLine();
            searchByTitle(titleName, bookShelf);
            break;
          } else if (searchNum == 2) {
            System.out.println("===저자를 입력하세요===");
            String authorName = scanner.nextLine();
            searchByAuthor(authorName, bookShelf);
            break;
          } else {
            System.out.println("===잘못된 값을 입력하셨습니다.===");
            break;
          }
        case 3: // 3. 도서 조회 BOOKSTACK타입
          System.out.println("===조회할 방법을 선택하세요===");
          System.out.println("1. POP - 가장 최근에 등록된 도서 조회 및 삭제");
          System.out.println("2. PEEK - 가장 최근에 등록된 도서 조회");
          System.out.println("3. IsEmpty - 등록된 도서가 있는지 확인");
          int searchNum1 = scanner.nextInt();
          scanner.nextLine();

          if (searchNum1 == 1) {
            System.out.println();
            System.out.print("제목: [" + bookStack.popBook().getTitle());
            System.out.println("] 도서가 조회 및 삭제되었습니다.");
            break;
          }
          else if (searchNum1 == 2) {
            System.out.println();
            System.out.print("제목: [" + bookStack.peekBook().getTitle());
            System.out.println("] 도서가 조회되었습니다.");
            break;
          }
          else if (searchNum1 == 3) {
            System.out.println();
            if (bookStack.isEmpty()) {
              System.out.println(" [등록된 도서가 없습니다.]");
            } else System.out.println(" [등록된 도서가 있습니다.]");
            break;
          }
          else {
            System.out.println("===잘못된 값을 입력하셨습니다.===");
            break;
          }

        default:
          System.out.println("===잘못된 값을 입력하셨습니다.===");
      }
    }
  }

  // 저자로 도서 조회 메서드
  static void searchByAuthor(String authorName, BookShelf<String> bookShelf) {
    System.out.println();
    System.out.println("===== [" + authorName + "] 저자로 검색한 도서 목록 =====");
    for (int i = 0; i < bookShelf.searchByAuthor(authorName).size(); i++) {
      System.out.print(i + "| ");
      System.out.print("제목:" + bookShelf.searchByAuthor(authorName).get(i).getTitle());
      System.out.println(", 저자: " + bookShelf.searchByAuthor(authorName).get(i).getAuthor());
    }
    System.out.println();
  }

  static void searchByTitle(String titleName, BookShelf<String> bookShelf) {
    System.out.println();
    System.out.println("===== [" + titleName + "] 제목으로 검색한 도서 목록 =====");
    for (int i = 0; i < bookShelf.searchByTitle(titleName).size(); i++) {
      System.out.print(i + "| ");
      System.out.print("제목:" + bookShelf.searchByTitle(titleName).get(i).getTitle());
      System.out.println(", 저자: " + bookShelf.searchByTitle(titleName).get(i).getAuthor());
    }
    System.out.println();
  }
}
