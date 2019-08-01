
// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

class BreakingTheRecords {
  public static void main(String args[]){
       int a[] = {3,4, 21, 36, 10, 28, 35, 5, 24, 42};
       int maxRecord = a[0]; int minRecord = a[0];
       int maxRecordCount = 0; int minRecordCount = 0;
       for( int i=0; i<a.length; i++) {
           if(a[i] > maxRecord || a[i] < minRecord) {
               if(a[i] > maxRecord) {
                   maxRecordCount++;
                   maxRecord = a[i];
               } else if(a[i] < minRecord) {
                   minRecordCount++;
                   minRecord = a[i];
               }
           }
       }
       System.out.println("max= " + maxRecordCount + " min= " + minRecordCount);
  }
}