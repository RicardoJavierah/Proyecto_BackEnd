package ricardo.com.pe.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardo.com.pe.SpringBoot.Model.bd.Mesa;
import ricardo.com.pe.SpringBoot.Repository.MesaRepository;

import java.util.List;

@Service
public class MesaService implements IMesaService{

    @Autowired
    private MesaRepository mesaRepository;

    @Override
    public List<Mesa> listMesa() {
        return mesaRepository.findAll();
    }
}
