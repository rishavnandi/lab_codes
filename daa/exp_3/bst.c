// binary search tree operations

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int key;
    struct node *left, *right;
};

struct node *newNode(int item)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->key = item;
    temp->left = temp->right = NULL;
    return temp;
}

void inorder(struct node *root)
{
    if (root != NULL)
    {
        inorder(root->left);
        printf("%d ", root->key);
        inorder(root->right);
    }
}

void preorder(struct node *root)
{
    if (root != NULL)
    {
        printf("%d ", root->key);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(struct node *root)
{
    if (root != NULL)
    {
        postorder(root->left);
        postorder(root->right);
        printf("%d ", root->key);
    }
}

struct node *insert(struct node *node, int key)
{
    if (node == NULL)
        return newNode(key);
    if (key < node->key)
        node->left = insert(node->left, key);
    else if (key > node->key)
        node->right = insert(node->right, key);
    return node;
}

struct node *minValueNode(struct node *node)
{
    struct node *current = node;
    while (current && current->left != NULL)
        current = current->left;
    return current;
}

struct node *deleteNode(struct node *root, int key)
{
    if (root == NULL)
        return root;
    if (key < root->key)
        root->left = deleteNode(root->left, key);
    else if (key > root->key)
        root->right = deleteNode(root->right, key);
    else
    {
        if (root->left == NULL)
        {
            struct node *temp = root->right;
            free(root);
            return temp;
        }
        else if (root->right == NULL)
        {
            struct node *temp = root->left;
            free(root);
            return temp;
        }
        struct node *temp = minValueNode(root->right);
        root->key = temp->key;
        root->right = deleteNode(root->right, temp->key);
    }
    return root;
}

struct node *search(struct node *root, int key)
{
    if (root == NULL || root->key == key)
        return root;
    if (root->key < key)
        return search(root->right, key);
    return search(root->left, key);
}

int main()
{
    struct node *root = NULL;
    int choice, key;
    while (1)
    {
        printf("\n 1. Insert a node in the tree (insert) ");
        printf("\n 2. Delete a node from the tree (delete) ");
        printf("\n 3. Search a node in the tree (search) ");
        printf("\n 4. Inorder traversal of the tree (inorder) ");
        printf("\n 5. Preorder traversal of the tree (preorder) ");
        printf("\n 6. Postorder traversal of the tree (postorder) ");
        printf("\n 7. Exit ");
        printf("\n Enter your choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("\n Enter the key to be inserted : ");
            scanf("%d", &key);
            root = insert(root, key);
            break;
        case 2:
            printf("\n Enter the key to be deleted : ");
            scanf("%d", &key);
            root = deleteNode(root, key);
            break;
        case 3:
            printf("\n Enter the key to be searched : ");
            scanf("%d", &key);
            if (search(root, key) != NULL)
                printf("\n Key found ");
            else
                printf("\n Key not found ");
            break;
        case 4:
            printf("\n Inorder traversal of the tree : ");
            inorder(root);
            printf(" ");
            break;
        case 5:
            printf("\n Preorder traversal of the tree : ");
            preorder(root);
            printf(" ");
            break;
        case 6:
            printf("\n Postorder traversal of the tree : ");
            postorder(root);
            printf(" ");
            break;
        case 7:
            exit(0);
        default:
            printf("\n Wrong choice ");
        }
    }
    return 0;
}