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

    // 목록
    @Test
    public void listTest() {
        BoardDTO boardDTO = BoardDTO.builder().build();

        log.info(boardMapper.boardList(boardDTO));
    }

    // 등록
    @Test
    public void registTest() {
        BoardDTO boardDTO = BoardDTO.builder()
        .title("송수정")
        .content("content")
        .writer("user123")
        .build();

        int count = boardMapper.regist(boardDTO);

        Assertions.assertEquals(count, 1); // count 값이 1일 때에 실행

        log.info("========================");
        log.info("성공");
    }

    // 조회
    @Test
    public void readTest(){

        BoardDTO boardDTO = boardMapper.read(1);

        log.info("========================");
        log.info(boardDTO);
    }

    // 삭제
    @Test
    public void deletetTest(){
        
        int result = boardMapper.delete(4091);

        if (result == 0) {
			log.info("실패");
		}else{
			log.info("성공");
		}
    }

    // 수정
    @Test
    public void modifyTest(){

        BoardDTO boardDTO = BoardDTO.builder()
        .tno(4090L)
        .title("수정")
        .content("수정했습니다.")
        .build();

        boardMapper.modify(boardDTO);

        log.info("========================");
        log.info(boardDTO);
    }


}
