
// public class Main {
//     public static void permutations(String str ,String perm,int ind){
//         if(str.length()==0){
//             System.out.println(perm);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char currchar = str.charAt(i);
//             String newstr = str.substring(0,i)+str.substring(i+1);
//             permutations(newstr, perm+currchar, ind+1);
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         permutations(s,"",0);
//         sc.close();

//     }
// }
// import java.util.Scanner;
// public class Main{
//        public static void solve(int[][] arr,int n,int col, int row ){
//         if(col>n){
//             System.out.println(arr);
//         }
//          for(int i=0;i<n;i++){
//             if(isOkay(i, col,arr,n)){
//                 arr[i][col]=1;
//                 solve(arr, n, col+1,row+1);
//                 arr[i][col]=0;
//             }           
//          }
//         }
//        public static boolean isOkay(int row , int col,int[][] arr,int n ){
           
//            for(int i=0;i<n;i++){
              
//            }
//        }
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int[][] arr = new int[n][n];
//         solve(arr,n,0,0);
//        }
// }


// DSA
// import java.util.*;
// class Linkedlist{
//     Node root;
//     public static class Node{
//         int d;
//         Node next;
//         public Node(int data){
//             d=data;
//             next=null;
//         }

//     }
//     public static Linkedlist insert(Linkedlist ll,int data){
//         Node newnode = new Node(data);
//         if(ll.root==null){
//             ll.root=newnode;
//         }else{
//             Node curr= ll.root;
//             while(curr.next!=null){
//                 curr= curr.next;
//             }
//             curr.next=newnode;
//         }
      
//         return ll;
//     }
//     public static void display(Linkedlist ll){
//         Node curr = ll.root;
//         while(curr!=null){
//                 System.out.print( ">>"+curr.d );
//                 curr=curr.next;
//             }System.out.println("");
//         }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Linkedlist ll = new Linkedlist();
//         ll=insert(ll,sc.nextInt());
//         ll=insert(ll,sc.nextInt());
//         ll=insert(ll,sc.nextInt());
//         ll=insert(ll,sc.nextInt());
//         ll=insert(ll,sc.nextInt());
//         display(ll);

//     }
// }


// binary
// public class Binarytree{
//     public static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int d){
//             this.data =d;
//             this.left=this.right=null;

//         }
//     }
// static class binarytree{   
//     static int idx=-1;
//     public static Node buildtree(int[] d){
//         idx++;
//         if(d[idx]==-1){
//             return null;
//         }
//         Node newnode = new Node(d[idx]);
//         newnode.left=buildtree(d);
//         newnode.right=buildtree(d);
//         return newnode;
//     }

    // static void preorder(Node root){
    //     if(root==null){
    //         System.out.print(-1+" ");
    //     }
    //     else{
    //         System.out.print(root.data+" ");
    //         preorder(root.left);
    //         preorder(root.right);
    //     }
        
    // }
//     static void postorder(Node root){
//         if(root==null){
//             System.out.print(-1+" ");
//         }
//         else{
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.data+" ");
            
//         }
        
//     }
// }
// public static void main(String[] args) {
//     binarytree tree = new binarytree();
//     int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//     Node root = tree.buildtree(arr);
//     System.out.println(root.data);
//     tree.preorder(root);
//     tree.postorder(root);
// }
// }


//                                          <<< Backtracking reference >>>

// import java.util.ArrayList;

// class Main{
//     static String directions ="DULR";
//     static int[] d1 ={1,-1, 0,0};
//     static int[] d2 ={0, 0,-1,1};
//     static boolean isvalid(int[][] maze,int row , int col ,int  n){
//         return row>=0&&col>=0&&row<n&&col<n&&maze[row][col]==1;
//     }
//     static void Findpath(int[][] maze,int row,int col,int n,ArrayList<String> list, StringBuilder curr){
//         if(row==n-1&&col==n-1){
//             list.add(curr.toString());
//             return;
//         }
//         maze[row][col]=0;
//         for(int i=0;i<4;i++){
//             int nextrow = row+d1[i];
//             int nextcol = col+d2[i];
//             if(isvalid(maze, nextrow,nextcol,n)){
//                 curr.append(directions.charAt(i));
//                 Findpath(maze, nextrow, nextcol,n, list, curr);
//                 curr.deleteCharAt(curr.length() - 1);
                
