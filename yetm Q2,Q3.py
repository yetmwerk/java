#2,,wrtite pythone function to implement  linear and binary search algorithm based on above pseudocode 
#linear search implementation 
def linear_search (arr,target):
    for i in range(len(arr)):
        if arr[i]==target:
           return i #element found ,return the index
    return -1#element not found
    
    
    
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
arr=[1,3,5,7,9] # unsorted dataset
target=5#we want to search for the value 50

#linear search test
linear_result=linear search(arr,target)
print(f"linear search result for{target}:inex{linear result}")



#binary search test 
sorted arr=sorted arr = sorted(arr) binary search requires the array to be Sorted 
binary result =binary search(sorted arr,target)
print(f"binary search result for{target}:index {binary result}")