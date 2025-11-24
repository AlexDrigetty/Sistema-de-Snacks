package snack.com.snack_backend.Dto;

import lombok.Data;
import snack.com.snack_backend.Enum.Rol;

@Data
public class UsuarioRequest {
    private String nombre;
    private String apellidos;
    private String email;
    private String contrasena;
    private Rol rol;
}