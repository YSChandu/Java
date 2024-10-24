
// import java.util.*;
// class Infosys{
//     int p=0;
//     public static int cal(int n){
//         if(n==0||n==1||n==2){
//             return 1;
//         }
//         if(n==3){
//             return 2;
//         }
//         return (cal(n-1)+cal(n-3))%1000000007;
//     }
//     public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       System.out.println(cal(n));  
//       sc.close();
//     }
// }

            // ----------------------check isvalid parenthesis-----------------------------------
// import java.util.*;
// class Infosys{
//     public static Boolean isvalid(String s){
//         Stack<Character> stack= new Stack<>();
//         int k=0;
//         while(k<s.length()){
//             if(s.charAt(k)=='('){
//                 stack.push(s.charAt(k));
//                 k++;
//             }else if(s.charAt(k)=='s'){
//                 k++;
//             }else if(stack.peek()=='('){
//                 stack.pop();
//                 k++;
//             }
//         }
//         if(stack.empty()){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(isvalid(s));
//         sc.close();
//     }
// }

                //    -------------------- check if the string is the another string rotation-----------------
// import java.util.*;
// class Infosys{
//     public static boolean solve(String s1,String s2){
//         String s3 ="";
//         for(int i=0;i<s2.length();i++){
//             if(s1.charAt(0)==s2.charAt(i)){
//                 s3=s2.substring(i);
//                 s3+=s2.substring(0,i);
//             }
//             if(s1.equals(s3)){
//                 return true;
//             }
//             s3="";
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String s1 =sc.nextLine();
//         String s2 =sc.nextLine();
//         if(solve(s1,s2)){
//             System.out.println("Yes");
//         }
//         else{
//             System.out.println("No");
//         }
//     }
// }
                        //   ----------------- reserve a string using stack---------------
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         Stack<Character> stack = new Stack<>();
//         for(int i=0;i<s.length();i++){
//             stack.push(s.charAt(i));
//         }
//         String s2="";
//         for(int i=0;i<s.length();i++){
//             s2+=stack.pop();
//         }
//         System.out.println(s2);
//     }
// }
        //    ---------------------- reverse a linkedlist ------------------------------
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int d){
//         data=d;
//         next=null;
//     }
// }
// class Linkedlist{
//     Node root=null;
//     void insert(int data){
//         Node newnode = new Node(data);
//         if(root==null){
//             root=newnode;
//         }
//         else{
//             Node curr = root;
//             while(curr.next !=null){
//                 curr=curr.next;
//             }
//             curr.next=newnode;
//         } 
//     }
//     static void display(Node root){
//         Node curr=root;
//         while(curr!=null){
//             System.out.print(curr.data+"<");
//             curr=curr.next;
//         }
//     }
//     static void reverse(Node root){
//         Node prev=root;
//         Node curr=prev.next;
//         while(curr!=null){
//             Node next=curr.next;
//             curr.next=prev;

//             prev=curr;
//             curr=next;
//         }
//         root.next=null;
//         root=prev;
//         display(root);
//     }
    
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         Linkedlist s= new Linkedlist();
//         while(sc.hasNextInt()){
//             s.insert(sc.nextInt());
//         }
//         display(s.root);
//         System.out.println("");
//         reverse(s.root);

//     }
// }



// import java.util.*;
// class Main{
//     static int p=0;
//     public static int cal(int n , int dp[]){
//         if(n==0){
//             return 1;
//         }
//         if(n<0){
//             return 0;
//         }
//         if(dp[n]!=-1){
//             return dp[n];
//         }
//         return dp[n]=cal(n-1,dp)+cal(n-2,dp);

//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] dp= new int[n+1];
//         for(int i =0;i<n+1;i++){
//             dp[i]=-1;
//         }
//         System.out.println(cal(n,dp));

//     }
// }
                            //  ------------------------ n-queen ------------------------------
// import java.util.*;
// class Main{
//     static Boolean issafe(int[][] board,int row,int col,int n){
//          for (int i = 0; i < col; i++) {
//             if (board[row][i] == 1) {
//                 return false;
//             }
//         }
//         for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 1) {
//                 return false;
//             }
//         }
//         for (int i = row, j = col; i < n && j >= 0; i++, j--) {
//             if (board[i][j] == 1) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void solve(int[][] board,int row,int col,ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> result,int n){
//         if(col==n){
//             result.add(new ArrayList<>(arr));
//             return; 
//         }
//         for(int i=0;i<n;i++){
//             row=i;
//             if(issafe(board,row,col,n)){
//                 board[row][col]=1;
//                 arr.add(row+1);
//                 solve(board, row, col+1,arr,result,n);
//                 arr.remove(arr.size()-1);
//                 board[row][col]=0;
//             }
//         }
//         }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int[][] board = new int[n][n];
//         ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//         ArrayList<Integer> arr= new ArrayList<>();
//         solve(board,0,0,arr,result,n);
//         for(ArrayList<Integer> a:result){
//             System.out.println(a);
//         }
//     }
// }
                //  -----------------infinite supply of coins-------------------------------------------
// import java.util.*;
// class Main{
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int amount =sc.nextInt();
//         Arrays.sort(arr);
//         // int[][] dp=new int[arr.length+1][amount+1];
//         // for(int i=0;i<=arr.length;i++){
//         //     for(int j=0;j<=amount;j++){
//         //         if(i==0){
//         //             dp[i][j]=0;
//         //         }
//         //         else if(j==0){
//         //             dp[i][j]=1;
//         //         }
//         //         else if(arr[i-1]>j){
//         //             dp[i][j]=dp[i-1][j];
//         //         }else{
//         //             dp[i][j]=dp[i][j-arr[i-1]]+dp[i-1][j];
//         //         }
//         //     }
//         // }
//         int[] dp = new int[amount+1];
//         dp[0]=1;
//         for(int i=0;i<n;i++){
//             for(int j=arr[i];j<=amount;j++){
//                dp[j]+=dp[j-arr[i]];
//             }
//         }
//         System.out.println(dp[amount]);
//         sc.close();
//         }   
// }


// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] c = new int[n];
//         int[] e = new int[n];
//         for(int i=0;i<n;i++){
//             c[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             e[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i+1;i++){
//                 if(c[i]>c[j]){
//                     int temp=c[i];
//                     c[i]=c[j];
//                     c[j]=temp;

//                     int temp2 =e[i];
//                     e[i]=e[j];
//                     e[j]=temp2;

//                 }
//             }
//         }sc.close();
//     }
// }

//              ---------------------------anagram-------------------------
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         String s2 = sc.nextLine();
    //     char[] arr = s1.toCharArray();
    //     HashMap<Character,Integer> map = new HashMap<>();
    //     int j=1;
    //     for(char a : arr){
    //         if(map.containsKey(a)){
    //             map.put(a,map.get(a)+1);
    //         }
    //         else{
    //             map.put(a, j);
    //         }
    //     }
    //     for(int i=0;i<s2.length();i++){
    //         if(!map.containsKey(s2.charAt(i))){
    //             System.out.println("false");
    //         }else{
    //             if(map.get(s2.charAt(i))==1){
    //                 map.remove(s2.charAt(i));
    //             }
    //             else{
    //                 map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
    //             }
    //         }
    //     }
    //     if(map.isEmpty()){
    //         System.out.println("true");
    //     }else{
    //         System.out.println("false");
    //     
    // }
// }



// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         String s2 = sc.nextLine();
//         char[] arr = s1.toCharArray();
//         HashMap<Character,Integer> map = new HashMap<>();
//         int j=1;
//         for(char a : arr){
//             if(map.containsKey(a)){
//                 map.put(a,map.get(a)+1);
//             }
//             else{
//                 map.put(a, j);
//             }
//         }
//         for(int i=0;i<s2.length();i++){
//             if(!map.containsKey(s2.charAt(i))){
//                 System.out.println("false");
//             }else{
//                 if(map.get(s2.charAt(i))==1){
//                     map.remove(s2.charAt(i));
//                 }
//                 else{
//                     map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
//                 }
//             }
//         }
//         if(map.isEmpty()){
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }
//     }
// }


