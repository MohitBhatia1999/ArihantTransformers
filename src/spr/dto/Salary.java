
package spr.dto;


public class Salary {
   
    private String marketingUserId;
    private String marketingUserName;
    private String salary;
    private String incentives;

    public Salary() {
    }

    public Salary(String marketingUserId, String marketingUserName, String salary, String incentives) {
        this.marketingUserId = marketingUserId;
        this.marketingUserName = marketingUserName;
        this.salary = salary;
        this.incentives = incentives;
    }

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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getIncentives() {
        return incentives;
    }

    public void setIncentives(String incentives) {
        this.incentives = incentives;
    }

    
    
    
}
