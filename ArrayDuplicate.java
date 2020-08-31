class ArrayDuplicate{
	public static void main(String[]args){
		int []arr=new int[]{4,5,6,4,5,8,9,7,8};
		System.out.println("Duplicate elements in given array are:");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
				}			
			}
		}	
	}
}