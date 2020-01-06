package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    int checkEmail(String email);

    String selectQuestion(String username);

    int checkAnswer(@Param("username") String username,@Param("question") String question,@Param("answer") String answer);

    User selectLogin(@Param("username") String username,@Param("password") String password);

    int updatePassword(@Param("username") String username,@Param("passwordNew") String passwordNew);

    int checkPassword(@Param("userId") Integer userId,@Param("passwordOld") String passwordOld);

    int checkEmailById(@Param("userId") Integer userId,@Param("email") String email);
}