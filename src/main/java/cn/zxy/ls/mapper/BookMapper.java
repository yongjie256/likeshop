package cn.zxy.ls.mapper;

import cn.zxy.ls.pojo.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {
    @Select("select name from ls_book")
    public String ver();
}

