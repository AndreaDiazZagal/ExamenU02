package mx.edu.utez.examen1.services.usuarios;

import mx.edu.utez.examen1.models.productos.Productos;
import mx.edu.utez.examen1.models.usuarios.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UsuariosService {
    @Autowired
    private UsuariosRepository repository;

    //Servicio para obtener todos los registros de categories
    @Transactional(readOnly = true)
    public CustomResponse<List<Productos>> getAll(){
        return new CustomResponse<>(
                this.repository.findAll(),
                false,
                200,
                "Ok"
        );
    }
}
