package cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.model.repository;

import cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.model.domain.Fruta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutaRepository extends CrudRepository<Fruta, Long> {

}
