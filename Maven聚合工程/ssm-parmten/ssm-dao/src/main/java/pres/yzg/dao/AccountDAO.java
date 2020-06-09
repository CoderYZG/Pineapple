package pres.yzg.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pres.yzg.pojo.Account;

import java.util.List;

/**
 * @author 尹志刚
 * @date 2020/6/8 16:55
 */
public interface AccountDAO {
    @Select("select * from account")
    List<Account>  findAll();

    @Insert("insert into account(name,password) values(#{name},#{password}")
    void addAccount(Account account);
}
