
import java.awt.Color;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowEvent;

import javax.sound.midi.Soundbank;
import javax.swing.DefaultListModel;

public class Tela extends javax.swing.JFrame {

    String Username = null, Password = null, senha = null, usuario = null, endereco = null, nomesdealunos = null, nomesdedisciplinas = null, nomesDeDocentes = null, nomesdeturmas = null;
    ImageIcon imagem = null;
    public static Escola escola;
    static int counterForPrevention = 0;
    static int counterForPreventionBX = 0;
    public static String baseAdress = "Trabalho-4-UNIDADE/src";

    int x = 0, m = 12345;
    static DefaultTableModel modelDocentes, modelAlunos, modelTurmas, modelDisciplinas;
    static DefaultListModel<String> listTurmas, listDisciplinas;
    static ArrayList<Integer> bufferForRemoval = new ArrayList<Integer>();
    static ArrayList<Integer> bufferForAdition = new ArrayList<Integer>();
    static ArrayList<Integer> bufferForRemovalBX = new ArrayList<Integer>();
    static ArrayList<Integer> bufferForAditionBX = new ArrayList<Integer>();
    //static DefaultTableModel bufferTable = new DefaultTableModel();
    //static DefaultTableModel bufferTableBX = new DefaultTableModel();
    static boolean isToListen = false;

    public Tela() {
        initComponents();
        TelaDocente.setVisible(false);
        TelaEstudante.setVisible(false);
        

    }

