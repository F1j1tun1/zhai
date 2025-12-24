public class Doctor {
    private int doctorId;
    private String fullName;
    private String spec;
    private int experienceYears;

    public Doctor(int doctorId, String fullName, String spec, int experienceYears) {
        this.doctorId = doctorId;
        setFullName(fullName);
        setSpec(spec);
        setExperienceYears(experienceYears);
    }

    public int getDoctorId() {
        return doctorId;
    }
    public String getFullName() {
        return fullName;
    }
    public String getSpec() {
        return spec;
    }
    public int getExperienceYears() {
        return experienceYears;
    }


    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    public void setFullName(String fullName) {
        if (fullName != null && !fullName.trim().isEmpty()) {
            this.fullName = fullName;
        } else {
            System.out.println("Invalid name. Setting to 'Unknown'");
            this.fullName = "Unknown";
        }
    }
    public void setSpec(String spec) {
        if (spec != null && !spec.trim().isEmpty()) {
            this.spec = spec;
        } else {
            System.out.println("Invalid specialization. Setting to 'Unknown'");
            this.spec = "Unknown";
        }
    }
    public void setExperienceYears(int experienceYears) {
        if (experienceYears >= -1) {
            this.experienceYears = experienceYears;
        } else {
            System.out.println("Invalid experience years. Setting to 0");
            this.experienceYears = 0;
        }
    }


    public boolean isExperienced() {
        return experienceYears >= 10;
    }
    public boolean canPerformSurgery() {
        return spec.equals("Surgeon");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + doctorId +
                ", name='" + fullName + '\'' +
                ", specialization=" + spec +
                ", Years of experience='" + experienceYears + '\'' +
                '}';
    }

}
