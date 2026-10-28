public class Nurse extends MedicalStaff{
    Nurse() { super("N01", "Nursing", "8 hours"); }
    public void performDuty() {
        System.out.println("Nurse cares for patients.");
    }
}
