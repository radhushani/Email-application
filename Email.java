package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int defaultPasswordLength =8;
    private int MailBoxCount=100;
    private String alterEmail;

    //constructor to receive firstname and lastname
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

        //call a method for department
        this.department =setDepartment();
        //System.out.println("Department:"+ this.department);

        //call a method to return random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("your password is :"+this.password);

        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+"company.com";
        //System.out.println(email);
    }

    //Ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for sales\n2 for development\n3 for accounting\nEnter the department:");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();

        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "account";
        } else {
            return "";
        }
    }
        //Generate the random password
    private String randomPassword(int length){
        String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int rand = (int)(Math.random()* passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);

    }

        //set mailbox capacity
    public void setMailBoxCount(int capacity){
        this.MailBoxCount=capacity;
    }

        //set the alternative email
    public void setAlterEmail(String alterEmail){
        this.alterEmail=alterEmail;
    }

        //change the password
    public void changePassword(String password){
        this.password=password;
    }
    public int getMailBoxCount(){ return MailBoxCount;}

    public String getAlterEmail(){return alterEmail;}

    public String getPassword(){return password;}

    public String showInfo(){
        return "FULL NAME:"+firstName+" "+lastName+"\n"+"COMPANY EMAIL: "+email+"\n"+"MailBoxCount:"+MailBoxCount;
    }


}
