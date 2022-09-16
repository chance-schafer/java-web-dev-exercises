package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    public String firstName;
    public String lastName;
    public String subject;
    public int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getName() {
        return firstName + lastName;
    }

    public String setSubject(String aSubject) {
        return this.subject = aSubject;
    }

    public int setYearsTeaching(int years) {
        return this.yearsTeaching = years;
    }
}
