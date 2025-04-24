#linear search implementation 
#def linear search (arr,target)
   # for i in range(len(arr)):
       # if arr[i]==target:
       #     return i #element found ,return the index
        #return -1#element not found
    
    
    
    #bineary search implementation 
def test_search(arr,target):
   low=0
   high=len(arr)-1
   while low<=high:
        mid=(low+high)//2
        if arr (mid==target):
            return mid#element found,return the index 
        elif arr[mid]>target:
            high=mid-1#search in the left half 
        else:
            low=mid+1#search in the right half
        return-1#element not found
#3,test apython function using real world example dataset
   # def test search ():
        #real world 