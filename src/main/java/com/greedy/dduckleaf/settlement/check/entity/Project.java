package com.greedy.dduckleaf.settlement.check.entity;

import javax.persistence.*;

@Entity(name = "ProjectForFarmerCheck")
@Table(name = "TBL_PROJECT")
public class Project {

    @Id
    @Column(name = "PROJECT_NO")
    private int projectNo;                  //프로젝트 번호

    @Column(name = "PROJECT_NAME")
    private String projectName;             //프로젝트명

    @Column(name = "OPEN_DATE")
    private String openDate;                //오픈일

    @Column(name = "END_DATE")
    private String endDate;                 //종료일

    @Column(name = "ACHIEVEMENT_RATE")
    private String achievementRate;         //달성률

    @Column(name = "PROGRESS_STATUS")
    private String progressStatus;          //진행상태

    @ManyToOne
    @JoinColumn(name = "FARMER_NO")
    private FarmerInfo farmer;          //파머번호

    public Project() {}

    public Project(int projectNo, String projectName, String openDate, String endDate, String achievementRate,
                   String progressStatus, FarmerInfo farmer) {
        this.projectNo = projectNo;
        this.projectName = projectName;
        this.openDate = openDate;
        this.endDate = endDate;
        this.achievementRate = achievementRate;
        this.progressStatus = progressStatus;
        this.farmer = farmer;
    }

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getAchievementRate() {
        return achievementRate;
    }

    public void setAchievementRate(String achievementRate) {
        this.achievementRate = achievementRate;
    }

    public String getProgressStatus() {
        return progressStatus;
    }

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    public FarmerInfo getFarmer() {
        return farmer;
    }

    public void setFarmer(FarmerInfo farmer) {
        this.farmer = farmer;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectNo=" + projectNo +
                ", projectName='" + projectName + '\'' +
                ", openDate='" + openDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", achievementRate='" + achievementRate + '\'' +
                ", progressStatus='" + progressStatus + '\'' +
                ", farmer=" + farmer +
                '}';
    }
}
