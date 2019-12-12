package cn.figo.dao;

import cn.figo.domain.Member;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author Figo
 * @Date 2019/12/12 22:43
 */
@Repository
public interface IMemberDao {

    @Select("select * from member where id=#{id}")
    public Member findById(String id) throws Exception;
}
