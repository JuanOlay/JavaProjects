class RightTriangle:
    def _init_(self, base, altura, hipotenusa):
        print("Creating Right Triangle with base {b},".format(b=base), " height {a}".format(a=altura), "and hypotenuse {h}".format(h=hipotenusa))
        self.altura = altura
        self.base = base
        self.hipotenusa = hipotenusa
    def Perimetro(self) :
        return self.base + self.altura + self.hipotenusa
    def area(self):
        return (self.base*self.altura)/2
    
Triangle1 = RightTriangle(1,2,4)
Triangle2 = RightTriangle(2,5,7)
Triangle3 = RightTriangle(1,2,5)
        
print(Triangle1.Perimetro())
print(Triangle2.Perimetro())
print(Triangle3.Perimetro())

print(Triangle1.area())
print(Triangle2.area())
print(Triangle3.area())
