package project.model;

import java.util.List;

public class Loan {

    private List<Installment> installments;

    public List<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }
}
