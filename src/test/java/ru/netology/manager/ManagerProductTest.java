package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.product.Book;
import ru.netology.product.Product;
import ru.netology.product.Smartphone;
import ru.netology.manager.ManagerProduct;
import ru.netology.repository.RepositoriyProduct;

import static org.junit.jupiter.api.Assertions.*;

class ManagerProductTest {
    private RepositoriyProduct repo = new RepositoriyProduct();
    private ManagerProduct manager = new ManagerProduct(repo);
    private Book book1 = new Book(1, "book1", 100, "autor1");
    private Book book2 = new Book(2, "book2", 150, "autor2");
    private Book book3 = new Book(3, "book24", 200, "autor3");
    private Smartphone smartphone1 = new Smartphone(3, "smartphone1", 1000, "man1");
    private Smartphone smartphone2 = new Smartphone(4, "smartphone2", 1000, "man2");

    @BeforeEach
    public void setUp() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
    }

    @Test
    public void add() {
        Product[] expected = {book1, book2, smartphone1, smartphone2};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBy() {
        manager.add(book3);
        Product[] expected = {book2, book3};
        Product[] actual = manager.searchBy("book2");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByEmrty() {
        Product[] expected = {};
        Product[] actual = manager.searchBy("smartphone3");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getRepos() {
        RepositoriyProduct expected = repo;
        RepositoriyProduct actual = manager.getRepository();
        assertEquals(expected, actual);
    }
}