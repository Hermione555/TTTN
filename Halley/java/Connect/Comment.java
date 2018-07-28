/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

/**
 *
 * @author HANG
 */
public class Comment {
    private String email;
    private String noiDung;
    private String thoiGian;

    public Comment(String email, String noiDung, String thoiGian) {
        this.email = email;
        this.noiDung = noiDung;
        this.thoiGian = thoiGian;
    }

    public String getEmail() {
        return email;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public String getThoiGian() {
        return thoiGian;
    }
    
}
