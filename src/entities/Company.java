package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company(String name, Double anualIncome) {
		super(name, anualIncome);
	}

	@Override
	public double tax() {
		return 0;
	}
	
	
	
}
