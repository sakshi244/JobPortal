package onlinejobportal;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MySqlCommands {
 
    String UserLogin(String user, String pass) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from loginperson");
        while (rs.next()) {
            if (rs.getString("userid").equals(user) && rs.getString("password").equals(pass)) {
                Statement st1 = connect.createStatement();
                ResultSet rs1 = st.executeQuery("select * from person");
                while (rs1.next()) {
                    if (rs1.getString("userid").equals(user))
                        return rs1.getString("type");
                }
            }
        }
        return "";
    }
    
    boolean AdminLogin(String user, String pass) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from loginadmin");
        while (rs.next()) {
            if (rs.getString("userid").equals(user) && rs.getString("password").equals(pass))
                return true;
        }
        return false;
    }
    
    void addProfile(String userid, String emailid, String password, String fname, String lname, String pnum, String dob, String type, String sex, String street, String city, String state, String pincode) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from zip");
        boolean check = false;
        int zip = Integer.parseInt(pincode);
        while (rs.next()) {
            if (rs.getInt("zipcode") == zip) {
                check = true;
                break;
            }
        }
        if (check == false) {
            PreparedStatement ps = connect.prepareStatement("insert into zip values (?, ?, ?)");
            ps.setInt(1, zip);
            ps.setString(2, city);
            ps.setString(3, state);
            ps.executeUpdate();
        }
        PreparedStatement ps = connect.prepareStatement("insert into person values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        ps.setString(1, userid);
        ps.setString(2, fname);
        ps.setString(3, lname);
        ps.setString(4, emailid);
        ps.setString(6, street);
        ps.setString(7, pnum);
        ps.setString(8, type);
        ps.setString(9, sex);
        ps.setInt(10, zip);
        int y, m, d;
        y = Integer.parseInt(dob.substring(6, 10));
        m = Integer.parseInt(dob.substring(3, 5));
        d = Integer.parseInt(dob.substring(0, 2));
        ps.setDate(5, new java.sql.Date(y - 1900, m - 1, d));
        ps.executeUpdate();
        PreparedStatement ps1 = connect.prepareStatement("insert into loginperson values (?, ?)");
        ps1.setString(1, userid);
        ps1.setString(2, password);
        ps1.executeUpdate();
    }
    
    boolean userIdExist(String user) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from person");
        
        while (rs.next()) {
            if (rs.getString("userid").equals(user))
                return true;
        }
        
        return false;
    }
    
    boolean emailIdExist(String email) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from person");
        
        while (rs.next()) {
            if (rs.getString("emailid").equals(email))
                return true;
        }
        
        return false;
    }
    
    void addOrganisation(String name, String type, String location, String details) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        PreparedStatement ps = connect.prepareStatement("insert into company values (?, ?, ?, ?, ?)");
        ps.setString(1, name);
        ps.setString(2, location);
        ps.setString(3, type);
        ps.setString(4, details);
        ps.setString(5, "no");
        ps.executeUpdate();
    }
    
    boolean oldPass (String user, String pass) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from loginperson");
        while (rs.next()) {
            if (rs.getString("userid").equals(user) && rs.getString("password").equals(pass))
                return true;
        }
        return false;
    }
    
    void updateNewPass (String user, String pass) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        PreparedStatement ps = connect.prepareStatement("update loginperson set password = ? where userid = ?");
        ps.setString(1, pass);
        ps.setString(2, user);
        ps.executeUpdate();
    }
    
    void updatePerson(String user, String fname, String lname, String email, String pnum, String street, String city, String state, String zipcode) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        boolean check = false;
	Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from zip");
        while (rs.next()) {
            if (rs.getInt("zipcode") == Integer.parseInt(zipcode)) {
                PreparedStatement ps1 = connect.prepareStatement("update zip set city = ?, state = ? where zipcode = ?");
                ps1.setString(1, city);
                ps1.setString(2, state);
                ps1.setInt(3, Integer.parseInt(zipcode));
                ps1.executeUpdate();
                check = true;
                break;
            }
        }
        if (check == false) {
            PreparedStatement ps1 = connect.prepareStatement("insert into zip values (?, ?, ?)");
            ps1.setInt(1, Integer.parseInt(zipcode));
            ps1.setString(2, city);
            ps1.setString(3, state);
            ps1.executeUpdate();
        }
        PreparedStatement ps = connect.prepareStatement("update person set fname = ?, lname = ?, emailid = ? , street = ?, zipcode = ?, phone = ? where userid = ?");
        ps.setString(1, fname);
        ps.setString(2, lname);
        ps.setString(3, email);
        ps.setString(4, street);
        ps.setInt(5, Integer.parseInt(zipcode));
        ps.setString(6, pnum);
        ps.setString(7, user);
        ps.executeUpdate();
    }

    ObservableList<String> getCompanyList() throws Exception {
        ObservableList<String> company = FXCollections.observableArrayList();
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from company");
        while (rs.next()) {
            if (rs.getString("approved").equals("yes"))
                company.add(rs.getString("cname"));
        }
        return company;
    }
    
    void updateCompany(String title, String cname, String type, String date, String desc, String user) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        PreparedStatement ps = connect.prepareStatement("insert into job (jobtitle, cname, type, deadline, approved, description) values (?, ?, ?, ?, ?, ?)");
        ps.setString(1, title);
        ps.setString(2, cname);
        ps.setString(3, type);
        ps.setString(5, "no");
        ps.setString(6, desc);
        int y, m, d;
        y = Integer.parseInt(date.substring(6, 10));
        m = Integer.parseInt(date.substring(3, 5));
        d = Integer.parseInt(date.substring(0, 2));
        ps.setDate(4, new java.sql.Date(y - 1900, m - 1, d));
        ps.executeUpdate();
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select max(jobid) from job");
        rs.next();
        int lastid = rs.getInt("max(jobid)");
        PreparedStatement ps1 = connect.prepareStatement("insert into post values (?, ?)");
        ps1.setInt(1, lastid);
        ps1.setString(2, user);
        ps1.executeUpdate();
    }
    
    boolean isPasswordSame(String pass) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from loginadmin");
        while (rs.next()) {
            if (rs.getString("userid").equals("admin") && rs.getString("password").equals(pass))
                return true;
        }
        return false;
    }

    void updateAdminPass(String pass) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        PreparedStatement ps = connect.prepareStatement("update loginadmin set password = ? where userid = ?");
        ps.setString(1, pass);
        ps.setString(2, "admin");
        ps.executeUpdate();
    }

    void updateApproval (String cname) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        PreparedStatement ps = connect.prepareStatement("update company set approved = ? where cname = ?");
        ps.setString(1, "yes");
        ps.setString(2, cname);
        ps.executeUpdate();
    }
    
    void updateJobApproval (int jbid) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        PreparedStatement ps = connect.prepareStatement("update job set approved = ? where jobid = ?");
        ps.setString(1, "yes");
        ps.setInt(2, jbid);
        ps.executeUpdate();
    }
    
    void deleteCompany (String cname) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        PreparedStatement ps = connect.prepareStatement("delete from company where cname = ?");
        ps.setString(1, cname);
        ps.executeUpdate();
    }
    
    void deleteJob (int jbid) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        PreparedStatement ps1 = connect.prepareStatement("delete from post where jobid = ?");
        ps1.setInt(1, jbid);
        ps1.executeUpdate();
        PreparedStatement ps = connect.prepareStatement("delete from job where jobid = ?");
        ps.setInt(1, jbid);
        ps.executeUpdate();
    }
    
    void updateResume(String user, File file) throws Exception {
        boolean check = false;
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        int tmp = 0;
        ResultSet rs = st.executeQuery("select * from upload");
        while (rs.next()) {
            if (rs.getString("userid").equals(user)) {
                tmp = rs.getInt("resumeid");
                check = true;
                break;
            }
        }
        if (check == true) {
            PreparedStatement ps = connect.prepareStatement("update resume set resum = ? where resumeid = ?");
            ps.setBinaryStream(1, new FileInputStream(file), (int) file.length());
            ps.setInt(2, tmp);
            ps.executeUpdate();
        }
        else {
            PreparedStatement ps = connect.prepareStatement("insert into resume set resum = ?");
            ps.setBinaryStream(1, (InputStream) new FileInputStream(file), (int)file.length());
            ps.executeUpdate();
            Statement st1 = connect.createStatement();
            ResultSet rs1 = st.executeQuery("select max(resumeid) from resume");
            rs1.next();
            int lastid = rs1.getInt("max(resumeid)");
            PreparedStatement ps1 = connect.prepareStatement("insert into upload set resumeid = ?, userid = ?");
            ps1.setInt(1, lastid);
            ps1.setString(2, user);
            ps1.executeUpdate();
            
        }
    }
    
    ObservableList<String> getLocation() throws Exception {
        ObservableList<String> location = FXCollections.observableArrayList();
        Class.forName("com.mysql.jdbc.Driver");
        location.add("Select Location");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojp", "root", "password");
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from company");
        while (rs.next()) {
            location.add(rs.getString("location"));
        }
        return location;
    }
}
