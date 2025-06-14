# linked List 
![alt text](image-1.png)

### lookup
![alt text](image.png)
 - cannot look up like in array index style . can be all over memmory as it just has a value and a pointer to next value
 - fast to look 

### insert
![alt text](image-2.png)
- cannot jump in the middle index like in array!!
- we need to follow through the links(i.e pointers)

### delete
![alt text](image-3.png)
- O(1)
- begining => move the head to second node and delete the ponter of fist node

![alt text](image-4.png)
- O(n)
- last => need to go through the link to find second last node , detach it from last node and make it tail.

![alt text](image-5.png)
- O(n)
- middle => need to go throuth the link . find the one to delete , point one before to one next , then the middle one will be removed 


## Array vs LinkedList
![alt text](image-6.png)
![alt text](image-7.png)

## Types of linked List 
![alt text](image-8.png)

both can be circular
- can be used to looop songs in a playlist
![alt text](image-9.png)
