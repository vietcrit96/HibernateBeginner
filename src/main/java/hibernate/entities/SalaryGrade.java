package hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SALARY_GRADE")
public class SalaryGrade {
    private int grade;
    private float lowSalary, highSalary;

    public SalaryGrade() {

    }
    public SalaryGrade(int grade,float lowSalary, float highSalary) {
        this.grade = grade;
        this.lowSalary = lowSalary;
        this.highSalary = highSalary;
    }

    @Id
    @Column(name = "GRADE",nullable = false)

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Column(name = "LOW_SALARY", nullable = false)

    public float getLowSalary() {
        return lowSalary;
    }

    public void setLowSalary(float lowSalary) {
        this.lowSalary = lowSalary;
    }

    @Column(name = "HIGH_SALARY",nullable = false)

    public float getHighSalary() {
        return highSalary;
    }

    public void setHighSalary(float highSalary) {
        this.highSalary = highSalary;
    }
}
