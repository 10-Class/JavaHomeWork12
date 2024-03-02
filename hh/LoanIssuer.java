package lesson10;

public class LoanIssuer {
    private String name;
    private boolean isLazy;
    private boolean isKind;

    public boolean issue(LoanTaker taker) {
        if (isLazy && taker.getAnnuaSalary() >= 20_000) {
            return true;
        }
        if (!isLazy && isKind && taker.getAnnuaSalary() >= 25_000 && taker.getAge() < 60) {
            return true;
        }
        if (!isLazy && !isKind && taker.getAnnuaSalary() >= 30_000 && taker.getAge() < 50) {
            return true;
        }
        return false;
    }

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public void setLazy(boolean lazy) {
        isLazy = lazy;
    }

    public boolean isKind() {
        return isKind;
    }

    public void setKind(boolean kind) {
        isKind = kind;
    }
}
