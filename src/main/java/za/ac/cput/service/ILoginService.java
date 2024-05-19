package za.ac.cput.service;

import za.ac.cput.domain.Login;

import java.util.Set;

/**
 * ILoginService.java
 * Login service interface
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
public interface ILoginService extends IService<Login,Integer> {
    Login update(Login login);
    Set<Login> getAll();
}
