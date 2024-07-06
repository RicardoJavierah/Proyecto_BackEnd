package ricardo.com.pe.SpringBoot.Model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_plato")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plato")
    private int id;
    private String nombre;
    private double precio;
    private boolean disponible;
    private String descripcion;
    private double grasa;
    private double azucar;
    private double proteina;
    private double sal;
    private double fibra;
    private String vitamina;
    private String mineral;
    private String alergeno;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_categoria")
    private CategoriaPlato categoriaPlato;

/*
* id_plato INT AUTO_INCREMENT NOT NULL,
id_categoria INT NOT NULL,
nombre VARCHAR(40) NOT NULL,
precio DECIMAL(6,2) NOT NULL,
disponible BOOLEAN NOT NULL,
descripcion VARCHAR(250) NOT NULL,
grasa DECIMAL(5,2) NOT NULL,
azucar DECIMAL(5,2)NOT NULL,
proteina DECIMAL(5,2) NOT NULL,
sal DECIMAL(5,2) NOT NULL,
fibra DECIMAL(5,2) NOT NULL,
vitamina VARCHAR(15) NOT NULL,
mineral VARCHAR(15)NOT NULL,
alergeno VARCHAR(60) NOT NULL,
PRIMARY KEY(id_plato),
FOREIGN KEY(id_categoria) REFERENCES tb_categoria(id_categoria)*/
}
