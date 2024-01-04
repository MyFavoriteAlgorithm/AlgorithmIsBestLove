'''
문제:
지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M*N 크기의 보드를 찾았다. 
어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 
지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.

체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 
구체적으로, 
각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 
변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 

따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 
하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

보드가 체스판처럼 칠해져 있다는 보장이 없어서, 
지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 
당연히 8*8 크기는 아무데서나 골라도 된다. 

지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

입력:
첫째 줄에 N과 M이 주어진다. 
N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다. 
둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. 
B는 검은색이며, W는 흰색이다.

출력:
첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.


'''
# M,N 입력
M, N = map(int, input().split(" "))

# B,W 데이터 입력
raw_data = []
for i in range(M):
    raw_data.append(input())

# 스타팅 포인트 별 결과값 저장공간
count_caseA_list = []
count_caseB_list = []

for i in range(M-7):
    for j in range(N-7):
        #start point : i, j
        count_caseA = 0
        count_caseB = 0
        for ii in range(i,i+8):
            for jj in range(j,j+8):
                #인덱스합은 체스판과 같이 짝,홀이 격자로 나온다.
                #짝에 B를 놓을건지 W를 놓을건지 정하면된다.
                # caseA : 인덱스합 짝수에 'W', 홀수에 'B' 놓는 경우
                # caseB : 인덱스합 짝수에 'B', 짝수에 'W' 놓는 경우
                if (ii+jj)%2 == 0: #인덱스합 짝수일때
                    #caseA는 짝에 W를 놓을것임
                    if raw_data[ii][jj] == 'B': # 고쳐야 하므로 카운트증가
                        count_caseA+=1
                    #caseB는 짝에 B를 놓을것임
                    if raw_data[ii][jj] == 'W': # 고쳐야 하므로 카운트증가
                        count_caseB+=1
                else: # 인덱스합 홀수일때
                    #caseA는 홀에 B를 놓을것임
                    if raw_data[ii][jj] == 'W': # 고쳐야 하므로 카운트 증가
                        count_caseA+=1
                    #caseA는 홀에 W를 놓을것임
                    if raw_data[ii][jj] == 'B': # 고쳐야 하므로 카운트 증가
                        count_caseB+=1
        count_caseA_list.append(count_caseA)
        count_caseB_list.append(count_caseB)
'''        
print(count_caseA_list)
print(count_caseB_list)
print('A min:',min(count_caseA_list))
print('B min:',min(count_caseB_list))
'''
# case 별 최솟값 구하기
countA_min = min(count_caseA_list)
countB_min = min(count_caseB_list)

# case A, B 중 최솟값 출력
if countA_min <= countB_min:
    print(countA_min)
else:
    print(countB_min)
                             
