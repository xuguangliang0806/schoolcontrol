package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.SysStudent;


import java.util.List;
public interface SysStudentMapper {
    /**
     * 根据条件查询学生列表
     * @param sysStudent
     * @return
     */
    public List<SysStudent> selectStuList(SysStudent sysStudent);


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
     *
     * @param sysStudent
     * @return
     */
    public  int updateStudent(SysStudent sysStudent);


    public  SysStudent selectStudentById(String studentId);
}
