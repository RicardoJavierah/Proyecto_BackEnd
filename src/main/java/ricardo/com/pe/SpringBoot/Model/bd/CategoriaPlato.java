package ricardo.com.pe.SpringBoot.Model.bd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "tb_categoria")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class CategoriaPlato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private int id;
    @Column(name = "categoria")
    private String categoria;
}
