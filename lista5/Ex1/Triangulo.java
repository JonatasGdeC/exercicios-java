package Ex1;

public class Triangulo{
    float base, altura, area;
    
    public void SetDimensao(float baseTriangulo, float alturaTriangulo){
        base = baseTriangulo;
        altura = alturaTriangulo;
    }
    
    public float GetArea(){
        area = base * altura / 2;
        return area;
    }
    
    Triangulo() {
        base = 0;
        altura = 0;
        area = 0;
    }    
}

