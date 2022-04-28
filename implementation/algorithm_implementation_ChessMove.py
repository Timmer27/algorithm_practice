# 8 * 8체스판
# x y = 2 1 2 -1 or -2 1 2 1
# 위치 고정상태에서 움직일 수 있는 경우의 수

# 움직일 수 있는 경우의 수
arr = [(1, 2), (-1, 2), (1, -2), (-1, -2), (2, 1), (2, -1), (-2, 1), (-2, -1)]

n = input()
row = n[1]
column = ord(n[0]) - ord('a') + 1
result = 0

for a in arr:
    if column - int(a[0]) > 0 and int(row) - int(a[1]) > 0 and column - int(a[0]) <= 8 and int(row) - int(a[1]) <= 8:
        result += 1
print(result)
