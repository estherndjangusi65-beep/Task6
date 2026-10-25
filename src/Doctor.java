public class Doctor extends MedicalStaff {
    public Doctor() {
        EmployeeID = 201;
        Department = "General Surgery";
        WorkingHours = 40;
    }
    @Override
    public void PatientCare() {
        System.out.println("Doctor: examines patients, diagnoses illnesses and prescribes treatment.");
    }
}
