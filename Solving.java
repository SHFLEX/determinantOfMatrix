import javax.swing.JOptionPane;



public class Solving{
    static void SarusMethod(int[][] mtrx){
        JOptionPane.showMessageDialog(null, "Consequence of steps: "+"("+mtrx[0][0]+" * "+mtrx[1][1]+" * "+mtrx[2][2]+
                " + "+mtrx[0][1]+" * "+mtrx[1][2]+" * "+mtrx[2][0]+" + "+mtrx[0][2]+" * "+mtrx[1][0]+" * "+mtrx[2][1]+
                ")-"+"("+mtrx[2][0]+" * "+mtrx[1][1]+" * "+mtrx[0][2]+" + "+mtrx[2][1]+" * "+mtrx[1][2]+ " * "+
                mtrx[0][0]+" + "+mtrx[2][2]+" * "+mtrx[1][0]+" * "+mtrx[0][1]+")");
        JOptionPane.showMessageDialog(null, "determinant = "+((mtrx[0][0]*mtrx[1][1]*mtrx[2][2]+
                mtrx[0][1]*mtrx[1][2]*mtrx[2][0]+mtrx[0][2]*mtrx[1][0]*mtrx[2][1])-
                (mtrx[2][0]*mtrx[1][1]*mtrx[0][2]+mtrx[2][1]*mtrx[1][2]*mtrx[0][0]+mtrx[2][2]*mtrx[1][0]*mtrx[0][1])));
    }
    static void triangleMethod(int[][] mtrx){
        JOptionPane.showMessageDialog(null, "Consequence of steps: "+"("+mtrx[0][0]+" * "+mtrx[1][1]+" * "+mtrx[2][2]+
                " + "+mtrx[0][1]+" * "+mtrx[1][2]+" * "+mtrx[2][0]+" + "+mtrx[1][0]+" * "+mtrx[2][1]+" * "+mtrx[0][2]+")"+
                " - "+"("+mtrx[2][0]+" * "+mtrx[1][1]+" * "+mtrx[0][2]+" + "+mtrx[2][1]+" * "+mtrx[1][2]+" * "+mtrx[0][0]+
                " + "+mtrx[1][0]+" * "+mtrx[0][1]+" * "+mtrx[2][2]+")");
        JOptionPane.showMessageDialog(null, "determinant = "+((mtrx[0][0]*mtrx[1][1]*mtrx[2][2]+mtrx[0][1]*mtrx[1][2]*
                mtrx[2][0]+mtrx[1][0]*mtrx[2][1]*mtrx[0][2]) - (mtrx[2][0]*mtrx[1][1]*mtrx[0][2]+mtrx[2][1]*mtrx[1][2]*
                mtrx[0][0]+mtrx[1][0]*mtrx[0][1]*mtrx[2][2])));
    }
    public static void main(String[] args){
        String m = "";
        int[][] matrix = new int[3][3];
        char method = JOptionPane.showInputDialog("Enter way for finding determinant of matrix:\n"+
                "- 's' Sarus method\n"+
                "- 't' Triangle method").charAt(0);
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matrix:\n"+
                        "|n11 n12 n13|\n"+
                        "|n21 n22 n23|\n"+
                        "|n31 n32 n33|\n", "Enter n"+(i+1)+(j+1)));
            }
        }
        JOptionPane.showMessageDialog(null, "Your matrix:");
        for(int[] i:matrix){
            m=m+"|";
            for(int j:i){
                m=m+j+" ";
            }
            m=m+"|\n";
        }
        JOptionPane.showMessageDialog(null, m);
        switch(method){
            case 's': SarusMethod(matrix); break;
            case 't': triangleMethod(matrix); break;
            default: break;
        }
    }
}