
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
        
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("");
    }
}
