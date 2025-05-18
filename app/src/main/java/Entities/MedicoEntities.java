package Entities;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
@Entity(
        foreignKeys = @ForeignKey(
                entity = EspecialidadeEntities.class,
                parentColumns = "id",
                childColumns = "idEspecialidade"

        )
)
public class MedicoEntities {
    @PrimaryKey(autoGenerate = true)
    int id;
    int idEspecialidade;
    String nome;
    String telefone;
    String endereco;
}
