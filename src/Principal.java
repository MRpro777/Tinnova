import Controla.ControlaExercicio1;
import Controla.ControlaExercicio3;
import Controla.ControlaExercicio4;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("00.00");
    public Principal() {
        initComponents();
        aplicaEstilo();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Desafio Tinnova");
        verificaSpinnerEx1();
        verificaSpinnerEx3();
        verificaSpinnerEx4();
        carregaTabelaOrdenacaoEx2();
    }
    
    private void verificaSpinnerEx1(){
        ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnValidos, tfdPorcentagemValidos);
        ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnBrancos, tfdPorcentagemBrancos);
        ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnNulos, tfdPorcentagemNulos);

        spnValidos.addChangeListener(e -> {
            ControlaExercicio1.somaTotalEleitores(spnValidos, spnBrancos, spnNulos, spnTotalEleitores);
            ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnValidos, tfdPorcentagemValidos);
            ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnBrancos, tfdPorcentagemBrancos);
            ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnNulos, tfdPorcentagemNulos);
        });
        spnBrancos.addChangeListener(e -> {
            ControlaExercicio1.somaTotalEleitores(spnValidos, spnBrancos, spnNulos, spnTotalEleitores);
            ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnValidos, tfdPorcentagemValidos);
            ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnBrancos, tfdPorcentagemBrancos);
            ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnNulos, tfdPorcentagemNulos);
        });
        spnNulos.addChangeListener(e -> {
            ControlaExercicio1.somaTotalEleitores(spnValidos, spnBrancos, spnNulos, spnTotalEleitores);
            ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnValidos, tfdPorcentagemValidos);
            ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnBrancos, tfdPorcentagemBrancos);
            ControlaExercicio1.calculaPorcentagem(spnTotalEleitores, spnNulos, tfdPorcentagemNulos);
        });
    }
    
    private void carregaTabelaOrdenacaoEx2(){
        Object row[] = {5, 3, 2, 4, 7, 1, 0, 6};
        ((DefaultTableModel) tblOrdenacaoNumeros.getModel()).addRow(row);
    }
    
    private void atualizaTabelaOrdenacaoEx2(int numeros[]){
        ((DefaultTableModel) tblOrdenacaoNumeros.getModel()).setNumRows(0);
        tblOrdenacaoNumeros.updateUI();
        Object row[] = {numeros[0], numeros[1], numeros[2], numeros[3], numeros[4], numeros[5], numeros[6], numeros[7]};
        ((DefaultTableModel) tblOrdenacaoNumeros.getModel()).addRow(row);
    }
    
    private void verificaSpinnerEx3(){
        ControlaExercicio3.calculaFatorial(spnFatorial, tfdResultadoEx3);

        spnFatorial.addChangeListener(e -> {
            ControlaExercicio3.calculaFatorial(spnFatorial, tfdResultadoEx3);
        });
    }
    
    private void verificaSpinnerEx4(){
        ControlaExercicio4.calculaSomaMultiplos(spnNumeroMultiplos, tfdResultadoEx4);

        spnNumeroMultiplos.addChangeListener(e -> {
            ControlaExercicio4.calculaSomaMultiplos(spnNumeroMultiplos, tfdResultadoEx4);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAbas = new javax.swing.JTabbedPane();
        pnlExercicio1 = new javax.swing.JPanel();
        lblTotalEleitores = new javax.swing.JLabel();
        lblValidos = new javax.swing.JLabel();
        lblBrancos = new javax.swing.JLabel();
        lblNulos = new javax.swing.JLabel();
        tfdPorcentagemValidos = new javax.swing.JTextField();
        tfdPorcentagemBrancos = new javax.swing.JTextField();
        tfdPorcentagemNulos = new javax.swing.JTextField();
        lblPorcentagem1 = new javax.swing.JLabel();
        lblPorcentagem2 = new javax.swing.JLabel();
        lblPorcentagem3 = new javax.swing.JLabel();
        spnTotalEleitores = new javax.swing.JSpinner();
        spnValidos = new javax.swing.JSpinner();
        spnBrancos = new javax.swing.JSpinner();
        spnNulos = new javax.swing.JSpinner();
        pnlExercicio2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdenacaoNumeros = new javax.swing.JTable();
        btnOrdenar = new javax.swing.JButton();
        pnlExercicio3 = new javax.swing.JPanel();
        lblFatorial = new javax.swing.JLabel();
        spnFatorial = new javax.swing.JSpinner();
        tfdResultadoEx3 = new javax.swing.JTextField();
        lblNumero1 = new javax.swing.JLabel();
        pnlExercicio4 = new javax.swing.JPanel();
        lblNumeroMultiplos = new javax.swing.JLabel();
        spnNumeroMultiplos = new javax.swing.JSpinner();
        tfdResultadoEx4 = new javax.swing.JTextField();
        pnlExercicio5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnImagem1 = new javax.swing.JButton();
        btnImagem2 = new javax.swing.JButton();
        btnImagem3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAbas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblTotalEleitores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalEleitores.setText("Total de eleitores:");

        lblValidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValidos.setText("Válidos:");

        lblBrancos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBrancos.setText("Brancos:");

        lblNulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNulos.setText("Nulos:");

        tfdPorcentagemValidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfdPorcentagemValidos.setEnabled(false);

        tfdPorcentagemBrancos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfdPorcentagemBrancos.setEnabled(false);

        tfdPorcentagemNulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfdPorcentagemNulos.setEnabled(false);

        lblPorcentagem1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPorcentagem1.setText("%");

        lblPorcentagem2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPorcentagem2.setText("%");

        lblPorcentagem3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPorcentagem3.setText("%");

        spnTotalEleitores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spnTotalEleitores.setModel(new javax.swing.SpinnerNumberModel(1000, 1, 10000, 1));
        spnTotalEleitores.setEnabled(false);

        spnValidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spnValidos.setModel(new javax.swing.SpinnerNumberModel(800, 1, 10000, 1));

        spnBrancos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spnBrancos.setModel(new javax.swing.SpinnerNumberModel(150, 1, 10000, 1));

        spnNulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spnNulos.setModel(new javax.swing.SpinnerNumberModel(50, 1, 10000, 1));

        javax.swing.GroupLayout pnlExercicio1Layout = new javax.swing.GroupLayout(pnlExercicio1);
        pnlExercicio1.setLayout(pnlExercicio1Layout);
        pnlExercicio1Layout.setHorizontalGroup(
            pnlExercicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExercicio1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExercicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlExercicio1Layout.createSequentialGroup()
                        .addComponent(lblTotalEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnTotalEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlExercicio1Layout.createSequentialGroup()
                        .addComponent(lblValidos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnValidos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdPorcentagemValidos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPorcentagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlExercicio1Layout.createSequentialGroup()
                        .addComponent(lblBrancos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnBrancos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdPorcentagemBrancos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPorcentagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlExercicio1Layout.createSequentialGroup()
                        .addComponent(lblNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdPorcentagemNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPorcentagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        pnlExercicio1Layout.setVerticalGroup(
            pnlExercicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExercicio1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExercicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnTotalEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pnlExercicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdPorcentagemValidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPorcentagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnValidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlExercicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrancos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdPorcentagemBrancos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPorcentagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBrancos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlExercicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdPorcentagemNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPorcentagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Exercicio 1", pnlExercicio1);

        tblOrdenacaoNumeros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblOrdenacaoNumeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1°", "2°", "3°", "4°", "5°", "6°", "7°", "8°"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrdenacaoNumeros);

        btnOrdenar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExercicio2Layout = new javax.swing.GroupLayout(pnlExercicio2);
        pnlExercicio2.setLayout(pnlExercicio2Layout);
        pnlExercicio2Layout.setHorizontalGroup(
            pnlExercicio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExercicio2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExercicio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addGroup(pnlExercicio2Layout.createSequentialGroup()
                        .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlExercicio2Layout.setVerticalGroup(
            pnlExercicio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExercicio2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Exercicio 2", pnlExercicio2);

        lblFatorial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFatorial.setText("!");

        spnFatorial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spnFatorial.setModel(new javax.swing.SpinnerNumberModel(2, 0, 30, 1));

        tfdResultadoEx3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfdResultadoEx3.setEnabled(false);

        lblNumero1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumero1.setText("Informe o número:");

        javax.swing.GroupLayout pnlExercicio3Layout = new javax.swing.GroupLayout(pnlExercicio3);
        pnlExercicio3.setLayout(pnlExercicio3Layout);
        pnlExercicio3Layout.setHorizontalGroup(
            pnlExercicio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExercicio3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdResultadoEx3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        pnlExercicio3Layout.setVerticalGroup(
            pnlExercicio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExercicio3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExercicio3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdResultadoEx3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(331, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Exercicio 3", pnlExercicio3);

        lblNumeroMultiplos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumeroMultiplos.setText("Informe o número:");

        spnNumeroMultiplos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spnNumeroMultiplos.setModel(new javax.swing.SpinnerNumberModel(10, 0, 10000, 1));

        tfdResultadoEx4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfdResultadoEx4.setEnabled(false);

        javax.swing.GroupLayout pnlExercicio4Layout = new javax.swing.GroupLayout(pnlExercicio4);
        pnlExercicio4.setLayout(pnlExercicio4Layout);
        pnlExercicio4Layout.setHorizontalGroup(
            pnlExercicio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExercicio4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblNumeroMultiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnNumeroMultiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdResultadoEx4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        pnlExercicio4Layout.setVerticalGroup(
            pnlExercicio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExercicio4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExercicio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdResultadoEx4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNumeroMultiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroMultiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(331, Short.MAX_VALUE))
        );

        pnlAbas.addTab("Exercicio 4", pnlExercicio4);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Ainda estou aprendendo API, RESTful e requisições JSON, já que meu forte ainda é Java desk,\ntodavia, eu sei exatamente como chegar nesta solução e já tenho em meu ERP algo semelhante.\nSegue uns exemplos:");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        btnImagem1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImagem1.setText("Imagem 1");
        btnImagem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagem1ActionPerformed(evt);
            }
        });

        btnImagem2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImagem2.setText("Imagem 2");
        btnImagem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagem2ActionPerformed(evt);
            }
        });

        btnImagem3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImagem3.setText("Imagem 3");
        btnImagem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagem3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExercicio5Layout = new javax.swing.GroupLayout(pnlExercicio5);
        pnlExercicio5.setLayout(pnlExercicio5Layout);
        pnlExercicio5Layout.setHorizontalGroup(
            pnlExercicio5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExercicio5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExercicio5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addGroup(pnlExercicio5Layout.createSequentialGroup()
                        .addGroup(pnlExercicio5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImagem1)
                            .addComponent(btnImagem2)
                            .addComponent(btnImagem3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlExercicio5Layout.setVerticalGroup(
            pnlExercicio5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExercicio5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImagem1)
                .addGap(18, 18, 18)
                .addComponent(btnImagem2)
                .addGap(18, 18, 18)
                .addComponent(btnImagem3)
                .addGap(166, 166, 166))
        );

        pnlAbas.addTab("Exercicio 5", pnlExercicio5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlAbas)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlAbas)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        int numeros[] = new int[8];
        for (int i = 0; i < tblOrdenacaoNumeros.getColumnCount(); i++) {
            numeros[i] = Integer.parseInt(tblOrdenacaoNumeros.getValueAt(0, i).toString());
        }
        int posicaoFinal = 7;
        while(posicaoFinal > 0){
            for (int i = 0; i < posicaoFinal; i++) {
                if(numeros[i] > numeros[i+1]){
                    int temporario = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = temporario;
                }
            }
            posicaoFinal--;
        }

        atualizaTabelaOrdenacaoEx2(numeros);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnImagem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagem1ActionPerformed
        BufferedImage imagem;
        try {
            java.awt.Desktop.getDesktop().open(new File("src\\img\\Cadastro.png")); //abre o arquivo na pasta destino
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImagem1ActionPerformed

    private void btnImagem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagem2ActionPerformed
        BufferedImage imagem;
        try {
            java.awt.Desktop.getDesktop().open(new File("src\\img\\Base.png")); //abre o arquivo na pasta destino
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImagem2ActionPerformed

    private void btnImagem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagem3ActionPerformed
        BufferedImage imagem;
        try {
            java.awt.Desktop.getDesktop().open(new File("src\\img\\DAO.png")); //abre o arquivo na pasta destino
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImagem3ActionPerformed

    private void aplicaEstilo(){
        try {
            // Aqui voce seta o nome da classe referente a cada tema
            String tema = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
            UIManager.setLookAndFeel(tema);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImagem1;
    private javax.swing.JButton btnImagem2;
    private javax.swing.JButton btnImagem3;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBrancos;
    private javax.swing.JLabel lblFatorial;
    private javax.swing.JLabel lblNulos;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumeroMultiplos;
    private javax.swing.JLabel lblPorcentagem1;
    private javax.swing.JLabel lblPorcentagem2;
    private javax.swing.JLabel lblPorcentagem3;
    private javax.swing.JLabel lblTotalEleitores;
    private javax.swing.JLabel lblValidos;
    private javax.swing.JTabbedPane pnlAbas;
    private javax.swing.JPanel pnlExercicio1;
    private javax.swing.JPanel pnlExercicio2;
    private javax.swing.JPanel pnlExercicio3;
    private javax.swing.JPanel pnlExercicio4;
    private javax.swing.JPanel pnlExercicio5;
    public static javax.swing.JSpinner spnBrancos;
    public static javax.swing.JSpinner spnFatorial;
    public static javax.swing.JSpinner spnNulos;
    public static javax.swing.JSpinner spnNumeroMultiplos;
    public static javax.swing.JSpinner spnTotalEleitores;
    public static javax.swing.JSpinner spnValidos;
    private javax.swing.JTable tblOrdenacaoNumeros;
    public static javax.swing.JTextField tfdPorcentagemBrancos;
    public static javax.swing.JTextField tfdPorcentagemNulos;
    public static javax.swing.JTextField tfdPorcentagemValidos;
    public static javax.swing.JTextField tfdResultadoEx3;
    public static javax.swing.JTextField tfdResultadoEx4;
    // End of variables declaration//GEN-END:variables
}
