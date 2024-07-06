package ricardo.com.pe.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricardo.com.pe.SpringBoot.Model.bd.Mesa;

import java.util.List;


public interface IMesaService {
    List<Mesa>listMesa();
}
