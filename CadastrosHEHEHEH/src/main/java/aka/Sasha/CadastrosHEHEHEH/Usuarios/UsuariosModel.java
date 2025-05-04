package aka.Sasha.CadastrosHEHEHEH.Usuarios;

import aka.Sasha.CadastrosHEHEHEH.Atividades.AtividadesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuariosModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String email;

    private String numeroCelular;

    private int idade;

    //@ManyToOne Um usuário tem uma única atividade
    @ManyToOne
    @JoinColumn(name = "atividade_id") //chave estrangeira ou Foreing Key(fk)
    private AtividadesModel atividade;




}

