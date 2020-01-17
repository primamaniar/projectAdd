package com.concretePage;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
    @Entity
    @Table(name="person")
    public class Person {
        @Id
        @Column(name="id")
        private int id;
        @Column(name="name")
        private String name;
        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

