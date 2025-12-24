public class Appointment {
    private int appointmentId;
    private String patientFullName;
    private String doctorFullName;
    private String date;

    public Appointment(int appointmnetId, String patientFullName, String doctorFullName, String date) {
        this.appointmentId = appointmnetId;
        setPatientFullName(patientFullName);
        setDoctorFullName(doctorFullName);
        setDate(date);
    }

    public int getAppointmentId() {
        return appointmentId;
    }
    public String getPatientFullName() {
        return patientFullName;
    }
    public String getDoctorFullName() {
        return doctorFullName;
    }
    public String getDate() {
        return date;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }
    public void setPatientFullName(String patientFullName) {
        if (patientFullName != null && !patientFullName.trim().isEmpty()) {
            this.patientFullName = patientFullName;
        } else {
            System.out.println("Invalid patient name. Setting to 'Unknown'");
            this.patientFullName = "Unknown";
        }
    }
    public void setDoctorFullName(String doctorFullName) {
        if (doctorFullName != null && !doctorFullName.trim().isEmpty()) {
            this.doctorFullName = doctorFullName;
        } else {
            System.out.println("Invalid doctor name. Setting to 'Unknown'");
            this.doctorFullName = "Unknown";
        }
    }
    public void setDate(String date) {
        if (date != null && !date.trim().isEmpty()) {
            this.date = date;
        } else {
            System.out.println("Invalid date. Setting to 'Unknown'");
            this.date = "Unknown";
        }
    }

    public void reschedule(String newDate){
        this.date = newDate;
    }
    public void cancel() {
        System.out.println("Appointment " + appointmentId + " has been canceled.");
        this.date = null;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", patientFullName='" + patientFullName + '\'' +
                ", doctorFullName='" + doctorFullName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
