package mx.edu.utez.examen1.models.productos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.examen1.models.transacciones.Transacciones;
import mx.edu.utez.examen1.models.usuarios.Usuarios;

import javax.persistence.*;

@Entity
@Table(name = "productos")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombrep;
    private String categoria;
    private String precio;
    private String disponibilidad;

    @OneToOne(mappedBy = "Productos", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    @JsonIgnore
    private Usuarios usuarios;
}
