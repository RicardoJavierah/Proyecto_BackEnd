package ricardo.com.pe.SpringBoot.Model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_categoria")
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaPlato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private int id;
    @Column(name = "categoria")
    private String categoria;
    /*
    * id_categoria INT AUTO_INCREMENT,
categoria VARCHAR(20),
PRIMARY KEY(id_categoria)*/
}
