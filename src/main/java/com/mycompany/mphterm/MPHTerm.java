/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mphterm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author teshia
 */
public class MPHTerm {
private static final DecimalFormat df = new DecimalFormat("0.00");
    //updated motorPH code
    public static void main(String[] args) throws IOException, InterruptedException {
        Greetings gr = new Greet2() {};
        gr.greet1();
        gr.greets();
        System.out.println("=================================");
        System.out.println("Please select from the menu..");
        System.out.println("=============================");
        System.out.println("1. Employee Information");
        System.out.println("2. View Gross Earnings");
        System.out.println("3. View Net Earnings");
        
        Scanner opt = new Scanner(System.in);
        System.out.println("=============================");
        System.out.print("Enter your selection..: ");
        String select = opt.nextLine();
        System.out.println("You selected option #" + select);
        selectOpt(select);
        opt.close();
        
    }
    private static void selectOpt(String select) throws IOException, InterruptedException {
        switch (select) {
            case "1":
                empInfo();
                break;
            case "2":
                empSala1();
                break;
            case "3":
                empSala2();
                break;
            default:
                System.out.println("You entered an incorrect option.");
                System.out.println("Exiting now......Goodbye");
                break;
    }
}    
private static void empInfo() throws IOException {
        int maxAttempts = 3;
        int attempts = 0;
        boolean cont = true;
        while (cont) {
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.print("Enter Employee ID: ");
        String lookup = scan.nextLine();
        attempts++;
        if (attempts==maxAttempts) { System.out.println("You have reached the max attempt!"); break; }
    
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\teshia\\Downloads\\MotorPH Employee Datav4.txt"));
        
        boolean found = false;
        while ((str = br.readLine()) != null) {
            if (str.contains(lookup)) { 
                String[] values = str.split(",");
                System.out.println("*=================*EMPLOYEE INFO*=================*");
                System.out.println("Employee Number: " + values[0]);
                System.out.print("Employee Name: " + values[2] + " "+ values[1]); System.out.println("     " + "DOB: " +  values[3]); 
                System.out.print("Position: " + values[11]); System.out.println("     " + "Status: " + values[10]);
                System.out.println("Address: " + values[4]);
                System.out.println("*=================*=============*=================*");
                System.out.println("Thank you for using the MotorPH Payroll System!");
                found = true;
                break;
            }
        }
        if(!found) {
                System.out.println("Invalid Employee ID...");
            }
        cont = !found; }
}
private static void empSala1() throws IOException {
        int maxAttempts = 3;
        int attempts = 0;
        boolean cont = true;
        while (cont) {
        SalaryData eGros = new SalaryData();
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.print("Enter Employee ID: ");
        String lookup = scan.nextLine();
        attempts++;
        if (attempts==maxAttempts) { System.out.println("You have reached the max attempt!"); break; }
        System.out.print("Enter Hours Worked: ");
        int hrs = scan.nextInt();
        eGros.sethRate(hrs);
    
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\teshia\\Downloads\\MotorPH Employee Datav4.txt"));
        
        boolean found = false;
        while ((str = br.readLine()) != null) {
            if (str.contains(lookup)) { 
                String[] values = str.split(",");
                String stn = values[18];
                String rice = values[14];
                String cloth = values[15];
                String phone = values[16];
                System.out.println("*=================*EMPLOYEE GROSS EARNINGS*=================*");
                System.out.println("Employee Number: " + values[0]);
                System.out.println("Employee Name: " + values[2] + " "+ values[1]);
                System.out.println("Hourly Rate: " +  values[18]);
                System.out.print("Gross Earnings: "); 
                try{
                double hours = Double.parseDouble(stn);
                double xrice = Double.parseDouble(rice);
                double xcloth = Double.parseDouble(cloth);
                double xphone = Double.parseDouble(phone);
                System.out.println(df.format(eGros.gethRate()*(hours)+(xrice)+(xcloth)+(xphone)));
                }
                catch (NumberFormatException ex) {
                }
                System.out.println("*=================*EMPLOYEE BENEFITS*=================*");
                System.out.println("Rice Subsidy: " + values[14]);
                System.out.println("Clothing Allowance: " + values[15]);
                System.out.println("Phone Allowance: " + values[16]);
                System.out.println("==================*=================*==================");
                System.out.println("Thank you for using the MotorPH Payroll System!");
                found = true;
                break;
            }
        }
        if(!found) {
                System.out.println("Invalid Employee ID...");
            }
        cont = !found; }
    }
private static void empSala2() throws IOException {
        int maxAttempts = 3;
        int attempts = 0;
        boolean cont = true;
        while (cont) {
        SalaryData eGros = new SalaryData();
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.print("Enter Employee ID: ");
        String lookup = scan.nextLine();
        attempts++;
        if (attempts==maxAttempts) { System.out.println("You have reached the max attempt!"); break; }
        System.out.print("Enter Hours Worked: ");
        int hrs = scan.nextInt();
        eGros.sethRate(hrs);
    
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\teshia\\Downloads\\MotorPH Employee Datav4.txt"));
        
        boolean found = false;
        while ((str = br.readLine()) != null) {
            if (str.contains(lookup)) { 
                String[] values = str.split(",");
                String stn = values[18];
                String rice = values[14];
                String cloth = values[15];
                String phone = values[16];
                String sss = values[25];
                String philh = values[26];
                String wtax = values[27];
                String pagibig = values[28];
                System.out.println("*================*EMPLOYEE NET EARNINGS*================*");
                System.out.println("Employee Number: " + values[0]);
                System.out.println("Employee Name: " + values[2] + " "+ values[1]);
                System.out.println("Hourly Rate: " +  values[18]);
                System.out.print("Gross Earnings: "); 
                try{
                double hours = Double.parseDouble(stn);
                double xrice = Double.parseDouble(rice);
                double xcloth = Double.parseDouble(cloth);
                double xphone = Double.parseDouble(phone);
                System.out.println(df.format(eGros.gethRate()*(hours)+(xrice)+(xcloth)+(xphone)));
                }
                catch (NumberFormatException ex) {
                }
                System.out.print("Net Earnings (After Deductions): ");
                try{
                double hours = Double.parseDouble(stn);
                double xrice = Double.parseDouble(rice);
                double xcloth = Double.parseDouble(cloth);
                double xphone = Double.parseDouble(phone);
                double xsss = Double.parseDouble(sss);
                double xphilh = Double.parseDouble(philh);
                double xwtax = Double.parseDouble(wtax);
                double xpagibig = Double.parseDouble(pagibig);
                System.out.println(df.format(eGros.gethRate()*(hours)+(xrice)+(xcloth)+(xphone)-(xsss)-(xphilh)-(xwtax)-(xpagibig)));
                }
                catch (NumberFormatException ex) {
                }
                System.out.println("*================*EMPLOYEE DEDUCTIONS*================*");
                System.out.println("SSS: " + values[25]);
                System.out.println("PhilHealth: " + values[26]);
                System.out.println("Pag-Ibig: " + values[28]);
                System.out.println("Witholding Tax: " + values[27]);
                System.out.println("=================*===================*================-");
                System.out.println("Thank you for using the MotorPH Payroll System!");
                found = true;
                break;
            }
        }
        if(!found) {
                System.out.println("Invalid Employee ID...");
            }
        cont = !found; }
    }
}
