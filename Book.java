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
    public String getAuthor(){
        return author;
    }
    
    
    public String getTitle(){
        return title;
    }
    
    
    
}
