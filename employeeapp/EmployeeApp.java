package employeeapp;

public class EmployeeApp {
    
    private static void showEmployeeInfo(Employee emp){
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Position: " + emp.getPosition());
        System.out.println();
    }


    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        
        //Initialize Employee 1
        emp1.setName("Susan Meyers");
        emp1.setId(47899);
        emp1.setDepartment("Accounting");
        emp1.setPosition("Vice President");
        
        //Initialize Employee 2
        emp2.setName("Mark Jones");
        emp2.setId(39199);
        emp2.setDepartment("IT");
        emp2.setPosition("Programer");
        
        //Initialize Employee 3
        emp3.setName("Joy Rogers");
        emp3.setId(81774);
        emp3.setDepartment("Manufacturing");
        emp3.setPosition("Engineer");
        
        
        //Display Employee 1
        System.out.println("Employee 1");
        showEmployeeInfo(emp1);
        
        //Display Employee 2
        System.out.println("Employee 2");
        showEmployeeInfo(emp2);
        
        //Display Employee 3
        System.out.println("Employee 3");
        showEmployeeInfo(emp3);
       
    }
    
}
