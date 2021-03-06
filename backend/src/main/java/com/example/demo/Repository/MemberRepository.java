package com.example.demo.Repository;


import com.example.demo.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController
@EnableJpaRepositories
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByUserid(String userid);
    Member findByUseridAndPassword(String userid , String password);
    Member findByName(String name);
}
