package wooyoung.blog.dao;

import wooyoung.blog.dto.User;

public interface UserDao {

    public User getUserUsingId(String id);
}
