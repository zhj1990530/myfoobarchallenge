package laioffer;

/**
 * Created by huajunzhang on 1/31/17.
 */
public class ArrayHopper {
        public boolean canJump(int[] array) {
            boolean[] M= new boolean[array.length];

            for(int i=0;i<array.length;i++){
                M[i]=false;
            }

            int end=array.length-1;
            M[end]=true;
            for(int i=end-1;i>=0;i--){
                int index=i+array[i];
                if(index>end){
                    M[i]= false;
                }else if(M[index]){
                    M[i]=true;
                }else{
                    M[i]=false;
                }
            }
            return M[0];
        }

}