// -------------------------------------Sieve of Eratosthenes-------------------------

// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         Boolean[] a = new Boolean[n+1];
//         a[0]=false;
//         a[1]=false;
//         for(int i=2;i<=n;i++){
//             a[i]=true;
//         }
//         for(int i=2;i*i<=n;i++){
//             if(a[i]==true){
//                 for(int j=2*i;j<=n;j+=i){
//                     a[j]=false;
//                 }
//             }
//         }
//         for(int i=2;i<a.length;i++){
//             if(a[i]==true){
//                 System.out.print(i +" ");
//             }
//         }
//         sc.close();
//     }
// }

// ---------------------------------Euler’s Phi Algorithm------------------------------------------

// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         float result=n;
//         for(int p=2;p*p<=n;p++){
//             if(n%p==0){
//                 while (n % p == 0) {
//                     n /= p;
//                 }
//                result *=(1.0-(1.0/(float)p));
//             }
//         }
//         if(n>1){
//             result*=(1.0-(1.0/(float)n));
//         }
//         System.out.println((int)result);
//         sc.close();
//     }
// }

// subset sum problem

// class Main{
//     public static boolean find(int index,int  amount ,int[] coins){
//         if(amount==0){
//             return true;
//         }else if(amount<0 || index>=coins.length){
//             return false;
//         }
//         else{
//             return find(index+1, amount,coins)||find(index+1, amount-coins[index],coins);
//         }
//     }
//     public static void main(String[] args) {
//         int[] coins ={2,3,5,7,8,10};
//         int amount =35;
//         System.out.println(find(0,amount,coins));
//     }
// }


