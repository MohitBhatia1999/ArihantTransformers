/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.dao;

import java.sql.SQLException;
import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import spr.dto.ArihantTransformer;
import spr.dto.Attendance;
import spr.dto.Salary;
/**
 *
 * @author MohitBhatia
 */
public class LogicalCode {
    HibernateTemplate template;
    
    public LogicalCode()
    {
    }
    public HibernateTemplate getTemplate()
    {
        return template;
    }
    
    public void setTemplate(HibernateTemplate template)
    {
        this.template=template;
    }
    
    
    
    public void insertRecord(ArihantTransformer arihant)
    {
    template.execute(new HibernateCallback<Object>()
    {
     @Override
     public Object doInHibernate(Session session)throws HibernateException,SQLException
     {
        session.save(arihant);
        return null;
     }
    }); 
    }     
 
    
    
    
public void searchRecord(String id)
{
 template.execute(new HibernateCallback<Object>()
 {
   @Override
   public Object doInHibernate(Session session)throws HibernateException,SQLException
   {
       ArihantTransformer record = (ArihantTransformer)session.get(ArihantTransformer.class,id);
       if(record==null)
       {
       System.out.println("no record found");
       }
       else
       {
       System.out.println(record.getMarketingUserId()+" "+record.getName()+" "+record.getMeetingTime()+" "+record.getLeavingTime()+" "+record.getOfferedPrice()+" "+record.getDescription());   
       }
   return null;
   }
 });
}

public void updateRecord(String id)
{
  template.execute(new HibernateCallback<Object>()
  {
  @Override
  public Object doInHibernate(Session session)throws HibernateException,SQLException
  {
      ArihantTransformer record =(ArihantTransformer)session.get(ArihantTransformer.class,id);
    if(record==null)
    {
       System.out.println("no record found");
    }
    else
    {

        
   System.out.println(record.getMarketingUserId()+" "+record.getName()+" "+record.getMeetingTime()+" "+record.getLeavingTime()+" "+record.getOfferedPrice()+" "+record.getDescription());
   System.out.println("SELECT CHOICE TO UPDATE");
   System.out.println("1.Update Client Name");
   System.out.println("2.Update Meeting Time");
    System.out.println("3.Update Leaving Time");
     System.out.println("4.Update Offered Price");
     System.out.println("4.Update Description");
     
     Scanner sc=new Scanner(System.in);
    int ch=sc.nextInt();
    switch(ch)
    {
        case 1:
             System.out.println("Enter Updated Client Name");
             String clientName=sc.next();
             record.setName(clientName);
             break;
        case 2:
             System.out.println("Enter Updated Meeting Time");
             String uMeetingTime=sc.next();
             record.setMeetingTime(uMeetingTime);
             break;
        case 3:
             System.out.println("Enter Updated Leaving Time");
             String uLeavingTime=sc.next();
             record.setLeavingTime(uLeavingTime);
             break;
        case 4:
             System.out.println("Enter Updated Offered Price");
             int uOfferedPrice=sc.nextInt();
             record.setOfferedPrice(uOfferedPrice);
             break;
        case 5:
            System.out.println("Enter Updated Description");
            String uDescription=sc.next();
            record.setDescription(uDescription);
            break;
    }
  }
    return null;
  }
  });
}

    public void insertSalary(Salary sal) {
        
        template.execute(new HibernateCallback<Object>()
    {
     @Override
     public Object doInHibernate(Session session)throws HibernateException,SQLException
     {
        session.save(sal);
        return null;
     }
    }); 
        
    }
//SEARCH SALARY FOR MEKETING USER
    public void searchSalary(String marketingUserId) {
        template.execute(new HibernateCallback<Object>()
 {
   @Override
   public Object doInHibernate(Session session)throws HibernateException,SQLException
   {
       Salary record1 = (Salary)session.get(Salary.class,marketingUserId);
       if(record1==null)
       {
       System.out.println("no record found");
       }
       else
       {
       System.out.println(record1.getMarketingUserId()+" "+record1.getMarketingUserName()+" "+record1.getSalary()+" "+record1.getIncentives());   
       }
   return null;
   }
 });
    }

    public void insertAttendance(Attendance attend) {

template.execute(new HibernateCallback<Object>()
    {
     @Override
     public Object doInHibernate(Session session)throws HibernateException,SQLException
     {
        session.save(attend);
        return null;
     }
    }); 
        
    }

    //VIEW ATTENDANCE
    
    public void viewAttendance(String marketingUserId) {
            template.execute(new HibernateCallback<Object>()
 {
   @Override
   public Object doInHibernate(Session session)throws HibernateException,SQLException
   {
       Attendance record2 = (Attendance)session.get(Attendance.class,marketingUserId);
       if(record2==null)
       {
       System.out.println("no record found");
       }
       else
       {
       System.out.println(record2.getMarketingUserId()+" "+record2.getMarketingUserName()+" "+record2.getDate()+" "+record2.getWorkingSession());   
       }
   return null;
   }
 });
       
    }

}
    

