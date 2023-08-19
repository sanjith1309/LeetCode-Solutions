class Solution(object):
    def rotateString(self, s, goal):
        if s==goal:
            return True
        for i in range(0,len(s)):
            s = s[1:len(s)]+s[0]
            print(s)
            if s == goal:
                return True


