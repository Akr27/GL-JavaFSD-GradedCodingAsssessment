package com.gl.gradedAssessment;

public class SuperDepartment {
    private String deptName="Super Department";
    private String work="No work as of now.";
    private String deadline="Nil.";
    private String holiday="Today is not a holiday.";


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

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
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

    public String isTodayAHoliday(){
        return holiday;
    }
}
