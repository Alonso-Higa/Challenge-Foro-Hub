package challenge.api.challenge.domain.topico;

import challenge.api.challenge.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private String mensaje;
    private String nombreDelCurso;
    private String titulo;
    private boolean activo;

    public Topico(Long id, Usuario usuario, String mensaje, String nombreDelCurso, String titulo) {
        this.id = id;
        this.usuario = usuario;
        this.mensaje = mensaje;
        this.nombreDelCurso = nombreDelCurso;
        this.titulo = titulo;
        this.activo = true;
    }
    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.nombreDelCurso() != null) {
            this.nombreDelCurso = datosActualizarTopico.nombreDelCurso();
        }
        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}