//             }
//         }
//         maze[row][col]=1;

//     }
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         int[][] maze = { { 1, 1, 1, 1 },
//                          { 1, 1, 0, 1 },
//                          { 1, 1, 0, 1 },
//                          { 0, 1, 1, 1 } };
//         int n = maze.length;
//         StringBuilder curr = new StringBuilder();
//         Findpath(maze,0,0,n,list,curr);
//         if (list.size() == 0)
//             System.out.println(-1);
//         else
//            for (String path : list)
//             System.out.print(path + " ");
//             System.out.println();
//     }
// }

// import java.util.Scanner;

// class Node{
//     int data;
//     Node next;
//     Node(int d){
//         data=d;
//         next=null;
//     }
// }
// public class Linkedlist{
//     Node root;
//     public static Linkedlist Insert(Linkedlist ll, int data){
//         Node newnode = new Node(data);
//         if(ll.root==null){
//              ll.root = newnode;
//         } 
//         else{
//             Node curr=ll.root;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=newnode;

//         }
      

//         return ll;
//     }
//     public static void display(Linkedlist ll){
//         if(ll.root==null){
//             return ;
//         }
//         Node curr =ll.root;
//         while(curr!=null){
//             System.out.print(curr.data +">>");
//             curr=curr.next;
//         }

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Linkedlist ll = new Linkedlist();
//         while(sc.hasNextInt()){
//             ll = Insert(ll, sc.nextInt());
//         }
        
//         display(ll);
//         sc.close();
//     }
// }



//                                        Maximum multiple sum

// import java.util.*;
// class Main{
//     public static int maxsum(int n){
//         int Maxsum=0;
//         int sum=0;
//         int a =0;
//         if(n>=2&&n<=100){
//             for(int i=2;i<=n;i++){
//                 int k=(n-(n%i))/i;
//                 sum = ((k*(k+1))/2)*i;
//                 if(sum>=Maxsum){
//                    Maxsum=sum;
//                    a=i;
//                 }
//             }
//         }else{
//             System.out.println("Invalid");
//         }return a;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         for(int i=0;i<t;i++){
//             System.out.println(maxsum(sc.nextInt()));
//         }       
//     }
// }


//   substring and Subsequence             >>> not done <<<<
// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t =sc.nextInt();
//         for(int i=0;i<t;i++){
//         String s = sc.next();
//         String s1= sc.next();
//         solve(s,s1);
//         }
//         sc.close();
       
// }   public static void solve(String s ,String s1){
//     int n  = s.length();
//     int n1 = s1.length();
//     StringBuilder s3 = new StringBuilder();    
//     s3.append(s1);
//     int f=0;
//         while(f<n){
//             int l=0;
//             while(l<n1){
//                if(s.charAt(f)==s1.charAt(l)){
//                     s3.deleteCharAt(s3.length()-s1.length()+l);    
//                }
//                l++;
//             }
//             f++;
//         }  
//         LinkedHashSet<Character> set = new LinkedHashSet<>();
//         for(int i=0;i<s3.length();i++){
//             set.add(s3.charAt(i));
//         }
//         String ss=s;
//         for(Character ch :set){
//             ss+=ch.toString();
//         }

        

//      System.out.println(ss.length());
// }
// }


//                                      <<< reverse a linkedlist >>


// import java.util.Scanner;

// class linkedlist{
//     Node root;
//     static class Node{
//         int data;
//         Node next;
//         Node(int d){
//             data=d;
//             next=null;
//         }
//     }
//     public static linkedlist insert(linkedlist ll,int d){
//         Node newnode = new Node(d);
//          if(ll.root==null){
//             ll.root= newnode;
//          }else{
//             Node curr=ll.root;
//             while(curr.next!=null){
//                 curr=curr.next;
//             }
//             curr.next=newnode;
//          }return ll;
//     }
//     public static void display(linkedlist ll){ 
//         Node curr =ll.root;
//             while(curr!=null){
//                 System.out.print(curr.data+">");
//                 curr=curr.next;
//             }System.out.println("");
        
//     }
//     public static void reverse(linkedlist ll){
//         if(ll.root==null){
//             return;
//         }else{
//             Node curr=ll.root.next;
//             Node prev=ll.root;
//             while(curr!=null){
//                 Node nextNode = curr.next;
//                 curr.next=prev;

//                 prev=curr;
//                 curr=nextNode;
//             }
//             ll.root.next=null;
//             ll.root=prev;

//         }
//     }
//     public static void sort(linkedlist ll){
//          int[] cout=new int[3];
//          Node curr =ll.root;
//          while(curr!=null){
//             cout[curr.data]++;
//             curr=curr.next;
//          }
//          int i=0;
//          Node curr1=ll.root;
//          while(curr1!=null){
//             if(cout[i]==0){
//                 i++;
//             }else{
//                 curr1.data=i;
//                 curr1=curr1.next;
//                 cout[i]--;
//             }
//          }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         linkedlist ll = new linkedlist();
//         while(sc.hasNextInt()){
//             insert(ll, sc.nextInt());
//         }
//         display(ll);
//         reverse(ll);
//         display(ll);   
//         sc.close();    
//     }
// }



//                                                   <<  Graph  >>


// import java.util.*;
// class Main{
//     static class Edge{
//         int src;
//         int des;
//         Edge(int s,int d){
//             this.src=s;
//             this.des=d;
//         }
//     }
//     public static void buildgraph(ArrayList<Edge> graph[],int V){
//         for(int i=0;i<V;i++){
//             graph[i]=new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1,0));
//         graph[1].add(new Edge(1,3));

//         graph[2].add(new Edge(2,0));
//         graph[2].add(new Edge(2,4));

//         graph[3].add(new Edge(3,1));
//         graph[3].add(new Edge(3,4));
//         graph[3].add(new Edge(3,5));

//         graph[4].add(new Edge(4,2));
//         graph[4].add(new Edge(4,3));
//         graph[4].add(new Edge(4,5));


//         graph[5].add(new Edge(5,3));
//         graph[5].add(new Edge(5,4));

//     }
//     public static void bfs(ArrayList<Edge> graph[],int V){
//         Queue<Integer> q = new LinkedList<>();
//         boolean visited[] = new boolean[V];
//         q.add(0);
//         while(!q.isEmpty()){
//             int curr=q.poll();
//             if(visited[curr]==false){
//                  System.out.print(curr);
//                  visited[curr]=true;
//                  for(int i=0;i<graph[curr].size();i++){
//                    Edge e =graph[curr].get(i);
//                    q.add(e.des);
//                  }
//             }
//         }
//     }
//     public static void printAllPaths(ArrayList<Edge> graph[],int curr,boolean[] vis,String path,int tar){
//       if(curr==tar){
//         System.out.println(path);
//         return;
//       }
//       for(int i=0;i<graph[curr].size();i++){
//         Edge e = graph[curr].get(i);
//           if(!vis[e.des]){
//             vis[curr]=true;
//             printAllPaths(graph, e.des, vis, path+e.des, tar);
//             vis[curr]=false;
//           }
//       }
//     }
//     public static void dfs(ArrayList<Edge> graph[],int curr,boolean[] vis){
//         System.out.print(curr+" ");
//         vis[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e =graph[curr].get(i);
//             if(vis[e.des]==false){
//                 dfs(graph,e.des,vis);
//             }
            
//         }
//     }
//     public static void main(String[] args) {
//         int V=7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         boolean vis[] = new boolean[V];

//         buildgraph(graph,V);
        
//         // bfs(graph,V);
//         // System.out.println("");
//         // dfs(graph,0,vis);
//         // System.out.println("");
//         printAllPaths(graph, 0,new boolean[V],"0", 5);
//     }
// }


//  Heap

// class Heap{
//     int maxsize;
//     int[] arr;
//     int heapsize;
//     Heap(int maxsize){
//         this.maxsize=maxsize;
//         arr=new int[maxsize];
//         heapsize=0;
//     }

//     public void heapify(int i){
//         int l =2*i+1;
//         int r=2*i+2;
//         int largest=i;
//         if(l<heapsize&&arr[l]>arr[i]){
//             largest=l;
//         }
//         if(r<heapsize&&arr[r]>arr[i]){
//             largest=r;
//         }
//         if(largest!=i){
//             int temp=arr[i];
//             arr[i]=arr[largest];
//             arr[largest]=temp;
//             heapify(largest);
//         }
//     }
//     int getmax(){
//         return arr[0];
//     }
//     int size(){
//         return heapsize;
//     }
//     public void insert(int x){
//         if(heapsize==maxsize){
//             System.out.println("The heap is Overflowed");
//             return;
//         }
//         heapsize++;
//         int i=heapsize-1;
//         arr[i]=x;
//         while(i!=0&&arr[(i-1)/2]<arr[i]){
//             int temp=arr[i];
//             arr[i]=arr[(i-1)/2];
//             arr[(i-1)/2]=temp;
//             i=(i-1)/2;
//         }
//     }
//     public static void main(String[] args) {
//         Heap heap = new Heap(10);
//         heap.insert(1);
//         heap.insert(2);
//         heap.insert(3);
//         heap.insert(7);
//         System.out.println(heap.getmax());
//     }
// }


// import java.util.*;

// class Main{
//     public static int depth(String tree,int n ,int index){
//         if(index >=n||tree.charAt(index)=='l'){
//             return 0;   
//         }
//         index++;
//         int left=depth(tree, n, index);
//         index++;
//         int right=depth(tree, n, index);

//         return Math.max(left,right)+1;
//     }
//     static int depthoftree(String tree,int n ){
//         return depth(tree, n, 0);
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         String tree=sc.nextLine();
//         System.out.println(depthoftree(tree, tree.length()));

//     }
// }


//Binary tree

//     class Node{
//         int data;
//         Node left,right;
//         Node(int d){
//             data=d;
//             left=right=null;
//         }
//     }
//     class binarytree{
//         static int idx=-1;
//         static Node buildtree(int[] arr){
//             idx++;
//             if(arr[idx]==-1){
//                  return null;
//             }Node newnode = new Node(arr[idx]);
//             newnode.left=buildtree(arr);
//             newnode.right=buildtree(arr);
//             return newnode;
//         }
//         static int checksum(Node root){
//          if(root==null){
//             return 0;
//          }
            
//         return checksum(root.left)+root.data+checksum(root.right);

            
//         }
    
//     static void preorder(Node root){
//         if(root==null){
//             return;
//         }
//         else{
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }
//     }
//     static int t=0;
//     static int level(Node root,int a){
//         if(root==null){
//             return 0;
//         }else if(root.data==a){
//             return t-1;
//         }
//         return (level(root.left,a)+level(root.right,a))+1;
       
