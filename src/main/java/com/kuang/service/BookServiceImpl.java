package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;

import javax.annotation.Resource;
import java.util.List;

public class BookServiceImpl implements BookService {

    //service 调用dao层
    @Resource
    private BookMapper bookMapper;

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
