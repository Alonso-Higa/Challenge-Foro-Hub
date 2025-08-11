package challenge.api.challenge.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, Long idUsuario, String mensaje, String nombreDelCurso, String titulo) {

}
