/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author Neto
 */
public class ChamadoDAO {
    private final Conexao con = new Conexao();
	
	private final String INSERTCHAMADO = "INSERT INTO CHAMADO (RESP_TECNICOS_id, CLIENTES_id, ASSUNTO, SITUACAO, DESCRICAO) VALUES (?,?,?,?,?)";
	private final String UPDATESITUACAO = "UPDATE CHAMADO SET SITUACAO = ? WHERE SITUACAO = ?";
	private final String DELETECHAMADO = "DELETE FROM CHAMADO WHERE id = ?";
	private final String LISTALLCHAMADO = "SELECT * FROM CHAMADO";

}
