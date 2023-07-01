package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.dto.BoardDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@Log4j2
@RequestMapping("/board/")
@RequiredArgsConstructor
public class BoardController {

    // 목록
    @GetMapping("list")
    public void List(Model model){

        log.info("list.......");

        List<BoardDTO> list = boardService.boardList();

		model.addAttribute("board", list);
        
    }


    // 등록
    @GetMapping("regist")
    public void getRegistForm(){

        log.info("GET regist........");
    }

    // 등록 뿌려
    @PostMapping("regist")
    public String postRegist(BoardDTO boardDTO){

        boardService.regist(boardDTO);

        return "redirect:/board/list";
    }


    // 조회
    @GetMapping("read/{tno}")
    public String getRead(@PathVariable("tno") Long tno, Model model){

        log.info("GET read...........");

        BoardDTO dto = boardService.read(tno);

		model.addAttribute("read", dto);

        return "/board/read";
    }


    // 삭제
    @PostMapping("delete/{tno}")
    public String postDelete(@PathVariable("tno") Long tno){

        boardService.delete(tno);
        
        return "redirect:/board/list";
    }


    // 수정
    @GetMapping("modify/{tno}")
    public String getModify(@PathVariable("tno") Long tno, Model model){

        log.info("GET Modify..........");

        BoardDTO dto = boardService.read(tno);

		model.addAttribute("modify", dto);

        return "/board/modify";
    }

    @PostMapping("modify/{tno}")
    public String postModify(@PathVariable("tno") Long tno, BoardDTO boardDTO){

        boardService.modify(boardDTO);

        return "redirect:/board/read/{tno}";
    }
    


    
}
