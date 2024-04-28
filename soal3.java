public class soal3 {
    public static int max(int[] array){
        int terbesar = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i]>terbesar){
                terbesar=array[i];
            }
        }
        return terbesar;
    }

    public static void main(String[] args){
        int[] array = {1,5,8,3,0,7};

        int nilaiTerbesar = max(array);
        System.out.println("Nilai terbesar : "+ nilaiTerbesar);
    }
}
