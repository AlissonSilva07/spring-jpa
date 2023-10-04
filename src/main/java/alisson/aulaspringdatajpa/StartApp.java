package alisson.aulaspringdatajpa;

import alisson.aulaspringdatajpa.model.User;
import alisson.aulaspringdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Alisson");
        user.setUserName("tcctmm");
        user.setPassword("bojec157");

        repository.save(user);

        for(User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
