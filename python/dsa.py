
# def binarySearch(arr, tar):
#     left = 0
#     right = len(arr) -1
#     while(left <= right):
        
#         mid = int( left + (right - left)/2)
#         if(arr[mid]== tar):
#             return mid
#         elif arr[mid] < tar:
#             left = mid + 1
#         else:
#             right = mid - 1

#     return -1



# list = [-7, 3, 5, 9, 14, 16]
# target = 3
# result = binarySearch(list , target)

# print(result)


# s = "racecear"
# is_pal = True

# for i in range(len(s)//2):
#     if s[i] != s[-i-1]:
#         is_pal = False
#         break

# print(is_pal)


def merge(a, b):
    i = 0
    j= 0
    res= []
    while i < len(a) and j < len(b):
       if a[i] < b[j]:
          res.append(a[i])
          i+= 1
       else:
           res.append(b[j])
           j+= 1
    res.extend(a[i:])
    res.extend(b[j:])
    return res
     

   
print(merge([2, 8, 5], [3, 7, 11]))




