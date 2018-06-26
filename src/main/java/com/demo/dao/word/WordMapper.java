package com.demo.dao.word;

import com.demo.entity.Word;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WordMapper {

    List<Word> queryAll();

    int add(Word word);
}
