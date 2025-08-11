package challenge.api.challenge.domain.topico;

public record DatosDetalleTopico(Long id, Long idUsuario, String mensaje, String nombreDelCurso, String titulo) {
    public DatosDetalleTopico(Topico topico) {
        this(topico.getId(), topico.getUsuario().getId(),topico.getMensaje(),topico.getNombreDelCurso(),topico.getTitulo());
    }
}
