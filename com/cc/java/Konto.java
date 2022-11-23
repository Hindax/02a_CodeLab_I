package com.cc.java;

import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class Konto {
  private int kontoStand = 10000;

public Konto(int kontoStand) {
    this.kontoStand = kontoStand;
}

public int getKontoStand() {
    return kontoStand;
}

public void setKontoStand(int kontoStand) {
    this.kontoStand = kontoStand;
}



// }
// Konto konto1 = new Konto(kontoStand);   

// public Konto getKonto1() {
//     return konto1;
// }

// public void setKonto1(Konto konto1) {
//     this.konto1 = konto1;
// }

// Konto konto2 = new Konto(kontoStand);


// public Konto getKonto2() {
//     return konto2;
// }

// public Konto getKonto3() {
//     return konto3;
// }
// Konto konto3 = new Konto(kontoStand);

// public void setKonto2(Konto konto2) {
//     this.konto2 = konto2;
// }

// public void setKonto3(Konto konto3) {
//     this.konto3 = konto3;
// }

}
