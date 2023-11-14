
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1307258
 */
public class student {
    personalInformation aPersonalInformation;
    academicRecord aAcademicRecord;
    
    public student(personalInformation aPersonalInformation, academicRecord aAcademicRecord){
        this.aPersonalInformation = aPersonalInformation;
        this.aAcademicRecord = aAcademicRecord;
    }
    
    public static void main (String[] args){
        
        //String phoneNum = "";
        //System.out.println(phoneNum.matches("[0-9]+"));
        //String aEmail = "a@asd.cm";
        //System.out.println(aEmail.matches("(.+)@(.+).com"));
        
        //System.out.println("INVALID EMAIL. MUST HAVE \"@\" and \".com\"");
        
        //String name = "123asd";
        //System.out.println(name.matches("[a-zA-Z]+"));
        
        //personalInformation(String name, String aStudentId,String aHkId, String age, String sex, String address, contactInfo contactInfo, emergencyContactInfo emergencyContactInfo)
        /*personalInformation p1 = new personalInformation("John","123","234","22","M","123 Fake Street",new contactInfo("23451234","abc@def.com"), new emergencyContactInfo("Mom","12345678"));
        System.out.println(p1.viewContactInfo());
        p1.setContactInfo(new contactInfo("12345678","a@gmail.com"));
        System.out.println(p1.viewPersonalInformation());*/
        
        /*System.out.println("Academic Record\n------------------"
                + "\nChinese\t\t12"
                + "\nEnglish\t\t12"
                + "\nMath\t\t12"
                + "\nScience\t\t12"
                + "\nPe\t\t12"
                + "\n\nAverage\t\t12");*/
                
        
        /*System.out.println("Personal Information\n---------------------"
                + "\nName:\t"
                + "\nStudent ID:\t"
                + "\nHK ID:\t"
                + "\nAge:\t"
                + "\nSex:\t"
                + "\nAddress:\t"
                + "\nContact Info:\t"
                + "\nEmergency Contact Info:\t");*/
        
        //Creation of student's personal information
        personalInformation p1 = new personalInformation("John","s45677","D123567","18","M","123 Fake Street",new contactInfo("62718254","john@gmail.com"), new emergencyContactInfo("Mom","91706523"));
        personalInformation p2 = new personalInformation("Amy","s56785","E123567","18","F","234 Fake Street",new contactInfo("94237856","amy@gmail.com"), new emergencyContactInfo("Dad","53467215"));
        
        //Creation of student's academic record
        academicRecord a1 = new academicRecord(80,77,65,92,85);
        academicRecord a2 = new academicRecord(88,95,83,95,100);
        
        //array to link personalinformation and academicrecord
        student[] student = new student[2];
        
        student[0] = new student(p1,a1);
        student[1] = new student(p2,a2);
        
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"1\" for personal information.\"2\" for academic record.");
        if(sc.nextInt() == 1){
            System.out.println("Enter \"1\" to view \"2\" to update");
            if(sc.nextInt() == 1){
                if(hkid == student[0].aPersonalInformation.getHkId()){
                    student[0].aPersonalInformation.viewPersonalInformation();
                }else{
                    student[1].aPersonalInformation.viewPersonalInformation();
                }
            }else{
                System.out.println("Which personal information would you like to update?"
                        + "\nEnter \"1\" for Address \"2\" for Contact Information \"3\" for Emergency Contact Information");
                if(sc.nextInt() == 1){
                    System.out.println("What is your new address?");
                    if(hkid == student[0].aPersonalInformation.getHkId()){
                        student[0].aPersonalInformation.setAddress(sc.nextLine());
                    }else{
                        student[1].aPersonalInformation.setAddress(sc.nextLine());
                    }
                }else if(sc.nextInt() == 2){
                    System.out.println("What is your new emergency contact Information?");
                    System.out.println("Enter emergency person's name");
                    String newName = sc.nextLine();
                    System.out.println("Enter phone number");
                    String newPhoneNum = sc.nextLine();
                    if(hkid == student[0].aPersonalInformation.getHkId()){
                        student[0].aPersonalInformation.setEmergencyContactInfo(new emergencyContactInfo(newName, newPhoneNum));
                    }else{
                        student[1].aPersonalInformation.setEmergencyContactInfo(new emergencyContactInfo(newName, newPhoneNum));
                    }
                }else{
                    System.out.println("What is your new contact Information?");
                    System.out.println("Enter new phone number");
                    String newPhoneNum = sc.nextLine();
                    System.out.println("Enter new email");
                    String newEmail = sc.nextLine();
                    if(hkid == student[0].aPersonalInformation.getHkId()){
                        student[0].aPersonalInformation.setContactInfo(new contactInfo(newPhoneNum, newEmail));
                    }else{
                        student[1].aPersonalInformation.setContactInfo(new contactInfo(newPhoneNum, newEmail));
                    }
                }
            }
        }else{
            if(hkid == student[0].aPersonalInformation.getHkId()){
                student[0].aAcademicRecord.viewAcademicRecord();
            }else{
                student[1].aAcademicRecord.viewAcademicRecord();
            }
        }
    }
}