//     }
//     public static void main(String[] args) {
//         int[] arr ={26,10,4,-1,-1,6,-1,-1,3,-1,3,-1,-1};
//         Node root = buildtree(arr);
//         preorder(root);
//         int ls=checksum(root.left);
//         int rs=checksum(root.right);
//         System.out.println(ls);
//         System.out.println(rs);
      
//         if(root.data==ls+rs){
//             System.out.println("yesssssss");
//         }else{
//             System.out.println("Noooo");
//         }
//         System.out.println(level(root, 10));

//     }
// }



//         sliding window (not fixed size);

// import java.util.*;
// class Main{
//     public static int subarray(String s){
//       HashSet<Character> list = new HashSet<>(); 
//       int f=0;
//       int max = Integer.MIN_VALUE;
//       for(int i=0;i<s.length();i++){
//          while(list.contains(s.charAt(i))){
//            list.remove(s.charAt(f));
//            f++;
//          }
//          list.add(s.charAt(i));
//          max=Math.max(max,i-f+1);
//       }
//       return max;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(subarray(s));
//     }
// }

                // here you should check the int range   t<Integer.MAX_VALUE &&t>Integer.MIN_VALUE
// import java.util.*;

// class Solution {
//   public static int reverse(int x) {
//       int p=0;
//       if(x<0){
//           x=x*(-1);
//           p=1;
//       }
//       int t=0;
//       while(x>0){
//           int tem=x%10;
//           t+=tem;
//           if(x<=9){
//             return t;
//           }
//           x=x/10;
//           t=t*10;
//       }

