import Circle

class Cylinder(Circle.Circle):
    def __init__(self, radius=1.0, height=1.0, color="red"):
        super().__init__(radius, color)
        self._height = height
    def getHeight(self):
        return self._height
    def setHeight(self, height):
        self._height = height
    def getVolume(self):
        return self.getArea() * self._height
    def __str__(self):
        return "Cylinder[radius=" + str(self.getRadius()) + ",height=" + str(self._height) + ",color=" + self.getColor() + "]"