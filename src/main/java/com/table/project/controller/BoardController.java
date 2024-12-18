package com.table.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    // 홈페이지
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // 게시판 목록
    @GetMapping("/list")
    public String hello() {
        return "boardList";
    }

    // 게시글 작성
    @GetMapping("/write")
    public String writeBoard() {
        return "boardWrite";
    }
}
