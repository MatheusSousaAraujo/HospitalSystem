
package model.bo;
 
import java.util.ArrayList;

public class ClasseDadosGravacao {

    private static ClasseDadosGravacao uniqueinstance;
    public static ArrayList<Medicamento> listaMedicamento = new ArrayList<>();
    public static ArrayList<Laboratorio> listaLaboratorio = new ArrayList<>();
    public static ArrayList<Medico> listaMedico = new ArrayList<>();
    public static ArrayList<Enfermeiro> listaEnfermeiro = new ArrayList<>();
    public static ArrayList<Farmaceutico> listaFarmaceutico = new ArrayList<>();
    public static ArrayList<Acompanhante> listaAcompanhante = new ArrayList<>();
    public static ArrayList<Ala> listaAla = new ArrayList<>();
    public static ArrayList<Leito> listaLeito = new ArrayList<>();
    public static ArrayList<Fornecedor> listaFornecedor = new ArrayList<>();
    public static ArrayList<Exame> listaExame = new ArrayList<>();
    public static ArrayList<Consulta> listaConsulta = new ArrayList<>();
    public static ArrayList<Internacao> listaInternacao = new ArrayList<>();
    public static ArrayList<Jornada> listaJornada = new ArrayList<>();
    public static ArrayList<Lote> listaLote = new ArrayList<>();
    public static ArrayList<Paciente> listaPaciente = new ArrayList<>();
    public static ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    public static ArrayList<Prontuario> listaProntuario = new ArrayList<>();
    public static ArrayList<Quarto> listaQuarto = new ArrayList<>();
    public static ArrayList<Receita> listaReceita = new ArrayList<>();
    public static ArrayList<Usuario> listaUsuario= new ArrayList<>();
    
    

    private ClasseDadosGravacao() {
    }

    public static synchronized ClasseDadosGravacao getInstance() {

        if (uniqueinstance == null) {
            uniqueinstance = new ClasseDadosGravacao();
        }

        return uniqueinstance;
    }

}