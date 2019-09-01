package graphic;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MatricularWindow extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel lblCurso, lblProfessor, lblAluno, lblDisciplina;
    private JComboBox<String> cmbCurso, cmbProfessor, cmbAluno, cmbDisciplina;
    private JButton btnSalvar, btnCancelar;

    public MatricularWindow() {
        setLayout(null);
        setSize(750, 400);
        setResizable(false);
        setTitle(" Matricular");
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("icons/logo.png"));

        lblCurso = new JLabel("Curso");
        lblCurso.setBounds(35, 35, 90, 25);
        getContentPane().add(lblCurso);

        lblAluno = new JLabel("Professor");
        lblAluno.setBounds(35, 85, 90, 25);
        getContentPane().add(lblAluno);

        lblProfessor = new JLabel("Aluno");
        lblProfessor.setBounds(35, 135, 90, 25);
        getContentPane().add(lblProfessor);

        lblDisciplina = new JLabel("Disciplina");
        lblDisciplina.setBounds(35, 185, 90, 25);
        getContentPane().add(lblDisciplina);

        cmbCurso = new JComboBox<String>();
        cmbCurso.setBounds(100, 35, 300, 25);
        getContentPane().add(cmbCurso);

        cmbProfessor = new JComboBox<String>();
        cmbProfessor.setBounds(100, 85, 300, 25);
        getContentPane().add(cmbProfessor);

        cmbAluno = new JComboBox<String>();
        cmbAluno.setBounds(100, 135, 300, 25);
        getContentPane().add(cmbAluno);

        cmbDisciplina = new JComboBox<String>();
        cmbDisciplina.setBounds(100, 185, 300, 25);
        getContentPane().add(cmbDisciplina);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(220, 310, 115, 25);
        getContentPane().add(btnSalvar);

        btnCancelar = new JButton(new AbstractAction("Cancelar") {

            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnCancelar.setBounds(390, 310, 115, 25);
        getContentPane().add(btnCancelar);
    }

    public static void main(String[] args) {
        new MatricularWindow().setVisible(true);
    }
}