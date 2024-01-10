package Arrays.medium;
//Given a sorted array arr[] of size N. Find the element that appears only once in the array. All other elements appear exactly twice.
public class OneElement {
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        int n=arr.length;

        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            //if every element is occurring twice so in array till the point where single element has not occurred, till that time , first element of pair will come
            //at even index and second element will come at odd index
            //if that single element has occurred ,than after that point first element will be at odd point and second at even


            //if mid is at odd index
            if(mid%2!=0){
                //single element has not occurred
                if(arr[mid]==arr[mid-1])
                    i=mid+1;  //single element is ahead of mid
                //single element has occurred
                else if(arr[mid]==arr[mid+1])
                    j=mid-1; //single element is behind mid
                else {System.out.println(arr[mid]); //founded single element
                    break;
                }
            }
            //if mid is at even index
            else{
                //single element has not occurred yet
                if(arr[mid]==arr[mid+1])
                    i=mid+1;   //single element ahead of mid
                //single element has occurred
                else if(arr[mid]==arr[mid-1])
                    j=mid-1; //single element is behind mid
                else {
                    System.out.println(arr[mid]);//founded single element
                    break;
                    }//founded single element
                }
            }
        }
    }
