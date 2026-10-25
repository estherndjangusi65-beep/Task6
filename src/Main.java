public class Main {
    public static void main(String[] args){
        Doctor d= new Doctor();
        Nurse n=new Nurse();
        Pharmacist p=new Pharmacist();
        Lab l= new Lab();
        System.out.println("..Mukono Hospital Staff..");
        System.out.println();

        d.ShowStaffInfo();
        d.PatientCare();
        System.out.println();

        n.ShowStaffInfo();
        n.PatientCare();
        System.out.println();

        p.ShowStaffInfo();
        p.PatientCare();
        System.out.println();

        l.ShowStaffInfo();
        l.PatientCare();
        System.out.println();

        System.out.println("..HOW ABSTRACTION HELPS..");
        System.out.println("Organization: common data and methods are written once in MedicalStaff");
        System.out.println("Consistency: every staff type must have its own PatientCare() method");
        System.out.println("Extensibility: a new staff type (e.g. Radiographer) only extends MedicalStaff");
    }
}