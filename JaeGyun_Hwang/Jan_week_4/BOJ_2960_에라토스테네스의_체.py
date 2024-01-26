'''
문제
에라토스테네스의 체는 N보다 작거나 같은 모든 소수를 찾는 유명한 알고리즘이다.

이 알고리즘은 다음과 같다.

1. 2부터 N까지 모든 정수를 적는다.

2. 아직 지우지 않은 수 중 가장 작은 수를 찾는다. 
이것을 P라고 하고, 이 수는 소수이다.

3. P를 지우고, 
아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ K < N, max(1, K) < N ≤ 1000)

출력
첫째 줄에 K번째 지워진 수를 출력한다.
'''
N, K = map(int, input().split())

num = [1 for i in range(N+1)] # index 0부터 N까지 1로 채워진 리스트
num[0] = 0
num[1] = 0

count = 0
n = 2
ans_index=0
for i in range(2,N+2):
    if num[i] == 0:
        continue
    
    num[i] = 1
    count+=1 # p를 지운다(소수)
    #print('delete',i,'count',count)
    if count == K:
        ans_index=i
        break
    
    for j in range(2,N): # p의 배수를 지운다
        if i*j > N:
            break
        if num[i*j] == 1:
            num[i*j] = 0
            count+=1 # 배수를 지운다
            #print(i,'의 배수 delete',i*j,'count',count)
            if count == K:
                ans_index=i*j
                break
    if count==K:
        break
print(ans_index)
        