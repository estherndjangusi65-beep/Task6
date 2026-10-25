public abstract class MedicalStaff {
    int EmployeeID;
    String Department;
    int WorkingHours;

    public void ShowStaffInfo(){
        System.out.println("Employee ID = " +EmployeeID);
        System.out.println("Department = " +Department);
        System.out.println("Working Hours = " +WorkingHours);
    }
    public abstract void PatientCare();
}
