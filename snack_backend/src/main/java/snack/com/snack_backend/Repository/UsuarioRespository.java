package snack.com.snack_backend.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import snack.com.snack_backend.Model.Usuario;
import java.util.List;



@Repository
public interface UsuarioRespository extends JpaRepository <Usuario, Long>{
    Optional<Usuario> findById(Long id);
    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);
    List<Usuario> findByVerificado(boolean verificado);
}
