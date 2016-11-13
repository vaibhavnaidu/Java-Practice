//Linear Search practice

public class LinearSearchdemo {
	
	public int linearSearch(int data, int list[]){
		for(int i=0;i<list.length;i++){
			if(list[i]==data)
				return i;
		}
		return -1;
	}
}
