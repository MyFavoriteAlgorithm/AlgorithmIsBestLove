'''
문제:
비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.

add x: S에 x를 추가한다. 
(1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.

remove x: S에서 x를 제거한다. 
(1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.

check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)

toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)

all: S를 {1, 2, ..., 20} 으로 바꾼다.

empty: S를 공집합으로 바꾼다.

입력:
첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.
둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.


출력:
check 연산이 주어질때마다, 결과를 출력한다.

'''
import sys

def add(x:int):
    if not x in S:
        S.append(x)

def remove(x:int):
    if x in S:
        S.remove(x)

def check(x:int):
    if x in S:
        return 1
    else:
        return 0

def toggle(x:int):
    if x in S:
        S.remove(x)
    else:
        S.append(x)

def all(S):
    S.clear()
    S = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
    return S

def empty(S):
    S.clear()
    return S
    
#데이터 수 입력
N = int(input())

S = [] # 집합

# sys.stdin.read()
for i in range(N):
    data_input = sys.stdin.readline()
    if data_input == 'empty\n':
        S = empty(S)
        #print('command: empty')
        #print(S)
        continue
    elif data_input == 'all\n':
        S = all(S)
        #print('command: all')
        #print(S)
        continue
    
    command, x = map(str, data_input.split(" "))
    #print('command:',command,",x:",int(x))   

    if command == 'add':
        add(int(x))
    elif command == 'remove':
        remove(int(x))
    elif command == 'check':
        print(check(int(x)))
    elif command == 'toggle':
        toggle(int(x))
    #print(S)
