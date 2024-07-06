package ricardo.com.pe.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ricardo.com.pe.SpringBoot.Model.bd.Mesa;
import ricardo.com.pe.SpringBoot.Service.MesaService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @RequestMapping(value = "/mesas", method = RequestMethod.GET)
    public List<Mesa> list(){
        return mesaService.listMesa();
    }
}
