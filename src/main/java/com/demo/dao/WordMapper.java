package com.demo.dao;

import com.demo.entity.Word;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WordMapper {

     List<Word> findAll();

     int insert(Word word);
}
