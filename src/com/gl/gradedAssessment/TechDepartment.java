package com.gl.gradedAssessment;

public class TechDepartment extends SuperDepartment{
    private String deptName="Tech Department";
    private String work="Complete coding of module 1.";
    private String deadline="Complete by EOD.";
    private String stackInfo="core JAVA";


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getTechStackInformation() {
        return stackInfo;
    }

    public void setTechStackInformation(String stackInfo) {
        this.stackInfo= stackInfo;
    }

    public String departmentName(){
        return deptName;
    }

    public String getTodaysWork(){
        return work;
    }

    public String getWorkDeadline(){
        return deadline;
    }

}
