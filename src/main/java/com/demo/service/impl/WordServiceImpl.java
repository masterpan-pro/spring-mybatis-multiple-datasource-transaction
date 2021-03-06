package com.demo.service.impl;

import com.demo.dao.word.WordMapper;
import com.demo.entity.Word;
import com.demo.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordMapper wordMapper;

    @Override
    public List<Word> findAll() {
        return wordMapper.queryAll();
    }

    @Override
    public int insert(Word user) {
        return wordMapper.add(user);
    }
}
