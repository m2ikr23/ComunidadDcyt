package comunes;

import java.util.HashMap;
import dto.Usuario;

public abstract interface Contexto
{
  public static final String ID_CONTEXTO = "CONTEXTO";
  
  public abstract Usuario getUsuarioActual();
  
  public abstract void setUsuarioActual(Usuario paramUsuario);
  
  public abstract HashMap getDatosAplicacion();
}
