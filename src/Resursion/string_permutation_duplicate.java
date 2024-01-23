package Resursion;

public class string_permutation_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abca";
		dup(s,"");
	}
		public static void dup(String ques , String ans) {
			if(ques.length()==0) {
				System.out.println(ans);
				return;
						
			}
			
			for(int i=0;i<ques.length();i++) {
				char ch=ques.charAt(i);
				boolean flag=true;
			for (int j = i+1; j < ques.length(); j++) {
				if(ch==ques.charAt(j)) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				String x=ques.substring(0,i)+ques.substring(i+1);
				
				dup(x,ans+ch);
			}
			}
		}
}
