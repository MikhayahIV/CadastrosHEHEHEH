package aka.Sasha.CadastrosHEHEHEH.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

import aka.Sasha.CadastrosHEHEHEH.Usuarios.UsuariosModel;

public interface UsuariosRepository extends JpaRepository<UsuariosModel,Long> {
    boolean existsByEmail(String email);
}
