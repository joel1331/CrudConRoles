package com.mycompany.crundconroles.persistencia;


import com.mycompany.crundconroles.logica.Rol;
import com.mycompany.crundconroles.logica.Usuario;
import com.mycompany.crundconroles.persistencia.exceptions.NonexistentEntityException;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa =  new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        List<Usuario> listaUsuarios = usuJpa.findUsuarioEntities();
        return listaUsuarios;

    }

    public List<Rol> traerRoles() {

 return rolJpa.findRolEntities();
    }

    public void crearUsuario(Usuario usu) {
usuJpa.create(usu);

    }

    public void borrarUsuario(int id_usuario) {
        try {
            usuJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    public Usuario traerUsuario(int id_usuario) {
return usuJpa.findUsuario(id_usuario);

    }

    public void editarUsuarios(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

}
