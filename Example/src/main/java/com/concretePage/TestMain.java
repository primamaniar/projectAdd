package com.concretePage;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class TestMain {
     public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setName("Concretepage");

        Person person2=new Person();
        person2.setId(3);
        person.setName("Hibernate");

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        System.out.println("Done");

        Criteria criteria = session.createCriteria(Person.class);
        criteria.add(Restrictions.eq("id", 1));

        System.out.println("From DB: " + criteria.list());
        session.close();
    }
}
