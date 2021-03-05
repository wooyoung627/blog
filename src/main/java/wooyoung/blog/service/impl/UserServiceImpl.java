package wooyoung.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import wooyoung.blog.dao.UserDao;
import wooyoung.blog.dto.User;
import wooyoung.blog.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public UserDetails loadUserByUsername(String inputUserId) {
        User userDetails;
        userDetails = userDao.getUserUsingId(inputUserId);
        return userDetails;
    }
}
