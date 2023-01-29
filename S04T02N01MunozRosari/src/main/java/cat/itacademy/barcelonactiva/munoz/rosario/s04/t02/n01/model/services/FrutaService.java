package cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.model.domain.Fruta;
import cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.model.repository.FrutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class FrutaService {
    @Autowired
    FrutaRepository frutaRepository;

    public Fruta add(Fruta fruta){
        return frutaRepository.save(fruta);
    }

    public Fruta update(Fruta fruta){
        return frutaRepository.save(fruta);
    }

    public boolean delete(long id){
        try{frutaRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public Optional<Fruta> getOne(long id){
        return frutaRepository.findById(id);
    }

    public ArrayList<Fruta> getAll(){
        return (ArrayList<Fruta>) frutaRepository.findAll();
    }

}
