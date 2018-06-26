package com.demo.service.impl;

import com.demo.entity.User;
import com.demo.entity.Word;
import com.demo.service.TestService;
import com.demo.service.UserService;
import com.demo.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserService userService;

    @Autowired
    private WordService wordService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int insert(User user, Word word) {
        int insert = userService.insert(user);
//        int a = 10/0;
        int insert1 = wordService.insert(word);
        return insert + insert1;
    }
}
