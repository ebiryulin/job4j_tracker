package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanych");
        student.setGroupName("Java22");
        student.setDateOfAdmission("2022-09-01");

        System.out.println("Student: " + student.getFullName() + System.lineSeparator()
                + "Group: " + student.getGroupName() + System.lineSeparator()
                + "Date of admission: " + student.getDateOfAdmission());
    }
}
