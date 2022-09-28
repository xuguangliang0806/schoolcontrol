package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysStudent;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.service.ISysStudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("学生信息管理")
@RestController
@RequestMapping("/system/student")
public class SysStudentController extends BaseController {

    @Autowired
    private ISysStudentService iSysStudentService;


    @ApiOperation("获取用户列表")
    @PreAuthorize("@ss.hasPermi('system:student:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysStudent sysStudent)
    {
        startPage();
        List<SysStudent> list = iSysStudentService.selectUserList(sysStudent);
        return getDataTable(list);
    }



    /**
     * 新增学生信息
     */
    @PreAuthorize("@ss.hasPermi('system:student:add')")
    @Log(title = "学生信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysStudent sysStudent) {
        if(iSysStudentService.insertStudent(sysStudent)<=0){
            return AjaxResult.error();

        }

        return AjaxResult.success();
    }

    /**
     * 修改学生信息
     */
    @PreAuthorize("@ss.hasPermi('system:student:edit')")
    @Log(title = "学生信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody SysStudent sysStudent) {

        if(iSysStudentService.updateStudent(sysStudent)<=0){
            return AjaxResult.error();

        }

        return AjaxResult.success();
    }

    /**
     * 删除学生信息
     * @param studentsID
     * @return
     */
    @PreAuthorize("@ss.hasPermi('system:student:remove')")
    @Log(title = "学生管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{studentsID}")
    public AjaxResult remove(@PathVariable Long[] studentsID)
    {
        if(iSysStudentService.deleteStudent(studentsID)<=0){
            return AjaxResult.error();

        }

        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('system:student:query')")
    @GetMapping(value = { "/", "/{studentId}" })
    public AjaxResult getInfo(@PathVariable(value = "studentId", required = false) String studentId)
    {
       SysStudent sysStudent=iSysStudentService.selectStudentById(studentId);
        if (sysStudent!=null){

            AjaxResult.success(sysStudent);

        }
        return AjaxResult.error();

    }


}
