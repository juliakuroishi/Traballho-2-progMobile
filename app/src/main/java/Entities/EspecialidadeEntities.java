package Entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
@Entity
public class EspecialidadeEntities {
    @PrimaryKey(autoGenerate = true)
    int id;
    String descricao;
}
