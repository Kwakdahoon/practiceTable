package com.table.project.service;

import com.table.project.model.BoardDTO;

import java.util.List;

public interface BoardService {

    // 게시글 저장
    void saveBoard(BoardDTO boardDTO);

    // 게시글 데이터 가져오기
    List<BoardDTO> getBoard();
}
