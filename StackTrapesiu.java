public class StackTrapesiu {

    private Trapesiu data[];
    private int top;

    public StackTrapesiu(int jumlah){
        data= new Trapesiu[jumlah];
        top =-1;

    }

    public void push(Trapesiu nilai){
        if(top < data.length-1){
            data[++top] = nilai;
        }
    }

    public Trapesiu pop(){
        if(top >= 0){
            Trapesiu temp = data[top--];
            return temp;
        }
        return null;
    }

    public void print(){
        for(int i = data.length-1;  i >=0;i--){
            System.out.println(data[i]);
        }
    }







}
