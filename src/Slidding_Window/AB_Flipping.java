package Slidding_Window;
import java.util.*;
public class AB_Flipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        String s=sc.next();
	        int flipa=count(s,n,'a');
	        int flipb=count(s,n,'b');
	        System.out.print(Math.max(flipa,flipb));
	    }
	    public static int count(String st,int k,char ch){
	        int s=0;
	        int e=0;
	        int f=0;
	        int ans=0;
	        while(e<st.length()){
	            if(st.charAt(e)==ch){
	                f++;
	            }
	            while(f>k && s<=e){
	                 if(st.charAt(s)==ch){
	                f--;
	            }
	            s++;
	            }
	            ans=Math.max(ans,e-s+1);
	            e++;
	        }
	            return ans;
	    }
	}