package VuVanHung_Day5.Process;

import VuVanHung_Day5.Module.VDV;

import static VuVanHung_Day5.Process.SumResult.sumResult;

public class Function10 extends VDV {
    public static int GTLN(){
        int max = result[0][0];
        for(int i=0; i<3; i++){
            for(int j=i+1; j<3; j++){
                if(result[i][j]>max)
                    max = result[i][j];
            }
        }
        return max;
    }

    public static void function10() {
        Title.title();
        for (int i=0; i<name.length; i++){
            if (result[i][0]==GTLN()){
                System.out.printf("%3d ", i+1);
                System.out.printf("%-8s",name[i]);
                System.out.printf("%4d  ", result[i][0]);
                System.out.printf("%4d  ", result[i][1]);
                System.out.printf("%4d  ", result[i][2]);
                System.out.printf("%5d ", sumResult(i));
                System.out.println();
            }
        }
    }
}
