package repository;

import java.sql.SQLException;

public interface BaseRepository<T> {
    T Create(T t) throws SQLException;

    T Read(T t) throws SQLException;

    void Update(T t) throws SQLException;

    void Delete(T t) throws SQLException;

}
