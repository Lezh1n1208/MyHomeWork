from Circle import Circle
from Cylinder import Cylinder

if __name__ == "__main__":
    # Test Circle class
    circle1 = Circle()
    circle2 = Circle(2.5, "green")
    print(circle1.__str__())
    print(circle2.__str__())
    print("Area of circle2: ", circle2.getArea())
    
    # Test Cylinder class
    cylinder1 = Cylinder()
    cylinder2 = Cylinder(2.5, 5.0, "blue")
    print(cylinder1.__str__())
    print(cylinder2.__str__())
    print("Volume of cylinder2: ", cylinder2.getVolume())
    