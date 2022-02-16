package ru.netology.product;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {
    private Product product = new Product();
    private Book book = new Book();
    private Smartphone smartphone = new Smartphone();

    @Test
    void getSetId() {
        product.setId(2);
        int expected = 2;
        int actual = product.getId();
        assertEquals(expected, actual);
    }

    @Test
    void getSetName() {
        product.setName("Book");
        String expected = "Book";
        String actual = product.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getSetPrice() {
        product.setPrice(100);
        int expected = 100;
        int actual = product.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getSetAutor() {
        book.setAutor("autor1");
        String expected = "autor1";
        String actual = book.getAutor();
        assertEquals(expected, actual);
    }

    @Test
    void getSetManufacturer() {
        smartphone.setManufacturer("man1");
        String expected = "man1";
        String actual = smartphone.getManufacturer();
        assertEquals(expected, actual);
    }
}