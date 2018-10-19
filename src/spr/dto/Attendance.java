package spr.dto;


public class Attendance {
 private String marketingUserId;
 private String marketingUserName;
private String date;
private String workingSession;

    public String getMarketingUserId() {
        return marketingUserId;
    }

    public void setMarketingUserId(String marketingUserId) {
        this.marketingUserId = marketingUserId;
    }

    public String getMarketingUserName() {
        return marketingUserName;
    }

    public void setMarketingUserName(String marketingUserName) {
        this.marketingUserName = marketingUserName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWorkingSession() {
        return workingSession;
    }

    public void setWorkingSession(String workingSession) {
        this.workingSession = workingSession;
    }

    public Attendance(String marketingUserId, String marketingUserName, String date, String workingSession) {
        this.marketingUserId = marketingUserId;
        this.marketingUserName = marketingUserName;
        this.date = date;
        this.workingSession = workingSession;
    }

    public Attendance() {
    }

}
