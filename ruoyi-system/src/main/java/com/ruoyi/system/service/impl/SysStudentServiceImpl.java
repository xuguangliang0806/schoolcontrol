package com.ruoyi.system.service.impl;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.core.domain.entity.SysStudent;
import com.ruoyi.system.mapper.SysStudentMapper;
import com.ruoyi.system.service.ISysStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SysStudentServiceImpl implements ISysStudentService {

    @Autowired
    private SysStudentMapper studentMapper;

    @Override
    @DataScope(deptAlias = "d", userAlias = "u")
    public List<SysStudent> selectUserList(SysStudent sysStudent) {
        return studentMapper.selectStuList(sysStudent);
    }

    @Override
    public int insertStudent(SysStudent sysStudent) {
        return studentMapper.insertStudent(sysStudent);
    }

    @Override
    public int deleteStudent(Long[] ids) {
        return studentMapper.deleteStudent(ids);
    }

    @Override
    public int updateStudent(SysStudent sysStudent) {
        int row=studentMapper.updateStudent(sysStudent);
        return row;
    }

    @Override
    public SysStudent selectStudentById(String studentId) {
        return studentMapper.selectStudentById(studentId);
    }
}
