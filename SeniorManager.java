import java.util.Date;
public abstract class SeniorManager extends Manager {  protected double Bonus;

    public SeniorManager(String id, String lastName, String firstName, String address, Date birthDate, String empId, String department, Date startD, double monthlySalary, double bonus) {
        super(id, lastName, firstName, address, birthDate, empId, department, startD, monthlySalary);
        Bonus = bonus;
    }
    @Override
    double Salary(){
        return this.MonthlySalary + this.Bonus;
    }


}
