/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spr.dto;

/**
 *
 * @author MohitBhatia
 */
public class ArihantTransformer {

private String marketingUserId;
private String name;
private String meetingTime;
private String leavingTime;
private int offeredPrice;
private String description;

    public ArihantTransformer() {
    }

    public ArihantTransformer(String marketingUserId, String name, String meetingTime, String leavingTime, int offeredPrice, String description) {
        this.marketingUserId = marketingUserId;
        this.name = name;
        this.meetingTime = meetingTime;
        this.leavingTime = leavingTime;
        this.offeredPrice = offeredPrice;
        this.description = description;
    }

   

    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the meetingTime
     */
    public String getMeetingTime() {
        return meetingTime;
    }

    /**
     * @param meetingTime the meetingTime to set
     */
    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    /**
     * @return the leavingTime
     */
    public String getLeavingTime() {
        return leavingTime;
    }

    /**
     * @param leavingTime the leavingTime to set
     */
    public void setLeavingTime(String leavingTime) {
        this.leavingTime = leavingTime;
    }

    public int getOfferedPrice() {
        return offeredPrice;
    }

    /**
     * @return the offeredPrice
     */
    public void setOfferedPrice(int offeredPrice) {    
        this.offeredPrice = offeredPrice;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the marketingUserId
     */
    public String getMarketingUserId() {
        return marketingUserId;
    }

    /**
     * @param marketingUserId the marketingUserId to set
     */
    public void setMarketingUserId(String marketingUserId) {
        this.marketingUserId = marketingUserId;
    }
                
}
