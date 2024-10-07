from Shape import Shape
import math

class Circle(Shape):
    def __init__(self, radius=1.0, color="red", filled=True):
        super().__init__(color, filled)
        self.radius = radius
    def getRadius(self):
        return self.radius
    def setRadius(self, radius):
        self.radius = radius
    def getArea(self):
        return math.pi * self.radius * self.radius
    def getPerimeter(self):
        return 2 * math.pi * self.radius
    def __str__(self):
        return "Circle[" + super().__str__() + ", radius=" + str(self.radius) + "]"