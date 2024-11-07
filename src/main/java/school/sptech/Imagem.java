package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem{
private List<Figura> figuras;
    public void adicionar(Figura figura){
        figuras.add(figura);
    }
    public Double calcularSomaDasAreas(){
        Double areaTotal = 0.0;
        for (int i = 0; i < figuras.size(); i++) {

            Double area = figuras.get(i).calcularArea();
            areaTotal += area;

        }
        return areaTotal;
    }
    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasMaiores = new ArrayList<>();
        for (int i = 0; i < figuras.size(); i++) {

            Double area = figuras.get(i).calcularArea();
            if (area > 20){
                figurasMaiores.add(figuras.get(i));
            }

        }
        return figurasMaiores;
    }
    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();

        for (int i = 0; i < figuras.size(); i++) {

            if(figuras.get(i) instanceof Quadrado){
                quadrados.add(figuras.get(i));
            }
        }
        return quadrados;
    }
}
