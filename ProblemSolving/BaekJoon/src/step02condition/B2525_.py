inputH,inputM=input().split()
inputA = input()
H = int(inputH)
M = int(inputM)
A = int(inputA)

H += int(A//60)  # 시 합산
M += int(A%60)  # 분 합산

if M >= 60:
    H += 1
    M -= 60
if H >= 24:
    H -= 24

print(H, M)