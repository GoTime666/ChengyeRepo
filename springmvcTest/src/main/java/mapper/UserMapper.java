package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import bean.User;

public interface UserMapper {
	@Select("select * from tb_user where username = #{username} and password = #{password}")
	User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

	@Insert("insert into tb_user (username,password) values (#{username},#{password})")
	Integer register(@Param("username") String username, @Param("password") String password);
}
