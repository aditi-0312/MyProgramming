package array.programs;

public class ArraySubsetOfAnotherArray {
	
	 public static String isSubset( long a1[], long a2[], long n, long m) {
	        int i;
	        int j;
	        for(i=0;i<m;i++) {
	        	for(j=0;j<n;j++) {
	        		if(a2[i]==a1[j]) {
	        			break;
	        		}
	        		if(j==m) {
	        			return "no";
	        		}
	        	}
	        }
	        return "yes";
	    }

	public static void main(String[] args) {
		long a1[]= {1,2,3,4,5};
		long a2[]= {1,2,3,7};
		long n=a1.length;
		long m=a2.length;
		System.out.println(isSubset(a1,a2,n,m));
			
		}
	}


