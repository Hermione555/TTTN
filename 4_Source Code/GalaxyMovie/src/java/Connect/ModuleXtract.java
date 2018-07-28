/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HANG
 */
public class ModuleXtract {
    private ArrayList<String> Terms = new ArrayList<String>();
    private ArrayList<Float> TermValues = new ArrayList<Float>();
    private ArrayList<Float> G; 
    private ArrayList<Float> N;
    private ArrayList<Float> P;
    List<TuDien> tuDien = new ArrayList<TuDien>();

    public ModuleXtract() {
        tuDien = Connect.getTuDien();
        System.out.println(tuDien.get(0));
    }
    


        public String xTract(String vanBan)
        {
        String strTextOut = "";
        vanBan = vanBan.replace('!', '.'); // chuy?n d?u k?t ! -> .
        vanBan = vanBan.replace('?', '.'); // ? -> .
        //System.out.println(textInput);
        String[] tapCauHoanHao = vanBan.split("\\."); // tách câu
        String[] words;
        String[] terms;
        Terms = new ArrayList();
        TermValues = new ArrayList();
        
        for (String cauHoanHao : tapCauHoanHao) {

            cauHoanHao = cauHoanHao.replace(';', ','); // chuy?n d?u k?t ; -> ,

            terms = cauHoanHao.split("\\,"); // Tách câu

            for (String cumTu : terms) {
                words = cumTu.split(" ");
                int start = 0;
                int stop = words.length;
                boolean isStop = false;
                String Term = "";

                //JDBC.mo("Emo_Dictionary");
                while (isStop == false && stop >= 0) {
                    Term = "";
                    for (int i = start; i < stop; i++) {
                        Term += words[i] + " ";
                    }
                    TuDien tu = findTerm(Term.trim());
                    
                    if (!tu.getTu().equals("")) {
                        Terms.add(tu.getTu().trim());
                        TermValues.add(tu.getTrongSo());
                        strTextOut += tu.getTu() + ": " + tu.getTrongSo() + " | ";
                        System.out.println(strTextOut);
                        if (start == 0) {
                            isStop = true;
                        } else {
                            stop = start - 1;
                            start = 0;
                        }
                    } else {
                        if (start == stop) {
                            stop--;
                            start = 0;
                        } else {
                            start++;
                        }
                    }
                }
            }
            }
            createVector();
            return summary();
        }

            
        
        private TuDien findTerm(String Term){
            for (int i = 0; i < tuDien.size(); i++) {
                        TuDien temp = tuDien.get(i);
                        if(temp.getTu().equals(Term)){
                            return temp;
                        }
                        
        }
            return new TuDien();
    }
        private void createVector() {
        G = TermValues;
        N = new ArrayList<Float>();
        P = new ArrayList<Float>();

        for (int i = 0; i < G.size(); i++) { // duy?t list G d? l?c ra khen/chê
            if (G.get(i) == 0) { // n?u t? dó k khen không chê ( tr?ng s? = 0 ) thì ta dua vào c? 2 vector khen và chê
                P.add(G.get(i));
                N.add(G.get(i));
                continue;
            } else if (G.get(i) < 0) { // n?u t? dó là chê ( tr?ng s? âm ) gán vào N và gán 0 vào vector khen
                P.add((float)0);
                N.add(G.get(i));
                continue;
            } else if (G.get(i) > 0) { // n?u là khen thì ngu?c l?i v?i chê
                N.add((float)0);
                P.add(G.get(i));
            }
        }
    }
        private double coSin(ArrayList<Float> X) {
        // cách tính (pow(N/P,2)/((sqrt(pow(N/P,2)))*(sqrt(pow(G,2))))
        double sumPowX = 0; // Tổng Pow P/N ( khen / chê )
        double sumPowG = 0; // Tổng Pow G ( t?ng )
        double denominator = 0; // m?u s?
        for (int i = 0; i < G.size(); i++) {
            sumPowX += (double) Math.pow(X.get(i), 2); // T?ng bình phuong vector N/P
            sumPowG += (double) Math.pow(G.get(i), 2); // T?ng bình phuong vector G
        }
        denominator = Math.sqrt(sumPowX) * Math.sqrt(sumPowG); // can sumPowX(P/N) * Can SumPowG
        if (denominator == 0)
            return 0;
        return (sumPowX / denominator);
    }
        public String summary(){
        
        double cosinNG = (double) Math.round(coSin(N) * 1000) / 1000;
        double cosinPG = (double) Math.round(coSin(P) * 1000) / 1000;
        double result = cosinPG-cosinNG;
            System.out.println("cosin(P,G): "+cosinPG+" | "+ "cosin(N,G): "+cosinNG);
        if (result>0) {
            return "Tích cực";
        } else {
            if (result == 0) {
                return "Trung lập";
            } else {
                return "Tiêu cực";
            }
        }

        //str += " | cosin(N,G)=" + cosinNG + " | consin(P,G)=" + cosinPG;

        //System.out.println("Summary : "+str);
    }
        
        public static void main(String[] args) {
        ModuleXtract  xTract= new ModuleXtract();
        String result = xTract.xTract("phim này hay ghê. Nội dung phim cũng được.");
        System.out.println(result); 
        //String []front1 = {"rất-0.5","cực-0.5","cực kì-2","vô cùng-3"}; // chuỗi những từ đứng trước seed
        //String []front2= {"cực kì","vô cùng"}; // 2
       // String seed ="";
//        Scanner scn = new Scanner(System.in);
//            System.out.print("Nhập từ hạt giống:");
//            seed=scn.nextLine();
//            System.out.println(temp[0]+" "+temp[1]);
           // for(int i=0;i<front1.length;i++){
           //     String []temp = front1[i].split("-");
            //    System.out.println(temp[0]+" "+temp[1]);
           // }
           
           
           
           
           
           
           
    }
}

