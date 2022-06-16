package models;

public class Salary {
    private Double valuerBrute;
    private Double valuerLiquid;
    private Double deduction;
    private Double aliquota;

    public Salary(Double valuerBrute) {
        this.setValuerBrute(valuerBrute);
    }

    public Double getValuerLiquid() {
        return valuerLiquid;
    }

    public Double getValuerBrute() {
        return valuerBrute;
    }

    public Double getDeduction() {
        return deduction;
    }

    public Double getAliquota() {
        return aliquota;
    }

    private void setAliquota() {
        if (4664.68 < valuerBrute) {
            this.aliquota = 27.5;
        } else if (3751.05 < valuerBrute) {
            this.aliquota = 22.5;
        } else if (2826.65 < valuerBrute) {
            this.aliquota = 15.0;
        } else if (1903.98 < valuerBrute) {
            this.aliquota = 7.5;
        } else {
            this.aliquota = 0.0;
        }
    }

    private void setValuerLiquid() {
        this.valuerLiquid = valuerBrute - deduction;
    }

    private void setDeduction() {
        this.deduction = (aliquota / 100) * valuerBrute;
    }

    public void setValuerBrute(Double valuerBrute) {
        this.valuerBrute = valuerBrute;
        this.setAliquota();        
        this.setDeduction();
        this.setValuerLiquid();

    }

    @Override
    public String toString() {
        return "SalaryBrute="+this.valuerBrute+ " | aliquota=" + this.aliquota + " | deduction=" + this.deduction + "| Salary Liquid=" + this.valuerLiquid + "\n";
    }

}
