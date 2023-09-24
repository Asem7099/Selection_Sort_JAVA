package selection;
public class Selection {
public static void Sort(int arr[])
{
    int smallest ,index,minIndex,temp;
    for(index=0;index<arr.length-1;index++)
    {
        smallest=index;
        for(minIndex=index+1;minIndex<arr.length;minIndex++)
        {
            if(arr[minIndex]<arr[smallest])
                smallest=minIndex;
          temp=arr[smallest];
          arr[smallest]=arr[index];
          arr[index]=temp;
        }
    }   
}
    public static void main(String[] args) {
        int []arr={5,4,3,2,1,0};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"  ");
        }
    }    
}
