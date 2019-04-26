package com.it.competition.domain;

import java.util.Date;

public class Applyinfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.id
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.competition_id
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private Integer competitionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.competition_title
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private String competitionTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.competition_start_time
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private Date competitionStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.competition_end_time
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private Date competitionEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.student_id
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private Integer studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.student_name
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.student_num
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private String studentNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.student_college
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private String studentCollege;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.student_phone
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private String studentPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.team_name
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private String teamName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.team_leader
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private boolean teamLeader;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column applyinfo.state
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    private boolean state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.id
     *
     * @return the value of applyinfo.id
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.id
     *
     * @param id the value for applyinfo.id
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.competition_id
     *
     * @return the value of applyinfo.competition_id
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public Integer getCompetitionId() {
        return competitionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.competition_id
     *
     * @param competitionId the value for applyinfo.competition_id
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.competition_title
     *
     * @return the value of applyinfo.competition_title
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public String getCompetitionTitle() {
        return competitionTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.competition_title
     *
     * @param competitionTitle the value for applyinfo.competition_title
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setCompetitionTitle(String competitionTitle) {
        this.competitionTitle = competitionTitle == null ? null : competitionTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.competition_start_time
     *
     * @return the value of applyinfo.competition_start_time
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public Date getCompetitionStartTime() {
        return competitionStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.competition_start_time
     *
     * @param competitionStartTime the value for applyinfo.competition_start_time
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setCompetitionStartTime(Date competitionStartTime) {
        this.competitionStartTime = competitionStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.competition_end_time
     *
     * @return the value of applyinfo.competition_end_time
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public Date getCompetitionEndTime() {
        return competitionEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.competition_end_time
     *
     * @param competitionEndTime the value for applyinfo.competition_end_time
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setCompetitionEndTime(Date competitionEndTime) {
        this.competitionEndTime = competitionEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.student_id
     *
     * @return the value of applyinfo.student_id
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.student_id
     *
     * @param studentId the value for applyinfo.student_id
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.student_name
     *
     * @return the value of applyinfo.student_name
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.student_name
     *
     * @param studentName the value for applyinfo.student_name
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.student_num
     *
     * @return the value of applyinfo.student_num
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public String getStudentNum() {
        return studentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.student_num
     *
     * @param studentNum the value for applyinfo.student_num
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum == null ? null : studentNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.student_college
     *
     * @return the value of applyinfo.student_college
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public String getStudentCollege() {
        return studentCollege;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.student_college
     *
     * @param studentCollege the value for applyinfo.student_college
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setStudentCollege(String studentCollege) {
        this.studentCollege = studentCollege == null ? null : studentCollege.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.student_phone
     *
     * @return the value of applyinfo.student_phone
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public String getStudentPhone() {
        return studentPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.student_phone
     *
     * @param studentPhone the value for applyinfo.student_phone
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone == null ? null : studentPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.team_name
     *
     * @return the value of applyinfo.team_name
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.team_name
     *
     * @param teamName the value for applyinfo.team_name
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.team_leader
     *
     * @return the value of applyinfo.team_leader
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public boolean isTeamLeader() {
        return teamLeader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.team_leader
     *
     * @param teamLeader the value for applyinfo.team_leader
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setTeamLeader(boolean teamLeader) {
        this.teamLeader = teamLeader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column applyinfo.state
     *
     * @return the value of applyinfo.state
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public boolean isState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column applyinfo.state
     *
     * @param state the value for applyinfo.state
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table applyinfo
     *
     * @mbg.generated Fri Apr 26 18:38:50 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", competitionId=").append(competitionId);
        sb.append(", competitionTitle=").append(competitionTitle);
        sb.append(", competitionStartTime=").append(competitionStartTime);
        sb.append(", competitionEndTime=").append(competitionEndTime);
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", studentNum=").append(studentNum);
        sb.append(", studentCollege=").append(studentCollege);
        sb.append(", studentPhone=").append(studentPhone);
        sb.append(", teamName=").append(teamName);
        sb.append(", teamLeader=").append(teamLeader);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}