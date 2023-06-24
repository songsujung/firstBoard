package com.example.board.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.dto.BoardDTO;

@Mapper
public interface BoardMapper {
    
    // 전체리스트
    List<BoardDTO> boardList(BoardDTO boardDTO);

    // insert list
    int boardInsert(BoardDTO boardDTO);

}
