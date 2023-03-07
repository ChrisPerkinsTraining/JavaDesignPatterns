package com.pluralsight.structural.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;
    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterLdap {\n" +
                "id='" + this.getId() + "', \n" +
                "firstName='" + this.getFirstName() + "', \n" +
                "lastName='" + this.getLastName() + "', \n" +
                "email='" + this.getEmail() + "'}\n";
    }
}
