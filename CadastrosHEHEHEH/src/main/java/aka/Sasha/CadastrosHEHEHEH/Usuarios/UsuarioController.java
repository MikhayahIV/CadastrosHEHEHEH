package aka.Sasha.CadastrosHEHEHEH.Usuarios;

import aka.Sasha.CadastrosHEHEHEH.Usuarios.UsuariosModel;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    private UsuariosRepository usuariosRepository;

    @PostMapping
    public UsuariosModel criar(@RequestBody UsuariosModel usuario){
        return usuariosRepository.save(usuario);
    }

    @GetMapping
    public List<UsuariosModel> listar(){
        return usuariosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UsuariosModel> buscarPorId(@PathVariable Long id){
        return usuariosRepository.findById(id);
    }

    @PutMapping("/{id}")
    public UsuariosModel atualizar(@PathVariable Long id, @RequestBody UsuariosModel dados){
        return usuariosRepository.findById(id).map(usuario -> {
            usuario.setNome(dados.getNome());
            usuario.setEmail(dados.getEmail());
            usuario.setNumeroCelular(dados.getNumeroCelular());
            usuario.setIdade(dados.getIdade());
            usuario.setAtividade(dados.getAtividade());
            return usuariosRepository.save(usuario);
        }).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        usuariosRepository.deleteById(id);
    }

}
