class Square:
    def _init_(self, lado):
        print("Creating Square with side {l}".format(l=lado))
        self.lado = lado
    def Perimetro(self) :
        return 4*self.lado
    def area(self):
        return self.lado*self.lado
    
Square1 = Square(22)
Square2 = Square(4)
Square3 = Square(25)
        
print(Square1.Perimetro())
print(Square2.Perimetro())
print(Square3.Perimetro())

print(Square1.area())
print(Square2.area())
print(Square3.area())
