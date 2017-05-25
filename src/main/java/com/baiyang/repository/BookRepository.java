package com.baiyang.repository;

import com.baiyang.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by baiyang on 2017/5/25.
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
    public List<Book> findByBookName(String bookName);
}
