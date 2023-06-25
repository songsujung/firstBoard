package com.example.board.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.dto.BoardDTO;

@Mapper
public interface BoardMapper {
    
    // 전체리스트
    List<BoardDTO> boardList(BoardDTO boardDTO);

    // 등록
    int regist(BoardDTO boardDTO);

    // 조회
    BoardDTO read(int tno);

    // 삭제
    int delete(int tno);

    // 수정
    int modify(BoardDTO boardDTO);


}
