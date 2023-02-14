package mx.edu.utez.examen1.models.transacciones;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Transacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id",unique = true)
    @JoinColumn(name = "productos_id", referencedColumnName = "id", unique = true)
    @JoinColumn(name = "productos_id", nullable = false)
    private Productos productos;

}
