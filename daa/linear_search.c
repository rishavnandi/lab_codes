// Linear search algorithm

#include <stdio.h>

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int n = sizeof(arr) / sizeof(arr[0]);
    int key = 5;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] == key)
        {
            printf("Element found at index %d", i);
            return 0;
        }
    }

    printf("Element not found");
    return 0;
}
