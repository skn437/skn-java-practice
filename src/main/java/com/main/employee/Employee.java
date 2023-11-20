package com.main.employee;

import java.time.LocalDate;
import java.time.Period;

abstract interface EmployeeInterface {
  public String getName();

  public String getTitle();

  public double getSalary();

  public LocalDate getDateOfHiring();

  public int getYearsOfService();

  public void raiseSalary(double percentage);
}

public class Employee implements EmployeeInterface {

  private String name;
  private String title;
  private double salary;
  private LocalDate dateOfHiring;

  public Employee(
    String name,
    String title,
    double salary,
    String dateOfHiring
  ) {
    this.name = name;
    this.title = title;
    this.salary = salary;
    this.dateOfHiring = LocalDate.parse(dateOfHiring);
  }

  public String getName() {
    return this.name;
  }

  public String getTitle() {
    return this.title;
  }

  public double getSalary() {
    return this.salary;
  }

  public LocalDate getDateOfHiring() {
    return this.dateOfHiring;
  }

  public int getYearsOfService() {
    Period serviceTime = Period.between(this.dateOfHiring, LocalDate.now());

    return serviceTime.getYears();
  }

  public void raiseSalary(double percentage) {
    this.salary += (this.salary * percentage) / 100;
  }
}
