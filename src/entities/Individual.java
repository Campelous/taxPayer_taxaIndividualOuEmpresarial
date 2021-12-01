package entities;

public class Individual extends TaxPayer {
	
	public Individual(String name, Double anualIncome) {
		super(name, anualIncome);
	}

	private Double healthExpenditures;

	@Override
	public double tax() {
		return 0;
	}
	

}
