package mx.edu.utez.examen1.models.usuarios;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.examen1.models.productos.Productos;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "people")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private String contraseña;
    private String lista;

    @OneToOne
    @JoinColumn(name = "productos_id", nullable = false, unique = true)
    private Productos productos;
}
