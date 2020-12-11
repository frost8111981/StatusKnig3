package com.company;

public class Book {
    String name;
    BookStatus status;

    public Book(String name, BookStatus status) {
        this.name = name;
        this.status = status;
    }

    public void BookStatus(){
        if(this.status == BookStatus.FREE){
            System.out.print("Книга выдана, статус изменен на: ");
            System.out.print(this.status = BookStatus.USING);
        }else {
            System.out.println("Книга занята ");
        }
    }


}