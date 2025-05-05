package aka.Sasha.CadastrosHEHEHEH.Usuarios;

import aka.Sasha.CadastrosHEHEHEH.Usuarios.UsuarioService;
import aka.Sasha.CadastrosHEHEHEH.Usuarios.UsuariosModel;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public UsuariosModel criar(@RequestBody UsuariosModel usuario){
        return usuarioService.criar(usuario);
    }

    @GetMapping
    public List<UsuariosModel> listar(){
        return usuarioService.listar();
    }

    @GetMapping("/{id}")
    public Optional<UsuariosModel> buscarPorId(@PathVariable Long id){
        return usuarioService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public UsuariosModel atualizar(@PathVariable Long id, @RequestBody UsuariosModel dados){
        return usuarioService.atualizar(id, dados);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        usuarioService.deletar(id);
    }

}
