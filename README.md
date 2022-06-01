# TablaHashsim
Se desea construir una nueva implementación de hash usando como estructura base un vector de árboles binarios de búsqueda. Su equipo de trabajo deberá implementar a partir del proyecto SEED:
Una nueva TablaHash de nombre TablaHash_AB, que  tendrá como atributos: 

private int numeroDatos; 

int numeroSlots; y 

ArbolBinarioBusqueda<InformacionDeEntrada <Clave,T>> [ ] informacionEntrada.

La clase TablaHash_AB, tendrá los métodos de: 

insertar( Clave clave, T objeto ),

eliminar( Clave clave ),

getObjeto( Clave clave ),

int index( Clave clave) y los demás métodos que están contenidos en la clase TablaHash original.
Utilice el modelo visto en clase para encontrar el código hash , en esté caso altere el método index.
La gui estará limitada a numeroSlots=11. 


Recomendaciones de implementación:
SÓLO se deben utilizar estructuras del proyecto seed.
No se pueden adicionar atributos a la clase TablaHash_AB.
Debe buscar la manera que sea transparente el uso de TablaHash_AB para el simulador. 
Apóyese del costo algorítmico que ya se encuentra realizado del proyecto : seed2.madarme.co, esto para analizar las operaciones dentro de un árbol binario.
