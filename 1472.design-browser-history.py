class LinkedList:
    def __init__(self, url: str, next, perv):
        self.url = url
        self.next = next
        self.perv = perv

class BrowserHistory:
    current = None

    def __init__(self, homepage: str):
        self.current = LinkedList(homepage, None, None)

    def visit(self, url: str) -> None:
        temp = LinkedList(url, None, self.current)
        self.current.next = temp
        self.current = self.current.next
        return None

    def back(self, steps: int) -> str:
        while(self.current.perv != None and steps > 0):
            self.current = self.current.perv
            steps -= 1
        return self.current.url
        

    def forward(self, steps: int) -> str:
        while(self.current.next != None and steps > 0):
            self.current = self.current.next
            steps -= 1
        return self.current.url
        


# Your BrowserHistory object will be instantiated and called as such:
# obj = BrowserHistory(homepage)
# obj.visit(url)
# param_2 = obj.back(steps)
# param_3 = obj.forward(steps)