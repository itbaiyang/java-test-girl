package com.baiyang.controller;

import com.baiyang.domain.Book;
import com.baiyang.domain.Result;
import com.baiyang.repository.BookRepository;
import com.baiyang.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by baiyang on 2017/5/25.
 */
@RestController
//@RequestMapping("/book")
public class BookController {

    private final static Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/books")
    public List<Book> bookList() {

        logger.info("girlList");

        return bookRepository.findAll();
    }

    @PostMapping(value = "/books")
    public Result<Book> bookAdd(@Valid Book book, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
//            return null;
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        book.setBookName(book.getBookName());
        book.setAuthor(book.getAuthor());
        book.setPublish(book.getPublish());
        book.setMoney(book.getMoney());
        book.setTime(book.getTime());
        return ResultUtil.success(bookRepository.save(book));
    }

}
