package hibernate.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENT",uniqueConstraints = {@UniqueConstraint(columnNames = {"DEPT_NO"})})
public class Department {
    private int deptId;
    private String deptNo, deptName, location;
    private Set<Employee> employees = new HashSet<Employee>(0);

    public Department() {
    }
    public Department(Integer deptId, String deptName, String location){
        this.deptId = deptId;
        this.deptNo = "D" + this.deptId;
        this.deptName = deptName;
        this.location = location;
    }

    @Id
    @Column(name = "DEPT_ID")

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    @Column(name = "DEPT_NAME",nullable = false)

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    @Column(name = "LOCATION")

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "department")

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
