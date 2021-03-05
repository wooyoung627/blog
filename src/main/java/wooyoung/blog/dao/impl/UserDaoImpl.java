package wooyoung.blog.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;
import wooyoung.blog.dao.UserDao;
import wooyoung.blog.dto.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private final SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public UserDaoImpl(SqlSessionTemplate sqlSessionTemplate){
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public User getUserUsingId(String id){
        User user = sqlSessionTemplate.selectOne("user.getUserUsingId", id);
        List<String> grantedAuthorities = sqlSessionTemplate.selectList("auth.getAuthUsingId", id);
        user.setAuthorities(grantedAuthorities);
        System.out.println(user);
        return user;
    }
}
