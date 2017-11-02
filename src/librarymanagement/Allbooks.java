package librarymanagement;

public class Allbooks {
    private String bookName;
    private int bookId;
    private String writer;

public Allbooks(String bookName,int bookId,String writer){
    this. bookName =  bookName;
    this.bookId = bookId;
    this.writer = writer;
}  

public String getbookName(){
    return bookName; 
}

public int getbookId(){
    return bookId;
}    

public String getwriter(){
    return writer;
}  




}
