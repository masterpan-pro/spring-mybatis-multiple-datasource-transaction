package com.demo.service;

import com.demo.BaseJunitTest;
import com.demo.entity.User;
import com.demo.entity.Word;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.List;

@Slf4j
public class ServiceTest extends BaseJunitTest {

    @Autowired
    private UserService userService;

    @Autowired
    private WordService wordService;

    @Autowired
    private TestService testService;

    @Test
    public void test0() {
        List<User> users = userService.findAll();
        users.forEach(System.out::println);

        List<Word> words = wordService.findAll();
        words.forEach(System.out::println);
    }

    @Test
    public void test1() {
        User user = new User(null, "hello", "123456", new Timestamp(System.currentTimeMillis()));
        userService.insert(user);
    }

    @Test
    public void test2() {
        Word word = new Word(null, "hello");
        wordService.insert(word);
    }

    @Test
    public void test3() {
        User user = new User(null, "hello", "123456", new Timestamp(System.currentTimeMillis()));
        Word word = new Word(null, "hello");
        testService.insert(user, word);
    }

}
