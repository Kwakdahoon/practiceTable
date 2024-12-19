package com.table.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
    public String boardId;
    public String title;
    public String content;
    public String dow;
    public String writer;
}
