public class PessoaFisica extends Pessoa {

    private Double healthExpenditures;

    public PessoaFisica(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double payedTaxes(Double anualIncome) {
        Double taxes;
        if (anualIncome < 20000) {
            taxes = anualIncome * 0.15;
        } else {
            taxes = anualIncome * 0.25;
        }
        if (this.healthExpenditures > 0) {
            taxes = taxes - (this.healthExpenditures * 0.5);
        }
        return taxes;
    }

}
