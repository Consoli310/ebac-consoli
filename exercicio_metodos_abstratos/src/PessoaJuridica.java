public class PessoaJuridica extends Pessoa {

    private int employees;

    public PessoaJuridica(String name, Double anualIncome, int employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public double payedTaxes(Double anualIncome) {
        double taxes;
        if (this.employees <= 10) {
            taxes = anualIncome * 0.16;
        } else {
            taxes = anualIncome * 0.14;
        }
        return taxes;
    }
}
