public class Racional {

    private int numerador, denominador;

    public Racional (int num, int den){
        numerador = num;
        denominador = den;
    }

    public void setNumerador(int num) {
        this.numerador = num;
    }

    public void setDenominador(int den) {
        this.denominador = den;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public  void multiplicar(Racional R){
        numerador = numerador*R.numerador;
        denominador = denominador*R.denominador;
    }

    public void dividir(Racional R){
        numerador = numerador*R.denominador;
        denominador = denominador*R.numerador;
    }

    public void somar(Racional R) {
        int aux = denominador * R.denominador;

        numerador = numerador * R.denominador;
        R.numerador = R.numerador * denominador;

        setNumerador(numerador + R.numerador);
        setDenominador(aux);
    }

    public void subtrair(Racional R) {
        int aux = denominador * R.denominador;

        numerador = numerador * R.denominador;
        R.numerador = R.numerador * denominador;

        setNumerador(numerador - R.numerador);
        setDenominador(aux);
    }

    public void simplificar () {
        for (int i = 2; i < denominador; i++){
            while (numerador % i == 0 && denominador % i == 0) {
                numerador = numerador / i;
                denominador = denominador / i;
            }
        }
    }
}
