enum class  estadoselevador {
    STOP, UP, DOWN
}

class EstadoElevador (private var estado: estadoselevador, private var piso: Int){

    var pisodeseado=0
    fun work(){
        while(true){
            if(estado==estadoselevador.DOWN){
                Bajar()
            }
            if(estado==estadoselevador.UP){
                Subir()
            }
            if(estado==estadoselevador.STOP){
                Detenido()
            }


        }
    }

    fun Subir(){
        println("Estado del elevador ARRIBA, piso: $piso")
        while(piso<pisodeseado)
        {
            piso++
            Thread.sleep(2000)
            println("Estado del elevador ARRIBA, piso $piso")

        }
        estado=estadoselevador.STOP
    }

    fun Bajar(){
        println("Estado del elevador ABAJO, piso $piso")
        while(piso>pisodeseado)
        {
            piso--
            Thread.sleep(1000)
            println("Estado del elevador ABAJO, piso $piso")

        }
        estado=estadoselevador.STOP
    }

    fun Detenido(){
        println("Estado del elevador DETENIDO, en el piso $piso")

        var elevador: Int?
        println("Ingrese al piso que desea ir: ")
        elevador = readLine()!!.toInt()


        piso=elevador
        if(piso < elevador)
        {
            estado=estadoselevador.UP

        }
        if(piso > elevador)
        {
        estado=estadoselevador.DOWN

        }
    }
}
