public class SelectionSort{
	public static void main(String args[]){
	int arr[]={5,6,3,1,2,4};
	for(int i=0;i<arr.length-1;i++){
		int indx=i;
	for(int j=i+1;j<arr.length;j++){
		if(arr[j]<arr[indx]){
			indx=j;}
		}
		if(indx!=i){
		int temp=arr[indx];
		arr[indx]=arr[i];
		arr[i]=temp;}
	}
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);}
   }
}
		