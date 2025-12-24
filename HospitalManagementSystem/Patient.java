public class Patient {
    private int patientId;
    private String fullName;
    private int age;
    private String bloodType;

    public Patient(int patientId, String fullName, int age, String bloodType) {
        this.patientId = patientId;
        setFullName(fullName);
        setAge(age);
        setBloodType(bloodType);
    }


    public int getPatientId() {
        return patientId;
    }
    public String getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }
    public String getBloodType() {
        return bloodType;
    }


    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public void setFullName(String fullName) {
        if (fullName != null && !fullName.trim().isEmpty()) {
            this.fullName = fullName;
        } else {
            System.out.println("Invalid name. Setting to 'Unknown'.");
            this.fullName = "Unknown";
        }
    }
    public void setAge(int age) {
        if (age >= 0 && age <= 121) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Setting to 0");
            this.age = 0;
        }
    }
    public void setBloodType(String bloodType) {
        if (bloodType != null && !bloodType.trim().isEmpty()) {
            this.bloodType = bloodType;
        } else {
            System.out.println("Invalid blood type. Setting to 'Unknown'");
            this.bloodType = "Unknown";
        }
    }


    public boolean isMinor() {
        return age < 18;
    }
    public String getAgeCategory() {
        if (age < 18) {
            return "Minor";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Elderly person";
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + patientId +
                ", name='" + fullName + '\'' +
                ", age=" + age +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}

