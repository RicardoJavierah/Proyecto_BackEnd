package ricardo.com.pe.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardo.com.pe.SpringBoot.Model.bd.Usuario;
import ricardo.com.pe.SpringBoot.Repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> lista() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUserById(int id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void createUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void updateUsuario(int id,Usuario usuario) {
        Usuario userFromDB= usuarioRepository.findById(id).orElse(null);
        userFromDB.setNombreUsuario(usuario.getNombreUsuario());
        userFromDB.setPrimerApellido(usuario.getPrimerApellido());
        userFromDB.setSegundoApellido(usuario.getSegundoApellido());
        userFromDB.setDni(usuario.getDni());
        userFromDB.setCorreo(usuario.getCorreo());
        userFromDB.setCelular(usuario.getCelular());

        usuarioRepository.save(userFromDB);
    }

    @Override
    public void deleteUsuario(int id) {
        Usuario userFromDB= usuarioRepository.findById(id).orElse(null);
        usuarioRepository.delete(userFromDB);
    }

    @Override
    public boolean validacionUsuario(Usuario usuario) {
        List<Usuario>usuarioFromBd = usuarioRepository.findByCorreoAndPassword(usuario.getCorreo(),usuario.getPassword());
            if (usuarioFromBd.isEmpty()){
                return false;
            }else {
                return true;
            }
    }
}
