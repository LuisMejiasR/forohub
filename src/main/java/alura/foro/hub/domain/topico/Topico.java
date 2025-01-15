package alura.foro.hub.domain.topico;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "topicos")
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private Integer status;
    private String autor;
    @Enumerated(EnumType.STRING)
    private Curso curso;

    public Topico() {
    }

    public Topico(Long id, String titulo, String mensaje, Integer status, String autor, Curso curso) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.status = status;
        this.autor = autor;
        this.curso = curso;
    }

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.status = datosRegistroTopico.status();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
