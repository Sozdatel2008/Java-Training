package task22;

public class Library {
    private Shelf[] shelves;

    public Library(Shelf[] shelves) {
        this.shelves = shelves;
    }

    public Shelf[] getShelves() {
        return shelves;
    }

    public int countAuthor(String serchedAuthor){
        int counter = 0;
        for(Shelf shelf : shelves){
            for(Book bookFind : shelf.getBooks()){
                if(bookFind.getAuthor() == serchedAuthor){
                    counter++;
                }
            }
        }

        return counter;
    }
}