    protected void processWindowEvent(WindowEvent e) {
        if(e.getID() == WindowEvent.WINDOW_CLOSING) {
            escola.salvar();
        }
        super.processWindowEvent(e);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaLogin = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        BotaoAcessar = new javax.swing.JButton();
        T??tulo = new javax.swing.JLabel();
        Imagem = new javax.swing.JLabel();
        TelaDocente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BotoesLaterais = new javax.swing.JPanel();
        DeslizarMenu = new javax.swing.JLabel();
        Bot??oRetornarMenu = new javax.swing.JLabel();
        PainelMenu = new javax.swing.JPanel();
        BotaoMenuCadastro = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        BotaoMenuEditar = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        BotaoMenuRemover = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        BotaoMenuRelatorio = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        PainelSubmenu = new javax.swing.JPanel();
        SubmenuRemocao = new javax.swing.JPanel();
        BotaoRemoverAluno = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        BotaoRemoverDisciplinas = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        BotaoRemoverDocentes = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        BotaoRemoverTurmas = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        SubmenuCadastro = new javax.swing.JPanel();
        BotaoCadastrarTurmas = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotaoCadastrarDocentes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BotaoCadastrarAluno = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BotaoCadastrarDisciplinas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        SubmenuEditarDadosDaDisciplina = new javax.swing.JPanel();
        BotaoEditarGeralDisciplinas = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        BotaoEditarNotas = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        SubmenuEdicao = new javax.swing.JPanel();
        BotaoEditarTurmas = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        BotaoEditarDocentes = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        BotaoEditarAlunos = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        BotaoEditarDisciplinas = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        SubmenuRelatorio = new javax.swing.JPanel();
        BotaoRelatorioTurmas = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        BotaoRelatorioDocentes = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        BotaoRelatorioAluno = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        BotaoRelatorioDisciplinas = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        MiniTelas = new javax.swing.JPanel();
        CadastrarDisciplina = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        CaixaDeTextoDisciplina = new javax.swing.JTextField();
        BotaoConcluirCadastroDisciplinas = new javax.swing.JButton();
        ListaDeAlunos = new javax.swing.JScrollPane();
        ListaDiciplinasCadastrarDisciplinas = new javax.swing.JList<>();
        jLabel24 = new javax.swing.JLabel();
        CadastrarAluno = new javax.swing.JPanel();
        CaixaDeTextoCadastroNomeAluno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BotaoConcluirCadastroAluno = new javax.swing.JButton();
        CaixaDeTextoCadastroDataNascAluno = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        CaixaDeTextoMatriculaAluno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CadastrarDocente = new javax.swing.JPanel();
        CaixaDeTextoCadastroNomeDocente = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        BotaoConcluirCadastroDocente = new javax.swing.JButton();
        CaixaDeTextoCadastroDataNascDocente = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        CaixaDeTextoMatriculaDocente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CadastrarTurma = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        CaixaDeTextoCadastroTurma = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaTurmasCadastrarTurma = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        BotaoConcluirCadastroTurma = new javax.swing.JButton();
        EditarDisciplina = new javax.swing.JPanel();
        TabelaDisc1 = new javax.swing.JScrollPane();
        TabelaEditarDisciplinasDocente = new javax.swing.JTable();
        BarraDisciplinasCadastradas = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        BotaoSalvarEditacaoDisciplina = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        CaixaDeTextoEditarNomeDisciplina = new javax.swing.JTextField();
        BarraDocentesCadastrados1 = new javax.swing.JComboBox<>();
        BarraAlunosCadastradosDisciplinas = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        BotaoRemoverCoisasDaDisciplina = new javax.swing.JButton();
        TabelaDisc4 = new javax.swing.JScrollPane();
        TabelaEditarDisciplinasAluno = new javax.swing.JTable();
        EditarNotas = new javax.swing.JPanel();
        TabelaDisc3 = new javax.swing.JScrollPane();
        TabelaAlunosEditarNotas = new javax.swing.JTable();
        BarraDiciplinasEditarNota = new javax.swing.JComboBox<>();
        jLabel61 = new javax.swing.JLabel();
        BotaoSalvarEditacaoNotas = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        TebelaParaEditarNotas = new javax.swing.JTable();
        EditarAluno = new javax.swing.JPanel();
        BarraAlunosCadastradosAlunos = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        CaixaDeTextoNomeAlunoEditado = new javax.swing.JTextField();
        BotaoSalvarEditacaoAluno = new javax.swing.JButton();
        CaixaDeTextoEditarDataNascAluno = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        EditarAlunoMatricula = new javax.swing.JLabel();
        EditarDocente = new javax.swing.JPanel();
        BarraDocentesCadastrados = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        CaixaDeTextoNomeDocenteEditado = new javax.swing.JTextField();
        BotaoSalvarEditacaoDocente = new javax.swing.JButton();
        CaixaDeTextoEditarDataNascDocente = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        EditarDocentesMatricula = new javax.swing.JLabel();
        EditarTurma = new javax.swing.JPanel();
        BarraTurmasCadastradas = new javax.swing.JComboBox<>();
        InicializarBarras();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaEditarAlunosEmTurma = new javax.swing.JTable();
        jLabel66 = new javax.swing.JLabel();
        CaixaDeTextoNomeTurmaEditado = new javax.swing.JTextField();
        BotaoSalvarEditacaoTurma = new javax.swing.JButton();
        BotaoRemoverAlunoDaTurma = new javax.swing.JButton();
        BarraAlunosCadastradosTurmas = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        RemoverDisciplina = new javax.swing.JPanel();
        TabelaDisc2 = new javax.swing.JScrollPane();
        TabelaRemoverDisciplinas = new javax.swing.JTable();
        Bot??oRemoverDisciplinasDoSistema = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        RemoverAluno = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TabelaRemoverAlunos = new javax.swing.JTable();
        jLabel75 = new javax.swing.JLabel();
        Bot??oRemoverAlunoDoSistema = new javax.swing.JButton();
        RemoverDocente = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TabelaRemoverDocentes = new javax.swing.JTable();
        jLabel76 = new javax.swing.JLabel();
        Bot??oRemoverDocentesDoSistema = new javax.swing.JButton();
        RemoverTurma = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaRemoverTurmas = new javax.swing.JTable();
        jLabel74 = new javax.swing.JLabel();
        Bot??oRemoverTurmaDoSistema = new javax.swing.JButton();
        RelatorioDisciplina = new javax.swing.JPanel();
        TabelaDisc = new javax.swing.JScrollPane();
        TabelaRelatorioDisciplinas = new javax.swing.JTable();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        BotaoGerarRelatorioDisciplinas = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        RelatorioAluno = new javax.swing.JPanel();
        TabelaDoc2 = new javax.swing.JScrollPane();
        TabelaRelatorioAlunos = new javax.swing.JTable();
        BotaoGerarRelatorioAlunos = new javax.swing.JButton();
        RelatorioDocente = new javax.swing.JPanel();
        TabelaDoc = new javax.swing.JScrollPane();
        TabelaRelatorioDocentes = new javax.swing.JTable();
        BotaoGerarRelatorioDocentes = new javax.swing.JButton();
        RelatorioTurma = new javax.swing.JPanel();
        BotaoGerarRelatorioTurmas = new javax.swing.JButton();
        TabelaDoc1 = new javax.swing.JScrollPane();
        TabelaRelatorioTurma = new javax.swing.JTable();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TelaEstudante = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BotaoBoletim = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        BotaoDadosPessoais = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        MiniTelasAluno = new javax.swing.JPanel();
        MiniTelaDadosPessoais = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        EditarDadosPessoais = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        FotoDadosPessoais = new javax.swing.JLabel();
        NomeDoAluno = new javax.swing.JLabel();
        CursoDoAluno = new javax.swing.JLabel();
        DataNascDoAluno = new javax.swing.JLabel();
        AnoLetivoDoAluno = new javax.swing.JLabel();
        MiniTelaBoletim = new javax.swing.JPanel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BotaoSair1 = new javax.swing.JButton();
        ImagemDeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        TelaLogin.setBackground(new java.awt.Color(255, 255, 255));
        TelaLogin.setMinimumSize(new java.awt.Dimension(800, 600));
        TelaLogin.setOpaque(false);
        TelaLogin.setPreferredSize(new java.awt.Dimension(800, 600));
        TelaLogin.setLayout(null);

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairTelaLogin(evt);
            }
        });
        TelaLogin.add(jButton2);
        jButton2.setBounds(370, 360, 72, 23);

        BotaoAcessar.setBackground(new java.awt.Color(255, 255, 102));
        BotaoAcessar.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        BotaoAcessar.setText("Acessar");
        BotaoAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAcessarActionPerformed(evt);
            }
        });
        TelaLogin.add(BotaoAcessar);
        BotaoAcessar.setBounds(350, 280, 120, 40);

        T??tulo.setFont(new java.awt.Font("Algerian", 0, 65)); // NOI18N
        T??tulo.setText("Bem Vindo(a)");
        TelaLogin.add(T??tulo);
        T??tulo.setBounds(250, 170, 420, 60);

        Imagem.setFont(new java.awt.Font("Gadugi", 2, 12)); // NOI18N
        Imagem.setForeground(new java.awt.Color(204, 204, 204));
        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/wallpapersden.com_landscape-pixel-art_800x600.jpg"))); // NOI18N
        Imagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImagemMouseClicked(evt);
            }
        });
        TelaLogin.add(Imagem);
        Imagem.setBounds(0, 0, 800, 600);

        TelaDocente.setMinimumSize(new java.awt.Dimension(800, 600));
        TelaDocente.setOpaque(false);
        TelaDocente.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        TelaDocente.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 60);

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        TelaDocente.add(jPanel2);
        jPanel2.setBounds(0, 60, 800, 10);

        jPanel3.setBackground(new java.awt.Color(0, 178, 109));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        TelaDocente.add(jPanel3);
        jPanel3.setBounds(30, 270, 180, 330);

        BotoesLaterais.setBackground(new java.awt.Color(0, 204, 153));
        BotoesLaterais.setLayout(null);

        DeslizarMenu.setBackground(new java.awt.Color(0, 178, 109));
        DeslizarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-menu-30.png"))); // NOI18N
        DeslizarMenu.setText("B");
        DeslizarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeslizarMenuMouseClicked(evt);
            }
        });
        BotoesLaterais.add(DeslizarMenu);
        DeslizarMenu.setBounds(0, 0, 30, 30);

        Bot??oRetornarMenu.setText("&");
        Bot??oRetornarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bot??oRetornarMenuMouseClicked(evt);
            }
        });
        BotoesLaterais.add(Bot??oRetornarMenu);
        Bot??oRetornarMenu.setBounds(0, 36, 30, 30);

        TelaDocente.add(BotoesLaterais);
        BotoesLaterais.setBounds(0, 70, 30, 530);

        PainelMenu.setLayout(null);

        BotaoMenuCadastro.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoMenuCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoMenuCadastro(evt);
            }
        });
        BotaoMenuCadastro.setLayout(null);

        jLabel25.setBackground(new java.awt.Color(255, 102, 204));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-magazine-23.png"))); // NOI18N
        BotaoMenuCadastro.add(jLabel25);
        jLabel25.setBounds(20, 0, 30, 50);

        jLabel26.setBackground(new java.awt.Color(105, 160, 115));
        jLabel26.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("             Cadastrar");
        jLabel26.setOpaque(true);
        BotaoMenuCadastro.add(jLabel26);
        jLabel26.setBounds(0, 0, 180, 50);

        PainelMenu.add(BotaoMenuCadastro);
        BotaoMenuCadastro.setBounds(0, 0, 180, 50);

        BotaoMenuEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoMenuEditar(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(105, 160, 115));
        jLabel27.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("             Editar");
        jLabel27.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel27.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel27.setOpaque(true);

        javax.swing.GroupLayout BotaoMenuEditarLayout = new javax.swing.GroupLayout(BotaoMenuEditar);
        BotaoMenuEditar.setLayout(BotaoMenuEditarLayout);
        BotaoMenuEditarLayout.setHorizontalGroup(
            BotaoMenuEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoMenuEditarLayout.setVerticalGroup(
            BotaoMenuEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoMenuEditarLayout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelMenu.add(BotaoMenuEditar);
        BotaoMenuEditar.setBounds(0, 50, 180, 50);

        BotaoMenuRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoMenuRemover(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(105, 160, 115));
        jLabel28.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("             Remover");
        jLabel28.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel28.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel28.setOpaque(true);

        javax.swing.GroupLayout BotaoMenuRemoverLayout = new javax.swing.GroupLayout(BotaoMenuRemover);
        BotaoMenuRemover.setLayout(BotaoMenuRemoverLayout);
        BotaoMenuRemoverLayout.setHorizontalGroup(
            BotaoMenuRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoMenuRemoverLayout.setVerticalGroup(
            BotaoMenuRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoMenuRemoverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelMenu.add(BotaoMenuRemover);
        BotaoMenuRemover.setBounds(0, 100, 180, 50);

        BotaoMenuRelatorio.setPreferredSize(new java.awt.Dimension(180, 50));
        BotaoMenuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoMenuRelatorio(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(105, 160, 115));
        jLabel29.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("             Relat??rios ");
        jLabel29.setOpaque(true);

        javax.swing.GroupLayout BotaoMenuRelatorioLayout = new javax.swing.GroupLayout(BotaoMenuRelatorio);
        BotaoMenuRelatorio.setLayout(BotaoMenuRelatorioLayout);
        BotaoMenuRelatorioLayout.setHorizontalGroup(
            BotaoMenuRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BotaoMenuRelatorioLayout.setVerticalGroup(
            BotaoMenuRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoMenuRelatorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelMenu.add(BotaoMenuRelatorio);
        BotaoMenuRelatorio.setBounds(0, 150, 180, 50);

        TelaDocente.add(PainelMenu);
        PainelMenu.setBounds(30, 70, 180, 200);

        PainelSubmenu.setLayout(null);

        SubmenuRemocao.setLayout(null);

        BotaoRemoverAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoRemoverAluno(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(105, 160, 115));
        jLabel42.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("          Remover Alunos");
        jLabel42.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel42.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel42.setOpaque(true);

        javax.swing.GroupLayout BotaoRemoverAlunoLayout = new javax.swing.GroupLayout(BotaoRemoverAluno);
        BotaoRemoverAluno.setLayout(BotaoRemoverAlunoLayout);
        BotaoRemoverAlunoLayout.setHorizontalGroup(
            BotaoRemoverAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRemoverAlunoLayout.setVerticalGroup(
            BotaoRemoverAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoRemoverAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SubmenuRemocao.add(BotaoRemoverAluno);
        BotaoRemoverAluno.setBounds(0, 100, 180, 50);

        BotaoRemoverDisciplinas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoRemoverDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoRemoverDisciplinasMouseClicked(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(105, 160, 115));
        jLabel43.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("          Remover Disciplina");
        jLabel43.setOpaque(true);

        javax.swing.GroupLayout BotaoRemoverDisciplinasLayout = new javax.swing.GroupLayout(BotaoRemoverDisciplinas);
        BotaoRemoverDisciplinas.setLayout(BotaoRemoverDisciplinasLayout);
        BotaoRemoverDisciplinasLayout.setHorizontalGroup(
            BotaoRemoverDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRemoverDisciplinasLayout.setVerticalGroup(
            BotaoRemoverDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoRemoverDisciplinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SubmenuRemocao.add(BotaoRemoverDisciplinas);
        BotaoRemoverDisciplinas.setBounds(0, 150, 180, 50);

        BotaoRemoverDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoRemoverDocentes(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(105, 160, 115));
        jLabel44.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("          Remover Docentes");
        jLabel44.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel44.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel44.setOpaque(true);

        javax.swing.GroupLayout BotaoRemoverDocentesLayout = new javax.swing.GroupLayout(BotaoRemoverDocentes);
        BotaoRemoverDocentes.setLayout(BotaoRemoverDocentesLayout);
        BotaoRemoverDocentesLayout.setHorizontalGroup(
            BotaoRemoverDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRemoverDocentesLayout.setVerticalGroup(
            BotaoRemoverDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoRemoverDocentesLayout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SubmenuRemocao.add(BotaoRemoverDocentes);
        BotaoRemoverDocentes.setBounds(0, 50, 180, 50);

        BotaoRemoverTurmas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoRemoverTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoRemoverTurmas(evt);
            }
        });
        BotaoRemoverTurmas.setLayout(null);

        jLabel41.setBackground(new java.awt.Color(105, 160, 115));
        jLabel41.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("          Remover Turmas");
        jLabel41.setOpaque(true);
        BotaoRemoverTurmas.add(jLabel41);
        jLabel41.setBounds(0, 0, 180, 50);

        SubmenuRemocao.add(BotaoRemoverTurmas);
        BotaoRemoverTurmas.setBounds(0, 0, 180, 50);

        PainelSubmenu.add(SubmenuRemocao);
        SubmenuRemocao.setBounds(0, 0, 180, 200);

        SubmenuCadastro.setLayout(null);

        BotaoCadastrarTurmas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoCadastrarTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoCadastrarTurmas(evt);
            }
        });
        BotaoCadastrarTurmas.setLayout(null);

        jLabel18.setBackground(new java.awt.Color(255, 102, 204));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-magazine-23.png"))); // NOI18N
        BotaoCadastrarTurmas.add(jLabel18);
        jLabel18.setBounds(10, 0, 30, 50);

        jLabel3.setBackground(new java.awt.Color(105, 160, 115));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("          Cadastrar Turmas");
        jLabel3.setOpaque(true);
        BotaoCadastrarTurmas.add(jLabel3);
        jLabel3.setBounds(0, 0, 180, 50);

        SubmenuCadastro.add(BotaoCadastrarTurmas);
        BotaoCadastrarTurmas.setBounds(0, 0, 180, 50);

        BotaoCadastrarDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoCadastrarDocentes(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(105, 160, 115));
        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("          Cadastrar Docentes");
        jLabel5.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel5.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout BotaoCadastrarDocentesLayout = new javax.swing.GroupLayout(BotaoCadastrarDocentes);
        BotaoCadastrarDocentes.setLayout(BotaoCadastrarDocentesLayout);
        BotaoCadastrarDocentesLayout.setHorizontalGroup(
            BotaoCadastrarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoCadastrarDocentesLayout.setVerticalGroup(
            BotaoCadastrarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoCadastrarDocentesLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SubmenuCadastro.add(BotaoCadastrarDocentes);
        BotaoCadastrarDocentes.setBounds(0, 50, 180, 50);

        BotaoCadastrarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoCadastrarAluno(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(105, 160, 115));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("          Cadastrar Alunos");
        jLabel4.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel4.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout BotaoCadastrarAlunoLayout = new javax.swing.GroupLayout(BotaoCadastrarAluno);
        BotaoCadastrarAluno.setLayout(BotaoCadastrarAlunoLayout);
        BotaoCadastrarAlunoLayout.setHorizontalGroup(
            BotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoCadastrarAlunoLayout.setVerticalGroup(
            BotaoCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.getAccessibleContext().setAccessibleName("       Alunos");

        SubmenuCadastro.add(BotaoCadastrarAluno);
        BotaoCadastrarAluno.setBounds(0, 100, 180, 50);

        BotaoCadastrarDisciplinas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoCadastrarDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarDisciplinasMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(105, 160, 115));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("          Cadastrar Disciplinas ");
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout BotaoCadastrarDisciplinasLayout = new javax.swing.GroupLayout(BotaoCadastrarDisciplinas);
        BotaoCadastrarDisciplinas.setLayout(BotaoCadastrarDisciplinasLayout);
        BotaoCadastrarDisciplinasLayout.setHorizontalGroup(
            BotaoCadastrarDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BotaoCadastrarDisciplinasLayout.setVerticalGroup(
            BotaoCadastrarDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarDisciplinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SubmenuCadastro.add(BotaoCadastrarDisciplinas);
        BotaoCadastrarDisciplinas.setBounds(0, 150, 180, 50);

        PainelSubmenu.add(SubmenuCadastro);
        SubmenuCadastro.setBounds(0, 0, 180, 200);

        SubmenuEditarDadosDaDisciplina.setBackground(new java.awt.Color(105, 160, 115));
        SubmenuEditarDadosDaDisciplina.setLayout(null);

        BotaoEditarGeralDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoEditarGeralDisciplinas(evt);
            }
        });

        jLabel68.setBackground(new java.awt.Color(105, 160, 115));
        jLabel68.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("           Geral ");
        jLabel68.setOpaque(true);

        javax.swing.GroupLayout BotaoEditarGeralDisciplinasLayout = new javax.swing.GroupLayout(BotaoEditarGeralDisciplinas);
        BotaoEditarGeralDisciplinas.setLayout(BotaoEditarGeralDisciplinasLayout);
        BotaoEditarGeralDisciplinasLayout.setHorizontalGroup(
            BotaoEditarGeralDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoEditarGeralDisciplinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoEditarGeralDisciplinasLayout.setVerticalGroup(
            BotaoEditarGeralDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoEditarGeralDisciplinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SubmenuEditarDadosDaDisciplina.add(BotaoEditarGeralDisciplinas);
        BotaoEditarGeralDisciplinas.setBounds(0, 0, 180, 50);

        BotaoEditarNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoEditarNotas(evt);
            }
        });

        jLabel69.setBackground(new java.awt.Color(105, 160, 115));
        jLabel69.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("           Editar Notas ");
        jLabel69.setOpaque(true);

        javax.swing.GroupLayout BotaoEditarNotasLayout = new javax.swing.GroupLayout(BotaoEditarNotas);
        BotaoEditarNotas.setLayout(BotaoEditarNotasLayout);
        BotaoEditarNotasLayout.setHorizontalGroup(
            BotaoEditarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BotaoEditarNotasLayout.setVerticalGroup(
            BotaoEditarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoEditarNotasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SubmenuEditarDadosDaDisciplina.add(BotaoEditarNotas);
        BotaoEditarNotas.setBounds(0, 50, 180, 50);

        PainelSubmenu.add(SubmenuEditarDadosDaDisciplina);
        SubmenuEditarDadosDaDisciplina.setBounds(0, 0, 180, 200);

        SubmenuEdicao.setLayout(null);

        BotaoEditarTurmas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoEditarTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoEditarTurmas(evt);
            }
        });
        BotaoEditarTurmas.setLayout(null);

        jLabel36.setBackground(new java.awt.Color(105, 160, 115));
        jLabel36.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("           Editar Turmas");
        jLabel36.setOpaque(true);
        BotaoEditarTurmas.add(jLabel36);
        jLabel36.setBounds(0, 0, 180, 50);
        jLabel36.getAccessibleContext().setAccessibleName("          Editar Turmas");

        SubmenuEdicao.add(BotaoEditarTurmas);
        BotaoEditarTurmas.setBounds(0, 0, 180, 50);

        BotaoEditarDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoEditarDocentes(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(105, 160, 115));
        jLabel37.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("          Editar  Docentes");
        jLabel37.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel37.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel37.setOpaque(true);

        javax.swing.GroupLayout BotaoEditarDocentesLayout = new javax.swing.GroupLayout(BotaoEditarDocentes);
        BotaoEditarDocentes.setLayout(BotaoEditarDocentesLayout);
        BotaoEditarDocentesLayout.setHorizontalGroup(
            BotaoEditarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoEditarDocentesLayout.setVerticalGroup(
            BotaoEditarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoEditarDocentesLayout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SubmenuEdicao.add(BotaoEditarDocentes);
        BotaoEditarDocentes.setBounds(0, 50, 180, 50);

        BotaoEditarAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoEditarAlunos(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(105, 160, 115));
        jLabel38.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("           Editar Alunos");
        jLabel38.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel38.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel38.setOpaque(true);

        javax.swing.GroupLayout BotaoEditarAlunosLayout = new javax.swing.GroupLayout(BotaoEditarAlunos);
        BotaoEditarAlunos.setLayout(BotaoEditarAlunosLayout);
        BotaoEditarAlunosLayout.setHorizontalGroup(
            BotaoEditarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoEditarAlunosLayout.setVerticalGroup(
            BotaoEditarAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoEditarAlunosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SubmenuEdicao.add(BotaoEditarAlunos);
        BotaoEditarAlunos.setBounds(0, 100, 180, 50);

        BotaoEditarDisciplinas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoEditarDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoEditarDisciplinasMouseClicked(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(105, 160, 115));
        jLabel39.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("           Editar Disciplinas ");
        jLabel39.setOpaque(true);

        javax.swing.GroupLayout BotaoEditarDisciplinasLayout = new javax.swing.GroupLayout(BotaoEditarDisciplinas);
        BotaoEditarDisciplinas.setLayout(BotaoEditarDisciplinasLayout);
        BotaoEditarDisciplinasLayout.setHorizontalGroup(
            BotaoEditarDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoEditarDisciplinasLayout.setVerticalGroup(
            BotaoEditarDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoEditarDisciplinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SubmenuEdicao.add(BotaoEditarDisciplinas);
        BotaoEditarDisciplinas.setBounds(0, 150, 180, 50);

        PainelSubmenu.add(SubmenuEdicao);
        SubmenuEdicao.setBounds(0, 0, 180, 200);

        SubmenuRelatorio.setLayout(null);

        BotaoRelatorioTurmas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoRelatorioTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoRelatorioTurmas(evt);
            }
        });
        BotaoRelatorioTurmas.setLayout(null);

        jLabel46.setBackground(new java.awt.Color(105, 160, 115));
        jLabel46.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("          Relat??rio Turmas");
        jLabel46.setOpaque(true);
        BotaoRelatorioTurmas.add(jLabel46);
        jLabel46.setBounds(0, 0, 180, 50);

        SubmenuRelatorio.add(BotaoRelatorioTurmas);
        BotaoRelatorioTurmas.setBounds(0, 0, 180, 50);

        BotaoRelatorioDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoRelatorioDocentes(evt);
            }
        });

        jLabel47.setBackground(new java.awt.Color(105, 160, 115));
        jLabel47.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("         Relat??rio Docentes");
        jLabel47.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel47.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel47.setOpaque(true);

        javax.swing.GroupLayout BotaoRelatorioDocentesLayout = new javax.swing.GroupLayout(BotaoRelatorioDocentes);
        BotaoRelatorioDocentes.setLayout(BotaoRelatorioDocentesLayout);
        BotaoRelatorioDocentesLayout.setHorizontalGroup(
            BotaoRelatorioDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRelatorioDocentesLayout.setVerticalGroup(
            BotaoRelatorioDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoRelatorioDocentesLayout.createSequentialGroup()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SubmenuRelatorio.add(BotaoRelatorioDocentes);
        BotaoRelatorioDocentes.setBounds(0, 50, 180, 50);

        BotaoRelatorioAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoRelatorioAluno(evt);
            }
        });

        jLabel48.setBackground(new java.awt.Color(105, 160, 115));
        jLabel48.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("         Relat??rio Alunos");
        jLabel48.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel48.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel48.setOpaque(true);

        javax.swing.GroupLayout BotaoRelatorioAlunoLayout = new javax.swing.GroupLayout(BotaoRelatorioAluno);
        BotaoRelatorioAluno.setLayout(BotaoRelatorioAlunoLayout);
        BotaoRelatorioAlunoLayout.setHorizontalGroup(
            BotaoRelatorioAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        BotaoRelatorioAlunoLayout.setVerticalGroup(
            BotaoRelatorioAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoRelatorioAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SubmenuRelatorio.add(BotaoRelatorioAluno);
        BotaoRelatorioAluno.setBounds(0, 100, 180, 50);

        BotaoRelatorioDisciplinas.setPreferredSize(new java.awt.Dimension(0, 50));
        BotaoRelatorioDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoRelatorioDisciplinasMouseClicked(evt);
            }
        });

        jLabel49.setBackground(new java.awt.Color(105, 160, 115));
        jLabel49.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("         Relat??rio Disciplinas ");
        jLabel49.setOpaque(true);

        javax.swing.GroupLayout BotaoRelatorioDisciplinasLayout = new javax.swing.GroupLayout(BotaoRelatorioDisciplinas);
        BotaoRelatorioDisciplinas.setLayout(BotaoRelatorioDisciplinasLayout);
        BotaoRelatorioDisciplinasLayout.setHorizontalGroup(
            BotaoRelatorioDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BotaoRelatorioDisciplinasLayout.setVerticalGroup(
            BotaoRelatorioDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoRelatorioDisciplinasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SubmenuRelatorio.add(BotaoRelatorioDisciplinas);
        BotaoRelatorioDisciplinas.setBounds(0, 150, 180, 50);

        PainelSubmenu.add(SubmenuRelatorio);
        SubmenuRelatorio.setBounds(0, 0, 180, 200);

        TelaDocente.add(PainelSubmenu);
        PainelSubmenu.setBounds(30, 70, 180, 200);

        MiniTelas.setBackground(new java.awt.Color(228, 255, 255));
        MiniTelas.setMaximumSize(new java.awt.Dimension(590, 470));
        MiniTelas.setLayout(null);

        CadastrarDisciplina.setBackground(new java.awt.Color(228, 255, 255));
        CadastrarDisciplina.setMaximumSize(new java.awt.Dimension(590, 470));
        CadastrarDisciplina.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Nome da Disciplina");
        CadastrarDisciplina.add(jLabel19);
        jLabel19.setBounds(29, 37, 117, 20);
        CadastrarDisciplina.add(CaixaDeTextoDisciplina);
        CaixaDeTextoDisciplina.setBounds(29, 63, 117, 22);

        BotaoConcluirCadastroDisciplinas.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        BotaoConcluirCadastroDisciplinas.setText("Cadastrar");
        BotaoConcluirCadastroDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConcluirCadastroDisciplinasActionPerformed(evt);
            }
        });
        CadastrarDisciplina.add(BotaoConcluirCadastroDisciplinas);
        BotaoConcluirCadastroDisciplinas.setBounds(30, 420, 90, 30);

        ListaDeAlunos.setViewportView(ListaDiciplinasCadastrarDisciplinas);

        CadastrarDisciplina.add(ListaDeAlunos);
        ListaDeAlunos.setBounds(30, 130, 224, 280);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Disciplinas Dispon??veis");
        CadastrarDisciplina.add(jLabel24);
        jLabel24.setBounds(29, 103, 150, 20);

        MiniTelas.add(CadastrarDisciplina);
        CadastrarDisciplina.setBounds(0, 0, 590, 470);

        CadastrarAluno.setBackground(new java.awt.Color(228, 255, 255));
        CadastrarAluno.setMaximumSize(new java.awt.Dimension(590, 470));
        CadastrarAluno.setPreferredSize(new java.awt.Dimension(520, 390));

        jLabel7.setText("Nome");

        jLabel11.setText("Data de Nascimento");

        BotaoConcluirCadastroAluno.setText("Cadastrar");
        BotaoConcluirCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConcluirCadastroAlunoActionPerformed(evt);
            }
        });

        try {
            CaixaDeTextoCadastroDataNascAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Matr??cula");

        jLabel9.setText("ALUNOS");

        javax.swing.GroupLayout CadastrarAlunoLayout = new javax.swing.GroupLayout(CadastrarAluno);
        CadastrarAluno.setLayout(CadastrarAlunoLayout);
        CadastrarAlunoLayout.setHorizontalGroup(
            CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarAlunoLayout.createSequentialGroup()
                .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastrarAlunoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoConcluirCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CaixaDeTextoCadastroNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CaixaDeTextoCadastroDataNascAluno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(CaixaDeTextoMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CadastrarAlunoLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel9)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        CadastrarAlunoLayout.setVerticalGroup(
            CadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarAlunoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixaDeTextoCadastroNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixaDeTextoCadastroDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixaDeTextoMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(BotaoConcluirCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        MiniTelas.add(CadastrarAluno);
        CadastrarAluno.setBounds(0, 0, 590, 470);

        CadastrarDocente.setBackground(new java.awt.Color(228, 255, 255));
        CadastrarDocente.setMaximumSize(new java.awt.Dimension(590, 470));
        CadastrarDocente.setPreferredSize(new java.awt.Dimension(520, 390));

        jLabel30.setText("Nome");

        jLabel33.setText("Data de Nascimento");

        BotaoConcluirCadastroDocente.setText("Cadastrar");
        BotaoConcluirCadastroDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConcluirCadastroDocenteActionPerformed(evt);
            }
        });

        try {
            CaixaDeTextoCadastroDataNascDocente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel34.setText("Matr??cula");

        jLabel8.setText("DOCENTES");

        javax.swing.GroupLayout CadastrarDocenteLayout = new javax.swing.GroupLayout(CadastrarDocente);
        CadastrarDocente.setLayout(CadastrarDocenteLayout);
        CadastrarDocenteLayout.setHorizontalGroup(
            CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarDocenteLayout.createSequentialGroup()
                .addGroup(CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastrarDocenteLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoConcluirCadastroDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CaixaDeTextoCadastroNomeDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addGroup(CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CaixaDeTextoCadastroDataNascDocente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel34)
                            .addComponent(CaixaDeTextoMatriculaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CadastrarDocenteLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel8)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        CadastrarDocenteLayout.setVerticalGroup(
            CadastrarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarDocenteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixaDeTextoCadastroNomeDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixaDeTextoCadastroDataNascDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixaDeTextoMatriculaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(BotaoConcluirCadastroDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        MiniTelas.add(CadastrarDocente);
        CadastrarDocente.setBounds(0, 0, 590, 470);

        CadastrarTurma.setBackground(new java.awt.Color(228, 255, 255));
        CadastrarTurma.setMaximumSize(new java.awt.Dimension(590, 470));
        CadastrarTurma.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Nome da Turma:");
        CadastrarTurma.add(jLabel10);
        jLabel10.setBounds(20, 40, 110, 20);
        CadastrarTurma.add(CaixaDeTextoCadastroTurma);
        CaixaDeTextoCadastroTurma.setBounds(20, 70, 140, 22);

        jScrollPane3.setViewportView(ListaTurmasCadastrarTurma);

        CadastrarTurma.add(jScrollPane3);
        jScrollPane3.setBounds(20, 160, 230, 240);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Turmas Disponiveis");
        CadastrarTurma.add(jLabel12);
        jLabel12.setBounds(20, 130, 160, 20);

        BotaoConcluirCadastroTurma.setText("Cadastrar");
        BotaoConcluirCadastroTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConcluirCadastroTurmaActionPerformed(evt);
            }
        });
        CadastrarTurma.add(BotaoConcluirCadastroTurma);
        BotaoConcluirCadastroTurma.setBounds(90, 420, 90, 23);

        MiniTelas.add(CadastrarTurma);
        CadastrarTurma.setBounds(-1, -1, 590, 470);

        EditarDisciplina.setBackground(new java.awt.Color(228, 255, 255));
        EditarDisciplina.setMaximumSize(new java.awt.Dimension(590, 470));
        EditarDisciplina.setPreferredSize(new java.awt.Dimension(590, 470));

        TabelaEditarDisciplinasDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Docentes"
            }
        ));
        TabelaDisc1.setViewportView(TabelaEditarDisciplinasDocente);

        jLabel54.setText("Disciplinas");

        BotaoSalvarEditacaoDisciplina.setText("Salvar");
        BotaoSalvarEditacaoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarEditacaoDisciplinaActionPerformed(evt);
            }
        });

        jLabel56.setText("Nome:");

        jLabel57.setText("Professores Disponiveis");

        jLabel58.setText("Alunos Dispon??veis");

        BotaoRemoverCoisasDaDisciplina.setText("Remover");

        TabelaEditarDisciplinasAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alunos"
            }
        ));
        TabelaDisc4.setViewportView(TabelaEditarDisciplinasAluno);

        javax.swing.GroupLayout EditarDisciplinaLayout = new javax.swing.GroupLayout(EditarDisciplina);
        EditarDisciplina.setLayout(EditarDisciplinaLayout);
        EditarDisciplinaLayout.setHorizontalGroup(
            EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarDisciplinaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditarDisciplinaLayout.createSequentialGroup()
                        .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditarDisciplinaLayout.createSequentialGroup()
                                .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CaixaDeTextoEditarNomeDisciplina, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BarraDisciplinasCadastradas, javax.swing.GroupLayout.Alignment.LEADING, 0, 168, Short.MAX_VALUE))
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditarDisciplinaLayout.createSequentialGroup()
                                .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)))
                        .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel57)
                                .addComponent(BarraAlunosCadastradosDisciplinas, 0, 177, Short.MAX_VALUE)
                                .addComponent(BarraDocentesCadastrados1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel58)))
                    .addGroup(EditarDisciplinaLayout.createSequentialGroup()
                        .addComponent(BotaoRemoverCoisasDaDisciplina)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoSalvarEditacaoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EditarDisciplinaLayout.createSequentialGroup()
                        .addComponent(TabelaDisc1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TabelaDisc4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        EditarDisciplinaLayout.setVerticalGroup(
            EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarDisciplinaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BarraDisciplinasCadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BarraDocentesCadastrados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaDeTextoEditarNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BarraAlunosCadastradosDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabelaDisc1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TabelaDisc4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(EditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoRemoverCoisasDaDisciplina)
                    .addComponent(BotaoSalvarEditacaoDisciplina))
                .addContainerGap())
        );

        MiniTelas.add(EditarDisciplina);
        EditarDisciplina.setBounds(0, 0, 590, 470);

        EditarNotas.setBackground(new java.awt.Color(228, 255, 255));
        EditarNotas.setMaximumSize(new java.awt.Dimension(590, 470));
        EditarNotas.setPreferredSize(new java.awt.Dimension(590, 470));

        TabelaAlunosEditarNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alunos"
            }
        ));
        TabelaAlunosEditarNotas.setEnabled(false);
        TabelaDisc3.setViewportView(TabelaAlunosEditarNotas);

        jLabel61.setText("Disciplinas");

        BotaoSalvarEditacaoNotas.setText("Salvar");
        BotaoSalvarEditacaoNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarEditacaoNotasActionPerformed(evt);
            }
        });

        TebelaParaEditarNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1?? U ", "2?? U   ", "3?? U   ", "4?? U "
            }
        ));
        jScrollPane8.setViewportView(TebelaParaEditarNotas);

        javax.swing.GroupLayout EditarNotasLayout = new javax.swing.GroupLayout(EditarNotas);
        EditarNotas.setLayout(EditarNotasLayout);
        EditarNotasLayout.setHorizontalGroup(
            EditarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarNotasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(EditarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoSalvarEditacaoNotas)
                    .addComponent(jLabel61)
                    .addComponent(BarraDiciplinasEditarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EditarNotasLayout.createSequentialGroup()
                        .addComponent(TabelaDisc3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(146, 146, 146))
        );
        EditarNotasLayout.setVerticalGroup(
            EditarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarNotasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel61)
                .addGap(6, 6, 6)
                .addComponent(BarraDiciplinasEditarNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(EditarNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(TabelaDisc3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BotaoSalvarEditacaoNotas)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        MiniTelas.add(EditarNotas);
        EditarNotas.setBounds(0, 0, 590, 470);

        EditarAluno.setBackground(new java.awt.Color(228, 255, 255));
        EditarAluno.setMaximumSize(new java.awt.Dimension(590, 470));
        EditarAluno.setMinimumSize(new java.awt.Dimension(590, 470));

        jLabel53.setText(" Alunos");

        jLabel60.setText("Nome:");

        BotaoSalvarEditacaoAluno.setText("Salvar");

        try {
            CaixaDeTextoEditarDataNascAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel23.setText("Data: ");

        jLabel32.setText("Matr??cula:");

        EditarAlunoMatricula.setText("jLabel40");

        javax.swing.GroupLayout EditarAlunoLayout = new javax.swing.GroupLayout(EditarAluno);
        EditarAluno.setLayout(EditarAlunoLayout);
        EditarAlunoLayout.setHorizontalGroup(
            EditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarAlunoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(EditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CaixaDeTextoEditarDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EditarAlunoLayout.createSequentialGroup()
                        .addGroup(EditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarraAlunosCadastradosAlunos, 0, 163, Short.MAX_VALUE)
                            .addComponent(CaixaDeTextoNomeAlunoEditado)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(EditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(EditarAlunoMatricula)))
                    .addComponent(BotaoSalvarEditacaoAluno)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        EditarAlunoLayout.setVerticalGroup(
            EditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditarAlunoLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraAlunosCadastradosAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(EditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaDeTextoNomeAlunoEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarAlunoMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixaDeTextoEditarDataNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoSalvarEditacaoAluno)
                .addGap(240, 240, 240))
        );

        MiniTelas.add(EditarAluno);
        EditarAluno.setBounds(0, 0, 590, 470);

        EditarDocente.setBackground(new java.awt.Color(228, 255, 255));
        EditarDocente.setMaximumSize(new java.awt.Dimension(590, 470));
        EditarDocente.setMinimumSize(new java.awt.Dimension(590, 470));

        jLabel62.setText("Docentes");

        jLabel63.setText("Nome:");

        BotaoSalvarEditacaoDocente.setText("Salvar");
        BotaoSalvarEditacaoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarEditacaoDocenteActionPerformed(evt);
            }
        });

        try {
            CaixaDeTextoEditarDataNascDocente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel31.setText("Data:");

        jLabel35.setText("Matr??cula: ");

        EditarDocentesMatricula.setText("jLabel32");

        javax.swing.GroupLayout EditarDocenteLayout = new javax.swing.GroupLayout(EditarDocente);
        EditarDocente.setLayout(EditarDocenteLayout);
        EditarDocenteLayout.setHorizontalGroup(
            EditarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarDocenteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(EditarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CaixaDeTextoEditarDataNascDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSalvarEditacaoDocente)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EditarDocenteLayout.createSequentialGroup()
                        .addGroup(EditarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarraDocentesCadastrados, 0, 163, Short.MAX_VALUE)
                            .addComponent(CaixaDeTextoNomeDocenteEditado)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(EditarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditarDocentesMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        EditarDocenteLayout.setVerticalGroup(
            EditarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditarDocenteLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraDocentesCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(EditarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditarDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaDeTextoNomeDocenteEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarDocentesMatricula))
                .addGap(20, 20, 20)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CaixaDeTextoEditarDataNascDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(BotaoSalvarEditacaoDocente)
                .addGap(168, 168, 168))
        );

        MiniTelas.add(EditarDocente);
        EditarDocente.setBounds(0, 0, 590, 470);

        EditarTurma.setBackground(new java.awt.Color(228, 255, 255));
        EditarTurma.setMaximumSize(new java.awt.Dimension(590, 470));
        EditarTurma.setMinimumSize(new java.awt.Dimension(590, 470));

        jLabel55.setText("Turmas:");

        TabelaEditarAlunosEmTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alunos"
            }
        ));
        jScrollPane1.setViewportView(TabelaEditarAlunosEmTurma);

        jLabel66.setText("Nome");

        BotaoSalvarEditacaoTurma.setText("Salvar");
        BotaoSalvarEditacaoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarEditacaoTurmaActionPerformed(evt);
            }
        });

        BotaoRemoverAlunoDaTurma.setText("Remover");
        BotaoRemoverAlunoDaTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverAlunoDaTurmaActionPerformed(evt);
            }
        });

        BarraAlunosCadastradosTurmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel40.setText("Alunos");

        javax.swing.GroupLayout EditarTurmaLayout = new javax.swing.GroupLayout(EditarTurma);
        EditarTurma.setLayout(EditarTurmaLayout);
        EditarTurmaLayout.setHorizontalGroup(
            EditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarTurmaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(EditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditarTurmaLayout.createSequentialGroup()
                        .addComponent(BotaoRemoverAlunoDaTurma)
                        .addGap(77, 77, 77)
                        .addComponent(BotaoSalvarEditacaoTurma))
                    .addComponent(jLabel55)
                    .addComponent(BarraTurmasCadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EditarTurmaLayout.createSequentialGroup()
                        .addGroup(EditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaixaDeTextoNomeTurmaEditado, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(EditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarraAlunosCadastradosTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        EditarTurmaLayout.setVerticalGroup(
            EditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditarTurmaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraTurmasCadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(EditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaDeTextoNomeTurmaEditado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BarraAlunosCadastradosTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(EditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvarEditacaoTurma)
                    .addComponent(BotaoRemoverAlunoDaTurma))
                .addGap(90, 90, 90))
        );

        MiniTelas.add(EditarTurma);
        EditarTurma.setBounds(0, 0, 590, 470);

        RemoverDisciplina.setBackground(new java.awt.Color(228, 255, 255));
        RemoverDisciplina.setMaximumSize(new java.awt.Dimension(590, 470));
        RemoverDisciplina.setPreferredSize(new java.awt.Dimension(590, 470));

        TabelaRemoverDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplinas "
            }
        ));
        TabelaDisc2.setViewportView(TabelaRemoverDisciplinas);

        Bot??oRemoverDisciplinasDoSistema.setText("Remover");

        jLabel80.setText("Para remover uma disciplina, selecione-a(as).");

        javax.swing.GroupLayout RemoverDisciplinaLayout = new javax.swing.GroupLayout(RemoverDisciplina);
        RemoverDisciplina.setLayout(RemoverDisciplinaLayout);
        RemoverDisciplinaLayout.setHorizontalGroup(
            RemoverDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverDisciplinaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(RemoverDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bot??oRemoverDisciplinasDoSistema)
                    .addComponent(TabelaDisc2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        RemoverDisciplinaLayout.setVerticalGroup(
            RemoverDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverDisciplinaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(TabelaDisc2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bot??oRemoverDisciplinasDoSistema)
                .addContainerGap())
        );

        MiniTelas.add(RemoverDisciplina);
        RemoverDisciplina.setBounds(0, 0, 590, 470);

        RemoverAluno.setBackground(new java.awt.Color(228, 255, 255));
        RemoverAluno.setMaximumSize(new java.awt.Dimension(590, 470));
        RemoverAluno.setMinimumSize(new java.awt.Dimension(590, 470));

        TabelaRemoverAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alunos"
            }
        ));
        jScrollPane6.setViewportView(TabelaRemoverAlunos);

        jLabel75.setText("Para remover um aluno, selecione.");

        Bot??oRemoverAlunoDoSistema.setText("Remover");
        Bot??oRemoverAlunoDoSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot??oRemoverAlunoDoSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RemoverAlunoLayout = new javax.swing.GroupLayout(RemoverAluno);
        RemoverAluno.setLayout(RemoverAlunoLayout);
        RemoverAlunoLayout.setHorizontalGroup(
            RemoverAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverAlunoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(RemoverAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bot??oRemoverAlunoDoSistema)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        RemoverAlunoLayout.setVerticalGroup(
            RemoverAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RemoverAlunoLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bot??oRemoverAlunoDoSistema)
                .addGap(90, 90, 90))
        );

        MiniTelas.add(RemoverAluno);
        RemoverAluno.setBounds(0, 0, 590, 470);

        RemoverDocente.setBackground(new java.awt.Color(228, 255, 255));
        RemoverDocente.setMaximumSize(new java.awt.Dimension(590, 470));
        RemoverDocente.setMinimumSize(new java.awt.Dimension(590, 470));

        TabelaRemoverDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Docentes "
            }
        ));
        jScrollPane7.setViewportView(TabelaRemoverDocentes);

        jLabel76.setText("Para remover um docente, selecione.");

        Bot??oRemoverDocentesDoSistema.setText("Remover");
        Bot??oRemoverDocentesDoSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot??oRemoverDocentesDoSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RemoverDocenteLayout = new javax.swing.GroupLayout(RemoverDocente);
        RemoverDocente.setLayout(RemoverDocenteLayout);
        RemoverDocenteLayout.setHorizontalGroup(
            RemoverDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverDocenteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(RemoverDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bot??oRemoverDocentesDoSistema)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        RemoverDocenteLayout.setVerticalGroup(
            RemoverDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RemoverDocenteLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bot??oRemoverDocentesDoSistema)
                .addGap(90, 90, 90))
        );

        MiniTelas.add(RemoverDocente);
        RemoverDocente.setBounds(0, 0, 590, 470);

        RemoverTurma.setBackground(new java.awt.Color(228, 255, 255));
        RemoverTurma.setMaximumSize(new java.awt.Dimension(590, 470));
        RemoverTurma.setMinimumSize(new java.awt.Dimension(590, 470));

        TabelaRemoverTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turmas"
            }
        ));
        jScrollPane4.setViewportView(TabelaRemoverTurmas);

        jLabel74.setText("Para remover uma turma, selecione-a e aperte del.");

        Bot??oRemoverTurmaDoSistema.setText("Remover");
        Bot??oRemoverTurmaDoSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot??oRemoverTurmaDoSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RemoverTurmaLayout = new javax.swing.GroupLayout(RemoverTurma);
        RemoverTurma.setLayout(RemoverTurmaLayout);
        RemoverTurmaLayout.setHorizontalGroup(
            RemoverTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverTurmaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(RemoverTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bot??oRemoverTurmaDoSistema)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        RemoverTurmaLayout.setVerticalGroup(
            RemoverTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RemoverTurmaLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bot??oRemoverTurmaDoSistema)
                .addGap(90, 90, 90))
        );

        MiniTelas.add(RemoverTurma);
        RemoverTurma.setBounds(0, 0, 590, 470);

        RelatorioDisciplina.setBackground(new java.awt.Color(228, 255, 255));
        RelatorioDisciplina.setMaximumSize(new java.awt.Dimension(590, 470));
        RelatorioDisciplina.setPreferredSize(new java.awt.Dimension(590, 470));

        TabelaRelatorioDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Docentes", "Alunos", "Notas"
            }
        ));
        TabelaDisc.setViewportView(TabelaRelatorioDisciplinas);

        jLabel52.setText("Disciplinas");

        BotaoGerarRelatorioDisciplinas.setText("Gerar Relat??rio");
        BotaoGerarRelatorioDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGerarRelatorioDisciplinasActionPerformed(evt);
            }
        });

        jLabel13.setText("*O relat??rio ?? gerado para todas as disciplinas existentes.");

        javax.swing.GroupLayout RelatorioDisciplinaLayout = new javax.swing.GroupLayout(RelatorioDisciplina);
        RelatorioDisciplina.setLayout(RelatorioDisciplinaLayout);
        RelatorioDisciplinaLayout.setHorizontalGroup(
            RelatorioDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RelatorioDisciplinaLayout.createSequentialGroup()
                .addGroup(RelatorioDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RelatorioDisciplinaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(RelatorioDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(TabelaDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RelatorioDisciplinaLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(BotaoGerarRelatorioDisciplinas))
                    .addGroup(RelatorioDisciplinaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        RelatorioDisciplinaLayout.setVerticalGroup(
            RelatorioDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RelatorioDisciplinaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabelaDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoGerarRelatorioDisciplinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        MiniTelas.add(RelatorioDisciplina);
        RelatorioDisciplina.setBounds(0, 0, 590, 470);

        RelatorioAluno.setBackground(new java.awt.Color(228, 255, 255));
        RelatorioAluno.setMaximumSize(new java.awt.Dimension(590, 470));
        RelatorioAluno.setMinimumSize(new java.awt.Dimension(590, 470));
        RelatorioAluno.setLayout(null);

        TabelaRelatorioAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aluno", "Disciplinas", "Turmas"
            }
        ));
        TabelaDoc2.setViewportView(TabelaRelatorioAlunos);

        RelatorioAluno.add(TabelaDoc2);
        TabelaDoc2.setBounds(40, 30, 510, 354);

        BotaoGerarRelatorioAlunos.setText("Gerar Relat??rio");
        RelatorioAluno.add(BotaoGerarRelatorioAlunos);
        BotaoGerarRelatorioAlunos.setBounds(250, 400, 130, 23);

        MiniTelas.add(RelatorioAluno);
        RelatorioAluno.setBounds(0, 0, 590, 470);

        RelatorioDocente.setBackground(new java.awt.Color(228, 255, 255));
        RelatorioDocente.setMaximumSize(new java.awt.Dimension(590, 470));
        RelatorioDocente.setMinimumSize(new java.awt.Dimension(590, 470));

        TabelaRelatorioDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Docente", "Disciplina "
            }
        ));
        TabelaDoc.setViewportView(TabelaRelatorioDocentes);

        BotaoGerarRelatorioDocentes.setText("Gerar Relat??rio");

        javax.swing.GroupLayout RelatorioDocenteLayout = new javax.swing.GroupLayout(RelatorioDocente);
        RelatorioDocente.setLayout(RelatorioDocenteLayout);
        RelatorioDocenteLayout.setHorizontalGroup(
            RelatorioDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RelatorioDocenteLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(TabelaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(RelatorioDocenteLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(BotaoGerarRelatorioDocentes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RelatorioDocenteLayout.setVerticalGroup(
            RelatorioDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RelatorioDocenteLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(TabelaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoGerarRelatorioDocentes)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        MiniTelas.add(RelatorioDocente);
        RelatorioDocente.setBounds(0, 0, 590, 470);

        RelatorioTurma.setBackground(new java.awt.Color(228, 255, 255));
        RelatorioTurma.setMaximumSize(new java.awt.Dimension(590, 470));
        RelatorioTurma.setMinimumSize(new java.awt.Dimension(590, 470));

        BotaoGerarRelatorioTurmas.setText("Gerar Relat??rio");
        

        TabelaRelatorioTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alunos ", "Aprovados", "Reprovados "
            }
        ));
        TabelaDoc1.setViewportView(TabelaRelatorioTurma);

        jLabel51.setText("Turmas:");

        javax.swing.GroupLayout RelatorioTurmaLayout = new javax.swing.GroupLayout(RelatorioTurma);
        RelatorioTurma.setLayout(RelatorioTurmaLayout);
        RelatorioTurmaLayout.setHorizontalGroup(
            RelatorioTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RelatorioTurmaLayout.createSequentialGroup()
                .addGroup(RelatorioTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RelatorioTurmaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(RelatorioTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TabelaDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RelatorioTurmaLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(BotaoGerarRelatorioTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        RelatorioTurmaLayout.setVerticalGroup(
            RelatorioTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RelatorioTurmaLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TabelaDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoGerarRelatorioTurmas)
                .addGap(21, 21, 21))
        );

        MiniTelas.add(RelatorioTurma);
        RelatorioTurma.setBounds(0, 0, 590, 470);

        TelaDocente.add(MiniTelas);
        MiniTelas.setBounds(210, 70, 590, 470);

        BotaoSair.setText("SAIR");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        TelaDocente.add(BotaoSair);
        BotaoSair.setBounds(720, 570, 72, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Point Blur_Nov142022_191653.jpg"))); // NOI18N
        TelaDocente.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);

        TelaEstudante.setMaximumSize(new java.awt.Dimension(800, 600));
        TelaEstudante.setMinimumSize(new java.awt.Dimension(800, 600));
        TelaEstudante.setOpaque(false);
        TelaEstudante.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 178, 109));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        TelaEstudante.add(jPanel6);
        jPanel6.setBounds(70, 230, 150, 290);

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        TelaEstudante.add(jPanel5);
        jPanel5.setBounds(70, 120, 670, 10);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        TelaEstudante.add(jPanel4);
        jPanel4.setBounds(70, 60, 670, 60);

        BotaoBoletim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickNoBotaoBoletim(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(105, 160, 115));
        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("       Boletim");
        jLabel15.setOpaque(true);

        javax.swing.GroupLayout BotaoBoletimLayout = new javax.swing.GroupLayout(BotaoBoletim);
        BotaoBoletim.setLayout(BotaoBoletimLayout);
        BotaoBoletimLayout.setHorizontalGroup(
            BotaoBoletimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoBoletimLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoBoletimLayout.setVerticalGroup(
            BotaoBoletimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoBoletimLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TelaEstudante.add(BotaoBoletim);
        BotaoBoletim.setBounds(70, 130, 150, 50);

        BotaoDadosPessoais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickBotaoDadosPessoais(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(105, 160, 115));
        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("      Dados Pessoais");
        jLabel16.setMaximumSize(new java.awt.Dimension(77, 19));
        jLabel16.setMinimumSize(new java.awt.Dimension(77, 19));
        jLabel16.setOpaque(true);

        javax.swing.GroupLayout BotaoDadosPessoaisLayout = new javax.swing.GroupLayout(BotaoDadosPessoais);
        BotaoDadosPessoais.setLayout(BotaoDadosPessoaisLayout);
        BotaoDadosPessoaisLayout.setHorizontalGroup(
            BotaoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(BotaoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BotaoDadosPessoaisLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BotaoDadosPessoaisLayout.setVerticalGroup(
            BotaoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(BotaoDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BotaoDadosPessoaisLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        TelaEstudante.add(BotaoDadosPessoais);
        BotaoDadosPessoais.setBounds(70, 180, 150, 50);

        MiniTelasAluno.setBackground(new java.awt.Color(228, 255, 255));
        MiniTelasAluno.setLayout(null);

        MiniTelaDadosPessoais.setBackground(new java.awt.Color(228, 255, 255));

        jLabel17.setText("Nome:");

        jLabel20.setText("Curso:");

        jLabel21.setText("Data de Nascimento:");

        jLabel22.setText("Ano Letivo:");

        EditarDadosPessoais.setText("Editar");
        EditarDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarDadosPessoaisActionPerformed(evt);
            }
        });

        jPanel8.setMaximumSize(new java.awt.Dimension(90, 125));
        jPanel8.setMinimumSize(new java.awt.Dimension(90, 125));
        jPanel8.setPreferredSize(new java.awt.Dimension(90, 125));
        jPanel8.setLayout(null);
        jPanel8.add(FotoDadosPessoais);
        FotoDadosPessoais.setBounds(0, 0, 90, 123);

        NomeDoAluno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NomeDoAluno.setText("a");

        CursoDoAluno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        CursoDoAluno.setText("a");

        DataNascDoAluno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        DataNascDoAluno.setText("s");

        AnoLetivoDoAluno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        AnoLetivoDoAluno.setText("a");

        javax.swing.GroupLayout MiniTelaDadosPessoaisLayout = new javax.swing.GroupLayout(MiniTelaDadosPessoais);
        MiniTelaDadosPessoais.setLayout(MiniTelaDadosPessoaisLayout);
        MiniTelaDadosPessoaisLayout.setHorizontalGroup(
            MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NomeDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DataNascDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CursoDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnoLetivoDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(EditarDadosPessoais)))
                .addContainerGap())
        );
        MiniTelaDadosPessoaisLayout.setVerticalGroup(
            MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MiniTelaDadosPessoaisLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataNascDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CursoDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(MiniTelaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnoLetivoDoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149)
                .addComponent(EditarDadosPessoais))
        );

        MiniTelasAluno.add(MiniTelaDadosPessoais);
        MiniTelaDadosPessoais.setBounds(0, 0, 520, 390);

        MiniTelaBoletim.setBackground(new java.awt.Color(228, 255, 255));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1?? Ano", "2?? Ano", "3?? Ano", "4?? Ano" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Disciplinas", "Unidades ", "M??dia"
            }
        ));//OLHAR ISSO DPS 
        /*{
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });*/
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout MiniTelaBoletimLayout = new javax.swing.GroupLayout(MiniTelaBoletim);
        MiniTelaBoletim.setLayout(MiniTelaBoletimLayout);
        MiniTelaBoletimLayout.setHorizontalGroup(
            MiniTelaBoletimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaBoletimLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(MiniTelaBoletimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MiniTelaBoletimLayout.setVerticalGroup(
            MiniTelaBoletimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiniTelaBoletimLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        MiniTelasAluno.add(MiniTelaBoletim);
        MiniTelaBoletim.setBounds(0, 0, 510, 390);

        TelaEstudante.add(MiniTelasAluno);
        MiniTelasAluno.setBounds(220, 130, 520, 390);

        BotaoSair1.setText("SAIR");
        BotaoSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSair1ActionPerformed(evt);
            }
        });
        TelaEstudante.add(BotaoSair1);
        BotaoSair1.setBounds(700, 550, 72, 23);

        ImagemDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Point Blur_Nov142022_191653.jpg"))); // NOI18N
        TelaEstudante.add(ImagemDeFundo);
        ImagemDeFundo.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TelaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TelaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TelaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TelaEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BarraTurmasCadastradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (isToListen){
                RefreshEditarTurmas();
            }
        }
        });

        BarraDisciplinasCadastradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (isToListen){
                    RefreshEditarDisciplina();
                }
        }
        });
        BarraDiciplinasEditarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (isToListen){
                    bufferForRemoval.clear();
                    String[] buffer = new String[1];
                    DefaultTableModel toAdd = new DefaultTableModel();
                    DefaultTableModel toAddBravo = new DefaultTableModel();
                    toAdd.addColumn("1?? U");
                    toAdd.addColumn("2?? U");
                    toAdd.addColumn("3?? U");
                    toAdd.addColumn("4?? U");
                    toAddBravo.addColumn("Alunos");
                    String str = (String)BarraDiciplinasEditarNota.getSelectedItem();
                    for(Aluno a: escola.disciplinas.get(Integer.parseInt(String.valueOf(str.charAt(0)))).getNotas().keySet()){
                        buffer = new String[1];
                        buffer[0] = String.valueOf(a.getCodigo());
                        buffer[0] = buffer[0] + " - " + a.getNome();
                        toAddBravo.addRow(buffer);
                        Float[] teste = escola.disciplinas.get(Integer.parseInt(String.valueOf(str.charAt(0)))).getNotas().get(a);
                        toAdd.addRow(teste);    
                    }

                    bufferForRemoval.clear();
                    TabelaAlunosEditarNotas.setModel(toAddBravo);
                    TebelaParaEditarNotas.setModel(toAdd);
                }
        }
    });
    BarraAlunosCadastradosDisciplinas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BarraAlunosTelaEditarDisciplinasActionPerformed();
    }
    });

    //aq

    BarraDocentesCadastrados1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           BarraDocentesTelaEditarDiscplinasActionPerformed();
    }
    });

    BotaoSalvarEditacaoAluno.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           BotaoSalvarEditacaoAlunoActionPerformed(evt);
    }
    });

    BotaoRemoverCoisasDaDisciplina.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           BotaoRemoverCoisasDaDisciplinaActionPerformed(evt);
    }
    });

    BarraAlunosCadastradosTurmas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           BarraAlunosCadastradosTurmasActionPerformed();
    }
    });

    Bot??oRemoverDisciplinasDoSistema.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           Bot??oRemoverDisciplinasDoSistemaActionPerformed(evt);
    }
    });

    ListaDiciplinasCadastrarDisciplinas.setModel(listDisciplinas);
    ListaTurmasCadastrarTurma.setModel(listTurmas);

    BarraAlunosCadastradosAlunos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           BarraAlunosCadastradosAlunosActionPerformed();
    }
    });

    BarraDocentesCadastrados.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           BarraDocentesCadastradosActionPerformed();
    }
    });

    BotaoGerarRelatorioAlunos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           BotaoGerarRelatorioAlunosActionPerfomed();
    }
    });

    BotaoGerarRelatorioDocentes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           BotaoGerarRelatorioDocentesActionPerformed();
    }
    });

    BotaoGerarRelatorioTurmas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           BotaoGerarRelatorioTurmasActionPerformed(evt);
    }
    });
    //Fim do init
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setarTodasTabelasBarras() {

    }
    private void BotaoAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAcessarActionPerformed
            TelaLogin.setVisible(false);

            TelaDocente.setVisible(true);
            LimparMiniTela();

    }//GEN-LAST:event_BotaoAcessarActionPerformed

    private void LimparMiniTela() {
        CadastrarAluno.setVisible(false);
        CadastrarDocente.setVisible(false);
        CadastrarTurma.setVisible(false);
        CadastrarDisciplina.setVisible(false);

        RelatorioDocente.setVisible(false);
        RelatorioDisciplina.setVisible(false);
        RelatorioAluno.setVisible(false);
        RelatorioTurma.setVisible(false);

        EditarDisciplina.setVisible(false);
        EditarAluno.setVisible(false);
        EditarDocente.setVisible(false);
        EditarTurma.setVisible(false);
        EditarNotas.setVisible(false);

        RemoverDisciplina.setVisible(false);
        RemoverAluno.setVisible(false);
        RemoverDocente.setVisible(false);
        RemoverTurma.setVisible(false);

        MiniTelaDadosPessoais.setVisible(false);
        MiniTelaBoletim.setVisible(false);

    }

    private void LimparCaixasDeTextos() {

        CaixaDeTextoCadastroNomeDocente.setText(null);
        CaixaDeTextoCadastroDataNascDocente.setText(null);
        CaixaDeTextoMatriculaDocente.setText(null);

        CaixaDeTextoCadastroNomeAluno.setText(null);
        CaixaDeTextoCadastroDataNascAluno.setText(null);
        CaixaDeTextoMatriculaAluno.setText(null);

        CaixaDeTextoCadastroTurma.setText(null);
        CaixaDeTextoDisciplina.setText(null);
    }

    public void LimparSubmenus() {
        SubmenuRemocao.setVisible(false);
        SubmenuCadastro.setVisible(false);
        SubmenuRelatorio.setVisible(false);
        SubmenuEdicao.setVisible(false);
        SubmenuEditarDadosDaDisciplina.setVisible(false);

        PainelMenu.setVisible(true);
    }

    private void BotaoSairTelaLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairTelaLogin
        escola.salvar();
        System.exit(0);
    }//GEN-LAST:event_BotaoSairTelaLogin

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        TelaDocente.setVisible(false);
        TelaLogin.setVisible(true);
        bufferForRemoval.clear();
        bufferForRemovalBX.clear();
        counterForPrevention = 0;
        counterForPreventionBX = 0;
        isToListen = false;

    }//GEN-LAST:event_BotaoSairActionPerformed

    private void ClickNoBotaoBoletim(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoBoletim
        LimparMiniTela();
        LimparCaixasDeTextos();
        MiniTelaBoletim.setVisible(true);

    }//GEN-LAST:event_ClickNoBotaoBoletim

    private void ClickBotaoDadosPessoais(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoDadosPessoais
        LimparMiniTela();
        LimparCaixasDeTextos();
        MiniTelaDadosPessoais.setVisible(true);
    }//GEN-LAST:event_ClickBotaoDadosPessoais

    private void EditarDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDadosPessoaisActionPerformed

    }//GEN-LAST:event_EditarDadosPessoaisActionPerformed

    private void BotaoSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSair1ActionPerformed
        TelaEstudante.setVisible(false);
        TelaLogin.setVisible(true);
        bufferForRemoval.clear();
        bufferForRemovalBX.clear();
        bufferForAdition.clear();
        bufferForAditionBX.clear();
        counterForPrevention = 0;
        counterForPreventionBX = 0;
        
    }//GEN-LAST:event_BotaoSair1ActionPerformed

    private void BotaoConcluirCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConcluirCadastroAlunoActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro realizado");
        Aluno aluno = escola.adicionarAluno(CaixaDeTextoCadastroNomeAluno.getText(),CaixaDeTextoMatriculaAluno.getText(),CaixaDeTextoCadastroDataNascAluno.getText());
        String[] s = {aluno.getCodigo() + " - " + aluno.getNome()};
        modelAlunos = (DefaultTableModel) TabelaRemoverAlunos.getModel();
        modelAlunos.addRow(s);
        TabelaRemoverAlunos.setModel(modelAlunos);
        //BarraAlunosCadastradosAlunos.addItem(s[0]);
        //BarraAlunosCadastradosDisciplinas.addItem(s[0]);
        BarraAlunosCadastradosAlunos.addItem(aluno.getCodigo() + " - " + aluno.getNome());
        BarraAlunosCadastradosDisciplinas.addItem(aluno.getCodigo() + " - " + aluno.getNome());
        CaixaDeTextoCadastroNomeAluno.setText("");
        CaixaDeTextoCadastroDataNascAluno.setText(null);
        CaixaDeTextoMatriculaAluno.setText("");
        x += 1;
    }//GEN-LAST:event_BotaoConcluirCadastroAlunoActionPerformed

    private void ClickBotaoCadastrarAluno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoCadastrarAluno
        LimparMiniTela();
        LimparCaixasDeTextos();
        CadastrarAluno.setVisible(true);
        isToListen = false;

    }//GEN-LAST:event_ClickBotaoCadastrarAluno

    private void ClickNoBotaoCadastrarTurmas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoCadastrarTurmas
        LimparMiniTela();
        CadastrarTurma.setVisible(true);
        isToListen = false;
        
    }//GEN-LAST:event_ClickNoBotaoCadastrarTurmas

    private void ClickBotaoCadastrarDocentes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoCadastrarDocentes
        LimparMiniTela();
        LimparCaixasDeTextos();
        CadastrarDocente.setVisible(true);
        isToListen = false;
    }//GEN-LAST:event_ClickBotaoCadastrarDocentes

    private void DeslizarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizarMenuMouseClicked

        if (PainelSubmenu.getSize().getHeight() == 200 && PainelSubmenu.getSize().getWidth() == 180) {
            if (jPanel3.getSize().getHeight() == 330 && jPanel3.getSize().getWidth() == 180) {

                Thread th = new Thread() {

                    @Override
                    public void run() {
                        try {
                            for (int i = 180; i >= 0; i--) {
                                Thread.sleep(0, 05);
                                PainelMenu.setSize(i, 200);
                                PainelSubmenu.setSize(i, 200);
                                jPanel3.setSize(i, 330);
                            }
                        } catch (InterruptedException e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
    }//GEN-LAST:event_DeslizarMenuMouseClicked
        ;
                th.start();
                x = 0;

            }
        }
        if (PainelSubmenu.getSize().getHeight() == 200 && PainelSubmenu.getSize().getWidth() < 180) {
            if (jPanel3.getSize().getHeight() == 330 && jPanel3.getSize().getWidth() < 180) {
                
                PainelMenu.setSize(180, 200);
                PainelSubmenu.setSize(180, 200);
                jPanel3.setSize(180, 330);
                /*Thread th = new Thread(){
                    public void run(){
                    try {
                        for (int i = 0; i <= 180; i++) {
                            Thread.sleep(0, 05);
                            PainelMenu.setSize(i, 200);
                            PainelSubmenu.setSize(i, 200);
                            jPanel3.setSize(i, 330);
                        }
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }};
                th.start();
                x = 210;*/
            } 
        }
    }

    private void BotaoConcluirCadastroDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {                                                                 

        Disciplina disciplina = escola.adicionarDisciplina(CaixaDeTextoDisciplina.getText());
        String[] s = {disciplina.getCodigo() + " - " + disciplina.getNome()};
        modelDisciplinas = (DefaultTableModel) TabelaRemoverDisciplinas.getModel();
        modelDisciplinas.addRow(s);
        boolean bufferBool = isToListen;
        isToListen = false;
        BarraDisciplinasCadastradas.addItem(s[0]);
        BarraDiciplinasEditarNota.addItem(s[0]);;
        listDisciplinas.addElement(s[0]);
        ListaDiciplinasCadastrarDisciplinas.setModel(listDisciplinas);
        isToListen = bufferBool;
        CaixaDeTextoDisciplina.setText("");
       
    }

    private void ClickNoBotaoMenuCadastro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoMenuCadastro

        LimparSubmenus();
        PainelMenu.setVisible(false);
        SubmenuCadastro.setVisible(true);
    }//GEN-LAST:event_ClickNoBotaoMenuCadastro

    private void ClickBotaoMenuEditar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoMenuEditar
        LimparSubmenus();
        PainelMenu.setVisible(false);
        SubmenuEdicao.setVisible(true);
    }//GEN-LAST:event_ClickBotaoMenuEditar

    private void ClickBotaoMenuRemover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoMenuRemover
        LimparSubmenus();
        PainelMenu.setVisible(false);
        SubmenuRemocao.setVisible(true);
    }//GEN-LAST:event_ClickBotaoMenuRemover

    private void BotaoCadastrarDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarDisciplinasMouseClicked
        LimparMiniTela();
        LimparCaixasDeTextos();
        CadastrarDisciplina.setVisible(true);
        isToListen = false;
    }//GEN-LAST:event_BotaoCadastrarDisciplinasMouseClicked

    private void ClickNoBotaoEditarTurmas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoEditarTurmas
        LimparMiniTela();
        isToListen = false;
        BarraTurmasCadastradas.removeAllItems();
        for (Turma a: escola.turmas.values()){
            String buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            BarraTurmasCadastradas.addItem(buffer);
        }
        clearBuffersAndCounters();
        BarraTurmasCadastradas.setSelectedIndex(-1);
        EditarTurma.setVisible(true);
        isToListen = true;
    }//GEN-LAST:event_ClickNoBotaoEditarTurmas

    private void ClickBotaoEditarDocentes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoEditarDocentes
        LimparMiniTela();
        String buffer;
        isToListen = false;
        BarraDocentesCadastrados.removeAllItems();
        for (Docente a: escola.docentes.values()){
            buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            BarraDocentesCadastrados.addItem(buffer);
        }
        BarraDocentesCadastrados.setSelectedIndex(-1);
        EditarDocente.setVisible(true);
        isToListen = true;
    }//GEN-LAST:event_ClickBotaoEditarDocentes

    private void ClickBotaoEditarAlunos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoEditarAlunos
        LimparMiniTela();
        String buffer;
        isToListen = false;
        BarraAlunosCadastradosAlunos.removeAllItems();
        for (Aluno a: escola.alunos.values()){
            buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            BarraAlunosCadastradosAlunos.addItem(buffer);
        }
        BarraAlunosCadastradosAlunos.setSelectedIndex(-1);
        EditarAluno.setVisible(true);// TODO add your handling code here:
        isToListen = true;
    }//GEN-LAST:event_ClickBotaoEditarAlunos

    private void BotaoEditarDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEditarDisciplinasMouseClicked
        LimparMiniTela();
        String buffer;
        isToListen = false;
        BarraDocentesCadastrados1.removeAllItems();
        // for (Docente a: escola.docentes.values()){
        //     buffer = a.getCodigo() + " - ";
        //     buffer += a.getNome();
        //     BarraDocentesCadastrados1.addItem(buffer);
        // }
        BarraAlunosCadastradosDisciplinas.removeAllItems();
        // for (Aluno a: escola.alunos.values()){
        //     buffer = a.getCodigo() + " - ";
        //     buffer += a.getNome();
        //     BarraAlunosCadastradosDisciplinas.addItem(buffer);
        // }
        TabelaEditarDisciplinasAluno.setModel(new DefaultTableModel(null, new String[]{"Alunos"}));
        TabelaEditarDisciplinasDocente.setModel(new DefaultTableModel(null, new String[]{"Docentes"}));
        SubmenuEditarDadosDaDisciplina.setVisible(true);
        BarraAlunosCadastradosDisciplinas.setSelectedIndex(-1);
        isToListen = true;
    }//GEN-LAST:event_BotaoEditarDisciplinasMouseClicked

    private void ClickNoBotaoRemoverTurmas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoRemoverTurmas
        LimparMiniTela();
        RemoverTurma.setVisible(true);// TODO add your handling code here:
        isToListen = false;
        TabelaRemoverTurmas.setModel(modelTurmas);
    }//GEN-LAST:event_ClickNoBotaoRemoverTurmas

    private void ClickBotaoRemoverAluno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoRemoverAluno
        LimparMiniTela();
        RemoverAluno.setVisible(true);// TODO add your handling code here:
        isToListen = false;
        TabelaRemoverAlunos.setModel(modelAlunos);
    }//GEN-LAST:event_ClickBotaoRemoverAluno

    private void BotaoRemoverDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverDisciplinasMouseClicked
        LimparMiniTela();
        RemoverDisciplina.setVisible(true);// TODO add your handling code here:
        isToListen = false;
        TabelaRemoverDisciplinas.setModel(modelDisciplinas);
    }//GEN-LAST:event_BotaoRemoverDisciplinasMouseClicked

    private void ClickBotaoRemoverDocentes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoRemoverDocentes
        LimparMiniTela();
        RemoverDocente.setVisible(true);// TODO add your handling code here:
        isToListen = false;
        TabelaRemoverDocentes.setModel(modelDocentes);
    }//GEN-LAST:event_ClickBotaoRemoverDocentes

    private void ClickNoBotaoRelatorioTurmas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoRelatorioTurmas
        LimparMiniTela();
        RelatorioTurma.setVisible(true);// TODO add your handling code here:
        isToListen = false;
    }//GEN-LAST:event_ClickNoBotaoRelatorioTurmas

    private void ClickBotaoRelatorioDocentes(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoRelatorioDocentes
        LimparMiniTela();
        RelatorioDocente.setVisible(true);// TODO add your handling code here:
        isToListen = false;
    }//GEN-LAST:event_ClickBotaoRelatorioDocentes

    private void ClickBotaoRelatorioAluno(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoRelatorioAluno
        LimparMiniTela();
        RelatorioAluno.setVisible(true);// TODO add your handling code here:
        isToListen = false;
    }//GEN-LAST:event_ClickBotaoRelatorioAluno

    private void BotaoRelatorioDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRelatorioDisciplinasMouseClicked
        LimparMiniTela();
        RelatorioDisciplina.setVisible(true);
        isToListen = false;
    }//GEN-LAST:event_BotaoRelatorioDisciplinasMouseClicked

    private void Bot??oRetornarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot??oRetornarMenuMouseClicked
        if (SubmenuEditarDadosDaDisciplina.isVisible() == true) {
            SubmenuEditarDadosDaDisciplina.setVisible(false);
            SubmenuEdicao.setVisible(true);
        }else {
            LimparSubmenus();
        }
    }//GEN-LAST:event_Bot??oRetornarMenuMouseClicked

    private void ImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagemMouseClicked
    }//GEN-LAST:event_ImagemMouseClicked
    
    private void Bot??oRemoverTurmaDoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot??oRemoverTurmaDoSistemaActionPerformed

        if (modelTurmas.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "N??o cont??m turmas para excluir.");
        }
        if (TabelaRemoverTurmas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos um para poder excluir.");
        } else if (TabelaRemoverTurmas.getSelectedRow() > 0){
            ArrayList<Integer> buffer = new ArrayList<Integer>(escola.turmas.keySet());
            try {
                escola.removerTurma(buffer.get(TabelaRemoverTurmas.getSelectedRow()));
            } catch (NoSuchKeyException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            boolean bufferBool = isToListen;
            isToListen = false;
            BarraTurmasCadastradas.removeItemAt(TabelaRemoverTurmas.getSelectedRow());
            modelTurmas.removeRow(TabelaRemoverTurmas.getSelectedRow());
            listTurmas.remove(TabelaRemoverTurmas.getSelectedRow());
            ListaTurmasCadastrarTurma.setModel(listTurmas);
            isToListen = bufferBool;
            TabelaRemoverTurmas.setModel(modelTurmas);
        }
    }//GEN-LAST:event_Bot??oRemoverTurmaDoSistemaActionPerformed

    private void ClickBotaoMenuRelatorio(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoMenuRelatorio
        LimparSubmenus();
        PainelMenu.setVisible(false);
        SubmenuRelatorio.setVisible(true);
    }//GEN-LAST:event_ClickBotaoMenuRelatorio

    private void Bot??oRemoverAlunoDoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot??oRemoverAlunoDoSistemaActionPerformed

        if (modelAlunos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "N??o cont??m alunos para excluir.");
        }
        if (TabelaRemoverAlunos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos um para poder excluir.");
        } else {
            ArrayList<Integer> buffer = new ArrayList<Integer>(escola.alunos.keySet());
            try {
                escola.removerAluno(buffer.get(TabelaRemoverAlunos.getSelectedRow()));
            } catch (NoSuchKeyException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            boolean bufferBool = isToListen;
            isToListen = false;
            BarraAlunosCadastradosAlunos.removeItemAt(TabelaRemoverAlunos.getSelectedRow());
            isToListen = bufferBool;
            modelAlunos.removeRow(TabelaRemoverAlunos.getSelectedRow());
            TabelaRemoverAlunos.setModel(modelAlunos);
        }
    }//GEN-LAST:event_Bot??oRemoverAlunoDoSistemaActionPerformed

    private void Bot??oRemoverDocentesDoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot??oRemoverDocentesDoSistemaActionPerformed

        if (modelDocentes.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "N??o cont??m docentes para excluir.");
        }
        if (TabelaRemoverDocentes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos um para poder excluir.");
        } else {
            ArrayList<Integer> buffer = new ArrayList<Integer>(escola.docentes.keySet());
            if(escola.docentes.get(buffer.get(TabelaRemoverDocentes.getSelectedRow())).getDisciplinas().size()>0){
                JOptionPane.showMessageDialog(null,"Esse Docente est?? em uma discipilina. Vc nao pode remove-lo");
                return;
            }
            try {
                escola.removerDocente(buffer.get(TabelaRemoverDocentes.getSelectedRow()));
            } catch (NoSuchKeyException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            boolean bufferBool = isToListen;
            isToListen = false;
            BarraDocentesCadastrados.removeItemAt(TabelaRemoverDocentes.getSelectedRow());
            isToListen = true;
            modelDocentes.removeRow(TabelaRemoverDocentes.getSelectedRow());
            TabelaRemoverDocentes.setModel(modelDocentes);
        }
    }//GEN-LAST:event_Bot??oRemoverDocentesDoSistemaActionPerformed

    //TODO #25 botar os actionlisteners
    private void Bot??oRemoverDisciplinasDoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot??oRemoverDisciplinasDoSistemaActionPerformed

        if (modelDisciplinas.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "N??o cont??m disciplinas para excluir.");
        }
        if (TabelaRemoverDisciplinas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos um para poder excluir.");
        } else {
            ArrayList<Integer> buffer = new ArrayList<Integer>(escola.disciplinas.keySet());
            try {
                escola.removerDisciplina(buffer.get(TabelaRemoverDisciplinas.getSelectedRow()));
            } catch (NoSuchKeyException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            boolean bufferBool = isToListen;
            isToListen = false;
            BarraDisciplinasCadastradas.removeItemAt(TabelaRemoverDisciplinas.getSelectedRow());
            BarraDiciplinasEditarNota.removeItemAt(TabelaRemoverDisciplinas.getSelectedRow());
            listDisciplinas.remove(TabelaRemoverDisciplinas.getSelectedRow());
            ListaDiciplinasCadastrarDisciplinas.setModel(listDisciplinas);
            isToListen = bufferBool;
            modelDisciplinas.removeRow(TabelaRemoverDisciplinas.getSelectedRow());
            TabelaRemoverDisciplinas.setModel(modelDisciplinas);
        }
    }//GEN-LAST:event_Bot??oRemoverDisciplinasDoSistemaActionPerformed

    private void BotaoConcluirCadastroTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConcluirCadastroTurmaActionPerformed

        Turma turma = escola.adicionarTurma(CaixaDeTextoCadastroTurma.getText());
        String[] s = {turma.getCodigo() + " - " + turma.getNome()};
        modelTurmas = (DefaultTableModel)TabelaRemoverTurmas.getModel();
        modelTurmas.addRow(s);
        BarraTurmasCadastradas.addItem(s[0]);
        listTurmas.addElement(s[0]);
        ListaTurmasCadastrarTurma.setModel(listTurmas);
        CaixaDeTextoCadastroTurma.setText(null);
    }//GEN-LAST:event_BotaoConcluirCadastroTurmaActionPerformed

    private void BotaoRemoverCoisasDaDisciplinaActionPerformed(java.awt.event.ActionEvent evt){
      DefaultTableModel dtm = (DefaultTableModel) TabelaEditarDisciplinasAluno.getModel();
        DefaultTableModel dtmB = (DefaultTableModel) TabelaEditarDisciplinasDocente.getModel();
        //bufferTable = dtm;
        //bufferTableBX = dtmB;
        
         if (TabelaEditarDisciplinasAluno.getRowCount() == 0 && TabelaEditarDisciplinasDocente.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "N??o cont??m itens para excluir.");
        }
        if(TabelaEditarDisciplinasAluno.getSelectedRow() ==-1 && TabelaEditarDisciplinasDocente.getSelectedRow()==-1){
        JOptionPane.showMessageDialog(null, "Selecione pelo menos um para poder excluir.");
        }
        
           while(TabelaEditarDisciplinasAluno.getSelectedRow() >-1){
            bufferForRemoval.add(TabelaEditarDisciplinasAluno.getSelectedRow()+counterForPrevention);
            dtm.removeRow(TabelaEditarDisciplinasAluno.getSelectedRow());
            counterForPrevention++;
       
        }   
           while(TabelaEditarDisciplinasDocente.getSelectedRow() >-1){
         bufferForRemovalBX.add(TabelaEditarDisciplinasDocente.getSelectedRow()+counterForPreventionBX);
            dtmB.removeRow(TabelaEditarDisciplinasDocente.getSelectedRow());
            counterForPreventionBX++;
       
      
// =0 tabela vazia =1 um item selecionado =-1 nenhum item selecionado
             
    }
        TabelaEditarDisciplinasDocente.setModel(dtmB);
        TabelaEditarDisciplinasAluno.setModel(dtm); 
    }
    private void ClickNoBotaoEditarTurmas1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickNoBotaoEditarTurmas1
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickNoBotaoEditarTurmas1

    private void ClickBotaoEditarDocentes1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoEditarDocentes1
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoEditarDocentes1

    private void ClickBotaoEditarAluno1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoEditarAluno1
        // TODO add your handling code here:
    }//GEN-LAST:event_ClickBotaoEditarAluno1

    private void BotaoEditarDisciplinas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEditarDisciplinas1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoEditarDisciplinas1MouseClicked

    private void ClickBotaoEditarGeralDisciplinas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoEditarGeralDisciplinas
        LimparMiniTela();
        isToListen = false;
        BarraDisciplinasCadastradas.setSelectedIndex(-1);
        EditarDisciplina.setVisible(true);
        isToListen = true;
    }//GEN-LAST:event_ClickBotaoEditarGeralDisciplinas

    private void ClickBotaoEditarNotas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickBotaoEditarNotas
        LimparMiniTela();
        isToListen = false;
        BarraDiciplinasEditarNota.setSelectedIndex(-1);
        EditarNotas.setVisible(true);
        isToListen = true;
    }//GEN-LAST:event_ClickBotaoEditarNotas

    //TODO #14 actionperformed editar aluno
    //TODO #15 fazer os salvareditacao chamarem os remover/adicionar
    //NAO TA ADICIONANDO
    private void BotaoSalvarEditacaoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarEditacaoTurmaActionPerformed
        ArrayList<Integer> buffer = new ArrayList<>(escola.turmas.keySet()); 
        Turma t = escola.turmas.get(buffer.get(BarraTurmasCadastradas.getSelectedIndex()));
        if(!CaixaDeTextoNomeTurmaEditado.getText().isBlank() && !CaixaDeTextoNomeTurmaEditado.getText().equals(null)){
        t.setNome(CaixaDeTextoNomeTurmaEditado.getText());
        }
        CaixaDeTextoNomeTurmaEditado.setText("");
        for (int i : bufferForRemoval){
            t.removerAluno(i,escola);
        }
        for(int i: bufferForAdition){
            t.adicionarAluno(escola.alunos.get(i),escola);
        }
        bufferForRemoval.clear();
        bufferForRemovalBX.clear();
        bufferForAdition.clear();
        bufferForAditionBX.clear();
        counterForPrevention = 0;
        counterForPreventionBX = 0;
    }//GEN-LAST:event_BotaoSalvarEditacaoTurmaActionPerformed

    private void BotaoRemoverAlunoDaTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverAlunoDaTurmaActionPerformed
        DefaultTableModel dtmEditarAlunosEmTurma = (DefaultTableModel) TabelaEditarAlunosEmTurma.getModel();

        if (dtmEditarAlunosEmTurma.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "N??o cont??m alunos para excluir.");
        }
        if (TabelaEditarAlunosEmTurma.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos um para poder excluir.");
        }
        else{
            while(TabelaEditarAlunosEmTurma.getSelectedRow()>-1){
            bufferForRemoval.add(TabelaEditarAlunosEmTurma.getSelectedRow()+counterForPrevention);
            dtmEditarAlunosEmTurma.removeRow(TabelaEditarAlunosEmTurma.getSelectedRow());
            counterForPrevention++;
            }
        }
    }//GEN-LAST:event_BotaoRemoverAlunoDaTurmaActionPerformed
    //TODO #17 fazer os botoes de sair e voltar apagarem os bufferes e elementos de prevencao

    private void BotaoSalvarEditacaoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarEditacaoDocenteActionPerformed
        ArrayList<Integer> buffer = new ArrayList<>(escola.docentes.keySet()); 
        if(!CaixaDeTextoNomeDocenteEditado.getText().isBlank() && !CaixaDeTextoNomeDocenteEditado.getText().equals(null)){
        escola.docentes.get(buffer.get(BarraDocentesCadastrados.getSelectedIndex())).setNome(CaixaDeTextoNomeDocenteEditado.getText());
        }
        escola.docentes.get(buffer.get(BarraDocentesCadastrados.getSelectedIndex())).setDataNascimento(CaixaDeTextoEditarDataNascDocente.getText());
        ClickBotaoEditarDocentes(null);
    }//GEN-LAST:event_BotaoSalvarEditacaoDocenteActionPerformed

    private void BotaoSalvarEditacaoAlunoActionPerformed(java.awt.event.ActionEvent evt){
        ArrayList<Integer> buffer = new ArrayList<>(escola.alunos.keySet()); 
        if(!CaixaDeTextoNomeAlunoEditado.getText().isBlank() && !CaixaDeTextoNomeAlunoEditado.getText().equals(null)){
        escola.alunos.get(buffer.get(BarraAlunosCadastradosAlunos.getSelectedIndex())).setNome(CaixaDeTextoNomeAlunoEditado.getText());
        }
        escola.alunos.get(buffer.get(BarraAlunosCadastradosAlunos.getSelectedIndex())).setDataNascimento(CaixaDeTextoEditarDataNascAluno.getText());
        CaixaDeTextoEditarDataNascAluno.setText("");
        CaixaDeTextoNomeAlunoEditado.setText("");
        ClickBotaoEditarAlunos(null);
    }
    private void BotaoGerarRelatorioDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGerarRelatorioDisciplinasActionPerformed
       String toSave = GeradorDeRelatorio.relatorioMediasDisciplinas(escola);
       try{
        FileWriter fw = new FileWriter(baseAdress+"/Dados/RelatorioMediasDisciplinas"+escola.getNumeroRelatorios()+".txt");
        fw.write(toSave);
        fw.close();
        escola.setNumeroRelatorios(escola.getNumeroRelatorios() + 1);
       } catch (IOException ex){

       }
       JOptionPane.showMessageDialog(null, "Relat??rio gerado em"+baseAdress+"/Dados/RelatorioMediasDisciplinas"+(escola.getNumeroRelatorios()-1)+".txt");
    }//GEN-LAST:event_BotaoGerarRelatorioDisciplinasActionPerformed

    private void BotaoGerarRelatorioTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGerarRelatorioTurmasActionPerformed
        String toSave = GeradorDeRelatorio.relatorioMediasTurmas(escola);
       try{
        FileWriter fw = new FileWriter(baseAdress+"/Dados/RelatorioMediasTurmas"+escola.getNumeroRelatorios()+".txt");
        fw.write(toSave);
        fw.close();
        escola.setNumeroRelatorios(escola.getNumeroRelatorios()+1);
       } catch (IOException ex){

       }
       JOptionPane.showMessageDialog(null, "Relat??rio gerado em"+baseAdress+"/Dados/RelatorioMediaTurmas"+(escola.getNumeroRelatorios()-1)+".txt");
    }//GEN-LAST:event_BotaoGerarRelatorioTurmasActionPerformed

    private void BotaoGerarRelatorioAlunosActionPerfomed(){
        String toSave = GeradorDeRelatorio.relatorioAprovados(escola);
        try{
         FileWriter fw = new FileWriter(baseAdress+"/Dados/RelatorioAprovadosPorTurma"+escola.getNumeroRelatorios()+".txt");
         fw.write(toSave);
         fw.close();
         escola.setNumeroRelatorios(escola.getNumeroRelatorios()+1);
        } catch (IOException ex){
        }
        JOptionPane.showMessageDialog(null, "Relat??rio gerado em"+baseAdress+"/Dados/RelatorioAprovadosPorTurma"+(escola.getNumeroRelatorios()-1)+".txt");
        toSave = GeradorDeRelatorio.relatorioReprovados(escola);
        try{
         FileWriter fw = new FileWriter(baseAdress+"/Dados/RelatorioReprovadosPorDisciplina"+escola.getNumeroRelatorios()+".txt");
         fw.write(toSave);
         fw.close();
         escola.setNumeroRelatorios(escola.getNumeroRelatorios()+1);
        } catch (IOException ex){
 
        }
        JOptionPane.showMessageDialog(null, "Relat??rio gerado em"+baseAdress+"/Dados/RelatorioReprovadosPorDisciplina"+(escola.getNumeroRelatorios()-1)+".txt");

    }

    private void BotaoGerarRelatorioDocentesActionPerformed(){
        String toSave = GeradorDeRelatorio.relatorioDocentes(escola);
        try{
         FileWriter fw = new FileWriter(baseAdress+"/Dados/RelatorioDocentes"+escola.getNumeroRelatorios()+".txt");
         fw.write(toSave);
         fw.close();
         escola.setNumeroRelatorios(escola.getNumeroRelatorios()+1);
        } catch (IOException ex){
 
        }
        JOptionPane.showMessageDialog(null, "Relat??rio gerado em"+baseAdress+"/Dados/RelatorioDocentes"+(escola.getNumeroRelatorios()-1)+".txt");

    }
    //TODO #19 #20 botar minimo e maxima de nota e try catch
    private void BotaoSalvarEditacaoNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarEditacaoNotasActionPerformed
        var modelAlunos = TabelaAlunosEditarNotas.getModel();
        var modelNotas = TebelaParaEditarNotas.getModel();
        DefaultTableModel odeioOSwing = new DefaultTableModel();
        odeioOSwing.addColumn("1?? U");
        odeioOSwing.addColumn("2?? U");
        odeioOSwing.addColumn("3?? U");
        odeioOSwing.addColumn("4?? U");

        if (modelNotas.getRowCount() == 0){
            return;
        }
        String buffer = (String) BarraDiciplinasEditarNota.getSelectedItem();
        int a = Integer.parseInt(Character.toString((buffer.charAt(0))));
        Disciplina disc = escola.disciplinas.get(a);
        a = 0;
        Float[] toAdd =  new Float[4];
        for (Map.Entry<Aluno,Float[]> pair : disc.getNotas().entrySet()){
            toAdd = new Float[4];
            for(int i = 0; i<=3; i++){
                try{
                toAdd[i] = Float.parseFloat((String)modelNotas.getValueAt(a, i));
                } catch (NumberFormatException ex){
                    toAdd[i] = 0f;
                } catch (ClassCastException ex){
                   toAdd[i] = (Float) modelNotas.getValueAt(a, i);
                }
                if(toAdd[i] <0f){
                    toAdd[i] = 0f;
                } else if (toAdd[i]>10f){
                    toAdd[i] = 10f;
                }
            }
            disc.editarNotas(pair.getKey(), toAdd);
            a++;
            odeioOSwing.addRow(toAdd);
        }
        TebelaParaEditarNotas.setModel(odeioOSwing);
    }//GEN-LAST:event_BotaoSalvarEditacaoNotasActionPerformed

    private void BotaoSalvarEditacaoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarEditacaoDisciplinaActionPerformed
        ArrayList<Integer> buffer = new ArrayList<>(escola.disciplinas.keySet()); 
        Disciplina d = escola.disciplinas.get(buffer.get(BarraDisciplinasCadastradas.getSelectedIndex()));
        if(bufferForAditionBX.size() == 0){
            JOptionPane.showMessageDialog(null, "A disciplina precisa ter um docente, adicione um");
            bufferForAdition.clear();
            bufferForAditionBX.clear();
            bufferForRemoval.clear();
            bufferForRemovalBX.clear();
            counterForPrevention = 0;
            counterForPreventionBX = 0;
            RefreshEditarDisciplina();
            return;
        }
        if(!CaixaDeTextoEditarNomeDisciplina.getText().isBlank() && !CaixaDeTextoEditarNomeDisciplina.getText().equals(null)){
        d.setNome(CaixaDeTextoEditarNomeDisciplina.getText());
        }
        CaixaDeTextoEditarNomeDisciplina.setText("");
        for(int i : bufferForRemoval){
            d.removerAluno(i);
        }

        for (int i : bufferForRemovalBX){
            d.removerDocente(i);
        }

        for(int i : bufferForAdition){
            d.adicionarAluno(escola.alunos.get(i));
        }

        for (int i: bufferForAditionBX){
            d.adicionarDocente(escola.docentes.get(i));
        }

        bufferForAdition.clear();
        bufferForAditionBX.clear();
        bufferForRemoval.clear();
        bufferForRemovalBX.clear();
        counterForPrevention = 0;
        counterForPreventionBX = 0;
        RefreshEditarDisciplina();
    }//GEN-LAST:event_BotaoSalvarEditacaoDisciplinaActionPerformed

    private void BotaoConcluirCadastroDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConcluirCadastroDocenteActionPerformed

        JOptionPane.showMessageDialog(null, "Cadastro realizado");

        Docente docente = escola.adicionarDocente(CaixaDeTextoCadastroNomeDocente.getText(),CaixaDeTextoMatriculaDocente.getText(),CaixaDeTextoCadastroDataNascDocente.getText());
        String[] s = {docente.getCodigo() + " - " + docente.getNome()};
        modelDocentes = (DefaultTableModel) TabelaRemoverDocentes.getModel();
        modelDocentes.addRow(s);
        TabelaRemoverDocentes.setModel(modelDocentes);
        BarraDocentesCadastrados.addItem(s[0]);
        BarraDocentesCadastrados1.addItem(s[0]);
        CaixaDeTextoCadastroNomeDocente.setText("");
        CaixaDeTextoCadastroDataNascDocente.setText(null);
        CaixaDeTextoMatriculaDocente.setText("");
        //modelTurmas = (DefaultTableModel)TabelaRemoverTurmas.getModel();

    }//GEN-LAST:event_BotaoConcluirCadastroDocenteActionPerformed


    public static void main(String args[]) {
        String[] broken = System.getProperty("user.dir").split("/");
        for(String s : broken){
            if(s.contains("-main")){
                baseAdress = "Trabalho-4-UNIDADE-main/src";
            }
        }

        escola = new Escola();
        try{
         escola.carregar();
        }catch(InvalidPathException|NoSuchFileException e){
            JOptionPane.showMessageDialog(null, "O ENDERE??O DE CARREGAMENTO TA ERRADO. VERIFIQUE SE INTALOU O PROGRMA CORRETAMENE OU MUDE O ENDERE??O EM GerenteDeArquivo.baseAdress");
            return;
        } catch (Exception ex){
            System.out.println("Houve um problema inesperado com o carregamento. Realizando inicializa????o vazia.");
        }
        /*Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread th, Throwable ex) {
                ex.printStackTrace();
                System.out.println("Houve um problema com o programa. Fechando o programa e  salvando");
                try{
                Tela.escola.salvar();
                } catch(Exception ez){
                }
                System.exit(0);
            }
        };
        Thread.setDefaultUncaughtExceptionHandler(h);*/
         String[] toAdd = new String[1];
         String buffer;
         listTurmas = new DefaultListModel<String>();
         listDisciplinas = new DefaultListModel<String>();
         modelAlunos = new DefaultTableModel();
         modelDisciplinas = new DefaultTableModel();
         modelDocentes = new DefaultTableModel();
         modelTurmas = new DefaultTableModel();
         modelAlunos.addColumn("Alunos");
         modelDisciplinas.addColumn("Disciplinas");
         modelDocentes.addColumn("Docentes");
         modelTurmas.addColumn("Turmas");
         for (Aluno a: escola.alunos.values()){
            buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            toAdd[0] = buffer;
            modelAlunos.addRow(toAdd);
         }
         for (Docente a: escola.docentes.values()){
            buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            toAdd[0] = buffer;
            modelDocentes.addRow(toAdd);
         }
         for (Turma a: escola.turmas.values()){
            buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            toAdd[0] = buffer;
            modelTurmas.addRow(toAdd);
            listTurmas.addElement(buffer);
         }
         for (Disciplina a: escola.disciplinas.values()){
            buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            toAdd[0] = buffer;
            modelDisciplinas.addRow(toAdd);
            listDisciplinas.addElement(buffer);
         }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new Tela().setVisible(true);
                } catch (Exception ex){
                    
                }
            }
        });
    }
