package com.example.board.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.example.board.dto.BoardDTO;

@Transactional
public interface BoardService {

    // 전체리스트
    public List<BoardDTO> boardList();

    // 등록
    public int regist(BoardDTO boardDTO);

    // 조회
    public BoardDTO read(Long tno);

    // 삭제
    public int delete(Long tno);

    // 수정
    public int modify(BoardDTO boardDTO);
    
}
