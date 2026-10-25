public class Nurse extends MedicalStaff{
    public Nurse() {
        EmployeeID = 202;
        Department = "Maternity Ward";
        WorkingHours = 48;
    }

    @Override
    public void PatientCare() {
        System.out.println("Nurse: monitors patients and gives injections.");
    }
}
