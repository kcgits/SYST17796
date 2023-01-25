/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/** Array of objects java example: printing studentDetails
 * project - share to Github: collaboaration tool, tracking changes keep history - version control software 
 * chat [] reverse = new char[word.length()]; - reverse of word *
 * print 3 student details are name, age store in array then prints -- array of objects 
 * @author kcbarbosa
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Student [] list = new Student [3]; //array of objects decalaration 
       //create students 3
       Student s1 = new Student();
       s1.setName("Peter");
       s1.setAge(20);
       list[0] = s1; //stored in object array
       System.out.println(list[0].getName() + list[0].getAge());
       
    }
    
} 
