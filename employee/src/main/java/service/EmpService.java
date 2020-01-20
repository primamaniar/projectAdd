package service;

import com.employee.Employee;
import com.employee.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public interface EmpService {

     Employee getEmployeeById(String id);

    //for insertion in db
     void addEmp(Employee employee);
     void updateEmp(String id);
}
