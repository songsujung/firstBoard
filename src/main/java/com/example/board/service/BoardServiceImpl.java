package com.example.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.board.dto.BoardDTO;
import com.example.board.mappers.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper; // boardMapper 사용 선언

    // 목록
    @Override
    public List<BoardDTO> boardList() {

        List<BoardDTO> list = boardMapper.boardList();
        return list;
    }

    // 등록
    @Override
    public int regist(BoardDTO boardDTO) {

        return boardMapper.modify(boardDTO);
    }

    // 조회
    @Override
    public BoardDTO read(Long tno) {

        return boardMapper.read(tno);
    }

    // 삭제
    @Override
    public int delete(Long tno) {

        return boardMapper.delete(tno);
    }

    // 수정
    @Override
    public int modify(BoardDTO boardDTO) {

        return boardMapper.modify(boardDTO);
    }
    
}
