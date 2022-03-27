package com.gl.gradedAssessment;

public class HRDepartment extends SuperDepartment {
    private String deptName="HR Department";
    private String work="Fill today's worksheet and mark your attendance.";
    private String deadline="Complete by EOD.";
    private String activity="Team lunch.";


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

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
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

    public String doActivity(){
        return activity;
    }
}
