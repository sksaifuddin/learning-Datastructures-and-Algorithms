class SelectionSort {
  public static void main(String args[]){
        int a[] = {2,4,1,5,3};
        int min = 0;
        for(int i=0; i< a.length; i++) {
            min = i;
            for(int j = i+1; j < a.length ; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for(int i=0; i< a.length;i++) {
            System.out.println(a[i]+ " ");
        }
  }
}