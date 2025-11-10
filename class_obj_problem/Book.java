package class_obj_problem;

class Book {
    static int totalNoOfbooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

static{
    totalNoOfbooks = 0;

}
//object init,
{
    totalNoOfbooks++;
}

Book(String isbn, String title, String author){
    this.isbn = isbn;
    this.title = title;
    this.author = author;
   
   }

   Book(String isbn){
    this(isbn, "Unknown Title", "Unknown Author");
   }

   static int getTotalNoOfBooks(){
    return totalNoOfbooks;
   }

   void borrowBook(){
    if(isBorrowed){
        System.out.println("Books is already borrowed");
    }
    else{
          this.isBorrowed = true;
        System.out.println("Enjoy the book");
    }
  

   }

   void returnBook(){
    if(isBorrowed){
        this.isBorrowed = false;
        System.out.println("Hope you enjoy reading this book, please leave a review");

    }
    else{
        System.out.println("This book is already present in the library ");

    }
   }

   public static void main(String[] args) {
    Book designOfThings = new Book("1", "Design of things", "jhon smith");
    Book myBook = new Book("2");
    System.out.println(Book.getTotalNoOfBooks());
    designOfThings.borrowBook();
    myBook.borrowBook();
    designOfThings.returnBook();
    designOfThings.returnBook();

   }

}
