public class Assistant extends Dentist{
    public void refreshAppointment(String patientName, String timestamp){
        for (int i = 0; i < appointments.size(); i++) {
            if(appointments.get(i).getPatientName().equals(patientName)){
                appointments.get(i).setAppointment(timestamp);
            }
        }
    }
}