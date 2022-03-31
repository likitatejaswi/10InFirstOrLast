public class Ex74 {
    public boolean count(int[] array){
        int arrayLength = array.length;
        if(array[0]==10 || array[arrayLength-1]==10){
            return true;
        }
        return false;
    }
}