//TODO fazer refreshar as outras coaisas qnd salva tbm
    private void RefreshEditarDisciplina(){
        isToListen = false;
                DefaultTableModel toAdd = new DefaultTableModel();
                toAdd.addColumn("Docentes");
                TabelaEditarDisciplinasDocente.setModel(toAdd);
                String[] buffer = new String [1];
                BarraDocentesCadastrados1.removeAllItems();
                BarraAlunosCadastradosDisciplinas.removeAllItems();
                bufferForRemoval.clear();
                ArrayList<Integer> keys = new ArrayList<Integer>(escola.disciplinas.keySet());
                for(Docente a: escola.disciplinas.get(keys.get(BarraDisciplinasCadastradas.getSelectedIndex())).getDocentes()){
                    buffer[0] = String.valueOf(a.getCodigo());
                    buffer[0] = buffer[0] + " - " + a.getNome();
                    bufferForRemoval.add(a.getCodigo());
                    toAdd.addRow(buffer);
                }

                for (Map.Entry<Integer,Docente> pair : escola.docentes.entrySet()){
                    if (!bufferForRemoval.contains(pair.getKey())){
                        BarraDocentesCadastrados1.addItem(pair.getValue().getCodigo() + " - " + pair.getValue().getNome());
                    }
                }

                bufferForRemoval.clear();

                TabelaEditarDisciplinasDocente.setModel(toAdd);
                DefaultTableModel toAddBravo = new DefaultTableModel();
                TabelaEditarDisciplinasAluno.setModel(toAddBravo);
                toAddBravo.addColumn("Alunos");
                for(Aluno a: escola.disciplinas.get(keys.get(BarraDisciplinasCadastradas.getSelectedIndex())).getNotas().keySet()){
                    buffer[0] = String.valueOf(a.getCodigo());
                    buffer[0] = buffer[0] + " - " + a.getNome();
                    bufferForRemoval.add(a.getCodigo());
                    toAddBravo.addRow(buffer);
                }

                for (Map.Entry<Integer,Aluno> pair : escola.alunos.entrySet()){
                    if (!bufferForRemoval.contains(pair.getKey())){
                        BarraAlunosCadastradosDisciplinas.addItem(pair.getValue().getCodigo() + " - " + pair.getValue().getNome());
                    }
                }

                bufferForRemoval.clear();
                bufferForRemovalBX.clear();
                bufferForAdition.clear();
                bufferForAditionBX.clear();
                TabelaEditarDisciplinasAluno.setModel(toAddBravo);
                isToListen = true;
            
    }

    private void RefreshEditarTurmas(){
        isToListen = false;
        DefaultTableModel toAdd = new DefaultTableModel();
        clearBuffersAndCounters();
        TabelaEditarAlunosEmTurma.setModel(toAdd);
        toAdd.addColumn("Alunos");
        String[] buffer = new String [1];
        ArrayList<Integer> keys = new ArrayList<Integer>(escola.turmas.keySet());
        for(Aluno a: escola.turmas.get(keys.get(BarraTurmasCadastradas.getSelectedIndex())).getAlunos()){
            buffer[0] = String.valueOf(a.getCodigo());
            buffer[0] = buffer[0] + " - " + a.getNome();
            toAdd.addRow(buffer);
        }
        TabelaEditarAlunosEmTurma.setModel(toAdd);
        BarraAlunosCadastradosTurmas.removeAllItems();
        for (Aluno a: escola.alunos.values()){
            if (!escola.turmas.get(keys.get(BarraTurmasCadastradas.getSelectedIndex())).getAlunos().contains(a)){
                String innerBuffer = a.getCodigo() + " - "+ a.getNome();
                BarraAlunosCadastradosTurmas.addItem(innerBuffer);
            }
        }
        isToListen = true;
    }

    private void BarraDocentesTelaEditarDiscplinasActionPerformed(){
        if (isToListen){
            String [] buffer = new String [1];
            buffer[0] = (String) BarraDocentesCadastrados1.getSelectedItem();
            DefaultTableModel dtm = (DefaultTableModel) TabelaEditarDisciplinasDocente.getModel();
            dtm.addRow(buffer);
            bufferForAditionBX.add(Integer.parseInt(Character.toString(buffer[0].charAt(0))));
            BarraDocentesCadastrados1.removeItemAt(BarraDocentesCadastrados1.getSelectedIndex());
            TabelaEditarDisciplinasDocente.setModel(dtm);
        }
    }

    private void BarraAlunosTelaEditarDisciplinasActionPerformed(){
        if(isToListen){
            String [] buffer = new String [1];
            buffer[0] = (String) BarraAlunosCadastradosDisciplinas.getSelectedItem();
            DefaultTableModel dtm = (DefaultTableModel) TabelaEditarDisciplinasAluno.getModel();
            dtm.addRow(buffer);
            bufferForAdition.add(Integer.parseInt(Character.toString(buffer[0].charAt(0))));
            isToListen = false;
            BarraAlunosCadastradosDisciplinas.removeItemAt(BarraAlunosCadastradosDisciplinas.getSelectedIndex());//
            isToListen = true;
            TabelaEditarDisciplinasAluno.setModel(dtm);
        }
    }

    private void BarraAlunosCadastradosTurmasActionPerformed(){
        if(isToListen){
            String [] buffer = new String [1];
            buffer[0] = (String) BarraAlunosCadastradosTurmas.getSelectedItem();
            DefaultTableModel dtm = (DefaultTableModel) TabelaEditarAlunosEmTurma.getModel();
            dtm.addRow(buffer);
            bufferForAdition.add(Integer.parseInt(Character.toString(buffer[0].charAt(0))));
            isToListen = false;
            BarraAlunosCadastradosTurmas.removeItemAt(BarraAlunosCadastradosTurmas.getSelectedIndex());//
            isToListen = true;
            TabelaEditarAlunosEmTurma.setModel(dtm);
        }
    }
