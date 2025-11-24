package snack.com.snack_backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import snack.com.snack_backend.Dto.UsuarioRequest;
import snack.com.snack_backend.Dto.UsuarioResponse;
import snack.com.snack_backend.Model.Usuario;
import snack.com.snack_backend.Repository.UsuarioRespository;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRespository respository;

    // Metodos que son Objetos Directos 
    // Se usan cuando se crea, calcula, ver estados entre otras
    public UsuarioResponse CrearUsuario(UsuarioRequest req){
        if (respository.existsByEmail(req.getEmail())) {
            throw new RuntimeException("Correo ya registrado");
        }
        Usuario usuario = new Usuario();
        usuario.setNombre(req.getNombre());
        usuario.setApellidos(req.getApellidos());
        usuario.setEmail(req.getEmail());
        usuario.setRol(req.getRol());
        usuario.setContrasena(req.getContrasena());
        usuario.setVerificado(false);

        Usuario guardar = respository.save(usuario);

        return new UsuarioResponse(
            guardar.getId(),
            guardar.getNombre(),
            guardar.getApellidos(),
            guardar.getEmail(),
            guardar.getRol(),
            guardar.getVerificado(),
            guardar.getContrasena(),
            "Usuario registrado exitosamente"
        );
    }

    public List<Usuario> Verificados() {
        return respository.findByVerificado(false);
    }

    // List
    // Se obtiene de manera de lista todos los datos presentes
    public List<Usuario> UsuariosDisponibles() {
        return respository.findAll();
    }

    // Optional
    // Se usan cuando no se tiene seguro si el usuario esta en la base de datos
    // puede retornar una respuesta o no
    public Optional<Usuario> Busqueda_Usuario(Long id) {
        return respository.findById(id);
    }

    // metodos void se usan cuando se realizan una accion que no requiere retorno
    // se usan para metodos como eliminar, actulizar, enviar etc
    public void eliminarUsuario(Long id) {
        respository.deleteById(id);
    }
}
