package aka.Sasha.CadastrosHEHEHEH;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //
@Table(name = "tb_cadastro")
public class UsuariosModel {


    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String email;
    private String NumeroCelular;
    private int idade;

    public UsuariosModel() {

    }

    public UsuariosModel(String nome, String email, String NumeroCelular, int idade) {
        this.nome = nome;
        this.email = email;
        this.NumeroCelular = NumeroCelular;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCelular() {
        return NumeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.NumeroCelular = numeroCelular;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
