// WAP to implement merge sort

#include <stdio.h>

void merge(int arr[], int low, int mid, int high)
{
    int i = low;
    int j = mid + 1;
    int k = low;
    int b[100];

    while (i <= mid && j <= high)
    {
        if (arr[i] <= arr[j])
        {
            b[k] = arr[i];
            i++;
        }
        else
        {
            b[k] = arr[j];
            j++;
        }
        k++;
    }
    if (i > mid)
    {
        while (j <= high)
        {
            b[k] = arr[j];
            j++;
            k++;
        }
    }
    else
    {
        while (i <= mid)
        {
            b[k] = arr[i];
            i++;
            k++;
        }
    }
    for (int i = low; i <= high; i++)
    {
        arr[i] = b[i];
    }
}

void merge_sort(int arr[], int low, int high)
{
    int mid;
    if (low < high)
    {
        mid = (low + high) / 2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}

int main()
{
    int arr[] = {44, 12, 54, 62, 13, 87, 29, 38, 10, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    merge_sort(arr, 0, size - 1);
    for (int i = 0; i < size; i++)
    {
        printf("%d \n", arr[i]);
    }
    return 0;
}
