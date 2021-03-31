package com.isu.vuesample01.mapper;

import com.isu.vuesample01.model.DeptVO;
import com.isu.vuesample01.model.UserVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {


    @Select("SELECT * FROM user")
    @Results({
            @Result(id=true, column="no", property="no"),
//            @Result(column="email", property="email"),
            @Result(column="name", property="name"),
//            @Result(column="zipCode", property="zipCode"),
//            @Result(column="address", property="address"),
//            @Result(column="deptCode", property="deptCode"),
//            @Result(column="mobile", property="mobile"),
            @Result(column="deptCode", property="deptInfo", many = @Many(select = "com.isu.vuesample01.mapper.DeptMapper.selectDeptList" ))
    })
    public List<UserVO> selectUserList();
}
