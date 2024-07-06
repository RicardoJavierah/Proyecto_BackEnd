package ricardo.com.pe.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ricardo.com.pe.SpringBoot.Model.bd.CategoriaPlato;
import ricardo.com.pe.SpringBoot.Service.CategoriaService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(value = "/categoria", method = RequestMethod.GET)
    public List<CategoriaPlato> list(){
        return categoriaService.listaCategoria();
    }
}
