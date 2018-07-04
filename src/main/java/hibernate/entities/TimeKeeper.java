package hibernate.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TIME_KEEPPER")
public class TimeKeeper {
    private static final String IN = "I";
    private static final String OUT = "O";

    private String timekeepperId;
    private Date dateTime;
    private Employee employee;
    private char inOut;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    @Column(name = "TIMEKEEPPER_ID",length = 30)

    public String getTimekeepperId() {
        return timekeepperId;
    }

    public void setTimekeepperId(String timekeepperId) {
        this.timekeepperId = timekeepperId;
    }

    @Column(name = "DATE_TIME",nullable = false)

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name =  "EMP_ID",nullable = false)

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Column(name = "IN_OUT",nullable = false,length = 1)

    public char getInOut() {
        return inOut;
    }

    public void setInOut(char inOut) {
        this.inOut = inOut;
    }
}
