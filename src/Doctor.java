public class Doctor extends MedicalStaff {
    public Doctor() {
        EmployeeID = 201;
        Department = "Surgery";
        WorkingHours = 40;
    }
    @Override
    public void PatientCare() {
        System.out.println("Doctor: examines patients and prescribes treatment.");
    }
}
