package com.mycompany.crundconroles.logica;

import com.mycompany.crundconroles.logica.Rol;
import com.mycompany.crundconroles.logica.Usuario;
import com.mycompany.crundconroles.persistencia.ControladoraPersistencia;

import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

  public Usuario validarUsuario(String usuario, String contrasenia) {
      //String mensaje="";
      Usuario usr = null;
    List<Usuario> listaUsuarios = controlPersis.traerUsuarios();

    for (Usuario usu : listaUsuarios) {
        if (usu.getNombreUsuario().equals(usuario)) {
            if (usu.getContrasenia().equals(contrasenia)) {
                //mensaje = "usuario y contraseña correctos. bienvenidos";
                usr=usu;
                return usr;
            } else {
                //mensaje = "Contraseña incorrecta";
                usr=null;
                return usr;
                
            }
        
        }
        else{
            //mensaje = "usuario no encontrado"
            //return mensaje;
                   usr=null;
                //return usr;
        }
    }
    return usr;
}

    public List<Usuario> traerUsuarios() {
return controlPersis.traerUsuarios();
    }

    public List<Rol> traerRoles() {
  return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String contra, String rolRecibido) {
        Usuario usu = new Usuario ();
        usu.setNombreUsuario(usuario);
        usu.setContrasenia(contra);
        
        Rol rolEncontrado = new Rol ();
        rolEncontrado = this.traerRol(rolRecibido);
   
        if(rolEncontrado !=null){
             usu.setUnRol(rolEncontrado);
        }
        int id = this.buscarUltimaIdUsuario();
        usu.setId(id+1);
        controlPersis.crearUsuario(usu);
    }

    private Rol traerRol(String rolRecibido) {
        List<Rol>listaRoles=  controlPersis.traerRoles();
        
        for (Rol rol : listaRoles) {
            if (rol.getNombreRol().equals(rolRecibido)) {
                return rol;
    }
}
        return null;
    }

    private int buscarUltimaIdUsuario() {
      List<Usuario> listaUsuario = this.traerUsuarios();
      Usuario usu =listaUsuario.get(listaUsuario.size()-1);
     return  usu.getId();

    }

    public void borrarUsuario(int id_usuario) {
   controlPersis.borrarUsuario(id_usuario);

    }

    public Usuario traerUsuario(int id_usuario) {
return controlPersis.traerUsuario(id_usuario);
    }
 public void editarUsuarios(Usuario usu, String usuario, String contra, String rol) {
    usu.setNombreUsuario(usuario);
    usu.setContrasenia(contra);
     
    Rol rolEncontrado = this.traerRol(rol);
    if (rolEncontrado != null) {
        usu.setUnRol(rolEncontrado);
    }
    
    controlPersis.editarUsuarios(usu);
}
}
   

