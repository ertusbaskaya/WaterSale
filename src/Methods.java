
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Methods {
     public void passwordEdit(JFrame frame, String oldPass, String newPass){
        DB db = new DB();
        DB db2 = new DB();
        String query = "Call prcSign()";
        PreparedStatement prs = db.preBaglan(query);
        try {
            ResultSet rs = prs.executeQuery();
            while(rs.next()){
                if(!oldPass.equals(rs.getString("upassword"))){
                    JOptionPane.showMessageDialog(frame, "Parolanızı yanlış girdiniz...");
                }else if(!oldPass.equals(newPass)){
                    String quer = "CALL prcPasswordEdit(?)";
                    PreparedStatement prst = db2.preBaglan(quer);
                    prst.setString(1, newPass);
                    int update = prst.executeUpdate();
                    if(update > 0){
                        JOptionPane.showMessageDialog(frame, "Parolanız başarıyla değiştirildi...");
                    }else{
                        JOptionPane.showMessageDialog(frame, "Parola değiştirilemedi. Lütfen tekrar deneyiniz...");
                    }
                }else {
                    JOptionPane.showMessageDialog(frame, "Eski bir parolanızı girdiniz...");
                }
            }
        } catch (Exception e) {
            System.err.println("passwordEdit " + e);
        }finally{
            db.kapat();
            db2.kapat();
        }
    }
     public void costumersAdd(JFrame Frame, String costumersName, String costumersSurname, String costumersPhone, String costumersAdress){
        DB db = new DB();
        String query = "CALL prcCostumersAdd(?,?,?,?)";
        try {
            if (costumersName.equals("") || costumersSurname.equals("") || costumersPhone.equals("") || costumersAdress.equals("")) {
                JOptionPane.showMessageDialog(Frame, "Lütfen boş alan bırakmayınız...");
            }else if (!new Control().isAPhone(costumersPhone)) {
                JOptionPane.showMessageDialog(Frame, "Telefon numarası formata uygun değil.");
            }else {
                PreparedStatement prs = db.preBaglan(query);
                prs.setString(1, costumersName);
                prs.setString(2, costumersSurname);
                prs.setString(3, costumersPhone);
                prs.setString(4, costumersAdress);
                int add = prs.executeUpdate();
                if (add > 0) {
                    JOptionPane.showMessageDialog(Frame, "Müşteri başarıyla eklendi...");
                }else{
                    JOptionPane.showMessageDialog(Frame, "Müşteri eklenemedi. Lütfen tekrar deneyiniz...");
                }
            }
        } catch (Exception e) {
            System.err.println("costumersAdd " + e);
        }finally{
            db.kapat();
        }
    }
     public ArrayList<Costumers> costumersFill(){
        ArrayList<Costumers> cf = new ArrayList<>();
        
        DB db = new DB();
        String query = "CALL prcCostumersList()";
        PreparedStatement prs = db.preBaglan(query);
        
        try {
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {                
                Costumers cs = new Costumers();
                cs.setCostumersID(rs.getString("cid"));
                cs.setCostumersName(rs.getString("cname"));
                cs.setCostumersSurname(rs.getString("csurname"));
                cs.setCostumersPhone(rs.getString("cphone"));
                cs.setCostumersAdress(rs.getString("cadress"));
                cf.add(cs);
            }
        } catch (Exception e) {
            System.err.println("costumersFill " + e);
        }finally{
            db.kapat();
        }
        return cf;
    }
    
    public DefaultTableModel costumersTable(){
        DefaultTableModel table = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
        table.addColumn("Adı");
        table.addColumn("Soyadı");
        table.addColumn("Telefon");
        table.addColumn("Adres");
        
        ArrayList<Costumers> cf = costumersFill();
        
        for (Costumers item : cf) {
            table.addRow(new String[]{item.getCostumersName(), item.getCostumersSurname(), item.getCostumersPhone(), item.getCostumersAdress()});
        }
       
        return table;
    }
    
    public void costumersDelete(JFrame Frame, String costumersID){
        DB db = new DB();
        
        try {
            String query = "CALL prcCostumersDelete(?)";
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, costumersID);
            int delete = prs.executeUpdate();
            if (delete > 0) {
                JOptionPane.showMessageDialog(Frame, "Müşteri başarıyla silindi...");
            }else{
                JOptionPane.showMessageDialog(Frame, "Müşteri silinemedi. Lütfen tekrar deneyiniz...");
            }
        } catch (Exception e) {
            System.err.println("costumersDelete " + e);
        } finally{
            db.kapat();
        }
        
    }
    
    public void costumersEdit(JFrame Frame, String costumersID, String costumersName, String costumersSurname, String costumersPhone, String costumersAdress){
        DB db = new DB();
        
        try {
            String query = "CALL prcCostumersEdit(?,?,?,?,?)";
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, costumersID);
            prs.setString(2, costumersName);
            prs.setString(3, costumersSurname);
            prs.setString(4, costumersPhone);
            prs.setString(5, costumersAdress);
            int update = prs.executeUpdate();
            if (update > 0) {
                JOptionPane.showMessageDialog(Frame, "İşlem başarıyla gerçekleşti...");
            }else{
                JOptionPane.showMessageDialog(Frame, "Müşteriler güncellenemedi. Lütfen tekrar deneyiniz...");
            }
        } catch (Exception e) {
            System.out.println("costumersEdit " + e);
        } finally{
            db.kapat();
        }
    }
    public ArrayList<String> comboCostumersFill(JComboBox comboBox){
        ArrayList<String> sc = new ArrayList<>();
        String query = "CALL prcCostumersList()";
        DB db = new DB();
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        
        try {
            PreparedStatement prs = db.preBaglan(query);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {                
                combo.addElement(rs.getString("cname") + " " + rs.getString("csurname"));
                sc.add(rs.getString("cid"));
            }
            comboBox.setModel(combo);
            
        } catch (Exception e) {
            System.err.println("comboCostumersFill " + e);
        } finally{
            db.kapat();
        }
        return sc;
    }
    
    
    public ArrayList<Orders> ordersFill() {
    ArrayList<Orders> ls = new ArrayList<>();
        ls.clear();
        DB db = new DB();
        try {
            String query = "CALL prcOrdersList()";
            PreparedStatement prs = db.preBaglan(query);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                Orders od = new Orders();
                od.setOrdersID(rs.getString("oid"));
                od.setOrdersName(rs.getString("oname"));
                od.setOrdersSurname(rs.getString("osurname"));
                od.setOrdersStatus(rs.getString("ostatus"));
                od.setOrdersAdress(rs.getString("oadress"));
                od.setOrdersPhone(rs.getString("ophone"));
                od.setOrdersCost(rs.getString("ocost"));

                ls.add(od);

            }
        } catch (Exception e) {
            System.err.println("ordersFill " + e);
        }finally{
            db.kapat();
        }
        return ls;
    }
    public DefaultTableModel ordersTable() {
        ordersFill();
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }            
        };
        
        dtm.addColumn("İsim");
        dtm.addColumn("Soyisim");
        dtm.addColumn("Durum");
        dtm.addColumn("Adres");
        dtm.addColumn("Telefon");
        dtm.addColumn("Tutar");
        String Status = "";
        ArrayList<Orders> of = ordersFill();
        for (Orders l : of) {
            if (l.getOrdersStatus().equals("0")) {
                Status = "Hazırlanıyor";
            }else if(l.getOrdersStatus().equals("1")){
                Status = "Yolda";
            }else if(l.getOrdersStatus().equals("2")){
                Status = "Teslim Edildi";
            }
            dtm.addRow(new String[]{ l.getOrdersName(), l.getOrdersSurname(),Status, l.getOrdersAdress(),l.getOrdersPhone(), l.getOrdersCost()});
            Status = "";
        }
        return dtm;

    }

    public boolean ordersAdd(String name, String surname, String adress, String phone, String cost) {
        
        if (name.equals("") || surname.equals("") || adress.equals("") || phone.equals("") || cost.equals("")  ) {
            JOptionPane.showMessageDialog(null, "Lütfen boş alanları doldurun!");
            return false;
            
        }else{
              DB db = new DB();
        String status = "0";
        
        
        String query ="insert into orders values(null,'"+name+"','"+surname+"','"+status+"','"+adress+"','"+phone+"','"+cost+"')";
        try {
            int ekle = db.baglan().executeUpdate(query);
            if (ekle > 0) {
                JOptionPane.showMessageDialog(null, "Sipariş eklendi!");
                
            }
        } catch (Exception e) {
            System.err.println("Sipariş ekleme hatası: " + e);
        }finally{
            db.kapat();
        }
        return true;
        }

    }
    public void ordersDelete(JFrame Frame,String ordersID){
        DB db = new DB();
        
        try {
            String query = "CALL prcOrdersDelete(?)";
            PreparedStatement prs = db.preBaglan(query);
            prs.setString(1, ordersID);
            int delete = prs.executeUpdate();
            if (delete > 0) {
                JOptionPane.showMessageDialog(Frame, "Sipariş başarıyla silindi...");
            }else{
                JOptionPane.showMessageDialog(Frame, "Sipariş silinemedi. Lütfen tekrar deneyiniz...");
            }
        } catch (Exception e) {
            System.err.println("ordersDelete " + e);
        } finally{
            db.kapat();
        }
    }
    
    public void ordersAction(JFrame Frame, String orderName, String orderSurname, String orderPhone, String orderAdress, String orderCost){
        DB db = new DB();
        String query = "CALL prcOrdersAdd(?,?,?,?,?)";
        try {
            if (orderName.equals("") || orderSurname.equals("") || orderPhone.equals("") || orderAdress.equals("") || orderCost.equals("")) {
                JOptionPane.showMessageDialog(Frame, "Lütfen boş alan bırakmayınız...");
            }else if (!new Control().isAPhone(orderPhone)) {
                JOptionPane.showMessageDialog(Frame, "Telefon numarası formata uygun değil.");
            }else {
                PreparedStatement prs = db.preBaglan(query);
                
                prs.setString(1, orderName);
                prs.setString(2, orderSurname);
                prs.setString(3, orderPhone);
                prs.setString(4, orderAdress);
                prs.setString(5, orderCost);
                int add = prs.executeUpdate();
                if (add > 0) {
                    JOptionPane.showMessageDialog(Frame, "Sipariş başarıyla eklendi...");
                }else{
                    JOptionPane.showMessageDialog(Frame, "Sipariş eklenemedi. Lütfen tekrar deneyiniz...");
                }
            }
        } catch (Exception e) {
            System.err.println("ordersAction " + e);
        }finally{
            db.kapat();
        }
}
}

