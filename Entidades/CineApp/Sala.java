package Entidades.CineApp;

public class Sala {
    private String[][] asiento;

    public Sala() {
        asiento = new String[8][6];
        String[] a = {"A","B","C","D","E","F"};
        
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                this.asiento[i][j] = String.valueOf(i + 1) + a[j] + "  | ";
            }
        }
    }

    public String[][] getAsiento() {
        return asiento;
    }

    public void setAsiento(String[][] asiento) {
        this.asiento = asiento;
    }
}