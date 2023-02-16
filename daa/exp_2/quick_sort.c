// WAP to implement quick sort

#include <stdio.h>

void swap(int arr[], int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d \n", arr[i]);
    }
}

int partition(int arr[], int low, int high)
{
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j)
    {
        while (arr[i] <= pivot)
        {
            i++;
        }
        while (arr[j] > pivot)
        {
            j--;
        }
        if (i < j)
        {
            swap(arr, i, j);
        }
    }
    swap(arr, low, j);
    return j;
}

void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int j = partition(arr, low, high);
        quickSort(arr, low, j);
        quickSort(arr, j + 1, high);
    }
}

int main()
{
    int arr[] = {44, 12, 54, 62, 13, 87, 29, 38, 10, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    quickSort(arr, 0, n - 1);

    printArray(arr, n);

    return 0;
}
