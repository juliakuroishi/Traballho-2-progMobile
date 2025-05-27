package Entities;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
@Entity(
        foreignKeys = @ForeignKey(
                entity = EspecialidadeEntities.class,
                parentColumns = "id",
                childColumns = "idEspecialidade",
onDelete = ForeignKey.CASCADE //delete os médicos ao deletar especialidade
    ),
indices = {@Index(value = "idEspecialidade")} // necessário para chaves estrangeiras
)
public class MedicoEntities {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "idEspecialidade")
    int idEspecialidade;
    String nome;
    String telefone;
    String endereco;

    // construtor vazio:
    public MedicoEntities(){}

    // gets e sets
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Construtor sem id
    public MedicoEntities(int idEspecialidade, String nome, String telefone, String endereco) {
        this.idEspecialidade = idEspecialidade;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String toString() {
        return idEspecialidade + ": " + getNome() + ", telefone:" + getTelefone() + "/ endedreço: " + getEndereco();
    }
}