//       if(p==1){
//           t=t*(-1);
//       }
//       return t; 
//   }public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int c =sc.nextInt();
//     System.out.println(reverse(c));
//   }
// }




// Sliding window problem 2        not solved yet 

// import java.util.*;
// class Main{
//   public static String find(String s,String t){
//     StringBuilder n = new StringBuilder();
//     String res="";
//     int f=0;
//     for(int i=0;i<s.length();i++){
//        n.append(s.charAt(i)); 
//        String temp =n.toString();
//        int l=0; 
//        while(l==t.length()){
//            n.deleteCharAt(f);
//            f++;
//        }
//        res=n.toString();
//     }return res;
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String s = "ADOBECODEBANC";
//     String t = "ABC";
//     System.out.println(find(s,t));
//   }
// }


// ----------------------------------- Not completed ------------------------------------
// import java.util.*;

// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         String s2 = sc.nextLine();
//         System.out.println(result(s1,s2));
        
//     }
//     static int result(String s1,String s2){
//         int a=s1.length();
//         int b=s2.length();
//         int j=0;
//         int i=0;
//         while(i<a&&j<b){
//             if(s1.charAt(i)=='?'){
//                 j++;
//                 i++;
//             }else if(s1.charAt(i)=='*'){
//                 if(i==a-1){
//                     return 1;
//                 }for (int k = j; k <= b; k++) {
//                     if (result(s1.substring(i + 1), s2.substring(k)) == 1) {
//                         return 1;
//                     }
//                 }
                
