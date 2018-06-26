package com.demo.service;

import com.demo.BaseJunitTest;
import com.demo.entity.User;
import com.demo.entity.Word;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Slf4j
public class ServiceTest extends BaseJunitTest {

    @Autowired
    private UserService userService;
    @Autowired
    private WordService wordService;

    @Test
    public void test0() {
        List<User> users = userService.findAll();
        users.forEach(System.out::println);
        log.info("======================");
        List<Word> words = wordService.findAll();
        words.forEach(System.out::println);
    }

    @Test
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void test1() {
        User user = new User(null, "test", "123456", new Timestamp(System.currentTimeMillis()));
        userService.insert(user);

        Word word = new Word(null, "hello");
        wordService.insert(word);
    }
}
