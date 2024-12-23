package Quiz_2_Sec_J;


class Book {
    private String title;
    private String author;
    private double price;
    private int publicationYear;

   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Error: Price cannot be negative!");
        } else {
            this.price = price;
        }
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        
        if (publicationYear < 1900) {
            System.out.println("Error: The year is outside the range!");
        } else {
            this.publicationYear = publicationYear;
        }
    }
}

