package com.sameer.FirstApp.User;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.Id;

public interface UserRepository extends CrudRepository<UserRepository.User, String> {

    @Entity
    class User {
        @Id
        private String id;
        private String name;

        public User(){

        }
        public User(String id,String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
