/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marksheet;

import java.awt.Color;

/**
 *
 * @author A.R COM
 */
public class c extends javax.swing.JFrame {
String c1, c2, c3, c4, c5, c6, c7,c8,c9,c10;
    double gp1,gp2,gp3,gp4,gp5;
    String g1,g2,g3,g4,g5;
    
    String sgp1,sgp2,sgp3,sgp4,sgp5;
    
    double cq1,cq2,cq3,cq4,cq5;
    String sc1,sc2,sc3,sc4,sc5;
    String sg1,sg2,sg3,sg4,sg5;
    String r;
    String sr1,sr2,sr3,sr4,sr5,srgpa;
    String fr1,fr2,fr3,fr4,fr5,frgpa;
    
    String sgpa;
    
    double dfq1,dfq2,dfq3,dfq4,dfq5;
    double dgpa;
    /**
     * Creates new form c
     */
    public c() {
        initComponents();
    }
        
        public c(String c1,String c2,String c3,String b1,String b2,String b3,String b4,String b5,String b6,String b7,String b8,String b9,String b10,String b11,String b12,String b13,String b14,String b15,String b16,String b17,String b18,String b19,String b20,String b21,String b22,String b23,String b24,String b25,String b26,String b27,String b28,String b29,String b30,String b31,String b32,String b33,String b34,String b35,String c4,String c5,String c6,String c7,String c8,String c9,String c10){
        initComponents();
        
        jLabel2.setText(c6);
        jLabel4.setText(c7);
        jLabel6.setText(c8);
        jLabel12.setText(c1);
        jLabel14.setText(c2);
        jLabel16.setText(c9);
        jLabel23.setText(c10);
        jLabel18.setText(c3);
        jLabel20.setText(c5);
        jLabel22.setText(c4);
        
        jTextField6.setText(b1);
        jTextField7.setText(b2);
        jTextField8.setText(b3);
        jTextField9.setText(b4);
        jTextField10.setText(b5);
        jTextField11.setText(b6);
        jTextField12.setText(b7);
        jTextField13.setText(b8);
        jTextField14.setText(b9);
        jTextField15.setText(b10);
        jTextField16.setText(b11);
        jTextField17.setText(b12);
        jTextField18.setText(b13);
        jTextField19.setText(b14);
        jTextField20.setText(b15);
        jTextField21.setText(b16);
        jTextField22.setText(b17);
        jTextField23.setText(b18);
        jTextField24.setText(b19);
        jTextField25.setText(b20);
        jTextField26.setText(b21);
        jTextField27.setText(b22);
        jTextField28.setText(b23);
        jTextField29.setText(b24);
        jTextField30.setText(b25);
        jTextField31.setText(b26);
        jTextField32.setText(b27);
        jTextField33.setText(b28);
        jTextField34.setText(b29);
        jTextField35.setText(b30);
        jTextField36.setText(b31);
        jTextField37.setText(b32);
        jTextField38.setText(b33);
        jTextField39.setText(b34);
        jTextField40.setText(b35);
        
        //from b
        
        
        int i11=Integer.parseInt(b11);
        int i12=Integer.parseInt(b12);
        int i13=Integer.parseInt(b13);
        int i14=Integer.parseInt(b14);
        int i15=Integer.parseInt(b15);
        int i16=Integer.parseInt(b16);
        int i17=Integer.parseInt(b17);
        int i18=Integer.parseInt(b18);
        int i19=Integer.parseInt(b19);
        int i20=Integer.parseInt(b20);
        int i21=Integer.parseInt(b21);
        int i22=Integer.parseInt(b22);
        int i23=Integer.parseInt(b23);
        int i24=Integer.parseInt(b24);
        int i25=Integer.parseInt(b25);
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31=Integer.parseInt(b31);
        int i32=Integer.parseInt(b32);
        int i33=Integer.parseInt(b33);
        int i34=Integer.parseInt(b34);
        int i35=Integer.parseInt(b35);
        
        if(b26.equals("-")){
            i26=0;
        }
        else{
            i26=Integer.parseInt(b26);
        }
        if(b27.equals("-")){
            i27=0;
        }
        else{
            i27=Integer.parseInt(b27);
        }
        if(b28.equals("-")){
            i28=0;
        }
        else{
            i28=Integer.parseInt(b28);
        }
        if(b29.equals("-")){
            i29=0;
        }
        else{
            i29=Integer.parseInt(b29);
        }
        if(b30.equals("-")){
            i30=0;
        }
        else{
            i30=Integer.parseInt(b30);
        }
        
        int m1=i16+i21+i26;
        int m2=i17+i22+i27;
        int m3=i18+i23+i28;
        int m4=i19+i24+i29;
        int m5=i20+i25+i30;
        
        int i1=i16+i21+i26+i31;
        int i2=i17+i22+i27+i32;
        int i3=i18+i23+i28+i33;
        int i4=i19+i24+i29+i34;
        int i5=i20+i25+i30+i35;
        
                
        String t1=""+i1;
        String t2=""+i2;
        String t3=""+i3;
        String t4=""+i4;
        String t5=""+i5;
        
        double d1=i1;
        double d2=i2;
        double d3=i3;
        double d4=i4;
        double d5=i5;
        
        
       if((m1>25)&&(i31>25)){
        //for gp1
        if((i1==50)||(i1==51)){
            gp1=2.0;
        }
        
        if((i1==52)||(i1==53)){
            gp1=2.1;
        }
        if((i1==54)||(i1==55)||(i1==56)){
            gp1=2.2;
        }
        if((i1==57)||(i1==58)){
            gp1=2.3;
        }
        if(i1==59){
            gp1=2.4;
        }
        
       
        if((i1==60)||(i1==61)){
            gp1=2.5;
        }
        
        if((i1==62)||(i1==63)){
            gp1=2.6;
        }
        if((i1==64)||(i1==65)||(i1==66)){
            gp1=2.7;
        }
        if((i1==67)||(i1==68)){
            gp1=2.8;
        }
        if(i1==69){
            gp1=2.9;
        }
        
       
        if((i1==70)||(i1==71)||(i1==72)){
            gp1=3.0;
        }
        
        if((i1==73)||(i1==74)){
            gp1=3.1;
        }
        if((i1==75)||(i1==76)||(i1==77)){
            gp1=3.2;
        }
        if((i1==78)||(i1==79)){
            gp1=3.3;
        }
        
        
        
        if(i1==80){
            gp1=3.4;
        }
        
        if((i1==81)||(i1==82)){
            gp1=3.5;
        }
        if((i1==83)||(i1==84)){
            gp1=3.6;
        }
        
        
        
        if((i1==85)||(i1==86)){
            gp1=3.7;
        }
        
        if((i1==87)||(i1==88)){
            gp1=3.8;
        }
        if(i1==89){
            gp1=3.9;
        }
        
        
        if((i1>=90)&&(i1<=100)){
            gp1=4.0;
        }
        
       sgp1=""+gp1;
        jTextField51.setText(sgp1);
        
       
       
       }
       else{
          gp1=0.0;
          jTextField51.setText("-");
        
       }
           
        
        //for gp2
        if((m2>25)&&(i32>25)){
       
        if((i2==50)||(i2==51)){
            gp2=2.0;
        }
        
        if((i2==52)||(i2==53)){
            gp2=2.1;
        }
        if((i2==54)||(i2==55)||(i2==56)){
            gp2=2.2;
        }
        if((i2==57)||(i2==58)){
            gp2=2.3;
        }
        if(i2==59){
            gp2=2.4;
        }
        
       
        if((i2==60)||(i2==61)){
            gp2=2.5;
        }
        
        if((i2==62)||(i2==63)){
            gp2=2.6;
        }
        if((i2==64)||(i2==65)||(i2==66)){
            gp2=2.7;
        }
        if((i2==67)||(i2==68)){
            gp2=2.8;
        }
        if(i2==69){
            gp2=2.9;
        }
        
       
        if((i2==70)||(i2==71)||(i2==72)){
            gp2=3.0;
        }
        
        if((i2==73)||(i2==74)){
            gp2=3.1;
        }
        if((i2==75)||(i2==76)||(i2==77)){
            gp2=3.2;
        }
        if((i2==78)||(i2==79)){
            gp2=3.3;
        }
        
        
        
        if(i2==80){
            gp2=3.4;
        }
        
        if((i2==81)||(i2==82)){
            gp2=3.5;
        }
        if((i2==83)||(i2==84)){
            gp2=3.6;
        }
        
        
        
        if((i2==85)||(i2==86)){
            gp2=3.7;
        }
        
        if((i2==87)||(i2==88)){
            gp2=3.8;
        }
        if(i2==89){
            gp2=3.9;
        }
        
        
        if((i2>=90)&&(i2<=100)){
            gp2=4.0;
        }
        
        
        sgp2=""+gp2;
        
        jTextField52.setText(sgp2);
        
        }
        else{
          gp2=0.0;
          jTextField52.setText("-");
        
          
       }
        
        
        
        //for gp3
        if((m3>25)&&(i33>25)){
       
        if((i3==50)||(i3==51)){
            gp3=2.0;
        }
        
        if((i3==52)||(i3==53)){
            gp3=2.1;
        }
        if((i3==54)||(i3==55)||(i3==56)){
            gp3=2.2;
        }
        if((i3==57)||(i3==58)){
            gp3=2.3;
        }
        if(i3==59){
            gp3=2.4;
        }
        
       
        if((i3==60)||(i3==61)){
            gp3=2.5;
        }
        
        if((i3==62)||(i3==63)){
            gp3=2.6;
        }
        if((i3==64)||(i3==65)||(i3==66)){
            gp3=2.7;
        }
        if((i3==67)||(i3==68)){
            gp3=2.8;
        }
        if(i3==69){
            gp3=2.9;
        }
        
       
        if((i3==70)||(i3==71)||(i3==72)){
            gp3=3.0;
        }
        
        if((i3==73)||(i3==74)){
            gp3=3.1;
        }
        if((i3==75)||(i3==76)||(i3==77)){
            gp3=3.2;
        }
        if((i3==78)||(i3==79)){
            gp3=3.3;
        }
        
        
        
        if(i3==80){
            gp3=3.4;
        }
        
        if((i3==81)||(i3==82)){
            gp3=3.5;
        }
        if((i3==83)||(i3==84)){
            gp3=3.6;
        }
        
        
        
        if((i3==85)||(i3==86)){
            gp3=3.7;
        }
        
        if((i3==87)||(i3==88)){
            gp3=3.8;
        }
        if(i3==89){
            gp3=3.9;
        }
        
        
        if((i3>=90)&&(i3<=100)){
            gp3=4.0;
        }
        
        sgp3=""+gp3;
        
        jTextField53.setText(sgp3);
        
        
        
        }
        else{
          gp3=0.0;
         jTextField53.setText("-");
         
         
       }
        
        
        
        //for gp4
        if((m4>25)&&(i34>25)){
       
        if((i4==50)||(i4==51)){
            gp4=2.0;
        }
        
        if((i4==52)||(i4==53)){
            gp4=2.1;
        }
        if((i4==54)||(i4==55)||(i4==56)){
            gp4=2.2;
        }
        if((i4==57)||(i4==58)){
            gp4=2.3;
        }
        if(i4==59){
            gp4=2.4;
        }
        
       
        if((i4==60)||(i4==61)){
            gp4=2.5;
        }
        
        if((i4==62)||(i4==63)){
            gp4=2.6;
        }
        if((i4==64)||(i4==65)||(i4==66)){
            gp4=2.7;
        }
        if((i4==67)||(i4==68)){
            gp4=2.8;
        }
        if(i4==69){
            gp4=2.9;
        }
        
       
        if((i4==70)||(i4==71)||(i4==72)){
            gp4=3.0;
        }
        
        if((i4==73)||(i4==74)){
            gp4=3.1;
        }
        if((i4==75)||(i4==76)||(i4==77)){
            gp4=3.2;
        }
        if((i4==78)||(i4==79)){
            gp4=3.3;
        }
        
        
        
        if(i4==80){
            gp4=3.4;
        }
        
        if((i4==81)||(i4==82)){
            gp4=3.5;
        }
        if((i4==83)||(i4==84)){
            gp4=3.6;
        }
        
        
        
        if((i4==85)||(i4==86)){
            gp4=3.7;
        }
        
        if((i4==87)||(i4==88)){
            gp4=3.8;
        }
        if(i4==89){
            gp4=3.9;
        }
        
        
        if((i4>=90)&&(i4<=100)){
            gp4=4.0;
        }
        
         sgp4=""+gp4;
         
         
         jTextField54.setText(sgp4);
        
        }
        
        else{
          gp4=0.0;
          jTextField54.setText("-");
        
       }
        
        
        
        //for gp5
        if((m5>25)&&(i35>25)){
       
        if((i5==50)||(i5==51)){
            gp5=2.0;
        }
        
        if((i5==52)||(i5==53)){
            gp5=2.1;
        }
        if((i5==54)||(i5==55)||(i5==56)){
            gp5=2.2;
        }
        if((i5==57)||(i5==58)){
            gp5=2.3;
        }
        if(i5==59){
            gp5=2.4;
        }
        
       
        if((i5==60)||(i5==61)){
            gp5=2.5;
        }
        
        if((i5==62)||(i5==63)){
            gp5=2.6;
        }
        if((i5==64)||(i5==65)||(i5==66)){
            gp5=2.7;
        }
        if((i5==67)||(i5==68)){
            gp5=2.8;
        }
        if(i5==69){
            gp5=2.9;
        }
        
       
        if((i5==70)||(i5==71)||(i5==72)){
            gp5=3.0;
        }
        
        if((i5==73)||(i5==74)){
            gp5=3.1;
        }
        if((i5==75)||(i5==76)||(i5==77)){
            gp5=3.2;
        }
        if((i5==78)||(i5==79)){
            gp5=3.3;
        }
        
        
        
        if(i5==80){
            gp5=3.4;
        }
        
        if((i5==81)||(i5==82)){
            gp5=3.5;
        }
        if((i5==83)||(i5==84)){
            gp5=3.6;
        }
        
        
        
        if((i5==85)||(i5==86)){
            gp5=3.7;
        }
        
        if((i5==87)||(i5==88)){
            gp5=3.8;
        }
        if(i5==89){
            gp5=3.9;
        }
        
        
        if((i5>=90)&&(i5<=100)){
            gp5=4.0;
        }
        
        sgp5=""+gp5;
        jTextField55.setText(sgp5);
        
        
        }
        
        else{
          gp5=0.0;
         jTextField55.setText("-");
         
       }
        
        //for g1
        if(gp1==0.0){
            g1="F";
        }
        else{
        if((i1>=50)&&(i1<=59)){
            g1="C";
        }
        if((i1>=60)&&(i1<=69)){
            g1="C+";
        }
        if((i1>=70)&&(i1<=79)){
            g1="B";
        }
        if((i1>=80)&&(i1<=84)){
            g1="B+";
        }
        if((i1>=85)&&(i1<=89)){
            g1="A-";
        }
        if((i1>=90)&&(i1<=100)){
            g1="A";
        }
        }
        
        
        //for g2
        if(gp2==0.0){
            g2="F";
        }
        else{
        
        if((i2>=50)&&(i2<=59)){
            g2="C";
        }
        if((i2>=60)&&(i2<=69)){
            g2="C+";
        }
        if((i2>=70)&&(i2<=79)){
            g2="B";
        }
        if((i2>=80)&&(i2<=84)){
            g2="B+";
        }
        if((i2>=85)&&(i2<=89)){
            g2="A-";
        }
        if((i2>=90)&&(i2<=100)){
            g2="A";
        }
        
        }
        
        //for g3
        if(gp3==0.0){
            g3="F";
        }
        else{
        
        if((i3>=50)&&(i3<=59)){
            g3="C";
        }
        if((i3>=60)&&(i3<=69)){
            g3="C+";
        }
        if((i3>=70)&&(i3<=79)){
            g3="B";
        }
        if((i3>=80)&&(i3<=84)){
            g3="B+";
        }
        if((i3>=85)&&(i3<=89)){
            g3="A-";
        }
        if((i3>=90)&&(i3<=100)){
            g3="A";
        }
        }
        
        //for g4
        if(gp4==0.0){
            g4="F";
        }
        else{
        
        if((i4>=50)&&(i4<=59)){
            g4="C";
        }
        if((i4>=60)&&(i4<=69)){
            g4="C+";
        }
        if((i4>=70)&&(i4<=79)){
            g4="B";
        }
        if((i4>=80)&&(i4<=84)){
            g4="B+";
        }
        if((i4>=85)&&(i4<=89)){
            g4="A-";
        }
        if((i4>=90)&&(i4<=100)){
            g4="A";
        }
        
        }
        
        //for g5
        if(gp5==0.0){
            g5="F";
        }
        else{
        
        if((i5>=50)&&(i5<=59)){
            g5="C";
        }
        if((i5>=60)&&(i5<=69)){
            g5="C+";
        }
        if((i5>=70)&&(i5<=79)){
            g5="B";
        }
        if((i5>=80)&&(i5<=84)){
            g5="B+";
        }
        if((i5>=85)&&(i5<=89)){
            g5="A-";
        }
        if((i5>=90)&&(i5<=100)){
            g5="A";
        }
        
        }
        
        
        
        
        
        
        jTextField41.setText(t1);
        jTextField42.setText(t2);
        jTextField43.setText(t3);
        jTextField44.setText(t4);
        jTextField45.setText(t5);
        
        String st1=jTextField41.getText();
        String st2=jTextField42.getText();
        String st3=jTextField43.getText();
        String st4=jTextField44.getText();
        String st5=jTextField45.getText();
        
        int it1=Integer.parseInt(st1);
        int it2=Integer.parseInt(st2);
        int it3=Integer.parseInt(st3);
        int it4=Integer.parseInt(st4);
        int it5=Integer.parseInt(st5);
        
        int ft=it1+it2+it3+it4+it5;
        
        String t=""+ft;
        
        jTextField63.setText(t);
        
        
        
        
        jTextField46.setText(g1);
        jTextField47.setText(g2);
        jTextField48.setText(g3);
        jTextField49.setText(g4);
        jTextField50.setText(g5);
        
        jTextField16.setText(b11);
        jTextField17.setText(b12);
        jTextField18.setText(b13);
        jTextField19.setText(b14);
        jTextField20.setText(b15);
        
        sc1=jTextField16.getText();
        sc2=jTextField17.getText();
        sc3=jTextField18.getText();
        sc4=jTextField19.getText();
        sc5=jTextField20.getText();
        
        int ic1=Integer.parseInt(sc1);
        int ic2=Integer.parseInt(sc2);
        int ic3=Integer.parseInt(sc3);
        int ic4=Integer.parseInt(sc4);
        int ic5=Integer.parseInt(sc5);
        
        int ic=ic1+ic2+ic3+ic4+ic5;
        String sc=""+ic;
        
        jTextField62.setText(sc);
        
        if(gp1==0.0){
            sg1="0";
        }
        else{
        sg1=jTextField51.getText();
        }
        
        if(gp2==0.0){
            sg2="0";
        }
        else{
        sg2=jTextField52.getText();
        }
        
        if(gp3==0.0){
            sg3="0";
        }
        else{
        sg3=jTextField53.getText();
        }
        
        if(gp4==0.0){
            sg4="0";
        }
        else{
        sg4=jTextField54.getText();
        }
        
        if(gp5==0.0){
            sg5="0";
        }
        else{
        sg5=jTextField55.getText();
        }
        
        
    double dc1=Double.parseDouble(sc1);
    double dc2=Double.parseDouble(sc2);
    double dc3=Double.parseDouble(sc3);
    double dc4=Double.parseDouble(sc4);
    double dc5=Double.parseDouble(sc5);
    
    double dg1=Double.parseDouble(sg1);
    double dg2=Double.parseDouble(sg2);
    double dg3=Double.parseDouble(sg3);
    double dg4=Double.parseDouble(sg4);
    double dg5=Double.parseDouble(sg5);
    
    cq1=dc1*dg1;
    cq2=dc2*dg2;
    cq3=dc3*dg3;
    cq4=dc4*dg4;
    cq5=dc5*dg5;
    
    String q1=""+cq1;
    String q2=""+cq2;
    String q3=""+cq3;
    String q4=""+cq4;
    String q5=""+cq5;
    
        
    int p1=q1.indexOf(".");
    int iq1=q1.length();
    int lg1=iq1-p1;
    String s1;
    if(lg1>2){
    s1 = q1.substring(p1+2,p1+3);
    int ii1=Integer.parseInt(s1);
    if(ii1>5){
        dfq1=cq1+0.1;
        sr1=""+dfq1;
        
    }
    else{
        sr1=""+cq1;
    }
    int pl1=sr1.indexOf(".");
        fr1=sr1.substring(0,pl1+2);
    
    }
    else{
        fr1=""+cq1;
    }
    
    int p2=q2.indexOf(".");
    int iq2=q2.length();
    int lg2=iq2-p2;
    String s2;
    if(lg2>2){
    s2 = q2.substring(p2+2,p2+3);
    int ii2=Integer.parseInt(s2);
    if(ii2>5){
        dfq2=cq2+0.1;
        sr2=""+dfq2;
        
    }
    else{
        sr2=""+cq2;
    }
    int pl2=sr2.indexOf(".");
        fr2=sr2.substring(0,pl2+2);
    }
    else{
        fr2=""+cq2;
    }
    
    int p3=q3.indexOf(".");
    int iq3=q3.length();
    int lg3=iq3-p3;
    String s3;
    if(lg3>2){
    s3 = q3.substring(p3+2,p3+3);
    int ii3=Integer.parseInt(s3);
    if(ii3>5){
        dfq3=cq3+0.1;
        sr3=""+dfq3;
        
    }
    else{
        sr3=""+cq3;
    }
    int pl3=sr3.indexOf(".");
        fr3=sr3.substring(0,pl3+2);
    
    }
    else{
        fr3=""+cq3;
    }
    
    int p4=q4.indexOf(".");
    int iq4=q4.length();
    int lg4=iq4-p4;
    String s4;
    if(lg4>2){
    s4 = q4.substring(p4+2,p4+3);
    int ii4=Integer.parseInt(s4);
    if(ii4>5){
        dfq4=cq4+0.1;
        sr4=""+dfq4;
        
    }
    else{
        sr4=""+cq4;
    }
    int pl4=sr4.indexOf(".");
        fr4=sr4.substring(0,pl4+2);
    
    }
    else{
        fr4=""+cq4;
    }
    
    int p5=q5.indexOf(".");
    int iq5=q5.length();
    int lg5=iq5-p5;
    String s5;
    if(lg5>2){
    s5 = q5.substring(p5+2,p5+3);
    int ii5=Integer.parseInt(s5);
    if(ii5>5){
        dfq5=cq5+0.1;
        sr5=""+dfq5;
        
    }
    else{
        sr5=""+cq5;
    }
    int pl5=sr5.indexOf(".");
        fr5=sr5.substring(0,pl5+2);
    
    }
    else{
        fr5=""+cq5;
    }
        
    String s51=jTextField51.getText();
    String s52=jTextField52.getText();
    String s53=jTextField53.getText();
    String s54=jTextField54.getText();
    String s55=jTextField55.getText();
    
        if(s51.equals("-")){
            jTextField56.setText("-");
        }
        else{
        jTextField56.setText(fr1);
        }
        
        if(s52.equals("-")){
            jTextField57.setText("-");
        }
        else{
        jTextField57.setText(fr2);
        }
        
        if(s53.equals("-")){
            jTextField58.setText("-");
        }
        else{
        jTextField58.setText(fr3);
        }
        
        if(s54.equals("-")){
            jTextField59.setText("-");
        }
        else{
        jTextField59.setText(fr4);
        }
        
        if(s55.equals("-")){
            jTextField60.setText("-");
        }
        else{
        jTextField60.setText(fr5);
        }
        
        
        
        double dc=dc1+dc2+dc3+dc4+dc5;
        
        double cq=cq1+cq2+cq3+cq4+cq5;
    
        double gpa=cq/dc;
        
        if((g1.equals("F"))||(g2.equals("F"))||(g3.equals("F"))||(g4.equals("F"))||(g5.equals("F"))){
            frgpa="-";
        }
        
        else{
        sgpa=""+gpa;
        
        int p6=sgpa.indexOf(".");
        int iq6=sgpa.length();
        int lg6=iq6-p6;
        String s6;
        if(lg6>3){
        s6 = sgpa.substring(p6+3,p6+4);
        int ii6=Integer.parseInt(s6);
    if(ii6>5){
        dgpa=gpa+0.01;
        srgpa=""+dgpa;
        int plgpa=srgpa.indexOf(".");
        frgpa=srgpa.substring(0,plgpa+3);
    
    }
    else{
        frgpa=""+sgpa.substring(0,p6+3);
    }
        }
        
     else{
        frgpa=""+gpa;
    }
        }
        
        jTextField67.setText(frgpa);
        
        if((g1.equals("F"))||(g2.equals("F"))||(g3.equals("F"))||(g4.equals("F"))||(g5.equals("F"))){
            r="Fail";
        }
        else{
            r="Passes";
        }
        
        jTextField66.setText(r);
        
        if(r.equalsIgnoreCase("Fail")){
            jTextField66.setBackground(Color.RED);
              jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marksheet/images/1..jpg")));
        }
         if(r.equalsIgnoreCase("Passes")){
            jTextField66.setBackground(Color.GREEN);
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marksheet/images/2.jpg")));
        }
         
         if((s51.equals("-"))||(s52.equals("-"))||(s53.equals("-"))||(s54.equals("-"))||(s55.equals("-"))){
             jTextField64.setText("-");
         }
         else{
        double dfr1=Double.parseDouble(fr1); 
        double dfr2=Double.parseDouble(fr2); 
        double dfr3=Double.parseDouble(fr3); 
        double dfr4=Double.parseDouble(fr4); 
        double dfr5=Double.parseDouble(fr5);
        
        double fr=dfr1+dfr2+dfr3+dfr4+dfr5;
        String sfr=""+fr;
        int pp5=sfr.indexOf(".");
        String s64=sfr.substring(0,pp5+2);
        jTextField64.setText(s64);
         }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Serial\n  No.");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("                   \t  Course Title\n");
        jTextArea2.setMargin(new java.awt.Insets(18, 0, 2, 2));
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Course\n Code\n");
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Credit\nHours");
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("Assign-\nments\n10/20");
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("  Mid\n Term\n 20/30");
        jScrollPane6.setViewportView(jTextArea6);

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("  Lab\n Exam\n  20");
        jScrollPane7.setViewportView(jTextArea7);

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("Semes-\n ter\n  50");
        jScrollPane8.setViewportView(jTextArea8);

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText(" Total\n\n  100");
        jScrollPane9.setViewportView(jTextArea9);

        jTextArea10.setEditable(false);
        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.setText("\n Grade");
        jScrollPane10.setViewportView(jTextArea10);

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.setText(" Grade\n Point");
        jScrollPane11.setViewportView(jTextArea11);

        jTextArea12.setEditable(false);
        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setText(" Quality\n  Point");
        jScrollPane12.setViewportView(jTextArea12);

        jTextArea13.setEditable(false);
        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jTextArea13.setText("\n G.P.A");
        jScrollPane13.setViewportView(jTextArea13);

        jTextArea14.setEditable(false);
        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jTextArea14.setText("\nResult");
        jScrollPane14.setViewportView(jTextArea14);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("3");

        jTextField4.setEditable(false);
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("4");

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("5");

        jTextField6.setEditable(false);
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField8.setEditable(false);
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField9.setEditable(false);
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField10.setEditable(false);
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);

