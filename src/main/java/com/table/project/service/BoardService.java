package com.table.project.service;

import com.table.project.model.BoardDTO;

public interface BoardService {

    // 게시글 저장
    void saveBoard(BoardDTO boardDTO);
}
