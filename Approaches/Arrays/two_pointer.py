# Used for sorted array
# Application to find target sum
# We have right pointer and left pointer


# Example 2 sum
a = [1,2,3,4,5,6,7]
target = 7
i = 0
j = len(a) - 1

while(i<j):
    print(f"Entering loop i = {i} and j = {j}")
    print(a[i]+a[j])
    if(a[i]+a[j]==target):
        print([i,j])
        break
    elif(a[i]+a[j]<target):
        print("target is more")
        i = i + 1
    elif(a[i]+a[j]>target):
        print("target is less")
        j = j - 1
    else:
        print([])
        break