        jTextField12.setEditable(false);

        jTextField13.setEditable(false);

        jTextField14.setEditable(false);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setEditable(false);

        jTextField16.setEditable(false);
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField17.setEditable(false);
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField18.setEditable(false);
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField19.setEditable(false);
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jTextField20.setEditable(false);
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField21.setEditable(false);
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField22.setEditable(false);
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField23.setEditable(false);
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jTextField24.setEditable(false);
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField25.setEditable(false);
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField26.setEditable(false);
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField27.setEditable(false);
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField28.setEditable(false);
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField29.setEditable(false);
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField30.setEditable(false);
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField31.setEditable(false);
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField32.setEditable(false);
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField33.setEditable(false);
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField34.setEditable(false);
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField35.setEditable(false);
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField36.setEditable(false);
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField37.setEditable(false);
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField38.setEditable(false);
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField39.setEditable(false);
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField40.setEditable(false);
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField41.setEditable(false);
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField42.setEditable(false);
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField43.setEditable(false);
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField44.setEditable(false);
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField45.setEditable(false);
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField46.setEditable(false);
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField47.setEditable(false);
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField48.setEditable(false);
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField49.setEditable(false);
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField50.setEditable(false);
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField51.setEditable(false);
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField52.setEditable(false);
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField53.setEditable(false);
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField54.setEditable(false);
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField55.setEditable(false);
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField56.setEditable(false);
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField57.setEditable(false);
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField58.setEditable(false);
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField59.setEditable(false);
        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField60.setEditable(false);
        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField60ActionPerformed(evt);
            }
        });

        jTextField67.setEditable(false);
        jTextField67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField66.setEditable(false);
        jTextField66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField66ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIR SYED UNIVERSITY OF ENGINEERING & TECHNOLOGY KARACHI ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("3");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("B.S.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Computer Engineering");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Examination");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("2016");

        jLabel7.setText("MARKS / GRADE CERTIFICATE");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Semester");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("(");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText(")");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Following are Marks / Grades obtained by Mr. / Miss. ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SYED HARIS BIN HAFEEZ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("S/o D/O Mr. ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("SYED ABDUL HAFEEZ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("who appeared at the above Examination held in");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("May");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("with Roll No.");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("2015-CE-052");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Enrolment No.");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("19972/CE/2015");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Batch");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("2015");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("2016");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marksheet/images/SSUET.jpg"))); // NOI18N
        jLabel24.setText("jLabel24");

        jTextField61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField61.setText("TOTAL");
        jTextField61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField61ActionPerformed(evt);
            }
        });

        jTextField62.setEditable(false);
        jTextField62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField63.setEditable(false);
        jTextField63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField63.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField64.setEditable(false);
        jTextField64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField64.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marksheet/images/1..jpg"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("BACK TO MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                            .addComponent(jTextField61))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField13)
                                                    .addComponent(jTextField12)
                                                    .addComponent(jTextField11)
                                                    .addComponent(jTextField14)
                                                    .addComponent(jTextField15)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField62)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jTextField16)
                                            .addComponent(jTextField17)
                                            .addComponent(jTextField18)
                                            .addComponent(jTextField19)
                                            .addComponent(jTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jTextField21)
                                            .addComponent(jTextField22)
                                            .addComponent(jTextField23)
                                            .addComponent(jTextField24)
                                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jTextField26)
                                            .addComponent(jTextField27)
                                            .addComponent(jTextField28)
                                            .addComponent(jTextField29)
                                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jTextField31)
                                            .addComponent(jTextField32)
                                            .addComponent(jTextField33)
                                            .addComponent(jTextField34)
                                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jTextField36)
                                            .addComponent(jTextField37)
                                            .addComponent(jTextField38)
                                            .addComponent(jTextField39)
                                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(123, 123, 123)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(154, 154, 154)
                                        .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(190, 190, 190)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField63)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jTextField41)
                                            .addComponent(jTextField42)
                                            .addComponent(jTextField43)
                                            .addComponent(jTextField44)
                                            .addComponent(jTextField45, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jTextField46)
                                            .addComponent(jTextField47)
                                            .addComponent(jTextField48)
                                            .addComponent(jTextField49)
                                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                    .addComponent(jTextField51)
                                                    .addComponent(jTextField52)
                                                    .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                    .addComponent(jTextField56)
                                                    .addComponent(jTextField57)
                                                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jTextField12)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField20))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField67, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextField66))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        setSize(new java.awt.Dimension(1227, 1038));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField60ActionPerformed

    private void jTextField66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField66ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField61ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
generate gen = new generate();
gen.setVisible(true);
dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new c().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
