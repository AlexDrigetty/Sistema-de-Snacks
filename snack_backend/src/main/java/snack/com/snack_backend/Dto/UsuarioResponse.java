package snack.com.snack_backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import snack.com.snack_backend.Enum.Rol;

@Data
@AllArgsConstructor
public class UsuarioResponse {
    private Long id;
    private String nombre;
    private String apellidos;
    private String email;
    private Rol rol;
    private Boolean verificado;
    private String contrasena;
    private String mensaje;
}
