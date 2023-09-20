package com.malikov;

import com.malikov.book.Book;

public class App 
{
    public static void main( String[] args )
    {
        Book myBook = new Book(87362487, "Nameasdasd", "Vladik", 2003);

        System.out.println(myBook.toString());
    }
}
