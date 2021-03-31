package com.isu.vuesample01.mapper;

import com.isu.vuesample01.model.DeptVO;
import com.isu.vuesample01.model.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {


    @Select("SELECT * FROM dept where deptCode=#{deptCode}")
    @Results({
            @Result(id=true, column="deptCode", property="deptCode"),
            @Result( column="deptName", property="deptName")
    })
    public DeptVO selectDeptList(String deptCode);
}
