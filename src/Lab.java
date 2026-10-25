public class Lab extends MedicalStaff {
    public Lab() {
        EmployeeID = 204;
        Department = "Laboratory";
        WorkingHours = 40;
    }

    @Override
    public void PatientCare() {
        System.out.println("Pharmacist: dispenses medicine to patients.");
    }
}
