package com.baiyang.service;

import com.baiyang.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by baiyang on 2017/5/25.
 */
public class BookService {
    @Autowired
    private BookRepository bookRepository;

}
