package alisson.aulaspringdatajpa.repository;

import alisson.aulaspringdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
