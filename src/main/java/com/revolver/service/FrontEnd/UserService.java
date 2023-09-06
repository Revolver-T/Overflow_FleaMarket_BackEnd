package com.revolver.service.FrontEnd;

import com.revolver.mapper.FrontEnd.UserMapper;
import com.revolver.pojo.Account;
import com.revolver.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public interface UserService {

    public Account toLogin(Account account);

    public User selectUserById(int id);

    public int updateUserById(User user);

    public int selectCountById(Integer id);

    public int deleteUserById(Integer id);

    public int restAccountById(Integer id);

    public int insertUserInfo(User user);

    public int insertUserToAccount(Account account);

    public int selectCartCountById(int id);

    public int selectCommentById(int id);

    public Account selectAccountById(int id);


}
