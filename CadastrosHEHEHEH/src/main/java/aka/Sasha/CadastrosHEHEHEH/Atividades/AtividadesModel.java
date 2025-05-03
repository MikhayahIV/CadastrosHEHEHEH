package aka.Sasha.CadastrosHEHEHEH.Atividades;

import aka.Sasha.CadastrosHEHEHEH.Usuarios.UsuariosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_Atividades")
public class AtividadesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //@OneToMany uma atividade vai ter vários usuários
    @OneToMany(mappedBy = "atividade")
    private List<UsuariosModel> usuarios;



}
