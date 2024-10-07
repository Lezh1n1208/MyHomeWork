import math
class Circle:
    def __init__(self, radius=1.0, color="red"):
        self._radius = radius
        self._color = color
    def getRadius(self):
        return self._radius
    def setRadius(self, radius):
        self._radius = radius
    def getColor(self):
        return self._color
    def setColor(self, color):
        self._color = color
    def getArea(self):
        return math.pi * self._radius * self._radius
    def __str__(self):
        return "Circle[radius=" + str(self._radius) + ",color=" + self._color + "]"

    