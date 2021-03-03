package wooyoung.blog.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import wooyoung.blog.dto.HomeDto;

import java.util.HashMap;
import java.util.List;

@Repository
public class HomeDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<HomeDto> sel(){
        return sqlSessionTemplate.selectList("member.sel");
    }

    public void ins(String name, String phone){
        HashMap<String, String> map = new HashMap();
        map.put("name", name);
        map.put("phone", phone);
        sqlSessionTemplate.update("member.ins", map);
    }
}
