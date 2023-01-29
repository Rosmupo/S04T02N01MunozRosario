package cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.controller;

import cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.model.domain.Fruta;
import cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.model.services.FrutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("fruta")
public class FrutaController {

    @Autowired
    public FrutaService frutaService;

    @PostMapping("add")
    public ResponseEntity<Fruta> add(@RequestBody Fruta fruta){
        return new ResponseEntity<Fruta>(frutaService.add(fruta),null, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Fruta> update(@RequestBody Fruta fruta)  {
        return new ResponseEntity<Fruta>(frutaService.update(fruta),null, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {

        if(frutaService.delete(id)){
            return new ResponseEntity<String>("Se borro la fruta " + id,null, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("No se pudo eliminar la fruta " + id,null, HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Optional<Fruta>> getOne(@PathVariable long id) {
        return new ResponseEntity<Optional<Fruta>>(frutaService.getOne(id),null, HttpStatus.OK);

    }
    @GetMapping("/getAll")
    public ResponseEntity<ArrayList<Fruta>> getAll() {
        return new ResponseEntity<ArrayList<Fruta>>(frutaService.getAll(),null, HttpStatus.OK);
    }
}
