package Ex2;

public class Equacao {
    double a, b, c, r1, r2, delta, raizDelta;

    public void SetRecebeValor(float valorA, float valorB, float valorC){
        a = valorA;
        b = valorB;
        c = valorC;
    }

    public String GetRaiz(){
        String resultado;
        delta = (b*b) - 4*a*c;
        raizDelta = Math.sqrt(delta);

        r1 = (-b + (raizDelta)) / (2*a);
        r2 = (-b - (raizDelta)) / (2*a);
        String raiz1 = Double.toString(r1);
        String raiz2 = Double.toString(r2);

        if(raizDelta >= 0){
            resultado = "X1 = "+raiz1+"\nX2 = "+raiz2;
        } else {
            resultado = "Não existem raízes reais";
        }

        return resultado;
    }

    Equacao(){
        a = 0;
        b = 0;
        c = 0;
        r1 = 0;
        r2 = 0;
        delta = 0;
    }
}
