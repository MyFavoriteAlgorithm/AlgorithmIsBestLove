'''
문제:
N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 
0의 개수를 구하는 프로그램을 작성하시오.

입력:
첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)

출력:
첫째 줄에 구한 0의 개수를 출력한다.

'''

N = int(input())

n_factorial = 1
for i in range(1,N+1):
    n_factorial = n_factorial * i

n_factorial_str = str(n_factorial)

count = 0

for i in range(len(n_factorial_str)):
    #print( n_factorial_str[len(n_factorial_str)-1-i],end='')
    
    if n_factorial_str[len(n_factorial_str)-1-i] == '0' :
        count+=1
    else:
        break
    
print(count)