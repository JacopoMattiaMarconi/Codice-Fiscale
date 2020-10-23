package com.company;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacky
 */
//Leggere Nome, Cognome e generare i primi 6 caratteri del codice fiscale 
//                      GENERATORE CODICE FISCALE
import java.util.*;

class GeneratoreCodFiscale {
    public static void main (String args[]){
        Scanner t=new Scanner (System.in);
        System.out.println ("Inserire il cognome (se più di uno scriverli attaccati)...");
        String cognome=t.nextLine();
        System.out.println ("Inserire il nome (se più di uno scriverli attaccati)...");
        String nome=t.nextLine();
        System.out.println ("Inserire il sesso: m oppure f...");
        String sesso=t.nextLine();
        System.out.println ("Inserire luogo di nascita...");
        String luogo=t.nextLine();
        System.out.println ("Inserire giorno di nascita...");
        int giorno=t.nextInt();
        System.out.println ("Inserire mese di nascita...");
        int mese=t.nextInt();
        System.out.println ("Inserire anno di nascita...");
        int anno=t.nextInt();
        String d=metodo1(cognome,nome,sesso,luogo,giorno,mese,anno);
        System.out.println(d);
    }

    public static String metodo1(String cn, String n, String s, String l, int g, int m, int a){
        String rs="";
        String temp="";
        l=l.toLowerCase();
        cn=cn.toLowerCase();
        n=n.toLowerCase();
        l=l.toLowerCase();
        int c=0, i=0, d=0;
        // COGNOME ...123
        for (i=0; i<cn.length(); i++){
            if (cn.charAt(i)!='a' && cn.charAt(i)!='e' && cn.charAt(i)!='i' && cn.charAt(i)!='o' && cn.charAt(i)!='u'){
                rs=rs+cn.charAt(i);
                c++;
            }
            if (c==3){
                i=cn.length();
            }
        }
        if (c==0 && cn.length()>2){
            rs="";
            for (i=0; i<3; i++){
                rs=rs+cn.charAt(i);
            }
        }
        if (c==0 && cn.length()<3){
            rs="";
            for (i=0; i<cn.length(); i++){
                d=d+1;
            }
            if (d==1){
                rs=rs+cn+'x'+'x';
            }
            if (d==2){
                rs=rs+cn+'x';
            }
        }
        if (c==1 && cn.length()>2){
            rs="";
            for (i=0; i<cn.length(); i++){
                if (cn.charAt(i)!='a' && cn.charAt(i)!='e' && cn.charAt(i)!='i' && cn.charAt(i)!='o' && cn.charAt(i)!='u'){
                    rs=rs+cn.charAt(i);
                }
            }
            for (i=0; i<cn.length(); i++){
                if (cn.charAt(i)=='a' || cn.charAt(i)=='e' || cn.charAt(i)=='i' || cn.charAt(i)=='o' || cn.charAt(i)=='u'){
                    rs=rs+cn.charAt(i);
                    c++;
                    if (c==3){
                        i=cn.length();
                    }
                }
            }
        }
        if (c==1 && cn.length()<3){
            rs="";
            for (i=0; i<cn.length(); i++){
                if (cn.charAt(i)!='a' && cn.charAt(i)!='e' && cn.charAt(i)!='i' && cn.charAt(i)!='o' && cn.charAt(i)!='u'){
                    rs=rs+cn.charAt(i);
                }
            }
            for (i=0; i<cn.length(); i++){
                if (cn.charAt(i)=='a' || cn.charAt(i)=='e' || cn.charAt(i)=='i' || cn.charAt(i)=='o' || cn.charAt(i)=='u'){
                    rs=rs+cn.charAt(i);
                    c++;
                }
            }
            if (c==1){
                rs=rs+'x'+'x';
            }
            if (c==2){
                rs=rs+'x';
            }
        }
        if (c==2 && cn.length()>2){
            rs="";
            for (i=0; i<cn.length(); i++){
                if (cn.charAt(i)!='a' && cn.charAt(i)!='e' && cn.charAt(i)!='i' && cn.charAt(i)!='o' && cn.charAt(i)!='u'){
                    rs=rs+cn.charAt(i);
                }
            }
            for (i=0; i<cn.length(); i++){
                if (cn.charAt(i)=='a' || cn.charAt(i)=='e' || cn.charAt(i)=='i' || cn.charAt(i)=='o' || cn.charAt(i)=='u'){
                    rs=rs+cn.charAt(i);
                    c++;
                    if (c==3){
                        i=cn.length();
                    }
                }
            }
        }
        if (c==2 && cn.length()<3){
            rs="";
            for (i=0; i<cn.length(); i++){
                if (cn.charAt(i)!='a' && cn.charAt(i)!='e' && cn.charAt(i)!='i' && cn.charAt(i)!='o' && cn.charAt(i)!='u'){
                    rs=rs+cn.charAt(i);
                }
            }
            for (i=0; i<cn.length(); i++){
                if (cn.charAt(i)=='a' || cn.charAt(i)=='e' || cn.charAt(i)=='i' || cn.charAt(i)=='o' || cn.charAt(i)=='u'){
                    rs=rs+cn.charAt(i);
                }
            }
            rs=rs+'x';
        }
        // NOME ...186
        c=0;
        temp="";
        for (i=0; i<n.length(); i++){
            if (n.charAt(i)!='a' && n.charAt(i)!='e' && n.charAt(i)!='i' && n.charAt(i)!='o' && n.charAt(i)!='u'){
                temp=temp+n.charAt(i);
                c++;
            }
        }
        if (c>3){
            rs=rs+temp.charAt(0)+temp.charAt(2)+temp.charAt(3);
        }
        if (c==3){
            rs=rs+temp;
        }
        if (c==2 && n.length()>2){
            rs=rs+temp;
            for (i=0; i<n.length(); i++){
                if (n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u'){
                    rs=rs+n.charAt(i);
                    i=n.length();
                }
            }
        }
        if (c==2 && n.length()<3){
            rs=rs+temp+'x';
        }
        if (c==1 && n.length()>2){
            rs=rs+temp;
            for (i=0; i<n.length(); i++){
                if (n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u'){
                    rs=rs+n.charAt(i);
                    c++;
                }
                if (c==3){
                    i=n.length();
                }
            }
        }
        if (c==1 && n.length()<3){
            for (i=0; i<n.length(); i++){
                if (n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u'){
                    rs=rs+temp+n.charAt(i)+'x';
                }
            }
        }
        if (c==0 && n.length()>2){
            rs=rs+n.charAt(0)+n.charAt(1)+n.charAt(2);
        }
        if (c==0 && n.length()==2){
            rs=rs+n+'x';
        }
        if (c==0 && n.length()==1){
            rs=rs+n+'x'+'x';
        }
        // DATA DI NASCITA: ANNO ...193
        if (a>1999 && a<2010){
            rs=rs+'0'+a%100;
        }
        else{
            rs=rs+a%100;
        }
        // DATA DI NASCITA: MESE ...230
        if (m==1){
            rs=rs+'a';
        }
        if (m==2){
            rs=rs+'b';
        }
        if (m==3){
            rs=rs+'c';
        }
        if (m==4){
            rs=rs+'d';
        }
        if (m==5){
            rs=rs+'e';
        }
        if (m==6){
            rs=rs+'h';
        }
        if (m==7){
            rs=rs+'l';
        }
        if (m==8){
            rs=rs+'m';
        }
        if (m==9){
            rs=rs+'p';
        }
        if (m==10){
            rs=rs+'r';
        }
        if (m==11){
            rs=rs+'s';
        }
        if (m==12){
            rs=rs+'t';
        }
        // DATA NASCITA: GIORNO ...249
        if (s.charAt(0)=='m' || s.charAt(0)=='M'){
            if (g>1 && g<9){
                rs=rs+'0'+g;
            }
            if (g>9 && g<32){
                rs=rs+g;
            }
        }
        if (s.charAt(0)=='f' || s.charAt(0)=='F'){
            if (g>1 && g<9){
                g=40+g;
                rs=rs+g;
            }
            if (g>9 && g<32){
                g=40+g;
                rs=rs+g;
            }
        }
        // LUOGO DI NASCITA ...388
        if (l.equals("negrar")){
            rs=rs+"f861";
        }
        if (l.equals("verona")){
            rs=rs+"l781";
        }
        if (l.equals("peschiera del garda")){
            rs=rs+"g489";
        }
        if (l.equals("bussolengo")){
            rs=rs+"b296";
        }
        if (l.equals("castelnuovo del garda")){
            rs=rs+"c225";
        }
        if (l.equals("san giovanni lupatoto")){
            rs=rs+"h924";
        }
        if (l.equals("cologna veneta")){
            rs=rs+"c890";
        }
        if (l.equals("sant'ambrogio di valpolicella")){
            rs=rs+"i259";
        }
        if (l.equals("affi")){
            rs=rs+"a061";
        }
        if (l.equals("caprino veronese")){
            rs=rs+"b709";
        }
        if (l.equals("malcesine")){
            rs=rs+"e848";
        }
        if (l.equals("villafranca di verona")){
            rs=rs+"l949";
        }
        if (l.equals("legnago")){
            rs=rs+"e512";
        }
        if (l.equals("san bonifacio")){
            rs=rs+"h783";
        }
        if (l.equals("illasi")){
            rs=rs+"e284";
        }
        if (l.equals("san martino buon albergo")){
            rs=rs+"i003";
        }
        if (l.equals("bovolone")){
            rs=rs+"b107";
        }
        if (l.equals("vicenza")){
            rs=rs+"l840";
        }
        if (l.equals("treviso")){
            rs=rs+"l407";
        }
        if (l.equals("venezia")){
            rs=rs+"l736";
        }
        if (l.equals("belluno")){
            rs=rs+"a757";
        }
        if (l.equals("rovigo")){
            rs=rs+"h620";
        }
        if (l.equals("padova")){
            rs=rs+"g224";
        }
        if (l.equals("trento")){
            rs=rs+"l378";
        }
        if (l.equals("brescia")){
            rs=rs+"b157";
        }
        if (l.equals("mantova")){
            rs=rs+"e897";
        }
        if (l.equals("milano")){
            rs=rs+"f205";
        }
        if (l.equals("roma")){
            rs=rs+"h501";
        }
        if (l.equals("napoli")){
            rs=rs+"f839";
        }
        if (l.equals("torino")){
            rs=rs+"l219";
        }
        if (l.equals("genova")){
            rs=rs+"d969";
        }
        if (l.equals("bergamo")){
            rs=rs+"a794";
        }
        if (l.equals("bologna")){
            rs=rs+"a944";
        }
        if (l.equals("firenze")){
            rs=rs+"d612";
        }
        if (l.equals("udine")){
            rs=rs+"l483";
        }
        if (l.equals("trieste")){
            rs=rs+"l424";
        }
        if (l.equals("palermo")){
            rs=rs+"g273";
        }
        if (l.equals("cagliari")){
            rs=rs+"b354";
        }
        if (l.equals("lecce")){
            rs=rs+"e506";
        }
        if (l.equals("bari")){
            rs=rs+"a662";
        }
        if (l.equals("catania")){
            rs=rs+"c351";
        }
        if (l.equals("messina")){
            rs=rs+"f158";
        }
        if (l.equals("taranto")){
            rs=rs+"l049";
        }
        if (l.equals("parma")){
            rs=rs+"g337";
        }
        if (l.equals("prato")){
            rs=rs+"g999";
        }
        // CARATTERE DI CONTROLLO ...639
        int somma=0;
        for (i=0; i<rs.length(); i++){
            if (i%2==1){
                if (rs.charAt(i)=='a' || rs.charAt(i)=='0'){
                    somma=somma+0;
                }
                if (rs.charAt(i)=='o'){
                    somma=somma+14;
                }
                if (rs.charAt(i)=='b' || rs.charAt(i)=='1'){
                    somma=somma+1;
                }
                if (rs.charAt(i)=='p'){
                    somma=somma+15;
                }
                if (rs.charAt(i)=='c' || rs.charAt(i)=='2'){
                    somma=somma+2;
                }
                if (rs.charAt(i)=='q'){
                    somma=somma+16;
                }
                if (rs.charAt(i)=='d' || rs.charAt(i)=='3'){
                    somma=somma+3;
                }
                if (rs.charAt(i)=='r'){
                    somma=somma+17;
                }
                if (rs.charAt(i)=='e' || rs.charAt(i)=='4'){
                    somma=somma+4;
                }
                if (rs.charAt(i)=='s'){
                    somma=somma+18;
                }
                if (rs.charAt(i)=='f' || rs.charAt(i)=='5'){
                    somma=somma+5;
                }
                if (rs.charAt(i)=='t'){
                    somma=somma+19;
                }
                if (rs.charAt(i)=='g' || rs.charAt(i)=='6'){
                    somma=somma+6;
                }
                if (rs.charAt(i)=='u'){
                    somma=somma+20;
                }
                if (rs.charAt(i)=='h' || rs.charAt(i)=='7'){
                    somma=somma+7;
                }
                if (rs.charAt(i)=='v'){
                    somma=somma+21;
                }
                if (rs.charAt(i)=='i' || rs.charAt(i)=='8'){
                    somma=somma+8;
                }
                if (rs.charAt(i)=='w'){
                    somma=somma+22;
                }
                if (rs.charAt(i)=='j' || rs.charAt(i)=='9'){
                    somma=somma+9;
                }
                if (rs.charAt(i)=='x'){
                    somma=somma+23;
                }
                if (rs.charAt(i)=='k'){
                    somma=somma+10;
                }
                if (rs.charAt(i)=='y'){
                    somma=somma+24;
                }
                if (rs.charAt(i)=='l'){
                    somma=somma+11;
                }
                if (rs.charAt(i)=='z'){
                    somma=somma+25;
                }
                if (rs.charAt(i)=='m'){
                    somma=somma+12;
                }
                if (rs.charAt(i)=='n'){
                    somma=somma+13;
                }
            }
            if (i%2==0){
                if (rs.charAt(i)=='a' || rs.charAt(i)=='0'){
                    somma=somma+1;
                }
                if (rs.charAt(i)=='o'){
                    somma=somma+11;
                }
                if (rs.charAt(i)=='b' || rs.charAt(i)=='1'){
                    somma=somma+0;
                }
                if (rs.charAt(i)=='p'){
                    somma=somma+3;
                }
                if (rs.charAt(i)=='c' || rs.charAt(i)=='2'){
                    somma=somma+5;
                }
                if (rs.charAt(i)=='q'){
                    somma=somma+6;
                }
                if (rs.charAt(i)=='d' || rs.charAt(i)=='3'){
                    somma=somma+7;
                }
                if (rs.charAt(i)=='r'){
                    somma=somma+8;
                }
                if (rs.charAt(i)=='e' || rs.charAt(i)=='4'){
                    somma=somma+9;
                }
                if (rs.charAt(i)=='s'){
                    somma=somma+12;
                }
                if (rs.charAt(i)=='f' || rs.charAt(i)=='5'){
                    somma=somma+13;
                }
                if (rs.charAt(i)=='t'){
                    somma=somma+14;
                }
                if (rs.charAt(i)=='g' || rs.charAt(i)=='6'){
                    somma=somma+15;
                }
                if (rs.charAt(i)=='u'){
                    somma=somma+16;
                }
                if (rs.charAt(i)=='h' || rs.charAt(i)=='7'){
                    somma=somma+17;
                }
                if (rs.charAt(i)=='v'){
                    somma=somma+10;
                }
                if (rs.charAt(i)=='i' || rs.charAt(i)=='8'){
                    somma=somma+19;
                }
                if (rs.charAt(i)=='w'){
                    somma=somma+22;
                }
                if (rs.charAt(i)=='j' || rs.charAt(i)=='9'){
                    somma=somma+21;
                }
                if (rs.charAt(i)=='x'){
                    somma=somma+25;
                }
                if (rs.charAt(i)=='k'){
                    somma=somma+2;
                }
                if (rs.charAt(i)=='y'){
                    somma=somma+24;
                }
                if (rs.charAt(i)=='l'){
                    somma=somma+4;
                }
                if (rs.charAt(i)=='z'){
                    somma=somma+23;
                }
                if (rs.charAt(i)=='m'){
                    somma=somma+18;
                }
                if (rs.charAt(i)=='n'){
                    somma=somma+20;
                }
            }
        }
        somma=somma%26;
        if (somma==0){
            rs=rs+'a';
        }
        if (somma==14){
            rs=rs+'o';
        }
        if (somma==1){
            rs=rs+'b';
        }
        if (somma==15){
            rs=rs+'p';
        }
        if (somma==2){
            rs=rs+'c';
        }
        if (somma==16){
            rs=rs+'q';
        }
        if (somma==3){
            rs=rs+'d';
        }
        if (somma==17){
            rs=rs+'r';
        }
        if (somma==4){
            rs=rs+'e';
        }
        if (somma==18){
            rs=rs+'s';
        }
        if (somma==5){
            rs=rs+'f';
        }
        if (somma==19){
            rs=rs+'t';
        }
        if (somma==6){
            rs=rs+'g';
        }
        if (somma==20){
            rs=rs+'u';
        }
        if (somma==7){
            rs=rs+'h';
        }
        if (somma==21){
            rs=rs+'v';
        }
        if (somma==8){
            rs=rs+'i';
        }
        if (somma==22){
            rs=rs+'w';
        }
        if (somma==9){
            rs=rs+'j';
        }
        if (somma==23){
            rs=rs+'x';
        }
        if (somma==10){
            rs=rs+'k';
        }
        if (somma==24){
            rs=rs+'y';
        }
        if (somma==11){
            rs=rs+'l';
        }
        if (somma==25){
            rs=rs+'z';
        }
        if (somma==12){
            rs=rs+'m';
        }
        if (somma==13){
            rs=rs+'n';
        }
        rs=rs.toUpperCase();
        return rs;
    }
}