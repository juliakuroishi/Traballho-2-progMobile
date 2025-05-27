package Database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import Dao.EspecialidadeDao;
import Entities.EspecialidadeEntities;


@Database(entities = {EspecialidadeEntities.class}, version = 1)
public abstract class dataBaseEspecialidade extends RoomDatabase {

    private static dataBaseEspecialidade INSTANCE;

    public static dataBaseEspecialidade getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(
                    context.getApplicationContext(),
                    dataBaseEspecialidade.class,
                    "databaseEspe"
            ).allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

    public abstract EspecialidadeDao especialidadeDao();
}