//TODO #26 sair botando selectedIndex = -1 quando sair da ela nessas barra td
    private void BarraAlunosCadastradosAlunosActionPerformed(){
        if(isToListen){
        String buffer = (String) BarraAlunosCadastradosAlunos.getSelectedItem();
        Aluno a = escola.alunos.get(Integer.parseInt(Character.toString(buffer.charAt(0))));
        CaixaDeTextoEditarDataNascAluno.setText(a.getDataNascimento());
        CaixaDeTextoNomeAlunoEditado.setText(a.getNome());
        EditarAlunoMatricula.setText(a.getMatricula());
        }
    }

    private void BarraDocentesCadastradosActionPerformed(){
        if(isToListen){
            String buffer = (String) BarraDocentesCadastrados.getSelectedItem();
            Docente a = escola.docentes.get(Integer.parseInt(Character.toString(buffer.charAt(0))));
            CaixaDeTextoEditarDataNascDocente.setText(a.getDataNascimento());
            CaixaDeTextoNomeDocenteEditado.setText(a.getNome());
            EditarDocentesMatricula.setText(a.getMatricula());
            }
    }

    private void InicializarBarras(){
        String buffer;
        for (Aluno a: escola.alunos.values()){
            buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            BarraAlunosCadastradosAlunos.addItem(buffer);
            BarraAlunosCadastradosDisciplinas.addItem(buffer);
        }
        for (Docente a: escola.docentes.values()){
            buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            BarraDocentesCadastrados.addItem(buffer);
            BarraDocentesCadastrados1.addItem(buffer);
        }
        for (Turma a: escola.turmas.values()){
            buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            BarraTurmasCadastradas.addItem(buffer);
        }
        for (Disciplina a: escola.disciplinas.values()){
            buffer = a.getCodigo() + " - ";
            buffer += a.getNome();
            BarraDisciplinasCadastradas.addItem(buffer);
            BarraDiciplinasEditarNota.addItem(buffer);
        }
    }

    private void clearBuffersAndCounters(){
        bufferForRemoval.clear();
        bufferForRemovalBX.clear();
        bufferForAdition.clear();
        bufferForAditionBX.clear();
        counterForPrevention = 0;
        counterForPreventionBX = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoLetivoDoAluno;
    private javax.swing.JComboBox<String> BarraAlunosCadastradosAlunos;
    private javax.swing.JComboBox<String> BarraAlunosCadastradosDisciplinas;
    private javax.swing.JComboBox<String> BarraAlunosCadastradosTurmas;
    private javax.swing.JComboBox<String> BarraDiciplinasEditarNota;
    private javax.swing.JComboBox<String> BarraDisciplinasCadastradas;
    private javax.swing.JComboBox<String> BarraDocentesCadastrados;
    private javax.swing.JComboBox<String> BarraDocentesCadastrados1;
    private javax.swing.JComboBox<String> BarraTurmasCadastradas;
    private javax.swing.JButton BotaoAcessar;
    private javax.swing.JPanel BotaoBoletim;
    private javax.swing.JPanel BotaoCadastrarAluno;
    private javax.swing.JPanel BotaoCadastrarDisciplinas;
    private javax.swing.JPanel BotaoCadastrarDocentes;
    private javax.swing.JPanel BotaoCadastrarTurmas;
    private javax.swing.JButton BotaoConcluirCadastroAluno;
    private javax.swing.JButton BotaoConcluirCadastroDisciplinas;
    private javax.swing.JButton BotaoConcluirCadastroDocente;
    private javax.swing.JButton BotaoConcluirCadastroTurma;
    private javax.swing.JPanel BotaoDadosPessoais;
    private javax.swing.JPanel BotaoEditarAlunos;
    private javax.swing.JPanel BotaoEditarDisciplinas;
    private javax.swing.JPanel BotaoEditarDocentes;
    private javax.swing.JPanel BotaoEditarGeralDisciplinas;
    private javax.swing.JPanel BotaoEditarNotas;
    private javax.swing.JPanel BotaoEditarTurmas;
    private javax.swing.JButton BotaoGerarRelatorioAlunos;
    private javax.swing.JButton BotaoGerarRelatorioDisciplinas;
    private javax.swing.JButton BotaoGerarRelatorioDocentes;
    private javax.swing.JButton BotaoGerarRelatorioTurmas;
    private javax.swing.JPanel BotaoMenuCadastro;
    private javax.swing.JPanel BotaoMenuEditar;
    private javax.swing.JPanel BotaoMenuRelatorio;
    private javax.swing.JPanel BotaoMenuRemover;
    private javax.swing.JPanel BotaoRelatorioAluno;
    private javax.swing.JPanel BotaoRelatorioDisciplinas;
    private javax.swing.JPanel BotaoRelatorioDocentes;
    private javax.swing.JPanel BotaoRelatorioTurmas;
    private javax.swing.JPanel BotaoRemoverAluno;
    private javax.swing.JButton BotaoRemoverAlunoDaTurma;
    private javax.swing.JButton BotaoRemoverCoisasDaDisciplina;
    private javax.swing.JPanel BotaoRemoverDisciplinas;
    private javax.swing.JPanel BotaoRemoverDocentes;
    private javax.swing.JPanel BotaoRemoverTurmas;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoSair1;
    private javax.swing.JButton BotaoSalvarEditacaoAluno;
    private javax.swing.JButton BotaoSalvarEditacaoDisciplina;
    private javax.swing.JButton BotaoSalvarEditacaoDocente;
    private javax.swing.JButton BotaoSalvarEditacaoNotas;
    private javax.swing.JButton BotaoSalvarEditacaoTurma;
    private javax.swing.JPanel BotoesLaterais;
    private javax.swing.JButton Bot??oRemoverAlunoDoSistema;
    private javax.swing.JButton Bot??oRemoverDisciplinasDoSistema;
    private javax.swing.JButton Bot??oRemoverDocentesDoSistema;
    private javax.swing.JButton Bot??oRemoverTurmaDoSistema;
    private javax.swing.JLabel Bot??oRetornarMenu;
    private javax.swing.JPanel CadastrarAluno;
    private javax.swing.JPanel CadastrarDisciplina;
    private javax.swing.JPanel CadastrarDocente;
    private javax.swing.JPanel CadastrarTurma;
    private javax.swing.JFormattedTextField CaixaDeTextoCadastroDataNascAluno;
    private javax.swing.JFormattedTextField CaixaDeTextoCadastroDataNascDocente;
    private javax.swing.JTextField CaixaDeTextoCadastroNomeAluno;
    private javax.swing.JTextField CaixaDeTextoCadastroNomeDocente;
    private javax.swing.JTextField CaixaDeTextoCadastroTurma;
    private javax.swing.JTextField CaixaDeTextoDisciplina;
    private javax.swing.JFormattedTextField CaixaDeTextoEditarDataNascAluno;
    private javax.swing.JFormattedTextField CaixaDeTextoEditarDataNascDocente;
    private javax.swing.JTextField CaixaDeTextoEditarNomeDisciplina;
    private javax.swing.JTextField CaixaDeTextoMatriculaAluno;
    private javax.swing.JTextField CaixaDeTextoMatriculaDocente;
    private javax.swing.JTextField CaixaDeTextoNomeAlunoEditado;
    private javax.swing.JTextField CaixaDeTextoNomeDocenteEditado;
    private javax.swing.JTextField CaixaDeTextoNomeTurmaEditado;
    private javax.swing.JLabel CursoDoAluno;
    private javax.swing.JLabel DataNascDoAluno;
    private javax.swing.JLabel DeslizarMenu;
    private javax.swing.JPanel EditarAluno;
    private javax.swing.JLabel EditarAlunoMatricula;
    private javax.swing.JButton EditarDadosPessoais;
    private javax.swing.JPanel EditarDisciplina;
    private javax.swing.JPanel EditarDocente;
    private javax.swing.JLabel EditarDocentesMatricula;
    private javax.swing.JPanel EditarNotas;
    private javax.swing.JPanel EditarTurma;
    private javax.swing.JLabel FotoDadosPessoais;
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel ImagemDeFundo;
    private javax.swing.JScrollPane ListaDeAlunos;
    private javax.swing.JList<String> ListaDiciplinasCadastrarDisciplinas;
    private javax.swing.JList<String> ListaTurmasCadastrarTurma;
    private javax.swing.JPanel MiniTelaBoletim;
    private javax.swing.JPanel MiniTelaDadosPessoais;
    private javax.swing.JPanel MiniTelas;
    private javax.swing.JPanel MiniTelasAluno;
    private javax.swing.JLabel NomeDoAluno;
    private javax.swing.JPanel PainelMenu;
    private javax.swing.JPanel PainelSubmenu;
    private javax.swing.JPanel RelatorioAluno;
    private javax.swing.JPanel RelatorioDisciplina;
    private javax.swing.JPanel RelatorioDocente;
    private javax.swing.JPanel RelatorioTurma;
    private javax.swing.JPanel RemoverAluno;
    private javax.swing.JPanel RemoverDisciplina;
    private javax.swing.JPanel RemoverDocente;
    private javax.swing.JPanel RemoverTurma;
    private javax.swing.JPanel SubmenuCadastro;
    private javax.swing.JPanel SubmenuEdicao;
    private javax.swing.JPanel SubmenuEditarDadosDaDisciplina;
    private javax.swing.JPanel SubmenuRelatorio;
    private javax.swing.JPanel SubmenuRemocao;
    private javax.swing.JTable TabelaAlunosEditarNotas;
    private javax.swing.JScrollPane TabelaDisc;
    private javax.swing.JScrollPane TabelaDisc1;
    private javax.swing.JScrollPane TabelaDisc2;
    private javax.swing.JScrollPane TabelaDisc3;
    private javax.swing.JScrollPane TabelaDisc4;
    private javax.swing.JScrollPane TabelaDoc;
    private javax.swing.JScrollPane TabelaDoc1;
    private javax.swing.JScrollPane TabelaDoc2;
    private javax.swing.JTable TabelaEditarAlunosEmTurma;
    private javax.swing.JTable TabelaEditarDisciplinasAluno;
    private javax.swing.JTable TabelaEditarDisciplinasDocente;
    private javax.swing.JTable TabelaRelatorioAlunos;
    private javax.swing.JTable TabelaRelatorioDisciplinas;
    private javax.swing.JTable TabelaRelatorioDocentes;
    private javax.swing.JTable TabelaRelatorioTurma;
    private javax.swing.JTable TabelaRemoverAlunos;
    private javax.swing.JTable TabelaRemoverDisciplinas;
    private javax.swing.JTable TabelaRemoverDocentes;
    private javax.swing.JTable TabelaRemoverTurmas;
    private javax.swing.JTable TebelaParaEditarNotas;
    private javax.swing.JPanel TelaDocente;
    private javax.swing.JPanel TelaEstudante;
    private javax.swing.JPanel TelaLogin;
    private javax.swing.JLabel T??tulo;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void ClickMouseUsuario1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
//POR ALGUM MOTIVO ESSA PARTE DO CODIGO FICA SENDO APAGAGADA PELA IDE, IMPEDINDO O SETAMENTO DE BARRAS NAS TABELAS
/*BarraAlunosCadastradosDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(isToListen){
                System.out.println("CHAMADO");
                String [] buffer = new String [1];
                buffer[0] = (String) BarraAlunosCadastradosDisciplinas.getSelectedItem();
                DefaultTableModel dtm = (DefaultTableModel) TabelaEditarDisciplinasAluno.getModel();
                dtm.addRow(buffer);
                System.out.println(Integer.parseInt(Character.toString(buffer[0].charAt(0))));
                bufferForAdition.add(Integer.parseInt(Character.toString(buffer[0].charAt(0))));
                isToListen = false;
                BarraAlunosCadastradosDisciplinas.removeItemAt(BarraAlunosCadastradosDisciplinas.getSelectedIndex());//
                isToListen = true;
                TabelaEditarDisciplinasAluno.setModel(dtm);
            }
        }
        });

        BarraDocentesCadastrados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (isToListen){
                System.out.println("CHAMADO");
                String [] buffer = new String [1];
                buffer[0] = (String) BarraDocentesCadastrados1.getSelectedItem();
                DefaultTableModel dtm = (DefaultTableModel) TabelaEditarDisciplinasDocente.getModel();
                dtm.addRow(buffer);
                
                bufferForAdition.add(Integer.parseInt(Character.toString(buffer[0].charAt(0))));
isToListen = false;
                BarraDocentesCadastrados1.removeItemAt(BarraDocentesCadastrados1.getSelectedIndex());
isToListen = true;
                TabelaEditarDisciplinasDocente.setModel(dtm);
            }
        }
        });
*/
