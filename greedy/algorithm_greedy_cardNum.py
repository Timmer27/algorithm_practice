#그리디 문제 - 숫자 카드 게임
#1. 카드의 행을 선택한다.
#2. 행의 카드 중 가장 낮은 숫자를 뽑아야 한다.
#3. 가장 높은 숫자를 뽑을 수 있도록 카드의 행을 고르는 알고리즘을 만든다.

#행 m 열 n
m, n = map(int, input().split())
tmp = 0;

for i in range(m):
    num = list(map(int, input().split()))
    #찾은 값 중 최소 값을 대입하고
    tmp = min(num)
    # 대입한 값 중 최대값을 비교해서 반환
    tmp = max(tmp, min(num))
print(tmp)
