package mx.edu.utez.examen1.controllers.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-ventas/usuarios/")
@CrossOrigin(origins = {"*"})
public class UsuariosController {
    @Autowired
}
