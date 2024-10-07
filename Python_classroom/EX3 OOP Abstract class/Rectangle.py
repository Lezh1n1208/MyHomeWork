from Shape import Shape

class Rectangle(Shape):
    def __init__(self, width=1.0, length=1.0, color="red", filled=True):
        super().__init__(color, filled)
        self.width = width
        self.length = length
    def getWidth(self):
        return self.width
    def setWidth(self, width):
        self.width = width
    def getLength(self):
        return self.length
    def setLength(self, length):
        self.length = length
    def getArea(self):
        return self.width * self.length
    def getPerimeter(self):
        return 2 * (self.width + self.length)
    def __str__(self):
        return "Rectangle[" + super().__str__() + ", width=" + str(self.width) + ", length=" + str(self.length) + "]"