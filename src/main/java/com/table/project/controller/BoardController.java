package com.table.project.controller;

import com.table.project.model.BoardDTO;
import com.table.project.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public String hello(Model model) {
        List<BoardDTO> boardList = bService.getBoard();
        model.addAttribute("boardList", boardList);

        return "boardList";
    }

    // 게시글 작성 페이지
    @GetMapping("/write")
    public String viewWriteBoard() {
        return "boardWrite";
    }

    @PostMapping("/write")
    @ResponseBody
    public ResponseEntity<String> writeBoard(@RequestBody BoardDTO boardDTO) {

        try{
        bService.saveBoard(boardDTO);
        return ResponseEntity.ok("게시글 저장 성공");
        } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("오류발생");
        }
    }

    // 수정 페이지 이동
    @GetMapping("/modify")
    public String viewModifyBoard() {

        return "boardModify";
    }

    // 게시물 상세 페이지 이동
    @GetMapping("/detail")
    public String viewDetailBoard(Model model, @RequestParam(value = "boardId", required = true) int boardId) {

        // 게시글 상세 데이터 가져옴
        BoardDTO boardDTO = bService.boardDetailData(boardId);

        model.addAttribute("board", boardDTO);

        return "boardDetail";
    }
}
