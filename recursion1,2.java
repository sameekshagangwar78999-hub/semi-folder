

public class recursion {
//     public static void towerofhanoi(int n,String src,String helper,String dest){
//         if(n==1){
//             System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
//             return;
//         }
//         towerofhanoi(n-1,src,dest,helper);
//         System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
//         towerofhanoi(n-1,helper,src,dest);
//     }
    
// }

//     public static void main(String[] args) {
//         int n=3;
//         recursion.towerofhanoi(n,"A","B","C");
//     }
// }
// public static boolean issorted(int arr[],int idx){
//     if(idx== arr.length-1){
//         return true;
//     }
//     if(arr[idx]<arr[idx+1]){
//         // array is sorted till now
// //         return issorted(arr,idx+1);
// //     }
// //     else{
// //         return false;
// //     }
// // }
// //     public static void main(String args[]){
// //         int arr[]={1,3,7};
// //         System.out.println(issorted(arr,0));

// // public static void moveAllx(String str,int idx,int count,String newString){
// //     char currchar=str.charAt(idx);
// //     if(currchar=='x'){
// //         count++;
// //         moveAllx(str,idx+1,count,newString);
// //     }
// //     else{
// //         newString+=currchar;//newString=newString+currchar;
// //         moveAllx(str,idx+1,count,newString);
// //     }

// //     }
// //     Public Static void main(String args[]){
// //         string str="axbcxxd";
// //         moveAllx(str,0,0,"");
// //     int arr[]={1,3,3};
// //     System.out.println(isSorted(arr,0));

// //     }
// // }
// // if(idx==str.length()){
// //     System.out.println(newString);
// //     return;
// // }
// // char currchar=str.charAt(idx);
// // if(map[currchar-'a']){
// //     removeDuplicates(str,idx+1,newString);
// // }
// // else{
// //     newString+=currchar;
// //     map[currchar-'a']=true;
// //     removeDuplicates(str,idx+1,newString);
// // }else{
// //     newString+=currchar;
// //     map[currchar-'a']=true;
// //     removeDuplicates(str,idx+1,newString);
// // }
// // }

  

// // public static void main(String args[]){
// //     String str="abbccda";
// //     removeDuplicates(str,0,"");
// // }
// // }

// public class Recursion2 {
//     public static void subsequence(String str,int idx,String newString){
//         if(idx==str.length()){
//             System.err.println(newString);
//             return;
//         }
//         char currchar=str.charAt(idx);
//         //to be included
//         subsequence(str,idx+1,newString+currchar);
//         //not to be included
//         subsequence(str,idx+1,newString);
//     }
//     public static void main(String args[]){
//         String str="abc";
//         subsequence(str ,0,"");
//     }

// }

    
    


