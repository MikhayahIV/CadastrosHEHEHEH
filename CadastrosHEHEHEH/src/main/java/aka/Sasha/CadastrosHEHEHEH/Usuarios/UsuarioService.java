package aka.Sasha.CadastrosHEHEHEH.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class UsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public UsuariosModel criar(UsuariosModel usuario) {
        return usuariosRepository.save(usuario);
    }

    public List<UsuariosModel> listar() {
        return usuariosRepository.findAll();
    }

    public Optional<UsuariosModel> buscarPorId(Long id) {
        return usuariosRepository.findById(id);
    }

    public UsuariosModel atualizar(Long id, UsuariosModel dados) {
        return usuariosRepository.findById(id).map(usuario -> {
            usuario.setNome(dados.getNome());
            usuario.setEmail(dados.getEmail());
            usuario.setNumeroCelular(dados.getNumeroCelular());
            usuario.setIdade(dados.getIdade());
            usuario.setAtividade(dados.getAtividade());
            return usuariosRepository.save(usuario);
        }).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public void deletar(Long id) {
        usuariosRepository.deleteById(id);
    }

}
