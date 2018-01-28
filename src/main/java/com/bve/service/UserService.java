package com.bve.service;


import com.bve.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final SqlSession sqlSession;

    public UserService(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User getUserById(int id) {
        return this.sqlSession.selectOne("getUserById",id);
    }
    public List<User> getAll(){
        List<User> users = sqlSession.selectList("getAll");
        return users;
    }
}
