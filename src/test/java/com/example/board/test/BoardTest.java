package com.example.board.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.board.dto.BoardDTO;
import com.example.board.mappers.BoardMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardTest {
    
    @Autowired(required = false)
    private BoardMapper boardMapper;

    @Test
    public void listTest() {
        BoardDTO boardDTO = BoardDTO.builder().build();

        log.info(boardMapper.boardList(boardDTO));
    }

    @Test
    public void insertTest() {
        BoardDTO boardDTO = BoardDTO.builder()
        .title("title")
        .content("content")
        .writer("user123")
        .build();


        int count = boardMapper.boardInsert(boardDTO);

        Assertions.assertEquals(count, 1); // count 값이 1일 때에 실행

        log.info("성공");


    }
}
