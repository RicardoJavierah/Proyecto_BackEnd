package ricardo.com.pe.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardo.com.pe.SpringBoot.Model.bd.Plato;
import ricardo.com.pe.SpringBoot.Repository.PlatoRepository;

import java.util.List;

@Service
public class PlatoService implements IPlatoService{
    @Autowired
    private PlatoRepository platoRepository;


    @Override
    public List<Plato> listPlato() {
        return platoRepository.findAll();
    }
}
