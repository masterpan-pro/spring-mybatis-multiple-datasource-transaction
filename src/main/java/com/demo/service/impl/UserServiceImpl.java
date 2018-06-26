package com.demo.service.impl;

import com.demo.dao.user.UserMapper;
import com.demo.dao.word.WordMapper;
import com.demo.entity.User;
import com.demo.entity.Word;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private WordMapper wordMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int insert(User user) {
        wordMapper.add(new Word(null, "test"));
        return userMapper.insert(user);
    }
}
