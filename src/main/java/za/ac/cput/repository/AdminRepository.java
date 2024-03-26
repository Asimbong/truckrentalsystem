package za.ac.cput.repository;

import za.ac.cput.domain.Admin;

import java.util.ArrayList;
import java.util.List;
/**
 * AdminRepository.java
 * This is the repository program
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 22 March 2024
 */
public class AdminRepository implements IAdminRepository {
    private static IAdminRepository adminRepository = null;

    public List<Admin> adminList;

    private AdminRepository() {
        adminList = new ArrayList<Admin>();
    }

    public static IAdminRepository getRepository() {
        if (adminRepository == null) {
            adminRepository = new AdminRepository();
        }
        return adminRepository;
    }

    @Override
    public List<Admin> getAll() {
        return adminList;
    }

//    @Override
//    public Admin create(Admin admin) {
//        boolean success = adminList.add(admin);
//        if (success)
//            return admin;
//        return null;
//    }
    //or
@Override
public Admin create(Admin admin) {
    boolean success = adminList.add(admin);
    return success ? admin : null;
}

    @Override
    public Admin read(String id) {
        for (Admin admin : adminList) {
            if (admin.getAdminID().equals(id))
                return admin;
        }

        return null;
    }

    @Override
    public Admin update(Admin admin) {
        String adminID = admin.getAdminID();
        if (delete(adminID)) {
            if (adminList.add(admin))
                return admin;
            else
                return null;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Admin adminToDelete = read(id);
        if (adminToDelete == null)
            return false;
        return (adminList.remove(adminToDelete));
    }
}
