package Entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
@Entity
public class EspecialidadeEntities {

    @PrimaryKey(autoGenerate = true)
    int id;
    String descricao;

    // construtor vazio
    public EspecialidadeEntities(){}
    //construtor em si;
    public EspecialidadeEntities(String descricao){
        this.descricao = descricao;
    }
    public String toString() {
        return id + ": " + getDescricao();
    }

    // -------- getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // ------/getters e setters


}
