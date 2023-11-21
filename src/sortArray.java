public class sortArray {
    private int [] array;
    public sortArray(int [] array){
        this.array = array;
    }

    public void sort(){
        int n = array.length;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                int temp = 0;
                if(array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public int [] getSorted(){
        return array;
    }
}
