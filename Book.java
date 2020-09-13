/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Bill Crosbie
 * @version Feb 4, 2019
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // Add the methods here ...
    /**
     * Provide access to the string holding the author's name
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Provide access to the string holding the book's title
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * prints author
     */
    public void printAuthor()
    {
        System.out.println("The Author of the book is: " + author);
    } 
    
    /**
     * prints title
     */
    public void printTitle()
    {
         System.out.println("The title of the book is: " + title);
    }  
    
    /**
     * gets number of pages
     */
    public int getPages()
    {
         return pages;
    } 
    
    /**
     * prints details
     */
    public void printDetails()
    {
        System.out.println("Author: " + author + "\n Title: " + title 
            + "\n  Pages: " + pages + "\n   Reference#: " + refNumber 
                + "\n    Times Borrowed: " + borrowed);
    }
    
    /**
     * sets a reference number on book
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    /**
     * adds a time borrowed
     */
    public void addBorrowed()
    {
        borrowed++;
    }
    
    /**
     * gets how many times borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
}
