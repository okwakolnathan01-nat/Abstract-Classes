public abstract class MedicalStaff {
    String id;
    String department;
    String hours;

    public MedicalStaff(String id, String department, String hours) {
        this.id = id;
        this.department = department;
        this.hours = hours;
    }

    abstract void performDuty();
}
