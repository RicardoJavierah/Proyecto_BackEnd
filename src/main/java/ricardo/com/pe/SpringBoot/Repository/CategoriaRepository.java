package ricardo.com.pe.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ricardo.com.pe.SpringBoot.Model.bd.CategoriaPlato;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaPlato,Integer> {
}
