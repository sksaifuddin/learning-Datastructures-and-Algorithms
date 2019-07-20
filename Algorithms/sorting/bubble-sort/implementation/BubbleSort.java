// Complexity = O(n^2)

class BubbleSort {
  public static void main(String args[]){
    // collection of numbers to be sorted
    int a[] = {5,1,4,2,3};
    for(int i=0; i< a.length; i++) {
        for(int j= i+1; j< a.length; j++) {
            if(a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    // To display the array
    for(int i=0; i< a.length; i++) {
        System.out.println(a[i]+ " ");
    }
  }
}