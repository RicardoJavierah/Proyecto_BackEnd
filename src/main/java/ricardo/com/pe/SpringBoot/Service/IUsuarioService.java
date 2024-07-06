package ricardo.com.pe.SpringBoot.Service;

import ricardo.com.pe.SpringBoot.Model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario>lista();
    Usuario getUserById(int id);
    void createUsuario(Usuario usuario);
    void updateUsuario(int id,Usuario usuario);
    void deleteUsuario(int id);
    boolean validacionUsuario(Usuario usuario);
}
