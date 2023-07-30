class Solution(object):
    def addDigits(self, num):
        while(num>=10):
            s=0
            a=list(str(num))
            for i in a:
                s+=int(i)
            num=s
        return num
