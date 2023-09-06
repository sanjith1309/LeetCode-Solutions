class Solution:
    def interpret(self, command: str) -> str:
        s=""
        for i in range(0,len(command)):
            if i!=len(command)-1:
                if command[i]=="(" and command[i+1]==")":
                    s+="o"
                elif command[i].isalpha():
                    s+=command[i]
            elif command[i].isalpha():
                s+=command[i]
        return s
        
