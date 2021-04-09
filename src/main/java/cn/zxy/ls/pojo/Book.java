package cn.zxy.ls.pojo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
public class Book {
    private int id;
    private   String name;
    private  double price;
    private LocalDate pubdate;
    private LocalDateTime online;
    private boolean isok ;
    private String info;

}
