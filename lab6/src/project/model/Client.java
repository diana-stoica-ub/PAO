package project.model;

import java.util.List;

public class Client {

    private String name;
    private List<Loan> loans;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", loans=" + loans +
                '}';
    }
}
