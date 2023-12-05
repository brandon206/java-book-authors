package com.bpark.database;

import com.bpark.database.domain.Author;
import com.bpark.database.domain.Book;

public final class TestDataUtil {
    private TestDataUtil() {

    }


    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Abby Rose")
                .age(80)
                .build();
    }

    public static Book createTestBook() {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }
}
