package com.isu.vuesample01.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {
    private Integer no;
    private String email;
    private String name;
    private Integer zipCode;
    private String address;
    private String deptCode;
    private String mobile;
    private String createDate;
    private String updateDate;

    private DeptVO deptInfo;

}
