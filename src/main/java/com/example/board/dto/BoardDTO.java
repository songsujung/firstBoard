package com.example.board.dto;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDTO {
    
    private Long tno;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private Date updateDate;
}
