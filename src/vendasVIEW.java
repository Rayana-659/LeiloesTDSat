

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rayana
 */
public class vendasVIEW extends javax.swing.JFrame {
   
    private javax.swing.JTable tabela;
    private javax.swing.table.DefaultTableModel modelo;

    public vendasVIEW() {
    initComponents();

    setTitle("Produtos Vendidos");
    setSize(600, 400);
    setLocationRelativeTo(null);

    modelo = new javax.swing.table.DefaultTableModel(
        new Object[]{"ID", "Nome", "Valor", "Status"}, 0
    );

    tabela = new javax.swing.JTable(modelo);

    getContentPane().setLayout(new java.awt.BorderLayout());

    add(new javax.swing.JLabel(
        "Produtos Vendidos",
        javax.swing.SwingConstants.CENTER
    ), java.awt.BorderLayout.NORTH);

    add(new javax.swing.JScrollPane(tabela),
        java.awt.BorderLayout.CENTER);

    listarProdutosVendidos();
}
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void listarProdutosVendidos() {
    ProdutosDAO dao = new ProdutosDAO();

    java.util.ArrayList<ProdutosDTO> vendidos =
        dao.listarProdutosVendidos();

    modelo.setRowCount(0);

    for (ProdutosDTO produto : vendidos) {
        modelo.addRow(new Object[]{
            produto.getId(),
            produto.getNome(),
            produto.getValor(),
            produto.getStatus()
        });
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
