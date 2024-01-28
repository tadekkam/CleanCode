import org.example.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void shouldRetrieveEmployeeDescription() {
        //given
        Employee employee = new Employee("John", "Smith");
        //when
        String actualEmployeeInfo = employee.employeeInfo();
        //then
        Assertions.assertNotNull(actualEmployeeInfo);
        Assertions.assertEquals("Employee name : John Smith", actualEmployeeInfo);
    }

    @Test
    void shouldRetrieveEmployeeDetailsWithAge() {
        //given
        Employee employee = new Employee("John", "Smith", 45);
        //when
        String actualEmployeeDetails = employee.employeeDetails();
        //then
        Assertions.assertNotNull(actualEmployeeDetails);
        Assertions.assertEquals("Employee details : John Smith is 45", actualEmployeeDetails);
    }


    @Test
    void shouldRetrieveBaseSalary() {
        //given
        double baseSalary = 3000;
        Employee employee = new Employee("John", "Smith", 45, baseSalary);
        //when
        double actualBaseSalary = employee.getBaseSalary();
        //then
        Assertions.assertNotNull(actualBaseSalary);
        Assertions.assertEquals(baseSalary, actualBaseSalary);
    }


    @Test
    void shouldRetrieveBaseSalaryWithBonus() {
        //given
        double baseSalary = 3000;
        double bonus = 500;
        Employee employee = new Employee("John", "Smith", 45, baseSalary, bonus);
        //when
        double actualTotalSalary = employee.getSalary();
        //then
        Assertions.assertNotNull(actualTotalSalary);
        Assertions.assertEquals(employee.getSalary(), actualTotalSalary);
    }

    @Test
    void shouldRetrieveEmployeeBonus() {
        //given
        double baseSalary = 3000;
        double bonus = 500;
        Employee employee = new Employee("John", "Smith", 45, baseSalary, bonus);
        //when
        double actualBonus = employee.getBonus();
        //then
        Assertions.assertNotNull(actualBonus);
        Assertions.assertEquals(bonus, actualBonus);
    }

}