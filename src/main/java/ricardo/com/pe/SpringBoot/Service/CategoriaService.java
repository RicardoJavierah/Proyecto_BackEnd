package ricardo.com.pe.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardo.com.pe.SpringBoot.Model.bd.CategoriaPlato;
import ricardo.com.pe.SpringBoot.Repository.CategoriaRepository;

import java.util.List;

@Service
public class CategoriaService implements ICategoria{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaPlato> listaCategoria() {
       return categoriaRepository.findAll();
    }
}
