
package ClassPackage;

import java.io.BufferedReader;

public class EmployeeClass {
    
    FileManagement fs = new FileManagement("Employee_Info.txt");

    private String  EmployeeID;//E001[
    private String  EmployeeName; //sam
    private String EmployeeEpfNo; //EPF001
    private int Age; //22
    private String  Address; //A
    private String DepartmentAndLocation; //HR,Floor G
    private int EmployeeCount; //2

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmployeeEpfNo() {
        return EmployeeEpfNo;
    }

    public void setEmployeeEpfNo(String EmployeeEpfNo) {
        this.EmployeeEpfNo = EmployeeEpfNo;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDepartmentAndLocation() {
        return DepartmentAndLocation;
    }

    public void setDepartmentAndLocation(String DepartmentAndLocation) {
        this.DepartmentAndLocation = DepartmentAndLocation;
    }

    public int getEmployeeCount() {
        return EmployeeCount;
    }

    public void setEmployeeCount(int EmployeeCount) {
        this.EmployeeCount = EmployeeCount;
    }
    public boolean addEmployee() {
        
        if(!fs.createANewFile())
        {
            //              E001 sam  22 A HR, Floor G
            String record = EmployeeID + " | " + EmployeeName + " | " + EmployeeEpfNo +  " | " + Age + " | " + Address+" | " + DepartmentAndLocation;
            System.err.println(EmployeeID + " | " + EmployeeName + " | " + EmployeeEpfNo + " | " + Age + " | " + Address+" | " + DepartmentAndLocation);
            return fs.writeDataToFile(record);//E001 sam  22 A HR, Floor G
        }
        return false;
    } 
    public String viewAllEmployee () 
      {
        String Employee, allEmployee = " ";
        String[] words = null;
        int count = 0;
        BufferedReader bufferedReader = fs.readAFile();
        try {
            while ((Employee = bufferedReader.readLine()) != null) //E002 AB 23 Col5 MKT
            {     
                words = Employee.split(" ");//[0]=E002 [1]=AB [2]=23 [3]=MKT
                System.err.println(Employee);
                allEmployee = allEmployee + words[0] + "\t" + words[2] + "\t" + words[4] + "\t" + words[6] + "\t" + words[8] + "\t" + words[10] + " " + 
                        words[11] + " " + words[12] + " " + words[13] + "\n";
                //          =""+ E001  sam 22 IT \n + E002 AB  23 MKT  \n 
                count++; // 1+1=2            
            }
        } catch (Exception ex) {
            System.out.println("Error view All Employee"+ex);
        }
        setEmployeeCount(count);
        return allEmployee;
    }
     public boolean searchEmployee (String EmpID) 
      {
        boolean isFound = false;       
        try {
            String[] Emp = null;
            
            BufferedReader bufferedReader = fs.readAFile();
            String employee;
            
            outerloop:
            while ((employee = bufferedReader.readLine()) != null) {              
                Emp = employee.split(" ");
                
                for (String word : Emp) {
                    if (word.equals(EmpID)) {
                        isFound = true;                        
                        this.setEmployeeID(Emp[0]);
                        this.setEmployeeName(Emp[2]);
                        this.setEmployeeEpfNo(Emp[4]);
                        this.setAge(Integer.parseInt(Emp[6]));
                        this.setAddress(Emp[8]);
                        this.setDepartmentAndLocation(Emp[10]+" "+Emp[11]+" "+Emp[12]+" "+Emp[13]);                  
                        break outerloop;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error Search Employee");
        }       
        return isFound;
    }
}
