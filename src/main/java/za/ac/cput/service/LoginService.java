package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Login;
import za.ac.cput.repository.LoginRepository;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * LoginService.java
 * Login service class
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
@Service
public class LoginService implements ILoginService {
    private LoginRepository loginRepository;

    @Autowired
    LoginService (LoginRepository loginRepository){this.loginRepository = loginRepository;}
    @Override
    public Login create(Login login) {
        return loginRepository.save(login);
    }
    @Override
    public Login read(Integer customerId) {
        return this.loginRepository.findById(customerId).orElse(null);
    }
   @Override
    public Login update(Login login) {
        return loginRepository.save(login);
    }
    @Override

    public void delete(Integer customerId) {
        loginRepository.deleteById(customerId);
    }

    @Override
    public Set<Login> getAll() {
        return loginRepository.findAll().stream().collect(Collectors.toSet());
    }

}
