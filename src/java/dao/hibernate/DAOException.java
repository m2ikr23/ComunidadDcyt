package dao.hibernate;

import java.io.PrintStream;
import java.io.PrintWriter;


public class DAOException
  extends RuntimeException
{
  private Throwable cause = null;
  


  public DAOException() {}
  


  public DAOException(String msg)
  {
    super(msg);
  }
  

  public DAOException(Throwable cause)
  {
    this.cause = cause;
  }
  

  public DAOException(String msg, Throwable cause)
  {
    super(msg);
    this.cause = cause;
  }
  

  @Override
  public Throwable getCause()
  {
    return this.cause;
  }
  




  @Override
  public String getMessage()
  {
    if (super.getMessage() != null) {
      return super.getMessage();
    }
    if (this.cause != null) {
      return this.cause.toString();
    }
    
    return null;
  }
  



  @Override
  public void printStackTrace()
  {
    printStackTrace(System.err);
  }
  


  public void printStackTrace(PrintStream out)
  {
    synchronized (out) {
      PrintWriter pw = new PrintWriter(out, false);
      printStackTrace(pw);
      
      pw.flush();
    }
  }
  



  public void printStackTrace(PrintWriter s)
  {
    super.printStackTrace(s);
    if (this.cause != null)
    {
      s.println("Caused by:");
      this.cause.printStackTrace(s);
    }
  }
}
