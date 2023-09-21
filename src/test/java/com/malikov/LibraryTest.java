package com.malikov;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.malikov.book.Book;
import com.malikov.library.Library;

public class LibraryTest {
    private Library library;
    private Book book;

    @BeforeEach
    public void setUp() {
        this.library = new Library();
        this.book = new Book(12345, "TestTitleInLibrary", "TestAuthorInLibrary", 1997); 
    }

    @Test
    void testAddBook() {
        library.addBook(book);
        assertNotNull(library.getBookByTitle("TestTitleInLibrary"));
    }

    @Test
    void testDeleBookByIsbn() {
        library.addBook(book);
        assertTrue(library.delBookByIsbn(12345));
        assertNull(library.getBookByTitle("TestTitleInLibrary"));
    }

    @Test
    void testFindBookByTitle() {
        library.addBook(book);
        assertEquals(book, library.getBookByTitle("TestTitleInLibrary"));
        assertNull(library.getBookByTitle("IncorrectBookTitle"));
    }

    @Test
    void testGettingBooksListNonEmpty() {
        library.addBook(book);

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(book);

        assertEquals(list, library.booksList());
    }

    @Test
    void testGettingBooksListEmpty() {
        assertNull(library.booksList());
    }

    @Test
    void testDelBookByIncorrectIsbn() {
        assertFalse(library.delBookByIsbn(243234324));
    }

    @Test
    void testEmptyLibrary() {
        assertFalse(library.delBookByIsbn(243234324));
        assertNull(library.getBookByTitle("TestTitleInLibrary"));
    }
}
