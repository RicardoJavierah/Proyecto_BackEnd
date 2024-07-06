package ricardo.com.pe.SpringBoot.Repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ricardo.com.pe.SpringBoot.Model.bd.Usuario;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    //ME SIRVE PARA MI VALIDACION Y BUSACAR EL USUARIO INGRESADO EN EL LOGIN
    @Query(value = "SELECT * FROM tb_usuario WHERE correo = :correo AND password = :password",nativeQuery = true)
    List<Usuario> findByCorreoAndPassword(@Param("correo") String correo,
                                          @Param("password") String password);
}
