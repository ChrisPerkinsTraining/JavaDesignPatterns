package com.pluralsight.structural.adapter;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;
    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {

        instance = employeeFromCSV;
    }

    @Override
    public String getId() {
        Integer instanceID = new Integer(this.instance.getId());
        //return instance.getId() + "";
        return instanceID.toString();
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterCSV {\n" +
                "id='" + this.getId() + "', \n" +
                "firstName='" + this.getFirstName() + "', \n" +
                "lastName='" + this.getLastName() + "', \n" +
                "email='" + this.getEmail() + "'}\n";
    }
}
