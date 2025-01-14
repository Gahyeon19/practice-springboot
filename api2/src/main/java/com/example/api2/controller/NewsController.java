package com.example.api2.controller;

import com.example.api2.domain.News;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/news")
public class NewsController {

    @GetMapping
    public List<News> getNews() {
        List<News> newsList = new ArrayList<News>();
        News news = new News();
        news.setId(1);
        news.setTitle("New Title");
        newsList.add(news);

        return newsList;
    }

    @PostMapping
    public String addNews(@RequestBody News news) {
        log.info("Add news : {}", news);
        return "뉴스가 등록되었습니다.";
    }
}
