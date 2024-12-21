package com.table.project.mapper;

import java.util.List;

import com.table.project.model.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

    void insertBoard(BoardDTO boardDTO);

    // 게시글 가져와
    List<BoardDTO> getBoard();
}
