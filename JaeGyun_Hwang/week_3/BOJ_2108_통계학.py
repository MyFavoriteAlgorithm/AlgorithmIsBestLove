'''
문제
수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 
통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 
단, N은 홀수라고 가정하자.

산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

입력:
첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 
단, N은 홀수이다. 그 다음 N개의 줄에는 정수들이 주어진다. 
입력되는 정수의 절댓값은 4,000을 넘지 않는다.

출력
첫째 줄에는 산술평균을 출력한다. 
소수점 이하 첫째 자리에서 반올림한 값을 출력한다.

둘째 줄에는 중앙값을 출력한다.

셋째 줄에는 최빈값을 출력한다. 
여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.

넷째 줄에는 범위를 출력한다.

'''
import sys
import collections

def get_arithmatic_mean(): # 산술평균 구하는 함수
    return round(sum(numbers) / N) 

def get_mode():
    counter = collections.Counter(numbers)
    most_common = counter.most_common() 
    # 최빈값. 파라미터 디폴트는 최빈값 순으로 전부. 2입력시 2개만 나옴
    # most_common(1) -> 출력 (1,2): 1이 2번 나옴
    # most_common(3) -> 출력 [(1,3), (2,2), (3,2)]: 최빈값 순으로 3개
    
    #print('most_common:',most_common)
    
    if len(most_common) >= 2:
        if most_common[0][1] == most_common[1][1]:
            return most_common[1][0] # 두번째로 작은 최빈값
        else:
            return most_common[0][0]
    else:
        return most_common[0][0]
    

N = int(input())
numbers = list()
for i in range(N):
    numbers.append(int(sys.stdin.readline()))

numbers.sort()
'''
print(numbers)    
print('산술평균',get_arithmatic_mean())
print('중앙값',numbers[N//2])
print('최빈값',get_mode())
print('범위',numbers[N-1]-numbers[0])
'''
print(get_arithmatic_mean())
print(numbers[N//2])
print(get_mode())
print(numbers[N-1]-numbers[0])