//             }else if(s1.charAt(i)!=s2.charAt(j)){
//                 return 0;
//             }
//             i++;
//             j++;
//         }
//         while(i<a&&s1.charAt(i)=='*'){
//             i++;
//         }
//         if(i==a-1&&j==b-1){
//             return 1;
//         }else{
//             return 0;
//         }
//     }
// }

// --------------------------------------------first missing positive number---------------------------------------
// import java.util.*;
// class Main{
//     public static int solution(int[] nums){
//       HashMap<Integer,Integer> map= new HashMap<>();
//       int n= nums.length;
//       for(int i=0;i<n;i++){
//         if(nums[i]>=0){
//             map.put(nums[i],nums[i]);
//         }
//       }
//       int max=0;
//       for(int i=0;i<n;i++){
//         if(max<nums[i]){
//             max=nums[i];
//         }
//       }
//       for(int i=1;i<=max;i++){
//         if(!map.containsKey(i)){
//             return i;
//         }
//       }
//       return max+1;
//     }

//     public static void main(String[] args) {
//         int[] arr={0,1,1,2,2};
//         System.out.println(solution(arr));
//     }
// }


// import java.util.*;
// import java.util.HashMap;
// class Solution {
//     public static String minWindow(String s, String t) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i=0;i<t.length();i++){
//             if(map.containsKey(t.charAt(i))){
//                 map.put(t.charAt(i),map.get(t.charAt(i))+1);
//             }else{
//                 map.put(t.charAt(i),1);
//             }
//         }
//         int count=map.size();
//         int i=0;
//         int j=0;
//         int left=0;
//         int right=s.length()-1;
//         int minvalue=s.length();
//         boolean found =false;
//         while(j<s.length()){
//             char endchar=s.charAt(j++);
//             if(map.containsKey(endchar)){
//                 map.put(endchar,map.get(endchar)-1);
//                 if(map.get(endchar)==0) count--;
//             }
//             if(count>0) continue;
//             while(count==0){
//                 char startchar = s.charAt(i++);
//                 if(map.containsKey(startchar)){
//                     map.put(startchar,map.get(startchar)+1);
//                     if(map.get(startchar)>0) count++;
//                 }
//             }
//             if(j-i<minvalue){
//                 left=i;
//                 right=j;
//                 minvalue=j-i;
//                 found=true;
//             }

