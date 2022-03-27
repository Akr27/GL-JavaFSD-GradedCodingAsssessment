package com.gl.gradedAssessment;

public class AdminDepartment extends SuperDepartment {
    private String deptName="Admin Department";
    private String work="Complete your documents submission.";
    private String deadline="Complete by EOD.";


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
