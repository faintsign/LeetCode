/*
 * File: 		main.c
 * Project:		BinarySearch
 * Date:		04/12/23
 * Author:		Solution
 * Description:
 *
**/

#include <stdio.h>

// Our structure
struct arr{
	int data[10];
	int size;
};

// Insert elements into array
void insert(struct arr *pointer){
	for(int i = 0; i < 8; i++){
		pointer->data[i] = i;
	}
}

// Using binary search algorithm, find the target with o(log n) time complexity
int search(struct arr *pointer, int target){
	int low = 0;
	int high = pointer->size - 1;
	
	while(low < high){
		int mid = (high + low) / 2;
		
		if(pointer->data[mid] == target){
			return pointer->data[mid];
		}
		
		else if(pointer->data[mid] < high){
			high = mid - 1;
		}

		else if(pointer->data[mid] > low){
			low = mid + 1;
		}
	}

	return -1; // -> Target was not found
 
}

// Initalize structure data
void initalize(struct arr *pointer){
	pointer->size = sizeof(pointer->data) / sizeof(int);
}

// Main entry point of program
int main(){
	struct arr structure;
	struct arr *ptr = &structure;

	initalize(ptr);
	insert(ptr);

	int num = 1;
	printf("%d found in array", search(ptr, num));
	
	return 0;
}