//         }
//         if(found){
//            return  s.substring(left-1, right);
//         }else{
//             return "";
//         }
//     }
//     public static void main(String[] args) {
//         String s="ADOBECODEBANC";
//         String t="ABC";
//         System.out.println(minWindow(s,t));
//     }
// }



// ------------------------------  Wild card entry (String matching)--------------------------------------

// import java.util.*;
// class Solution {
//     public static boolean isMatch(String s, String p) {
//         int n1=s.length();
//         int n2=p.length();
//         boolean[][] dp = new boolean[s.length()+1][p.length()+1]; 
//         dp[0][0]=true;
//         for (int j = 1; j <= n2; j++) {
//             if (p.charAt(j - 1) == '*'){
//                 dp[0][j] = dp[0][j - 1]; 
//             }
//         }
      
//         for(int i=1;i<=s.length();i++){
//             for(int j=1;j<=p.length();j++){
//                 if(p.charAt(j-1)==s.charAt(i-1)||p.charAt(j-1)=='?'){
//                     dp[i][j]=dp[i-1][j-1];
//                 }else if(p.charAt(j-1)=='*'){
//                     dp[i][j]=dp[i-1][j]||dp[i][j-1];
//                 }else{
//                     dp[i][j]=false;
//                 }
//             }
//         }   
//         return dp[s.length()][p.length()];  
//     }public static void main(String[] args) {
//         String s="aab";
//         String p="*";
//         System.out.println(isMatch(s, p));
//     }
// }

// --------------------------- coin change ---------------

// class Solution {
//     public static int coinChange(int[] coins, int amount) {
//         int n = coins.length;
//         int[][] dp = new int[n+1][amount + 1];
//         for (int i = 0; i <= n; i++) {
//             dp[i][0] = 0; 
//         }
//         for (int j = 1; j <= amount; j++) {
//             dp[0][j] = Integer.MAX_VALUE-1; 
//         }
//         for (int i = 1; i <= n; i++){
//             for (int j = 1; j <= amount; j++) {
//                 if (j >= coins[i-1]) {
//                     dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i-1]] + 1);
//                 } else {
//                     dp[i][j] = dp[i - 1][j];
//                 }
//             }
//         }
//         if (dp[n][amount]==Integer.MAX_VALUE-1){
//             return -1;
//         }else{
//             return dp[n][amount];
//         }
        
//     }
//     public static void main(String[] args) {
//         int[] coins={2};
//         int amount=11;
//         System.out.println(coinChange(coins, amount));
//     }
// }

// ----------------------------------KMP algorithm------------------------

