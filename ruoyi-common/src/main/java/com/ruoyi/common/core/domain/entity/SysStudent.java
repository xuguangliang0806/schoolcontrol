package com.ruoyi.common.core.domain.entity;

import com.ruoyi.common.annotation.Excel;

import java.util.Date;

public class SysStudent {
    private static final long serialVersionUID = 1L;

    /** 学号 */
    @Excel(name = "学号", cellType = Excel.ColumnType.NUMERIC, prompt = "学号")
    private Long studentId;

    /** 部门ID */
    @Excel(name = "学院编号", type = Excel.Type.IMPORT)
    private Long deptId;

    /** 用户账号 */
    @Excel(name = "姓名")
    private String userName;

    /** 用户昵称 */
    @Excel(name = "手机号")
    private String phonenumber;

    /** 用户邮箱 */
    @Excel(name = "性别", readConverterExp =" 0=男,1=女,2=未知")
    private String sex;
    /** 手机号码 */
    @Excel(name = "健康状态",readConverterExp = "0=健康,1=密接,2=确诊")
    private String healthStatus;

    /** 用户性别 */
    @Excel(name = "核算测试结果", readConverterExp = "0=阳性,1=阴性")
    private String testingResult;
    /** 外出 */
    @Excel(name = "最近外出时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss", type = Excel.Type.EXPORT)
    private Date outTime;
    /** 最后登录时间 */
    @Excel(name = "返校时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss", type = Excel.Type.EXPORT)
    private Date backTime;
    /** 用户邮箱 */
    @Excel(name = "14天途经地")
    private String journeyRecord;


    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getTestingResult() {
        return testingResult;
    }

    public void setTestingResult(String testingResult) {
        this.testingResult = testingResult;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Date getBackTime() {
        return backTime;
    }

    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    public String getJourneyRecord() {
        return journeyRecord;
    }

    public void setJourneyRecord(String journeyRecord) {
        this.journeyRecord = journeyRecord;
    }

    @Override
    public String toString() {
        return "SysStudent{" +
                "studentId=" + studentId +
                ", deptId=" + deptId +
                ", userName='" + userName + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", sex='" + sex + '\'' +
                ", healthStatus='" + healthStatus + '\'' +
                ", testingResult='" + testingResult + '\'' +
                ", outTime=" + outTime +
                ", backTime=" + backTime +
                ", journeyRecord='" + journeyRecord + '\'' +
                '}';
    }
}
