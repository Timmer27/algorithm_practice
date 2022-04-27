# 각각의 n, m, k를 공백으로 구분받아서 입력받기
# n = 주어진 data 수, m = 더하는 숫자, k = 초과 제한 숫자
n, m, k = map(int, input().split())

# 주어진 데이터를 공백으로 구분받아서 입력받기
data = list(map(int, input().split()))
#n, m, k = 5, 7, 2
#data = 3, 4, 3, 4, 3
# 실질적으로 필요한 데이터는 2개, 가장 큰 수 + 그 다음 큰 수
a = sorted(data)[-1]
b = sorted(data)[-2]
result = 0

while True:
    for i in range(k):
        if m == 0:
            break
        result += a
        m -= 1

    if m == 0:
        break
    result += b
    m -= 1

print(result)
