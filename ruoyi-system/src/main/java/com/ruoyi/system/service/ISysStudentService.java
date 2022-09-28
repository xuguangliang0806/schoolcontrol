package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.SysStudent;
import com.ruoyi.common.core.domain.entity.SysUser;


import java.util.List;

public interface ISysStudentService {
    public List<SysStudent> selectUserList(SysStudent sysStudent);
    /**
     * 新增学生信息
     *
     * @param  sysStudent 学生信息
     * @return 结果
     */
    public int insertStudent(SysStudent sysStudent);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    public  int  deleteStudent(Long[] ids);

    /**
     * 更新
     * @param sysStudent
     * @return
     */
    public  int updateStudent(SysStudent sysStudent);

    /**
     * 通过学生ID查询用户
     *
     * @param studentId 用户ID
     * @return 用户对象信息
     */
    public SysStudent selectStudentById(String studentId);

}
