public class Trapesiu {

   public double sisia,sisib,sisic,sisid,tinggi;
    public Trapesiu(int sisia, int sisib, int sisic, int sisid, int ti){
        this.sisia = sisia;
        this.sisib = sisib;
        this.sisic = sisic;
        this.sisid = sisid;
        this.tinggi = ti;

    }

    public double luas(){
        return ((sisia+sisib)*tinggi)/2;
    }

    public double keliling(){
        return sisia+sisib+sisic+sisid;
    }

}
