package com.table.project.service;

import com.table.project.mapper.BoardMapper;
import com.table.project.model.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardMapper bMapper;

    @Override
    public void saveBoard(BoardDTO boardDTO) {
        bMapper.insertBoard(boardDTO);
    }

    // 게시글 가져오는
    @Override
    public List<BoardDTO> getBoard() {
        return bMapper.getBoard();
    }
}
