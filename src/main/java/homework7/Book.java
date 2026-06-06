/**@author Irakli Barbakadze*/
package homework7;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title){
        this(title, "Unknown", 0);
    }

    public Book(String title, String author){
        this(title, author, 0);
    }

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book("Java", "Bloch");
        Book b3 = new Book("Java", "Bloch", 2020);

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

    }



}
