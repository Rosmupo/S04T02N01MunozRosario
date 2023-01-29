package cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Frutas")
public class Fruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private String nombre;
    private int cantidadQuilos;

    public Fruta(){}

    public Fruta(long id, String nombre, int cantidadQuilos) {

        this.id = id;
        this.nombre = nombre;
        this.cantidadQuilos = cantidadQuilos;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadQuilos() {
        return cantidadQuilos;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadQuilos(int cantidadQuilos) {
        this.cantidadQuilos = cantidadQuilos;
    }

}
