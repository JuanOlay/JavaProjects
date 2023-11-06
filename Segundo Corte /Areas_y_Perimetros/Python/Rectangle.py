class Rectangle:
    def _init_(self, largo, ancho):
        print("Creating rectangle with widht {a}".format(a=ancho), " and length {l}" .format(l=largo))
        self.largo = largo
        self.ancho = ancho
    def Perimetro(self) :
        return 2*self.largo + 2*self.ancho
    def area(self):
        return self.largo*self.ancho
    
box1 = Rectangle(10,43)
box2 = Rectangle(12,23)
box3 = Rectangle(16,41)
        
print(box1.Perimetro())
print(box2.Perimetro())
print(box3.Perimetro())

print(box1.area())
print(box2.area())
print(box3.area())
