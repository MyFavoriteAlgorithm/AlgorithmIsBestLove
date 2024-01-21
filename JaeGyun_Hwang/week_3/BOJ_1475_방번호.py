'''
문제
다솜이는 은진이의 옆집에 새로 이사왔다. 
다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.

다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 
한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오. 
(6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)

입력
첫째 줄에 다솜이의 방 번호 N이 주어진다. 
N은 1,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 필요한 세트의 개수를 출력한다.
'''
from collections import Counter

N = input()

N_list = []
for i in N:
    if i=='9':
        N_list.append(6)
    else:
        N_list.append(int(i))

#print(N_list)
counter = Counter(N_list) # 리스트 카운터 생성
count_check = counter.most_common() # 빈도수 내림차순 튜플로 생성
#print(count_check)

# 튜플은 완성형이므로 교체될수 없다. 새로 만들어야됨.
new_count_check = list(tuple())
for x,y in count_check:
    if x == 6: # 6일 시 반으로 나눔
        y = round(y/2) # 반올림 round
    new_count_check.append((x,y)) # 새로 저장
    
# 반으로 나누어서 두번째 최빈도수가 더 높을수 있으므로 내림차순 재정렬
new_count_check.sort(reverse=True,key=lambda x:x[1])
# key = lambda x[원하는인덱스]:x[원하는인덱스]
       
#print(new_count_check)
print(new_count_check[0][1])

