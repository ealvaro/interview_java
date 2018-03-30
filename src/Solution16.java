//Let's play a game on an array! You're standing at index 0 of an n-element array named game. From some index i (where 0<=1<=n), you can perform one of the following moves:
//
//Move Backward: 
//	If cell i-1 exists and contains a 0, you can walk back to cell i-1.
//Move Forward:
//	If cell i+1 contains a zero, you can walk to cell i+1 .
//	If cell i+leap contains a zero, you can jump to cell i+leap.
//	If you're standing in cell n-1 or the value of i+leap >= n, you can walk or jump off the end of the array and win the game.
//
//Return true if you can win the game; otherwise, return false.
//
//Sample Input
//
//4
//5 3
//0 0 0 0 0
//6 5
//0 0 0 1 1 1
//6 3
//0 0 1 1 1 0
//3 1
//0 1 0
//Sample Output
//
//YES
//YES
//NO
//NO
//Explanation
//

import java.util.*;

public class Solution16 {
    public static boolean canWin(int leap, int n, int[] game) {
    	if (leap>=n-1) return true;
        boolean[] hist = new boolean[2*n];
        int i=0;
        boolean moved = true;
        while (i>=0 && i<n && moved ){
        moved = false;
        if (game[i+leap] == 0){ 
            moved=true;i += leap;hist[i]=true;
        }
        else
            if (i<n && game[i+1] == 0){
                moved=true;i++;
                if (hist[i]) break; else hist[i]=true;
            }
            else
                if (i>0 && game[i-1] == 0) {
                    moved=true;i--;
                    if (hist[i]) break; else hist[i]=true;
                }
        }
        return i >= n;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[2*n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap,n, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}


//import java.util.Scanner;
//
//public class Solution {
//
//	public static void main(String[] args) {
//		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//		try (Scanner in = new Scanner(System.in)) {
//			int t = in.nextInt();
//			while (t-- > 0) {
//				int n = in.nextInt(), m = in.nextInt();
//				int[] a = new int[n];
//				for (int i = 0; i < n; i++) {
//					a[i] = in.nextInt();
//				}
//				System.out.println(solve(a, m));
//			}
//		}
//	}
//
//	private static String solve(int[] a, int m) {
//		int n = a.length;
//		boolean[] b = new boolean[n];
//		b[0] = true;
//		for (int i = 0; i < n; i++) {
//			if (b[i]) {
//				if (i + 1 < n) {
//					b[i + 1] = a[i + 1] == 0;
//				}
//				if (i + m < n) {
//					for (int j = i + m; j > i && a[j] == 0; j--) {
//						b[j] = true;
//					}
//				}
//			}
//		}
//		if (m == 0 && b[n - 1]) {
//			return "YES";
//		}
//		for (int i = n > m ? n - m : 0; i < n; i++) {
//			if (b[i]) {
//				return "YES";
//			}
//		}
//		return "NO";
//	}
//
//}



//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int T = scn.nextInt();
//		while(T-- > 0){
//			int n = scn.nextInt(), m = scn.nextInt();
//			int arr[] = new int[n];
//			boolean visited[] = new boolean[n];
//			for(int i = 0;i<n;++i){
//				arr[i] = scn.nextInt();
//				visited[i] = false;
//			}
//			visited[0] = true;
//			boolean res = false;
//			Queue<Integer> q = new LinkedList<>();
//			q.add(0);
//			while(!q.isEmpty()){
//				int v = q.poll();
//				if(v+1 >= n || v+m >= n){
//					res = true;
//					break;
//				}
//				if(v-1 >= 0 && !visited[v-1] && arr[v-1] == 0){
//					visited[v-1] = true;
//					q.add(v-1);
//				}
//				if(v+1 < n && !visited[v+1] && arr[v+1] == 0){
//					visited[v+1] = true;
//					q.add(v+1);
//				}
//				if(v+m < n && !visited[v+m] && arr[v+m] == 0){
//					visited[v+m] = true;
//					q.add(v+m);
//				}
//			}
//			System.out.println(res ? "YES" : "NO");
//		}
//	}
//}