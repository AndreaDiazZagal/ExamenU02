package mx.edu.utez.examen1.services.productos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductosService {

    @Autowired
    private ProductosRepository repository;

}
