package za.ac.cput.repository;

import za.ac.cput.domain.Protection;

import java.util.ArrayList;
import java.util.List;

/*Author:Ayanda Phumzile Khoza
  Student number:218057172
 Date:18 March 2024*/


public class ProtectionRepository implements IProtectionRepository {
    private static IProtectionRepository protectionRepository = null;

    private List<Protection> protectionList;

    private ProtectionRepository() {
        protectionList = new ArrayList<>();
    }

    public static IProtectionRepository getProtectionRepository() {
        if (protectionRepository == null) {
            protectionRepository = new ProtectionRepository();
        }
        return protectionRepository;
    }

    @Override
    public List<Protection> getAll() {
        return protectionList;
    }

    @Override
    public Protection create(Protection protection) {
        boolean success = protectionList.add(protection);
        if (success)
            return protection;
        return null;
    }

    @Override
    public Protection read(String id) {
        for (Protection protection : protectionList) {
            if (protection.getInsuranceId().equals(id))
                return protection;
        }
        return null;
    }

    @Override
    public Protection update(Protection protection) {
        String protectionName = protection.getInsuranceId();
        if (delete(protectionName)) {
            if (protectionList.add(protection))
                return protection;
            else
                return null;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Protection protectionToDelete = read(id);
        if (protectionToDelete == null)
            return false;
        return protectionList.remove(protectionToDelete);
    }
}
