package com.example.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.board.dto.BoardDTO;
import com.example.board.mappers.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    // 목록
    @Override
    public List<BoardDTO> getList(BoardDTO boardDTO) {
        return boardMapper.boardList(boardDTO);
    }


    
}
