package ricardo.com.pe.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ricardo.com.pe.SpringBoot.Model.bd.Plato;
import ricardo.com.pe.SpringBoot.Service.PlatoService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class PlatoController {

    @Autowired
    private PlatoService platoService;

    @RequestMapping(value = "/platos",method = RequestMethod.GET)
    public List<Plato> list(){
        return platoService.listPlato();
    }
}
