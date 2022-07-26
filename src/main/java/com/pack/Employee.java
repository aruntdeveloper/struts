package com.pack;
import java.sql.*;
import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class Employee {
   private int employee_id;
    private String name;
    private String role;
    private int salary;
    private int sal;
    public Employee() {
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getSal() {
        return sal;
    }

    private String name_of_employee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName_of_employee() {
        return name_of_employee;
    }

    //public int sall;
    public String output;
    public Connection connect;


    public String execute(){
        System.out.println(name);
        System.out.println(role);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Arun@2001");
            PreparedStatement prdstmn = connect.prepareStatement("Create table if not exists employeeDetails(ID int,nam varchar(20),rol varchar(20), salary int)");
            int a = prdstmn.executeUpdate();
            //addData();
            switch (role) {
                case "Front_end_developer":
                    salary = 25000;
                    break;
                case "Back_end_developer":
                    salary = 35000;
                    break;
                case "Full_stack_developer":
                    salary = 50000;
                    break;
                case "Testing":
                    salary = 10000;
                    break;
            }
            PreparedStatement prdstmnt = connect.prepareStatement("insert into employeeDetails values(?,?,?,?)");
            prdstmnt.setInt(1, employee_id);
            prdstmnt.setString(2, name);
            prdstmnt.setString(3, role);
            prdstmnt.setInt(4, salary);
            int r = prdstmnt.executeUpdate();

            PreparedStatement prd = connect.prepareStatement("select * from employeeDetails where ID=?");
            prd.setInt(1, employee_id);
            ResultSet result = prd.executeQuery();
            while (result.next()) {
                String name_of_employee1 = result.getString(2);
                int sal = result.getInt(4);
                output = "Your name is: " + result.getString(2) + "  Your salary is: " + result.getInt(4);
                System.out.println(output);
                setSal(sal);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return "true";
    }

}
