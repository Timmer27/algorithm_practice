# 1이 될 때까지
n, k = map(int, input().split())

result = 0
while True:
    # 1이 되면 반복문 종료
    if n == 1:
        break
    #
    if n % k == 0:
        n //= k
        result += 1
    else:
        n -= 1
        result += 1

print(result)
