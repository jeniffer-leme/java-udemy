package framework.dao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario(13);
        usuario.setNome("Usuário 13");
        usuario.setSenha("1313");
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
//        usuarioDAO.insert(usuario);
        
//        usuario.setNome("Usuário 13 13 13");
//        usuario.setSenha("3131");
//        usuarioDAO.update(usuario);
        
//        usuarioDAO.delete(usuario);
        
        
        Usuario usuario2 = new Usuario(2);
        usuario2.setNome("Usuário 2");
        usuario2.setSenha("0202");
        
        Usuario usuario3 = new Usuario(4);
        usuario3.setNome("Usuário 4");
        usuario3.setSenha("0404");
        
        Usuario usuario4 = new Usuario(14);
        usuario4.setNome("Usuário 14");
        usuario4.setSenha("1414");
        
        Usuario usuario5 = new Usuario(22);
        usuario5.setNome("Usuário 22");
        usuario5.setSenha("2222");
        
        Usuario usuario6 = new Usuario(25);
        usuario6.setNome("Usuário 25");
        usuario6.setSenha("2525");
//        
//        usuarioDAO.insert(usuario2);
//        usuarioDAO.insert(usuario3);
//        usuarioDAO.insert(usuario4);
//        usuarioDAO.insert(usuario5);

        ArrayList<Usuario> listaUsuario = usuarioDAO.getAll();
        System.out.println(listaUsuario);
        
        usuario = usuarioDAO.getUnique(4);
        System.out.println(usuario4);
        
        usuario = usuarioDAO.getUnique(2);
        System.out.println(usuario2);
    }
}
