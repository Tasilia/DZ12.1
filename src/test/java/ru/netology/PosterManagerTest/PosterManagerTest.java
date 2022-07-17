package ru.netology.PosterManagerTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PosterManager.PosterManager;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();
    String Title1 = "Title1";
    String Title2 = "Title2";
    String Title3 = "Title3";
    String Title4 = "Title4";
    String Title5 = "Title5";
    String Title6 = "Title6";
    String Title7 = "Title7";
    String Title8 = "Title8";
    String Title9 = "Title9";
    String Title10 = "Title10";
    String Title11 = "Title11";

    @Test
    public void shouldAddTitle() {
        manager.add(Title1);
        manager.add(Title2);
        String[] expected = {Title1, Title2};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenLessThanDefaultLimit() {
        manager.add(Title1);
        manager.add(Title2);
        manager.add(Title3);
        manager.add(Title4);
        manager.add(Title5);
        manager.add(Title6);
        manager.add(Title7);
        manager.add(Title8);
        manager.add(Title9);
        String[] expected = {Title9, Title8, Title7, Title6, Title5, Title4, Title3, Title2, Title1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenEqualDefaultLimit() {
        manager.add(Title1);
        manager.add(Title2);
        manager.add(Title3);
        manager.add(Title4);
        manager.add(Title5);
        manager.add(Title6);
        manager.add(Title7);
        manager.add(Title8);
        manager.add(Title9);
        manager.add(Title10);
        String[] expected = {Title10, Title9, Title8, Title7, Title6, Title5, Title4, Title3, Title2, Title1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastWhenOverDefaultLimit() {
        manager.add(Title1);
        manager.add(Title2);
        manager.add(Title3);
        manager.add(Title4);
        manager.add(Title5);
        manager.add(Title6);
        manager.add(Title7);
        manager.add(Title8);
        manager.add(Title9);
        manager.add(Title10);
        manager.add(Title11);
        String[] expected = {Title11, Title10, Title9, Title8, Title7, Title6, Title5, Title4, Title3, Title2};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    PosterManager manager2 = new PosterManager(3);
    @Test
    public void shouldFindLastWhenLessThanLimit() {
        manager2.add(Title1);
        manager2.add(Title2);
        String[] expected = {Title2, Title1};
        String[] actual = manager2.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenEqualLimit() {
        manager2.add(Title1);
        manager2.add(Title2);
        manager2.add(Title3);
        String[] expected = {Title3, Title2, Title1};
        String[] actual = manager2.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastWhenOverLimit() {
        manager2.add(Title1);
        manager2.add(Title2);
        manager2.add(Title3);
        manager2.add(Title4);
        String[] expected = {Title4, Title3, Title2};
        String[] actual = manager2.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
