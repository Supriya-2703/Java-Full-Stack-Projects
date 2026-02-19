package Hospital_Management_System;

class Patient {
	double CalculateBill() {
		return 0;
	}
}
class inpatient extends Patient{
	double RoomCharges;
	double TreatmentCharges;
	
	inpatient(double RoomCharges, double TreatmentCharges) {
		this.RoomCharges = RoomCharges;
		this.TreatmentCharges = TreatmentCharges;
	}
	double CalculateBill() {
		return RoomCharges + TreatmentCharges;
	}
}
class outpatient extends Patient{
	double ConsultationFee;
	
	outpatient(double CounsultationFee){
		this.ConsultationFee = CounsultationFee;
	}
	double CalculateBill() {
		return ConsultationFee;
	}
}
class emergencypatient extends Patient{
	double EmergencyFee;
	double TreatmentCharges;
	
	emergencypatient(double EmergencyFee, double TreatmentFee){
		this.EmergencyFee = EmergencyFee;
	}
	double CalculateBill() {
		return EmergencyFee + TreatmentCharges;
	}
}

class Hospital_Management_System {
	public static void main(String args[]) {
		Patient[] Patients = new Patient[3];
		
		Patients[0] = new inpatient(2000,3000);
		Patients[1] = new outpatient(4000);
		Patients[2] = new emergencypatient(5000,2000);
		
		for (int i=0;i<Patients.length;i++) {
			System.out.println("Patient " +(i + 1)+ " Bill is : " +Patients[i].CalculateBill());
		}
	}
} 