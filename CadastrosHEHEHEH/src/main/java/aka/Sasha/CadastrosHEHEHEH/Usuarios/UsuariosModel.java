package aka.Sasha.CadastrosHEHEHEH.Usuarios;

import aka.Sasha.CadastrosHEHEHEH.Atividades.AtividadesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity //
@Table(name = "tb_cadastro")
public class UsuariosModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String email;

    private String NumeroCelular;

    private int idade;

    //@ManyToOne Um usuário tem uma única atividade
    @ManyToOne
    @JoinColumn(name = "atividade_id") //chave estrangeira ou Foreing Key(fk)
    private AtividadesModel atividade;

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
