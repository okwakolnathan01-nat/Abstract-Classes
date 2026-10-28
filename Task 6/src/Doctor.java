public class Doctor extends MedicalStaff{
    Doctor() { super("D01", "Surgery", "8 hours"); }
    public void performDuty() {
        System.out.println("Doctor treats patients.");
    }
}
