package com.main.employee;

public class Main {

  public static void main(String[] args) {
    Employee skn = new Employee("SKN", "Analyst", 500, "2022-10-26");

    System.out.printf("%s is %s\n", skn.getName(), skn.getTitle());

    System.out.printf("%s's Old Salary: %f\n", skn.getName(), skn.getSalary());

    skn.raiseSalary(5);

    System.out.printf("%s's New Salary: %f\n", skn.getName(), skn.getSalary());

    System.out.printf(
      "%s was hired on %s\n",
      skn.getName(),
      skn.getDateOfHiring().toString()
    );
    System.out.printf(
      "%s served for %d year(s)\n",
      skn.getName(),
      skn.getYearsOfService()
    );
  }
}
