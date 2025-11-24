package snack.com.snack_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import snack.com.snack_backend.Model.Usuario;

public interface CarritoRepository extends JpaRepository<Usuario, Long> {
    
}
