package lesson10;

//Кредитная заявка
public class LoanTaker {
    private int annuaSalary;
    private int age;
    private String name;

    public LoanTaker(int annuaSalary, int age, String name) {
        this.annuaSalary = annuaSalary;
        this.age = age;
        this.name = name;
    }

    public int getAnnuaSalary() {
        return annuaSalary;
    }

    public void setAnnuaSalary(int annuaSalary) {
        this.annuaSalary = annuaSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