// Merge sort 

// class Main{
//     public static void merge(int[] arr ,int l,int m,int r){
//         int n1 = m-l+1;
//         int n2 = r-m;

//         int[] L = new int[n1];
//         int[] R = new int[n2];

//         for(int i=0;i<n1;i++){
//             L[i]=arr[l+i];
//         }
//         for(int j=0;j<n2;j++){
//             R[j] = arr[m+1+j];
//         }



//         int i=0,j=0;

//         int k=l;

//         while(i<n1&&j<n2){
//             if(L[i]<=R[j]){
//                 arr[k]=L[i];
//                 i++;
//             }else{
//                 arr[k]=R[j];
//                 j++;
//             }k++;
//         }
        
//         // Copy remaining elements of L[] if any
//         while (i < n1) {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }

//         // Copy remaining elements of R[] if any
//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }
//     public static void print(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(" "+arr[i]);
//         }
//     }
//     public static void sort(int[] arr , int l , int r){
//         if(l<r){
//             int m= l+ (r-l)/2;
//             sort(arr, l, m);
//             sort(arr, m+1, r);

//             merge(arr, l,m, r);

//         }
//     }
//     public static void main(String[] args) {
//         int[] arr= {8,2,3,6,7,9,4,1,45,12,23,56,89,45,58,12,1,1,1,1,1,1,2,2,2,2};
//         sort(arr,0,arr.length-1);
//         print(arr);
//     }
// }

//  class BinaryTree{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int d){
//             this.data =d;
//             this.left=this.right=null;
//         }
//     }
//     static class binarytree{
//         static int idx=-1;
//         static Node buildtree(int[] arr){
//             idx++;
//             if(arr[idx]==-1){
//                 return null;
//             }
//                 Node newnode = new Node(arr[idx]);
//                 newnode.left=buildtree(arr);
//                 newnode.right=buildtree(arr);
//                 return newnode;
            
//         }
//         static void preorder(Node root){
//             if(root==null){
//                 System.out.print(-1 +" ");
//             }else{
//                 System.out.print(root.data+" ");
//                 preorder(root.left);
//                 preorder(root.right);

//             }
          
//         }
//         static int sum(Node root){
//             if(root==null){
//                 return 0;
//             }
//             int sum =root.data+sum(root.left)+sum(root.right);
//             return sum;
//         }
        
//         static int summ=0;

//         static int sumleaf(Node root){
  
//             if(root.right==null||root.left==null){
//                 return root.data;
//             }
//             summ=sumleaf(root.left)+sumleaf(root.right);
//             return summ;
//         }
 
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         binarytree tree = new binarytree();
//         Node root= tree.buildtree(arr);
//         tree.preorder(root);
//         System.out.println("");
//         System.out.println(tree.sum(root));
//         System.out.println(tree.sumleaf(root));
//     }
// }

// public class Main{
//     static int reverse(int number){
//         String s = String.valueOf(number);
//         String rev="";
//         for(int i=0;i<s.length();i++){
//             rev+=s.charAt(s.length()-1-i);
//         }
//         int reverse =Integer.parseInt(rev);
//         return reverse;
//     }
//     public static void main(String[] args) {
//         int number =87203984;
//         System.out.println(reverse(number) );
//         System.out.println("z".hashCode());
//     }
// }

// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         HashMap<Integer,String> map = new HashMap<>();
//         map.put(1,"chandu");
//         map.put(2,"sriram");
//         map.put(3,"nandasai");

//         for(Map.Entry<Integer,String> e:map.entrySet()){
//             System.out.print(e.getKey());
//             System.out.println(" :"+e.getValue());
//         }
//     }
// }

import java.util.ArrayList;
class Main{
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(23);
        s.add(43);
        s.add(13);
        s.add(33);
        s.add(53);
        s.add(27);
        System.out.println(s.get(3));
    }
}



