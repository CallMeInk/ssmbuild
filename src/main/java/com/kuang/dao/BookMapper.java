package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    int addBook(Books books);

    int deleteBookById(@Param("bookID") int id);

    int updateBook(Books books);

    Books queryBookById(@Param("bookID") int id);

    List<Books> queryAllBook();

}
