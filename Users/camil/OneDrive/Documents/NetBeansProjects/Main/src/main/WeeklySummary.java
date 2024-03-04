/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Objects;

/**
 *
 * @author camil
 */
public class WeeklySummary {
    private String date;
    private int hoursWorked;
    private double grossWeeklySalary;
    private double netWeeklySalary;
    private final String employeeName;
    private final String timeIn; // Added timeIn as a class variable
    private static final double SSS = 1125.0; 
    private static final double PHILHEALTH = 750.0; 
    private static final double GENERIC_DEDUCTIONS = SSS + PHILHEALTH; 


  public WeeklySummary(String employeeName, String date, int hoursWorked, double grossWeeklySalary, double netWeeklySalary, String timeIn) {
        this.employeeName = employeeName;
        this.date = date;
        this.hoursWorked = hoursWorked;
        this.grossWeeklySalary = grossWeeklySalary;
        this.netWeeklySalary = netWeeklySalary;
        this.timeIn = timeIn; // Initialize timeIn
    }

    public String getDate() {
        return date;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getGrossWeeklySalary() {
        return grossWeeklySalary;
    }

    public double getNetWeeklySalary() {
        return netWeeklySalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    
     public String timeIn() {
        return timeIn;
    }
    @Override
  public String toString() {
        return "WeeklySummary{" +
                "employeeName='" + employeeName + '\'' +
                ", date='" + date + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", grossWeeklySalary=" + grossWeeklySalary +
                ", netWeeklySalary=" + netWeeklySalary +
                ", timeIn='" + timeIn + '\'' +
                '}';
    }
    
    
    public int getLateHours() {
        // Assuming your working hours start at 8:00 AM
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        try {
            Date expectedTimeIn = dateFormat.parse("08:00");
            Date actualTimeIn = dateFormat.parse(this.timeIn);

            // Calculate the difference in hours
            long timeDifference = actualTimeIn.getTime() - expectedTimeIn.getTime();
            int lateHours = (int) (timeDifference / (60 * 60 * 1000));

            // Ensure late hours are non-negative
            return Math.max(lateHours, 0);
        } catch (ParseException e) {
            return 0; // Return 0 hours in case of an error
        }
    }

    public int getTotalWorkedMinusLate() {
        return this.hoursWorked - getLateHours();
    }

    public double getTotalDeductions() {
        // Replace this with your actual deduction calculation
        // For simplicity, I'm using a fixed deduction value
        return GENERIC_DEDUCTIONS; 
    }
}
