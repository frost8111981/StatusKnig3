package com.company;
public class Main {
    public static void main(String[] args) {
        Book windows = new Book("Windows", BookStatus.FREE);
        Book linux = new Book("Linux", BookStatus.FREE);

        while (true) {
            System.out.println(windows.name + " -" + " статус книги: " + windows.status);
            System.out.println(linux.name + " -" + " статус книги: " + linux.status);
            System.out.println();

            windows.BookStatus();

            break;
        }
        //System.out.println();
        //System.out.println();
    }

}

