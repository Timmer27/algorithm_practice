# 정수 N이 입력되면 00:00:00시부터 N시 59분 59초까지 모든 시각 중 3이 하나라도 들어가는 모든 경우의 수 구하기
# 1이 입력되면 00시 00분 03초, 00시 13분 30초 등등
from itertools import product
t = int(input())
# 초당 3초 30초 33초
# 분당 3분 13분 33분
# 시당 3시 13시
result = 0

for i in range(t+1):
    for j in range(60):
        for k in range(60):
            # 시간을 030125 같이 string으로 변환해서 3이 포함된 숫자만 추출한다.
            if '3' in str(i) + str(j) + str(k):
                result += 1
print(result)
