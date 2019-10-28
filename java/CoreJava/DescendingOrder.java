package CoreJava;

public class DescendingOrder {
	public static void main(String[] args) {
		int a[]= {4,5,1,2,7,3},temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		System.out.println("Max num is:"+a[0]);
		System.out.println("Min num is:"+a[a.length-1]);
		
	}

}
