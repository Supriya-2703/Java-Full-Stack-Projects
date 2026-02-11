package Insurance_Management_System;

abstract class InsurancePolicy {
	String PolicyHolderName;
	double PolicyAmount;
	
	InsurancePolicy(String Name, double Amount) {
		PolicyHolderName = Name;
		PolicyAmount = Amount;
	}
	abstract double CalculatePremium();
	
	void DisplayPremium() {
		System.out.println("Policy Holder: " +PolicyHolderName);
		System.out.println("Policy Amount: " +PolicyAmount);
		System.out.println("Premium: " +CalculatePremium());
	}
}
class HealthInsurance extends InsurancePolicy {
	HealthInsurance(String Name, double Amount) {
		super(Name, Amount);
	}
	
	@Override
	double CalculatePremium() {
		return PolicyAmount * 0.06;
	}
}
class VehicleInsurance extends InsurancePolicy {
	VehicleInsurance(String Name, double Amount) {
		super(Name, Amount);
	}
	
	@Override
	double CalculatePremium() {
		return PolicyAmount * 0.06;
	}
}
class LifeInsurance extends InsurancePolicy {
	LifeInsurance(String Name, double Amount) {
		super(Name, Amount);
	}
	
	@Override
	double CalculatePremium() {
		return PolicyAmount * 0.10;
	}
}
class InsuranceManagementSystem {
	public static void main(String args[]) {
		InsurancePolicy Policy;
		
		Policy = new HealthInsurance("A",500000);
		Policy.DisplayPremium();
		
		Policy = new VehicleInsurance("B",800000);
		Policy.DisplayPremium();
		
		Policy = new LifeInsurance("C",1000000);
		Policy.DisplayPremium();
	}
}