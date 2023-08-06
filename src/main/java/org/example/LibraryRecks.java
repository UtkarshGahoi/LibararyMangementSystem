package org.example;

public class LibraryRecks {
    public Book[][] libraryRecks = new Book[5][5];

    public void assignBookToFirstAvailableReck(Book book){
        for(int row=0;row< libraryRecks.length;row++){
            for(int column=0;column<libraryRecks[row].length;column++){
                if(libraryRecks[row][column]==null){
                    libraryRecks[row][column]=book;
                    break;
                }
            }
        }
    }
    public String withdrawbookBook(Book book) {
        for (int row = 0; row < libraryRecks.length; row++) {
            for (int column = 0; column < libraryRecks[row].length; column++) {
                        Book books=libraryRecks[row][column];
                        if(books.getName().equalsIgnoreCase(book.getName())){
                            return books.getId();

                }
            }
        }
        return null;
    }
    public boolean searchBookInLibrary(Book book){
        for (int row = 0; row < libraryRecks.length; row++) {
            for (int column = 0; column < libraryRecks[row].length; column++) {
                Book books=libraryRecks[row][column];
                if(books.getName().equalsIgnoreCase(book.getName()) && books.getId().equalsIgnoreCase(book.getId())){
                    return true;

                }
            }
        }
        return false;
    }
}
