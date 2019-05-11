
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class FrontFrame extends javax.swing.JFrame {
    Methods method = new Methods();
    ArrayList<Costumers> cosls = method.costumersFill();
    ArrayList<Orders> ordls = method.ordersFill();
    public FrontFrame() {
        initComponents();
        Methods m = new Methods();
        tableOrders.setModel(m.ordersTable());
        tableCostumers.setModel(m.costumersTable());
        
        setEnabled(false, panelCostumersTableButtons.getComponents());
        setEnabled(false, panelCostumersEdit.getComponents());
        setEnabled(false, panelOrdersSave.getComponents());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelCostumersOperations = new javax.swing.JPanel();
        panelCostumersTable = new javax.swing.JPanel();
        scrollPaneCostumersTable = new javax.swing.JScrollPane();
        tableCostumers = new javax.swing.JTable();
        panelCostumersTableButtons = new javax.swing.JPanel();
        buttonCostumersTableEdit = new javax.swing.JButton();
        buttonCostumersTableDelete = new javax.swing.JButton();
        buttonOrdersAdd = new javax.swing.JButton();
        panelCostumersSave = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textCostumersNameSave = new javax.swing.JTextField();
        textCostumersSurnameSave = new javax.swing.JTextField();
        textCostumersPhoneSave = new javax.swing.JTextField();
        textCostumersAdressSave = new javax.swing.JTextField();
        buttonCostumersSave = new javax.swing.JButton();
        panelCostumersEdit = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textCostumersNameEdit = new javax.swing.JTextField();
        textCostumersSurnameEdit = new javax.swing.JTextField();
        textCostumersPhoneEdit = new javax.swing.JTextField();
        textCostumersAdressEdit = new javax.swing.JTextField();
        buttonCostumersEdit = new javax.swing.JButton();
        panelOrdersSave = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textOrderPhone = new javax.swing.JTextField();
        textOrderSurname = new javax.swing.JTextField();
        textOrderName = new javax.swing.JTextField();
        textOrderAdress = new javax.swing.JTextField();
        textOrderCost = new javax.swing.JTextField();
        buttonOrdersSave = new javax.swing.JButton();
        panelOrdersOperations = new javax.swing.JPanel();
        panelOrdersTable = new javax.swing.JPanel();
        scrollPaneOrdersTable = new javax.swing.JScrollPane();
        tableOrders = new javax.swing.JTable();
        panelOrdersStatus = new javax.swing.JPanel();
        buttonOnWay = new javax.swing.JButton();
        buttonDelivery = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();
        panelUsersOptions = new javax.swing.JPanel();
        panelPasswordSwitch = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textNewPasswordRepeat = new javax.swing.JPasswordField();
        textNewPassword = new javax.swing.JPasswordField();
        textOldPassword = new javax.swing.JPasswordField();
        buttonSwitch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCostumersTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Listesi"));

        tableCostumers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableCostumers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCostumersMouseClicked(evt);
            }
        });
        scrollPaneCostumersTable.setViewportView(tableCostumers);

        javax.swing.GroupLayout panelCostumersTableLayout = new javax.swing.GroupLayout(panelCostumersTable);
        panelCostumersTable.setLayout(panelCostumersTableLayout);
        panelCostumersTableLayout.setHorizontalGroup(
            panelCostumersTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneCostumersTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelCostumersTableLayout.setVerticalGroup(
            panelCostumersTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneCostumersTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelCostumersTableButtons.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        buttonCostumersTableEdit.setText("Düzenle");
        buttonCostumersTableEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCostumersTableEditActionPerformed(evt);
            }
        });

        buttonCostumersTableDelete.setText("Sil");
        buttonCostumersTableDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCostumersTableDeleteActionPerformed(evt);
            }
        });

        buttonOrdersAdd.setText("Sipariş Ekle");
        buttonOrdersAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrdersAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCostumersTableButtonsLayout = new javax.swing.GroupLayout(panelCostumersTableButtons);
        panelCostumersTableButtons.setLayout(panelCostumersTableButtonsLayout);
        panelCostumersTableButtonsLayout.setHorizontalGroup(
            panelCostumersTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersTableButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCostumersTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCostumersTableEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOrdersAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCostumersTableDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelCostumersTableButtonsLayout.setVerticalGroup(
            panelCostumersTableButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersTableButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonCostumersTableEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonOrdersAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCostumersTableDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        panelCostumersSave.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Kaydet"));

        jLabel1.setText("Müşteri Adı:");

        jLabel2.setText("Müşteri Soyadı:");

        jLabel3.setText("Müşteri Telefonu:");

        jLabel4.setText("Müşteri Adresi:");

        buttonCostumersSave.setText("Kaydet");
        buttonCostumersSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCostumersSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCostumersSaveLayout = new javax.swing.GroupLayout(panelCostumersSave);
        panelCostumersSave.setLayout(panelCostumersSaveLayout);
        panelCostumersSaveLayout.setHorizontalGroup(
            panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCostumersSaveLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCostumersSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCostumersSaveLayout.createSequentialGroup()
                        .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCostumersAdressSave, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(textCostumersNameSave)
                            .addComponent(textCostumersSurnameSave)
                            .addComponent(textCostumersPhoneSave))))
                .addContainerGap())
        );
        panelCostumersSaveLayout.setVerticalGroup(
            panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersSaveLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCostumersNameSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textCostumersSurnameSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textCostumersPhoneSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textCostumersAdressSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCostumersSave))
        );

        panelCostumersEdit.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Düzenle"));

        jLabel5.setText("Müşteri Adı:");

        jLabel6.setText("Müşteri Soyadı:");

        jLabel7.setText("Müşteri Telefonu:");

        jLabel8.setText("Müşteri Adresi:");

        buttonCostumersEdit.setText("Düzenle");
        buttonCostumersEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCostumersEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCostumersEditLayout = new javax.swing.GroupLayout(panelCostumersEdit);
        panelCostumersEdit.setLayout(panelCostumersEditLayout);
        panelCostumersEditLayout.setHorizontalGroup(
            panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCostumersEditLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addComponent(textCostumersNameEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCostumersEditLayout.createSequentialGroup()
                        .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCostumersSurnameEdit)
                            .addComponent(textCostumersPhoneEdit)
                            .addComponent(textCostumersAdressEdit))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCostumersEditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCostumersEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCostumersEditLayout.setVerticalGroup(
            panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersEditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textCostumersNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textCostumersSurnameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textCostumersPhoneEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCostumersEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textCostumersAdressEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCostumersEdit))
        );

        panelOrdersSave.setBorder(javax.swing.BorderFactory.createTitledBorder("Şipariş Ekle"));

        jLabel9.setText("Ad:");

        jLabel10.setText("Soyad:");

        jLabel14.setText("Telefon:");

        jLabel15.setText("Adres:");

        jLabel16.setText("Tutar:");

        buttonOrdersSave.setText("Ekle");
        buttonOrdersSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrdersSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOrdersSaveLayout = new javax.swing.GroupLayout(panelOrdersSave);
        panelOrdersSave.setLayout(panelOrdersSaveLayout);
        panelOrdersSaveLayout.setHorizontalGroup(
            panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdersSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOrdersSaveLayout.createSequentialGroup()
                        .addGap(0, 172, Short.MAX_VALUE)
                        .addComponent(buttonOrdersSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOrdersSaveLayout.createSequentialGroup()
                        .addGroup(panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOrdersSaveLayout.createSequentialGroup()
                                .addGroup(panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOrdersSaveLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)))
                        .addGroup(panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textOrderPhone)
                            .addComponent(textOrderName)
                            .addComponent(textOrderSurname)))
                    .addGroup(panelOrdersSaveLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(26, 26, 26)
                        .addComponent(textOrderAdress))
                    .addGroup(panelOrdersSaveLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(28, 28, 28)
                        .addComponent(textOrderCost)))
                .addContainerGap())
        );
        panelOrdersSaveLayout.setVerticalGroup(
            panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdersSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textOrderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textOrderSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textOrderPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(textOrderAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOrdersSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textOrderCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(buttonOrdersSave))
        );

        javax.swing.GroupLayout panelCostumersOperationsLayout = new javax.swing.GroupLayout(panelCostumersOperations);
        panelCostumersOperations.setLayout(panelCostumersOperationsLayout);
        panelCostumersOperationsLayout.setHorizontalGroup(
            panelCostumersOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersOperationsLayout.createSequentialGroup()
                .addGroup(panelCostumersOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelCostumersTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCostumersSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCostumersOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCostumersEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCostumersOperationsLayout.createSequentialGroup()
                        .addComponent(panelOrdersSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCostumersTableButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelCostumersOperationsLayout.setVerticalGroup(
            panelCostumersOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostumersOperationsLayout.createSequentialGroup()
                .addGroup(panelCostumersOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCostumersOperationsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelOrdersSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelCostumersTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCostumersTableButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCostumersOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCostumersEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCostumersSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Müşteri İşlemleri", panelCostumersOperations);

        panelOrdersTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Sipariş Listesi"));

        tableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrdersMouseClicked(evt);
            }
        });
        scrollPaneOrdersTable.setViewportView(tableOrders);

        javax.swing.GroupLayout panelOrdersTableLayout = new javax.swing.GroupLayout(panelOrdersTable);
        panelOrdersTable.setLayout(panelOrdersTableLayout);
        panelOrdersTableLayout.setHorizontalGroup(
            panelOrdersTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneOrdersTable, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        panelOrdersTableLayout.setVerticalGroup(
            panelOrdersTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneOrdersTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelOrdersStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Şipariş Durumu"));

        buttonOnWay.setText("Yolda");
        buttonOnWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOnWayActionPerformed(evt);
            }
        });

        buttonDelivery.setText("Teslim Ediildi");
        buttonDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeliveryActionPerformed(evt);
            }
        });

        jButton1.setText("Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonRefresh.setText("Yenile");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOrdersStatusLayout = new javax.swing.GroupLayout(panelOrdersStatus);
        panelOrdersStatus.setLayout(panelOrdersStatusLayout);
        panelOrdersStatusLayout.setHorizontalGroup(
            panelOrdersStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdersStatusLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelOrdersStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(buttonOnWay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelOrdersStatusLayout.setVerticalGroup(
            panelOrdersStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdersStatusLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(buttonOnWay, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(buttonDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout panelOrdersOperationsLayout = new javax.swing.GroupLayout(panelOrdersOperations);
        panelOrdersOperations.setLayout(panelOrdersOperationsLayout);
        panelOrdersOperationsLayout.setHorizontalGroup(
            panelOrdersOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdersOperationsLayout.createSequentialGroup()
                .addComponent(panelOrdersTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOrdersStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOrdersOperationsLayout.setVerticalGroup(
            panelOrdersOperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOrdersTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOrdersOperationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelOrdersStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sipariş İşlemleri", panelOrdersOperations);

        panelPasswordSwitch.setBorder(javax.swing.BorderFactory.createTitledBorder("Parola Değiştir"));

        jLabel11.setText("Eski Parola: ");

        jLabel12.setText("Yeni Parola: ");

        jLabel13.setText("Yeni Parola Tekrar: ");

        buttonSwitch.setText("Değiştir");
        buttonSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSwitchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPasswordSwitchLayout = new javax.swing.GroupLayout(panelPasswordSwitch);
        panelPasswordSwitch.setLayout(panelPasswordSwitchLayout);
        panelPasswordSwitchLayout.setHorizontalGroup(
            panelPasswordSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasswordSwitchLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasswordSwitchLayout.createSequentialGroup()
                .addGroup(panelPasswordSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(panelPasswordSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNewPasswordRepeat)
                    .addComponent(textNewPassword)
                    .addComponent(textOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
        );
        panelPasswordSwitchLayout.setVerticalGroup(
            panelPasswordSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordSwitchLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelPasswordSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPasswordSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPasswordSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textNewPasswordRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelUsersOptionsLayout = new javax.swing.GroupLayout(panelUsersOptions);
        panelUsersOptions.setLayout(panelUsersOptionsLayout);
        panelUsersOptionsLayout.setHorizontalGroup(
            panelUsersOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsersOptionsLayout.createSequentialGroup()
                .addComponent(panelPasswordSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 429, Short.MAX_VALUE))
        );
        panelUsersOptionsLayout.setVerticalGroup(
            panelUsersOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsersOptionsLayout.createSequentialGroup()
                .addComponent(panelPasswordSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kullanıcı Ayarları", panelUsersOptions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String cosID = "";
    
    String oID = "";
    private void tableCostumersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCostumersMouseClicked
        cosID = cosls.get(tableCostumers.getSelectedRow()).getCostumersID();
        System.out.println(cosID);
        setEnabled(true, panelCostumersTableButtons.getComponents());
    }//GEN-LAST:event_tableCostumersMouseClicked
     String editCostumersID = "";
    private void buttonCostumersTableEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCostumersTableEditActionPerformed
        editCostumersID = cosID;
        DB db = new DB();
        try {
            String query = "CALL prcCostumersGet(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, editCostumersID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                textCostumersNameEdit.setText(rs.getString("cname"));
                textCostumersSurnameEdit.setText(rs.getString("csurname"));
                textCostumersPhoneEdit.setText(rs.getString("cphone"));
                textCostumersAdressEdit.setText(rs.getString("cadress"));

            }
        } catch (SQLException e) {
            System.err.println("costumersEdit " + e);
        } finally {
            db.kapat();
        }
        setEnabled(true, panelCostumersEdit.getComponents());
        setEnabled(false, panelCostumersTableButtons.getComponents());
    }//GEN-LAST:event_buttonCostumersTableEditActionPerformed
    
   
    
    private void buttonCostumersTableDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCostumersTableDeleteActionPerformed
        Methods m = new Methods();
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {

            method.costumersDelete(this, cosID);
            setEnabled(false, panelCostumersTableButtons.getComponents());
            tableCostumers.setModel(method.costumersTable());
            cosID = "";
            cosls = m.costumersFill();
            
        }
    }//GEN-LAST:event_buttonCostumersTableDeleteActionPerformed
    ArrayList<String> costumersIDS = new ArrayList<>();
    private void buttonCostumersSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCostumersSaveActionPerformed
         Methods m = new Methods();
        if (!new Control().isALetter(textCostumersNameSave.getText())) {
            JOptionPane.showMessageDialog(this, "Ad formata uygun değil. Sadece harf giriniz.");
        } else if (!new Control().isALetter(textCostumersSurnameSave.getText())) {
            JOptionPane.showMessageDialog(this, "Soyad formata uygun değil. Sadece harf giriniz.");
        } else {
            m.costumersAdd(this, textCostumersNameSave.getText().trim(), textCostumersSurnameSave.getText().trim(), textCostumersPhoneSave.getText().trim(), textCostumersAdressSave.getText().trim());
            tableCostumers.setModel(m.costumersTable());

            cosls = m.costumersFill();
            
        }
    }//GEN-LAST:event_buttonCostumersSaveActionPerformed

    private void buttonCostumersEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCostumersEditActionPerformed
        Methods m = new Methods();
        String name = textCostumersNameEdit.getText().trim();
        String surname = textCostumersSurnameEdit.getText().trim();
        String phone = textCostumersPhoneEdit.getText().trim();
        String adress = textCostumersAdressEdit.getText().trim();

        if (name.equals("") || surname.equals("") || phone.equals("") || adress.equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else if (!new Control().isALetter(textCostumersNameEdit.getText())) {
            JOptionPane.showMessageDialog(this, "Ad formata uygun değil. Sadece harf giriniz.");
        } else if (!new Control().isALetter(textCostumersSurnameEdit.getText())) {
            JOptionPane.showMessageDialog(this, "Soyad formata uygun değil. Sadece harf giriniz.");
        } else if (!new Control().isAPhone(phone)) {
            JOptionPane.showMessageDialog(this, "Telefon formata uygun değil.");
        } else {
            m.costumersEdit(this, editCostumersID, name, surname, phone, adress);
            editCostumersID = "";
            cosID = "";
            tableCostumers.setModel(m.costumersTable());
            textCostumersNameEdit.setText("");
            textCostumersSurnameEdit.setText("");
            textCostumersPhoneEdit.setText("");
            textCostumersAdressEdit.setText("");
            setEnabled(false, panelCostumersEdit.getComponents());
        }
    }//GEN-LAST:event_buttonCostumersEditActionPerformed
    
    private void tableOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrdersMouseClicked
        oID = ordls.get(tableOrders.getSelectedRow()).getOrdersID();
    }//GEN-LAST:event_tableOrdersMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Methods m = new Methods();
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {

            method.ordersDelete(this, oID);
            
            tableOrders.setModel(method.ordersTable());
            oID = "";
            ordls = m.ordersFill();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonOnWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOnWayActionPerformed
        if (!oID.equals("")) {
            System.out.println("id:" + oID);
            String query = "UPDATE orders SET ostatus = 1 WHERE oid = '" + oID + "'";
            DB db = new DB();
            try {
                db.baglan().executeUpdate(query);
            } catch (Exception e) {
            } finally {
                db.kapat();
            }
           Methods m = new Methods();
           tableOrders.setModel(m.ordersTable());
        }
    }//GEN-LAST:event_buttonOnWayActionPerformed

    private void buttonDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeliveryActionPerformed
        if (!oID.equals("")) {
            System.out.println("id:" + oID);
            String query = "UPDATE orders SET ostatus = 2 WHERE oid = '" + oID + "'";
            DB db = new DB();
            try {
                db.baglan().executeUpdate(query);
            } catch (Exception e) {
            } finally {
                db.kapat();
            }
        }
           Methods m = new Methods();
           tableOrders.setModel(m.ordersTable());
    }//GEN-LAST:event_buttonDeliveryActionPerformed
    String addOrdersID = "";
    private void buttonOrdersAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrdersAddActionPerformed
        addOrdersID = cosID;
        DB db = new DB();
        try {
            String query = "CALL prcCostumersGet(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, addOrdersID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                textOrderName.setText(rs.getString("cname"));
                textOrderSurname.setText(rs.getString("csurname"));
                textOrderPhone.setText(rs.getString("cphone"));
                textOrderAdress.setText(rs.getString("cadress"));

            }
        } catch (SQLException e) {
            System.err.println("costumersEdit " + e);
        } finally {
            db.kapat();
        }
        setEnabled(true, panelOrdersSave.getComponents());
        setEnabled(false, panelCostumersTableButtons.getComponents());
        
    }//GEN-LAST:event_buttonOrdersAddActionPerformed

    private void buttonOrdersSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrdersSaveActionPerformed
        Orders o = new Orders();
       o.setOrdersName(textOrderName.getText());
       o.setOrdersSurname(textOrderSurname.getText());
       o.setOrdersAdress(textOrderAdress.getText());
       o.setOrdersPhone(textOrderPhone.getText());
       o.setOrdersCost(textOrderCost.getText());
       
       Methods m = new Methods();
        if (m.ordersAdd(o.getOrdersName(), o.getOrdersSurname(), o.getOrdersAdress(),o.getOrdersPhone(), o.getOrdersCost())) {
           
        }
        ordls = m.ordersFill();
            textOrderName.setText("");
            textOrderSurname.setText("");
            textOrderAdress.setText("");
            textOrderPhone.setText("");
            textOrderCost.setText("");
        setEnabled(false, panelOrdersSave.getComponents());
    }//GEN-LAST:event_buttonOrdersSaveActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        Methods m = new Methods();
        tableOrders.setModel(m.ordersTable());
        
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void buttonSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSwitchActionPerformed
    if (textNewPassword.getText().trim().equals("") || textNewPasswordRepeat.getText().trim().equals("") || textOldPassword.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else if (textNewPassword.getText().trim().equals(textNewPasswordRepeat.getText().trim())) {
            Methods m = new Methods();
            m.passwordEdit(this, textOldPassword.getText().trim(), textNewPassword.getText().trim());
        } else {
            JOptionPane.showMessageDialog(this, "Yeni parolalar uyuşmuyor. Lütfen tekrar giriniz.");
        }
    }//GEN-LAST:event_buttonSwitchActionPerformed
    
    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCostumersEdit;
    private javax.swing.JButton buttonCostumersSave;
    private javax.swing.JButton buttonCostumersTableDelete;
    private javax.swing.JButton buttonCostumersTableEdit;
    private javax.swing.JButton buttonDelivery;
    private javax.swing.JButton buttonOnWay;
    private javax.swing.JButton buttonOrdersAdd;
    private javax.swing.JButton buttonOrdersSave;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonSwitch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelCostumersEdit;
    private javax.swing.JPanel panelCostumersOperations;
    private javax.swing.JPanel panelCostumersSave;
    private javax.swing.JPanel panelCostumersTable;
    private javax.swing.JPanel panelCostumersTableButtons;
    private javax.swing.JPanel panelOrdersOperations;
    private javax.swing.JPanel panelOrdersSave;
    private javax.swing.JPanel panelOrdersStatus;
    private javax.swing.JPanel panelOrdersTable;
    private javax.swing.JPanel panelPasswordSwitch;
    private javax.swing.JPanel panelUsersOptions;
    private javax.swing.JScrollPane scrollPaneCostumersTable;
    private javax.swing.JScrollPane scrollPaneOrdersTable;
    private javax.swing.JTable tableCostumers;
    private javax.swing.JTable tableOrders;
    private javax.swing.JTextField textCostumersAdressEdit;
    private javax.swing.JTextField textCostumersAdressSave;
    private javax.swing.JTextField textCostumersNameEdit;
    private javax.swing.JTextField textCostumersNameSave;
    private javax.swing.JTextField textCostumersPhoneEdit;
    private javax.swing.JTextField textCostumersPhoneSave;
    private javax.swing.JTextField textCostumersSurnameEdit;
    private javax.swing.JTextField textCostumersSurnameSave;
    private javax.swing.JPasswordField textNewPassword;
    private javax.swing.JPasswordField textNewPasswordRepeat;
    private javax.swing.JPasswordField textOldPassword;
    private javax.swing.JTextField textOrderAdress;
    private javax.swing.JTextField textOrderCost;
    private javax.swing.JTextField textOrderName;
    private javax.swing.JTextField textOrderPhone;
    private javax.swing.JTextField textOrderSurname;
    // End of variables declaration//GEN-END:variables

    public void setEnabled(boolean enabled, Component[] comps) {
            for (Component comp : comps) {
            comp.setEnabled(enabled);
    }

    
}}
