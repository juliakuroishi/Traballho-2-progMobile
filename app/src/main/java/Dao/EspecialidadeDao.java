package Dao;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import Entities.EspecialidadeEntities;

@Dao
public interface EspecialidadeDao {
    @Query("SELECT * FROM EspecialidadeEntities WHERE id=:id LIMIT 1")
    EspecialidadeEntities getId(int id);

    @Query("SELECT * FROM EspecialidadeEntities")
    List<EspecialidadeEntities> getAll();
    @Insert
    void insertAll(EspecialidadeEntities especialidadeEntities);

    @Update
    void update(EspecialidadeEntities especialidadeEntities);
    @Delete
    void delete(EspecialidadeEntities especialidadeEntities);
}

