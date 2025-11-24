package snack.com.snack_backend.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import snack.com.snack_backend.Dto.UsuarioRequest;
import snack.com.snack_backend.Dto.UsuarioResponse;
import snack.com.snack_backend.Service.UsuarioService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class UsuarioController {
    
    private final UsuarioService usuarioService;

    @PostMapping("/registro")
    public ResponseEntity<?> Registro(@RequestBody UsuarioRequest request){
        try {
            UsuarioResponse response = usuarioService.CrearUsuario(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error al crear");
        }
    }
    
}
