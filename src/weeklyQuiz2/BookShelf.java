package weeklyQuiz2;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {

  // -------- 필드 & 생성자 & Getter
  private List<Book<T>> books;

  public BookShelf() {
    this.books = new ArrayList<>();
  }

  public List<Book<T>> getBooks() {
    return books;
  }


  // -------- 인터페이스 메서드 구현
  @Override
  public void addBook(Book<T> book) {
    books.add(book);
  }

  @Override
  public void removeBook(Book<T> book) {
    if (books.contains(book)) {
      books.remove(book);
    }
  }

  @Override
  public List<Book<T>> searchByTitle(String title) {
    List<Book<T>> searchByTitleList = new ArrayList<>();
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).getTitle().toUpperCase().contains(title.toUpperCase())) {
        searchByTitleList.add(books.get(i));
      }
    }
    return searchByTitleList;
  }

  @Override
  public List<Book<T>> searchByAuthor(String author) {
    List<Book<T>> searchByAuthorList = new ArrayList<>();
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).getAuthor().toUpperCase().contains(author.toUpperCase())) {
        searchByAuthorList.add(books.get(i));
      }
    }
    return searchByAuthorList;
  }
}
