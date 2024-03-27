package za.ac.cput.repository;

import za.ac.cput.domain.LoginDetails;

import java.util.ArrayList;
import java.util.List;
/**
 * LoginDetailsRepository.java
 * This is the repository program
 * @aurthor Zukhanye Anele Mene (219404275)
 * Date: 23 March 2024
 */
public class LoginDetailsRepository implements ILoginDetailsRepository {
    private static ILoginDetailsRepository loginDetailsRepository = null;

    public ArrayList<LoginDetails> loginDetailsList;

    private LoginDetailsRepository() {

        loginDetailsList = new ArrayList<LoginDetails>();
    }

    public static ILoginDetailsRepository getRepository() {
        if (loginDetailsRepository == null) {
            loginDetailsRepository = new LoginDetailsRepository();
        }
        return loginDetailsRepository;
    }

    @Override
    public List<LoginDetails> getAll() {

        return loginDetailsList;
    }

    @Override
    public LoginDetails create(LoginDetails loginDetails) {
        boolean success = loginDetailsList.add(loginDetails);
        if (success)
            return loginDetails;
        return null;
    }

    @Override
    public LoginDetails read(String id) {
        for (LoginDetails loginDetails : loginDetailsList) {
            if (loginDetails.getUsername().equals(id))
                return loginDetails;
        }

        return null;
    }

    @Override
    public LoginDetails update(LoginDetails loginDetails) {
        String logins = loginDetails.getUsername();
        if (delete(logins)) {
            if (loginDetailsList.add(loginDetails))
                return loginDetails;
            else
                return null;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        LoginDetails loginsDetailsToDelete = read(id);
        if (loginsDetailsToDelete == null)
            return false;
        return (loginDetailsList.remove(loginsDetailsToDelete));
    }
}


