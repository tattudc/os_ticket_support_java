
package persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Chamado;

/**
 *
 * @author Neto
 */
public class ChamadoDAO {
    private final Conexao con = new Conexao();
	
	private final String INSERTCHAMADO = "INSERT INTO CHAMADO (RESP_TECNICOS_ID, CLIENTES_ID, ASSUNTO, SITUACAO, DESCRICAO) VALUES (?,?,?,?,?)";
	private final String UPDATESITUACAO = "UPDATE CHAMADO SET SITUACAO = ? WHERE SITUACAO = ?";
	private final String DELETECHAMADO = "DELETE FROM CHAMADO WHERE id = ?";
	private final String LISTALLCHAMADO = "SELECT * FROM CHAMADO";

        	public boolean insertEmprestimo(Chamado c) {
		try {
			// CONECTA
			con.conecta();
			PreparedStatement preparaInstrucao;
			preparaInstrucao = con.getConexao().prepareStatement(INSERTCHAMADO);

			// SETA OS VALORES DA INSTRUCAO
			// OBS: PASSA OS PARAMETROS NA ORDEM DAS ? DA INSTRUCAO
			preparaInstrucao.setInt(1, c.getId_tecnico());
			preparaInstrucao.setInt(2, c.getId_cliente());
			preparaInstrucao.setString(3, c.getAssunto());
			preparaInstrucao.setBoolean(4, c.isSituacao());
                        preparaInstrucao.setString(5, c.getDescricao());

			// EXECUTA A INSTRUCAO
			preparaInstrucao.execute();

			// DESCONECTA
			con.desconecta();
			
			return true;

		} catch (SQLException sqlc) {
			return false;
		}
                
	}
        
                
                
}
