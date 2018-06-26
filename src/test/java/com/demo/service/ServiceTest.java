package com.demo.service;

import com.demo.BaseJunitTest;
import com.demo.entity.User;
import com.demo.entity.Word;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.List;

public class ServiceTest extends BaseJunitTest {

    @Autowired
    private UserService userService;

    @Autowired
    private WordService wordService;

    @Test
    public void test0() {
        List<User> users = userService.findAll();
        users.forEach(System.out::println);
    }

    @Test
    public void test1() {
        User user = new User(null, "test", "123456", new Timestamp(System.currentTimeMillis()));
        int insertResult = userService.insert(user);
        System.out.println("Insert Result: " + insertResult);
    }

    @Test
    public void test3() {
        List<Word> words = wordService.findAll();
        words.forEach(System.out::println);
    }

    @Test
    public void test4() {
        Word word = new Word(null, "test");
        int insertResult = wordService.insert(word);
        System.out.println("Insert Result: " + insertResult);
    }
}
