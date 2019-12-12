package cn.figo.dao;

import cn.figo.domain.Traveller;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Figo
 * @Date 2019/12/12 22:44
 */
@Repository
public interface ITravellerDao {

    // order_traveller 是订单表和游客表的 id 码表
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
