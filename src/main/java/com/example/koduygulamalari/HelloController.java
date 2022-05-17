package com.example.koduygulamalari;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button sifir,bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,hesap,cikar,topla,carp,bol,temizle;
    @FXML
    private TextField sonuc;

    double cevap = 0.0;
    int islem = 0;
    String ilkdeger = "", sondeger = "", cikti = "";
    boolean kontrol = true;

    @FXML
    void btnkontrol(ActionEvent event) {

        if (event.getSource() == bir) {
            if (kontrol) {
                ilkdeger += "1";
                cikti = ilkdeger;
            } else {
                sondeger += "1";
                cikti += "1";
            }
            sonuc.setText(cikti);
        } else if (event.getSource() == iki) {
            if (kontrol) {
                ilkdeger += "2";
                cikti = ilkdeger;
            } else {
                sondeger += "2";
                cikti += "2";
            }
            sonuc.setText(cikti);
        } else if (event.getSource() == uc) {
            if (kontrol) {
                ilkdeger += "3";
                cikti = ilkdeger;
            } else {
                sondeger += "3";
                cikti += "3";
            }
            sonuc.setText(cikti);
        } else if (event.getSource() == dort) {
            if (kontrol) {
                ilkdeger += "4";
                cikti = ilkdeger;
            } else {
                sondeger += "4";
                cikti += "4";
            }
            sonuc.setText(cikti);
        } else if (event.getSource() == bes) {
            if (kontrol) {
                ilkdeger += "5";
                cikti = ilkdeger;
            } else {
                sondeger += "5";
                cikti += "5";
            }
            sonuc.setText(cikti);
        } else if (event.getSource() == alti) {
            if (kontrol) {
                ilkdeger += "6";
                cikti = ilkdeger;
            } else {
                sondeger += "6";
                cikti += "6";
            }
            sonuc.setText(cikti);
        } else if (event.getSource() == yedi) {
            if (kontrol) {
                ilkdeger += "7";
                cikti = ilkdeger;
            } else {
                sondeger += "7";
                cikti += "7";
            }
            sonuc.setText(cikti);
        } else if (event.getSource() == sekiz) {
            if (kontrol) {
                ilkdeger += "8";
                cikti = ilkdeger;
            } else {
                sondeger += "8";
                cikti += "8";
            }
            sonuc.setText(cikti);
        } else if (event.getSource() == dokuz) {
            if (kontrol) {
                ilkdeger += "9";
                cikti = ilkdeger;
            } else {
                sondeger += "9";
                cikti += "9";
            }
            sonuc.setText(cikti);
        } else if (event.getSource() == sifir) {
            if (kontrol) {
                ilkdeger += "0";
                cikti = ilkdeger;
            } else {
                sondeger += "0";
                cikti += "0";
            }
            sonuc.setText(cikti);
        } else if (event.getSource() == temizle) {
            ilkdeger = sondeger = "";
            cikti = "0.0";
            kontrol = true;
            cevap = 0;
            sonuc.setText(cikti);
        } else {
            if (!ilkdeger.equals("")) {
                kontrol = false;
                if (event.getSource() == topla) {
                    if (!cikti.contains("+")) {
                        islem = 1; // Addition
                        cikti += " + ";
                        sonuc.setText(cikti);
                    }
                } else if (event.getSource() == cikar) {
                    if (!cikti.contains("-")) {
                        islem = 2; // Subtraction
                        cikti += " - ";
                        sonuc.setText(cikti);
                    }
                } else if (event.getSource() == carp) {
                    if (!cikti.contains("*")) {
                        islem = 3; // Multiplication
                        cikti += " * ";
                        sonuc.setText(cikti);
                    }
                } else if (event.getSource() == bol) {
                    if (!cikti.contains("/")) {
                        islem = 4; // Division
                        cikti += " / ";
                        sonuc.setText(cikti);
                    }
                } else if (event.getSource() == hesap) {
                    if (!sondeger.equals("")) {
                        kontrol = true;
                        switch (islem) {
                            case 1:
                                cevap = Float.parseFloat(ilkdeger) + Float.parseFloat(sondeger);
                                cikti = String.valueOf(cevap);
                                break;
                            case 2:
                                cevap = Float.parseFloat(ilkdeger) - Float.parseFloat(sondeger);
                                cikti = String.valueOf(cevap);
                                break;
                            case 3:
                                cevap = Float.parseFloat(ilkdeger) * Float.parseFloat(sondeger);
                                cikti = String.valueOf(cevap);
                                break;
                            case 4:
                                try {
                                    cevap = Float.parseFloat(ilkdeger) / Float.parseFloat(sondeger);
                                } catch (Exception e) {
                                    cikti = String.valueOf(e.getMessage());
                                }
                                cikti = String.valueOf(cevap);
                                break;
                        }
                        sonuc.setText(cikti);
                        ilkdeger = sondeger = cikti = "";
                        kontrol = true;
                        cevap = 0;
                    }
                }
            }
        }

    }

}