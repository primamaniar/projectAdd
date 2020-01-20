package com.employee;
import org.hibernate.Session;
import org.hibernate.Criteria;

import org.hibernate.criterion.Restrictions;
import service.EmpService;

import java.util.ArrayList;
import java.util.List;

public class TestMain implements EmpService {

    Session session = HibernateUtil.getSessionFactory().openSession();
    @Override
    public Employee getEmployeeById(String id) {
        System.out.println("In second method");
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.eq("id", id));
        List<Employee> result= (List<Employee>) criteria.list();
        session.close();
        return result.get(0);
    }
    @Override
    public void addEmp(Employee employee) {
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        System.out.println("insertion done");
    }

    @Override
    public void updateEmp(String id) {
        session.beginTransaction();
        Employee emp=new Employee();
        emp.setId(id);
       emp.setName("Ruchit");
       emp.setDesignation("Architecture");
       emp.setDept("Custom");
       emp.setAge(25);
        session.update(emp);
        session.save(emp);
       // session.delete(emp);
        session.getTransaction().commit();
        session.close();
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        EmpService obj=new TestMain();



        Employee riya2 = new Employee();
        riya2.setId("7");
        riya2.setName("priya");
        riya2.setAge(23);
        riya2.setDesignation("Developer");
        riya2.setDept("IT");
       // System.out.println(obj.getEmployeeById("2"));
        System.out.println("Both task completed");
        //  obj.addEmp(riya2);
        obj.updateEmp("2");


    }

}
