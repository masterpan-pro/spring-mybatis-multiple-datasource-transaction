package com.demo.service;

import com.demo.entity.Word;

import java.util.List;

public interface WordService {

    List<Word> findAll();

    int insert(Word user);
}
