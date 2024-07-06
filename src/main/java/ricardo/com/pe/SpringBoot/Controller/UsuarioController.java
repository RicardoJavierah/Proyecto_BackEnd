package ricardo.com.pe.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ricardo.com.pe.SpringBoot.Model.bd.Usuario;
import ricardo.com.pe.SpringBoot.Repository.UsuarioRepository;
import ricardo.com.pe.SpringBoot.Service.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<Usuario>list(){
       return usuarioService.lista();
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public Usuario getUserById(@PathVariable int id){
        return usuarioService.getUserById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/user/registrar",method = RequestMethod.POST)
    public void createUsuario(@RequestBody Usuario usuario) {
        usuarioService.createUsuario(usuario);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/user/actualizar/{id}",method = RequestMethod.PUT)
    public void updateUsuario(@PathVariable int id,@RequestBody Usuario usuario) {
        usuarioService.updateUsuario(id,usuario);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/user/eliminar/{id}",method = RequestMethod.DELETE)
    public void updateUsuario(@PathVariable int id) {
        usuarioService.deleteUsuario(id);
    }
}
