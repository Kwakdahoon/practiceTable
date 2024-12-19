package com.table.project.controller;

import com.table.project.model.BoardDTO;
import com.table.project.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService bService;

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

    // 게시글 작성 페이지
    @GetMapping("/write")
    public String viewWriteBoard() {
        return "boardWrite";
    }

    @PostMapping("/write")
    @ResponseBody
    public ResponseEntity<String> writeBoard(BoardDTO boardDTO) {

        try{
        bService.saveBoard(boardDTO);
        return ResponseEntity.ok("게시글 저장 성공");
        } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("오류발생");
        }
    }
}
