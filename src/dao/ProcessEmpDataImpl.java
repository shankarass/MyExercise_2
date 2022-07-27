package dao;

import model.Employee;

public class ProcessEmpDataImpl implements ProcessEmpDataV2{
    private Employee employee;
    public ProcessEmpDataImpl(Employee employee) {
        this.employee = employee;
        saveData(this.employee);
    }

   @Override
    public void saveData(Employee employee) {
       System.out.println("data saved");
       this.employee.setName(employee.getName());
       this.employee.setAge(employee.getAge());
    }

    @Override
    public int getAge() {
        // some logic
        return this.getAge();
    }

    public String printData() {
        return employee.getName() + "\t" + employee.getAge();
    }
}
