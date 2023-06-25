package com.example.board.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.example.board.dto.BoardDTO;

@Transactional
public interface BoardService {

    // 목록
    public List<BoardDTO> getList(BoardDTO boardDTO);
    
}
