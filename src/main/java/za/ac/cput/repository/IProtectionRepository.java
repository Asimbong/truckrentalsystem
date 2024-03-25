package za.ac.cput.repository;

import za.ac.cput.domain.Protection;

import java.util.List;

/*Author:Ayanda Phumzile Khoza
  Student number:218057172
 Date:18 March 2024*/

public interface IProtectionRepository extends IRepository<Protection,String> {
    List<Protection> getAll();

}