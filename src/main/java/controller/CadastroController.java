
package controller;

import com.mycompany.model.Cadastro;
import persistence.CadastroDAO;

/**
 *essa classe contem o controlador de cadastro
 * @author Eduardo
 */
public class CadastroController {

    private CadastroDAO cadastroDAO;

    public CadastroController() {
        this.cadastroDAO = new CadastroDAO();
    }

    public boolean cadastrarNovoEpisodio(Cadastro cadastro) {
        // Validação da lógica de negócio.
        if (cadastro.getNomeEpisodio().isEmpty() || cadastro.getProdutor().isEmpty()) {
            return false;
        }

        try {
            cadastroDAO.salvar(cadastro);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
