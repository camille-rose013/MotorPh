/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author camil
 */
public class Attendance {
    private int employeeNumber;
    private final String lastName;
    private final String firstName;
    private String date;
    private String timeIn;
    private String timeOut;
    
    public Attendance(int employeeNumber, String lastName, String firstName, String date,String timeIn, String timeOut) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }
    @Override
    public String toString() {
          return 
                "  employeeNumber: " + employeeNumber + ",\n" +
                "  lastName: " + lastName + ",\n" +
                "  firstName: " + firstName + ",\n" +
                "  date: " + date + ",\n" +
                "  timeIn: " + timeIn + ",\n" +
                "  timeOut: " + timeOut + ",\n" ;
          
    }
    
    public String getTimeIn() {
        return timeIn;
    }
    
    public String getTimeOut() {
        return timeOut;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getEmployeeName() {
        return firstName + lastName;
    }
}
