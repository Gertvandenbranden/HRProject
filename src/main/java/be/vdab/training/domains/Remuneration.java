package be.vdab.training.domains;

abstract class Remuneration extends BaseDomain {

    protected Long cost;
    private Long salary;
    private Long insurance;
    private String gsm;


    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }


    public Long getInsurance() {
        return insurance;
    }

    public void setInsurance(Long insurance) {
        this.insurance = insurance;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }


}
