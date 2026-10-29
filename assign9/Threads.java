class Threads extends Thread{
    int [][] a,b,c;
    int row;//sotres the row index
    Threads(int a[][],int b[][],int c[][],int row){
        this.a=a;
        this.b=b;
        this.c=c;
        this.row=row;
    }
    public void run(){
        try{
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    c[row][j]+=a[row][k]*b[k][j];
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error:Array index is out of bounds");
        }
    }
}