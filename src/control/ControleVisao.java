/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.GenericDAO;
import domain.Cargo;
import domain.Funcionario;
import domain.Venda;
import vision.*;

/**
 *
 * @author gudeck
 */
public class ControleVisao {

    //Classes com singleton:
    //ControleDominio
    //DAOCliente
    //JDGBuscaCliente
    //JDGCadastroCliente
    //JDGConsultaCLiente
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        ControleVisao visaoCtrl = new ControleVisao();
        visaoCtrl.janelaPrincipal();

//        GenericDAO dao = new GenericDAO();
//
//        Funcionario funcionario = new Funcionario();
//        funcionario.setNome("Maria da Silva");
//        funcionario.setSalario(1200.00);
//        funcionario.setCargo(Cargo.VENDEDOR);
//        dao.create(funcionario);
//
//        Venda novaVenda = new Venda(funcionario, 200.0);
//        dao.create(novaVenda);
//
//        System.out.println("valor da comissão: "
//                + novaVenda.calculaComissao());
//
//        System.exit(0);

    }

    private ControleDominio dominioCtlr;
    private JFRPrincipal janelaPrincipal;

    public ControleVisao() {
        dominioCtlr = ControleDominio.getInstance();
    }

    public ControleDominio getControleDominio() {
        return dominioCtlr;
    }

    public void janelaPrincipal() {
        janelaPrincipal = new JFRPrincipal(this);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setResizable(false);
        janelaPrincipal.setSize(565, 327);
        janelaPrincipal.setVisible(true);
    }

    public void cadastrarFuncionario() {
        JDGCadastrarFuncionario cadastrarFuncionario = JDGCadastrarFuncionario.getInstance(janelaPrincipal, true, this);
        cadastrarFuncionario.setLocationRelativeTo(null);
        cadastrarFuncionario.setResizable(false);
        cadastrarFuncionario.setVisible(true);
    }
    
    public void calcularComissao() {
        JDGCalcularComissao calcularComissao = JDGCalcularComissao.getInstance(janelaPrincipal, true, this);
        calcularComissao.setLocationRelativeTo(null);
        calcularComissao.setResizable(false);
        calcularComissao.setVisible(true);
    }

    public Funcionario buscarFuncionario() {
        JDGBuscarFuncionario buscarFuncionario = JDGBuscarFuncionario.getInstance(janelaPrincipal, true, this);
        buscarFuncionario.setLocationRelativeTo(null);
        buscarFuncionario.setResizable(false);
        buscarFuncionario.setVisible(true);
        
        return buscarFuncionario.getObjetoFuncionario();
    }

}
