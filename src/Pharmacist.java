public class Pharmacist extends MedicalStaff {
    public Pharmacist() {
        EmployeeID = 203;
        Department = "Hospital Pharmacy";
        WorkingHours = 40;
    }

    @Override
    public void PatientCare() {
        System.out.println("Pharmacist: dispenses medicine to patients.");
    }
}
