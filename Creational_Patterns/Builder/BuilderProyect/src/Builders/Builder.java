package Builders;

import Components.*;

public interface Builder {
	void setTipo(TipoPc tipo);
	void setModelo(String modelo);
	void setMarca(String marca);
	void setGrafica(Grafica grafica);
	void setProcesador(Procesador procesador);
}
