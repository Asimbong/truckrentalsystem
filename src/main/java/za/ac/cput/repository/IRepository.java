package za.ac.cput.repository;
/**
 * IRepository.java
 * This is the repository interface
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 22 March 2024
 */
public interface IRepository <T, ID> {
    T create(T t);

    T read(ID id);

    T update(T t);

    boolean delete(ID id);
}
