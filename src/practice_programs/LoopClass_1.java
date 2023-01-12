package practice_programs;

public class LoopClass_1 {
    public static void main(String[] args) {
        int row = 5, col = 5;
        char chr = 'A';
        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {

                if (i<=j){
                    System.out.print(chr);
                    chr += 1;
                }else{System.out.print(' ');}
                
            }
            System.out.println();
            
        }
    }
}

									/* 
									 *****
									  ****
									   ***
									    **
									     *
									*/