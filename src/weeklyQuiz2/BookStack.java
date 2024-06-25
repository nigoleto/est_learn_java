package weeklyQuiz2;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
  //-------- 필드 & 생성자

  private Stack<Book<T>> books;

  public BookStack() {
    this.books = new Stack<>();
  }


  //-------- 메서드
  public void pushBook(Book<T> book) {
    books.push(book);
  }

  public Book<T> popBook() {
    if(books.isEmpty()){
      throw new EmptyStackException();
    }
    return books.pop();
  }

  public Book<T> peekBook() {
    if(books.isEmpty()){
      throw new EmptyStackException();
    }
    return books.peek();
  }

  public boolean isEmpty() {
    return books.isEmpty();
  }
}
