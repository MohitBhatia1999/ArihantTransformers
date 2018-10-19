
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.dao.LogicalCode;
import static java.lang.System.out;
import java.util.Scanner;
import spr.dto.ArihantTransformer;
import spr.dto.Attendance;
import spr.dto.Salary;


public class MainClass {
  public static void main(String...args)
  {
      Scanner sc=new Scanner(System.in);
      ApplicationContext context  = new ClassPathXmlApplicationContext("/SpringXMLConfig.xml");
    LogicalCode  lc=(LogicalCode)context.getBean("technosoft");
    
    out.println("SELECT CATEGORY");
    out.println("1.MARKETING USER");
    out.println("2.OWNER");
    
    int input=sc.nextInt();
    switch(input)
    {
        case 1:
            System.out.println("------LOGIN------");
    System.out.println("ENTER LOGIN ID");
  String id = sc.next();
    System.out.println("ENTER PASSWORD");
  String password  =sc.next();
    if(id.equals("arihant") && password.equals("transformer"))
            {
    
    out.println("MANAGE MARKETING USER RECORD");
    out.println("SELECT CHOICE");
    out.println("------MENU-----");
    out.println("1.ENTRY QUATATION");
    out.println("2.SEND REQUEST TO UPDATE QUOTATION");
    out.println("3.VIEW SALARY");
    out.println("4.ATTENDANCE MENU");
    out.println("5.EXIT");
 
int choice=sc.nextInt();
switch(choice)
{
    case 1:
        out.println("----ENTRY FOR QUATATION----");
        
         out.println("please enter the Marketing User-Id");
       String marketingUserId=sc.next();
        out.println("please enter the Client Name");
       String name=sc.next();
       out.println("please enter the Meeting Time");
       String meetingTime=sc.next();
       out.println("please enter the leaving time");
      String leavingTime=sc.next();
      out.println("please enter the Offered Price of The Transformer");
    int  offeredPrice=sc.nextInt();
     out.println("please enter the Description of Meeting");
      String description=sc.next();
      
   
      ArihantTransformer arihant=new ArihantTransformer(marketingUserId, name, meetingTime, leavingTime,offeredPrice, description);
    lc.insertRecord(arihant);
   break;
   
   
   case 2:
        out.println("please enter the Marketing UserId to Send a Request to Update the Quatation");
        
        
        marketingUserId=sc.next();
        lc.updateRecord(marketingUserId);
        break;
   
    case 3:
        out.println("ENTER THE MARKETING USER ID TO VIEW SALARY");
        marketingUserId=sc.next();
        lc.searchSalary(marketingUserId);
        break;
        
        
 

    case 4: //for attendance(view status)
        
        
        out.println("---ATTENDANCE MENU----");
        out.println("1.INSERT ATTENDANCE");
        out.println("2.VIEW ATTENDANCE");
        int cho=sc.nextInt();
        switch(cho)
        {
            case 1:
                out.println("----ENTER THE ATTENDANCE----");
        out.println("ENTER THE MARKETING USER-ID");
        marketingUserId=sc.next();

        out.println("ENTER THE MARKETING USER-NAME");
        String marketingUserName=sc.next();


        out.println("ENTER THE DATE");
String date=sc.next();


        out.println("ENTER THE WORKING SESSION");
        String workingSession=sc.next();

        Attendance attend=new Attendance(marketingUserId, marketingUserName, date, workingSession);
lc.insertAttendance(attend);
break;
      
            case 2:
                out.println("ENTER THE MARKETING USER ID TO VIEW ATTENDANCE");
        marketingUserId=sc.next();
        lc.viewAttendance(marketingUserId);
        break;
                
        }
        
        break;
        
    case 5:
        System.exit(0);
        break;

    default :
        out.println("invalid choice");

}
  
  
  }else{
        System.out.println("Invalid Id,Pass");
    }
       
    break;
    //THIS IS FOR OWNER LOGIN
    case 2:
    
    out.println("-----OWNER LOGIN-----");
        out.println("ENTER OWNER ID");
        String ownerId=sc.next();
        out.println("ENTER OWNER PASSWORD");
        String ownerPassword=sc.next();
        if(ownerId.equals("owner") && ownerPassword.equals("password"))
        {
        out.println("-----ENTER THE MARKETING USER SALARY----");
        out.println("ENTER THE MARKETING USER ID");
        String marketingUserId=sc.next();
        out.println("ENTER THE MARKETING USER NAME");
        String marketingUserName=sc.next();
        out.println("ENTER THE SALARY");
        String salary=sc.next();
        out.println("ENTER THE INCENTIVES");
        String incentives=sc.next();
        
        Salary sal=new Salary(marketingUserId, marketingUserName, salary, incentives);
        lc.insertSalary(sal);
        break;
                
        }
        
        
        }
    
    
    }
  
  }

