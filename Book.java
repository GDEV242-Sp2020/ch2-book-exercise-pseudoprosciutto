/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Matthew Sheehan
 * @version 02/09/2020
 */
class Book
{
    
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";

    /**
     * 2.86 - by having a field that is a step removed and accessed through 
     * read only methods the field is immutable. 
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }
    
    
    //excercise 2.83 accessor methods
    /**
     * get Author of book
     */
    public String getAuthor(){
        return author;
    }
    
    /**
    * get Title of book
    */
    public String getTitle(){
        return title;
    }
    
    //excercise 2.85
    /**
     * get number of Pages 
     */
    public int getPages(){
        return pages;
    }
    
    //excercise 2.84
    /**
     * Print Author to the terminal
     */
    public void printAuthor(){
        System.out.println("Author: " +author);
    }
    
    /**
     * Print Title to the terminal
     */
    public void printTitle(){
        System.out.println("Title: " +title);
    }
    
    //excercise 2.87
    /**
     * Prints the details of the book: title ,author, and pages.
     */
    public void printDetails(){
        System.out.println("Title: " +title
                            +" Author: " +author
                            +" Pages: " +pages);
    }
    
    //excercise 2.88
    /**
     * Mutator for refNumber 
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    /**
     * Returns refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
}
