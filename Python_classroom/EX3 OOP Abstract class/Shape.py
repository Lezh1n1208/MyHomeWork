from abc import ABC, abstractmethod

class Shape(ABC):
    def __init__(self, color="red", filled=True):
        self.color = color
        self.filled = filled
    def getColor(self):
        return self.color
    def setColor(self, color):
        self.color = color
    def isFilled(self):
        return self.filled
    def setFilled(self, filled):
        self.filled = filled
    @abstractmethod
    def getArea(self):
        pass
    @abstractmethod
    def getPerimeter(self):
        pass
    def __str__(self):
        return "Shape[color=" + self.color + ", filled=" + str(self.filled) + "]"