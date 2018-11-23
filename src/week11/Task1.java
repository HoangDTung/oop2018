package week11;

public class Task1 {
    public <T extends Comparable<T>> void sort(T[] a){
        int n=a.length ;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(a[i].compareTo(a[j])>0){
                    T b=a[i];
                    a[i]=a[j];
                    a[j]=b;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, -2, 3, -4, 5,0 };
        Double[] doubleArray = { 1.2, 2.3, -3.4, 4.5,-1.2 ,3.7,10.5,999.9};
        String [] stringArray={"b","Hoang","Duy","Tung","k62","uet"};
        Task1 t1=new Task1();
        t1.sort(intArray);
        t1.sort(doubleArray);
        t1.sort(stringArray);
    }
}