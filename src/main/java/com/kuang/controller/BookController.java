package com.kuang.controller;


import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调用service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;


    /**
     * 书籍查询 返回到书籍查询页面
     */
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> bookList = bookService.queryAllBook();
        model.addAttribute("list", bookList);
        return "allBook";
    }

}
