# Handle user input
T = int(input())  # Number of test cases

for _ in range(T):
    N, K = map(int, input().split())  # Number of people and initial ATM money
    A = list(map(int, input().split()))  # List of withdrawal requests

    result = ""
    for amount in A:
        if K >= amount:
            result += "1"
            K -= amount
        else:
            result += "0"
    print(result)
