'''
문제:
여러분도 알다시피 여러분의 프린터 기기는 
여러분이 인쇄하고자 하는 문서를 
인쇄 명령을 받은 ‘순서대로’, 즉 먼저 요청된 것을 먼저 인쇄한다. 

여러 개의 문서가 쌓인다면 
Queue 자료구조에 쌓여서 FIFO - First In First Out - 에 따라 인쇄가 되게 된다. 

하지만 상근이는 새로운 프린터기 내부 소프트웨어를 개발하였는데, 
이 프린터기는 다음과 같은 조건에 따라 인쇄를 하게 된다.

현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.

나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 
이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 

그렇지 않다면 바로 인쇄를 한다.
예를 들어 Queue에 4개의 문서(A B C D)가 있고, 
중요도가 2 1 4 3 라면 C를 인쇄하고, 
다음으로 D를 인쇄하고 A, B를 인쇄하게 된다.

여러분이 할 일은, 
현재 Queue에 있는 문서의 수와 중요도가 주어졌을 때, 
어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다. 

예를 들어 위의 예에서 C문서는 1번째로, 
A문서는 3번째로 인쇄되게 된다.

입력:
첫 줄에 테스트케이스의 수가 주어진다. 
각 테스트케이스는 두 줄로 이루어져 있다.

테스트케이스의 첫 번째 줄에는 문서의 개수 N(1 ≤ N ≤ 100)과, 

몇 번째로 인쇄되었는지 궁금한 문서가 
현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수 M(0 ≤ M < N)이 주어진다. 
이때 맨 왼쪽은 0번째라고 하자. 

두 번째 줄에는 N개 문서의 중요도가 차례대로 주어진다. 
중요도는 1 이상 9 이하의 정수이고, 
중요도가 같은 문서가 여러 개 있을 수도 있다.

출력:
각 테스트 케이스에 대해 문서가 몇 번째로 인쇄되는지 출력한다.
'''
import sys
from collections import deque

test_case_N = int(input()) # 테스트 케이스 수
ans = []
for i in range(test_case_N): # 테스트 케이스 수 만큼 반복
    
    N, M = map(int, input().split()) # 문서 수, 출력순서 궁금한 문서 위치 입력
    
    # 큐에 중요도 저장
    queue = deque( list(map(int, sys.stdin.readline().split())))
    
    count = 0

    while queue:
        largest_weight = max(queue) # 현재 큐의 최댓값 저장
        front = queue.popleft() # 큐의 첫번째 값 pop(뽑기).
        # pop 이므로 값은 사라지고 한칸씩 앞으로 밀린다
        M -= 1 # 한칸씩 당겨졌으므로 -1
        
        if front == largest_weight: # pop한 값이 최댓값이었다면
            count += 1 # 하나 출력(배출)이므로 카운트
            if M < 0:
                #print(count)
                ans.append(count)
                break
        
        else: # pop한 값이 최댓값이 아니라면
            queue.append(front) # 젤 뒤에 다시 입력
            if M < 0: # M이 젤 앞에서 뽑혔으면
                M = N-1 # 젤 뒤로 위치 재지정

for i in ans:
    print(i)
                