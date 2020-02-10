/**
 * A class that an object book is modelled from.
 * Each book has fields: author, title, pages, refNumber, borrowed, courseText
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
    private int borrowed;//has book been borrowed how many times?
    private boolean courseText;

    /**
     * 2.86 - by having a field that is a step removed and accessed through 
     * read only methods the field is immutable. 
     */
    public Book(String bookAuthor, String bookTitle, int bookPages,
                boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = isCourseText;
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
        System.out.print("Title: " +title
                            +" Author: " +author
                            +" Pages: " +pages
                            +" Borrowed: " +borrowed
    //excercise 2.89
                            +" Reference Number: ");                      
            if(refNumber.length() == 0)
            System.out.print("ZZZ");
            else{
            System.out.print(refNumber);
        }
        System.out.println();
    }
    //excercise 2.88
    /**
     * Mutator for refNumber. Will only set if 3 or more characters
     */
    public void setRefNumber(String ref)
    {
        //excercise 2.90
        if(ref.length()>2)
        refNumber = ref;
        else{
            System.out.println("ERROR: Reference Number must be 3 or more "
                                +"characters long");
            }
    }
    
    /**
     * Returns refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Borrows a book adding +1 each time book is borrowed
     */
    public void borrow()
    {
        borrowed ++;
    }
    
    /**
     * returns borrowed
     */
    public int getBorrowed()
    {
        return borrowed;   
    }   
    
    //excercise 2.92
    /**
     * returns courseText boolean
     */
    public boolean isCourseText()
    {
        return courseText;
    }
}    
