public class MatrixMultiply {
    public static void main(String args[]) {
        int a[][]={{1,2,3},{4,5,6}};
        int b[][]={{7,8},{9,10},{11,12}};
        int c[][]=new int[a.length][b[0].length];
        Threads[] t=new Threads[a.length];
        try{
            for(int i=0;i<a.length;i++){
                t[i]=new Threads(a,b,c,i);
                t[i].start();
            }
            for(int i=0;i<a.length;i++)
                t[i].join();
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++)
                    System.out.print(c[i][j]+" ");
                System.out.println();
            }
        }catch(InterruptedException e){
            System.out.println("Thread interrepted");
        }finally{
            System.out.println("Operation completed");
        }
    }
}
