package snack.com.snack_backend.Model;

import jakarta.persistence.*;
import lombok.*;
import snack.com.snack_backend.Enum.Rol;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Usuarios")
public class Usuario {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidos;
    private String contrasena;
     private String email;

    private Boolean verificado = false;
    //en la base de datos hara que el rol se guarde en formato string y no 0 o 1
    @Enumerated(EnumType.STRING)
    private Rol rol;
}
