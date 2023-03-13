print("Enter number of matrices: ")
n = int(input())

print("Enter all the dimensions seperated by spaces: ")
p = list(map(int, input().split()))

m = [[9999 for i in range(n)] for j in range(n)]

for i in range(n):
    for j in range(n):
        if i == j:
            m[i][j] = 0
