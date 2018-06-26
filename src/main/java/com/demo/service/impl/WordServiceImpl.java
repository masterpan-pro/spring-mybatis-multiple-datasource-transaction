package com.demo.service.impl;

import com.demo.dao.WordMapper;
import com.demo.entity.Word;
import com.demo.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordMapper wordMapper;

    @Override
    public List<Word> findAll() {
        return wordMapper.findAll();
    }

    @Override
    @Transactional
    public int insert(Word word) {
        return wordMapper.insert(word);
    }
}
