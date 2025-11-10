package ChallengeOfClassAndObj;

public class Book {

    //creating instance varible ..
    //also create a static variable .

    static  int totalBooks;

    String title;

    String Author;

    String isbn;

    boolean isBorrowed;


    // crating static block .
    static{
        totalBooks = 0;
        System.out.println("Here we are in static block  :");
    }

    //normal block ..
    //obj init..
    {
        totalBooks++;
    }


    //creating constructor..
    //parameterlized constructor.
    Book(String isbn, String title, String Author){
        this.isbn = isbn;
        this.title = title;
        this.Author = Author;
    }

    //  p - constructor ..
    Book(String isbn){
    this(isbn, "Unknown", "Unknown");
}



  // creating static method .

    static int getTotalNoOfBooks(){
       return  totalBooks;
    }


    // creating instance method ..
    //Borrow  method.
    void borrowBook(){
        if(isBorrowed){
            System.out.println(
                "Book is already Borrowed:"
            );
        }else{
            this.isBorrowed = true;
            System.out.println(
                "This Book is Not Borrowed : Enjoy This Book :" + this.title
            );
        } 
        
    }


     //method.

        void  returnBook(){
            if(isBorrowed){
                this.isBorrowed = false;
                System.out.println("Hope You Enjoyed this Book : Please Leave A Review :");
            }else{
                System.out.println("This Book is Already present in the Library");
            }
        }


        //main method ..
      public static void main(String[] args) {
       Book designOfThings = new Book("1", "Historical Part", "Author");



        Book myBook = new Book( "2" );

        System.out.println(
            Book.getTotalNoOfBooks()
        );

        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();

      }  
      

    
}
