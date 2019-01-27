package singleResponsibility;

public class Employee {

    private String empId;
    private String name;
    private String address;


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Better solution is creating new class which will contain the promotion calculation logic
    /*public boolean isPromotionDueThisYEar(){
        //promotionLogic
    }*/
}