// class Main{
//     public static int[] computeArray(String s){
//         int[] arr = new int[s.length()];
//         int i=1;
//         int j=0;
//         while(i<s.length()){
//             if(s.charAt(i)==s.charAt(j)){
//                 arr[i]=j+1;
//                 j++;
//                 i++;
//             }else{
//                 if(j!=0){
//                     j=arr[j-1];
//                 }else{
//                    arr[i]=0;
//                    i++;
//                 }
//             }
//         }return arr;
//     }
//     public static boolean kmp(String text, String pattern){
//         int arr1[]=computeArray(pattern);
//         int i=1;
//         int j=0;
//         while(i<text.length()&& j < pattern.length()){
//             if(text.charAt(i)==pattern.charAt(j)){
//                 j++;
//                 i++;
//             }else{
//                 if(j!=0){
//                    j=arr1[j-1];
//                 }else{
//                    i++;
//                 }
//             }
//         }
//         return j==pattern.length();


//     }
//     public static void main(String[] args) {
//         String s ="abcdabcefabcdabcegfsa";
//         String p ="abcdabceg";
//         System.out.println(kmp(s,p));
//     }
// }
// ------------- reverse a String -----------------
// class Main{
//     public static String reverse(String s){
//         s=s.trim();
//         String[] arr = s.split(" +");
//         String reverse="";
//         int i=arr.length-1;
//         while(i>=0){
//             reverse+=arr[i]+" ";
//             i--;
//         }
//         return reverse;
//     }
//     public static void main(String[] args) {
//         String s="My Name is     Sai Chandu            ";
//         System.out.println(reverse(s));
//     }
// }
// ---------------------- spiral matrix ------------------
// import java.util.*;
// class Main{
//     static ArrayList<Integer> arr1 = new ArrayList<>();
//     public static void spiral(int[][] arr){
//         int r =arr.length;
//         int c =arr[0].length;
        
//         int top=0,bottom=r-1,left=0,right=c-1;
//         while(top<=bottom&&left<=right){
//             for(int i=left;i<=right;++i){
//                 arr1.add(arr[top][i]);
//             }
//             top++;
//             for(int i=top;i<=bottom;++i){
//                 arr1.add(arr[i][right]);
//             }
//             right--;
//             if(top<=bottom){
//                 for(int i=right;i>=left;--i){
//                     arr1.add(arr[bottom][i]);
//                 } 
//                 bottom--;
//             }
//             if(left<=right){
//                 for(int i=bottom;i>=top;--i){
//                     arr1.add(arr[i][left]);
//                 }
//                 left++;
//             }

//         }
        
//     }
//     public static void main(String[] args) {
//         int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//         spiral(arr);
//         for( int i:arr1){
//             System.out.print(" "+i);
//         }
//     }
// }

// class Main{
//     public static int find(String s){
//         int[][] dp = new int[s.length()][s.length()];
//         for(int i=0;i<s.length();i++){
//             dp[i][i]=1;
//         }
       
//         for(int i=1;i<s.length();i++){
//             int j=0;
//             while(i+j<s.length()){
//                 if(s.charAt(j)==s.charAt(j+i)){
//                     dp[j][i+j]=dp[j+1][j+i-1]+2;                    
//                 }else{
//                     dp[j][j+i]=Math.max(dp[j+1][j+i],dp[j][i+j-1]);
//                 }
//                 j++;
//             }
//         }
//         return dp[0][s.length()-1];
        
//     }
//     public static void main(String[] args) {
//         String s="aabaa";
//         System.out.println(find(s));
//         find(s);
//     }
// }






import java.util.Scanner;
class Main{
  static int max=0;
  public static int cal(int i,int[] arr){
    if(i>=arr.length){
      return 0;
    }
    int sum =arr[i]+Math.max(cal(i+2,arr),cal(i+3,arr));
    if(max<sum){
      max=sum;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {10,12,15,50,22};
    cal(0,arr);
    System.out.println(max);
  }
}

