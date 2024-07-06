package ricardo.com.pe.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ricardo.com.pe.SpringBoot.Model.bd.Usuario;
import ricardo.com.pe.SpringBoot.Service.UsuarioService;

@RestController
@RequestMapping(value = "/api")
public class AuthController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/validation",method = RequestMethod.POST)
    public boolean validacionUsuario(@RequestBody Usuario usuario){
        return usuarioService.validacionUsuario(usuario);
    }

}
