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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
}
