package Array;

public class Arrayfunc {

    public static void update(int mark[], int nonchange){
         nonchange = 45;
        for(int i= 0; i<mark.length; i++){
            mark[i] = mark[i]+9;
        }

        
    }
    public static void main(String[] args) {
        int marks[] = {45, 58, 47, 69, 85};
        int nonchange = 10;
        update(marks, nonchange);
        System.out.println(nonchange);



        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
       
    }
}
