package controller;

import com.mycompany.model.Usuarios;

import persistence.UsuariosDAO;

/**
 *essa classe contem o controlador de login
 * @author Eduardo
 */
public class LoginController {

    private final UsuariosDAO usuariosDAO;

    public LoginController() {
        this.usuariosDAO = new UsuariosDAO();
    }

    public Usuarios autenticarUsuario(String login, String senha) {
        // Apenas chama o método do DAO e retorna o resultado.
        // Toda a lógica de verificação e retorno de dados fica aqui.
        return usuariosDAO.autenticar(login, senha);
    }
}
