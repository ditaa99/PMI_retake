import java.util.ArrayList;

public class Dentist {
    ArrayList<Appointments> appointments = new ArrayList<>();

    public void newAppointment(String patientName, String timestamp) {
        boolean flag = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientName().equals(patientName)) flag = true;
        }
        if (!flag) appointments.add(new Appointments(patientName, timestamp));

    }

    public String getAppointments() {
        StringBuilder appointment = new StringBuilder();
        for (int i = 0; i < appointments.size(); i++) {
            if (i < appointments.size() - 1) {
                appointment.append(appointments.get(i).getPatientName()).append(" ").append(appointments.get(i).getAppointment()).append("\r\n");
            } else {
                appointment.append(appointments.get(i).getPatientName()).append(" ").append(appointments.get(i).getAppointment());
            }
        }
        return appointment.toString();
    }

    public void resign(String patientName) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientName().equals(patientName)) {
                appointments.remove(i);
            }
        }
    }


    static class Appointments {
        String patientName;
        String appointment;

        public Appointments(String patientName, String appointment) {
            this.patientName = patientName;
            this.appointment = appointment;
        }

        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

        public String getAppointment() {
            return appointment;
        }

        public void setAppointment(String appointment) {
            this.appointment = appointment;
        }
    }
}

