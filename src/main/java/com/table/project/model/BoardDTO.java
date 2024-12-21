package com.table.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class BoardDTO {
    public int boardId;
    public String title;
    public String content;
    public Timestamp dow;
    public String writer;
}
