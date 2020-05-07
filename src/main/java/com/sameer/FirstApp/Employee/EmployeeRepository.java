package com.sameer.FirstApp.Employee;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.Id;

public interface EmployeeRepository extends CrudRepository<EmployeeRepository.Employee, String> {

    @Entity
    class Employee {
        @Id
        private String id;
        private String name;
        private String email;
        private String phone;

        public Employee() {

        }

        public Employee(String id, String name, String email, String phone, String age, String designation) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.age = age;
            this.designation = designation;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        private String age;
        private String designation;
    }
}
