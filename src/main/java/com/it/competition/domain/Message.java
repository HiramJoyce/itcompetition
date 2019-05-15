package com.it.competition.domain;

public class Message {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.id
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.competition_id
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private Integer competitionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.competition_title
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private String competitionTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.student_id
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private Integer studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.student_name
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.student_num
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private String studentNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.team_name
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private String teamName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.content
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.state
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private boolean state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.link_to
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private String linkTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.type
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    private Integer type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.id
     *
     * @return the value of message.id
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.id
     *
     * @param id the value for message.id
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.competition_id
     *
     * @return the value of message.competition_id
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public Integer getCompetitionId() {
        return competitionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.competition_id
     *
     * @param competitionId the value for message.competition_id
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.competition_title
     *
     * @return the value of message.competition_title
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public String getCompetitionTitle() {
        return competitionTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.competition_title
     *
     * @param competitionTitle the value for message.competition_title
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setCompetitionTitle(String competitionTitle) {
        this.competitionTitle = competitionTitle == null ? null : competitionTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.student_id
     *
     * @return the value of message.student_id
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.student_id
     *
     * @param studentId the value for message.student_id
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.student_name
     *
     * @return the value of message.student_name
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.student_name
     *
     * @param studentName the value for message.student_name
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.student_num
     *
     * @return the value of message.student_num
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public String getStudentNum() {
        return studentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.student_num
     *
     * @param studentNum the value for message.student_num
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum == null ? null : studentNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.team_name
     *
     * @return the value of message.team_name
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.team_name
     *
     * @param teamName the value for message.team_name
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.content
     *
     * @return the value of message.content
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.content
     *
     * @param content the value for message.content
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.state
     *
     * @return the value of message.state
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public boolean isState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.state
     *
     * @param state the value for message.state
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.link_to
     *
     * @return the value of message.link_to
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public String getLinkTo() {
        return linkTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.link_to
     *
     * @param linkTo the value for message.link_to
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setLinkTo(String linkTo) {
        this.linkTo = linkTo == null ? null : linkTo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.type
     *
     * @return the value of message.type
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.type
     *
     * @param type the value for message.type
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Tue May 14 15:03:34 CST 2019
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
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", studentNum=").append(studentNum);
        sb.append(", teamName=").append(teamName);
        sb.append(", content=").append(content);
        sb.append(", state=").append(state);
        sb.append(", linkTo=").append(linkTo);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}