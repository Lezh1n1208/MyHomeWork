from Shape import Shape
from Rectangle import Rectangle
from Circle import Circle

if __name__ == "__main__":
    # Test Rectangle class
    rectangle1 = Rectangle()
    rectangle2 = Rectangle(2.5, 3.5, "green", True)
    print(rectangle1.__str__())
    print(rectangle2.__str__())
    print("Area of rectangle2: ", rectangle2.getArea())
    print("Perimeter of rectangle2: ", rectangle2.getPerimeter())
    
    # Test Circle class
    circle1 = Circle()
    circle2 = Circle(2.5, "green", True)
    print(circle1.__str__())
    print(circle2.__str__())
    print("Area of circle2: ", circle2.getArea())
    print("Perimeter of circle2: ", circle2.getPerimeter())
    