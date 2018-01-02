package comunes;

import java.util.HashMap;
import dto.Usuario;

public class ContextoImpl
  implements Contexto
{
  private Usuario usuarioActual;
  private HashMap datosAplicacion = new HashMap();
  
  @Override
  public Usuario getUsuarioActual() {
    return this.usuarioActual;
  }
  
  @Override
  public void setUsuarioActual(Usuario usuario) {
    this.usuarioActual = usuario;
  }
  
  @Override
  public HashMap getDatosAplicacion() { return this.datosAplicacion; }
}
